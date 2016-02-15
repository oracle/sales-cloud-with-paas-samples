package com.oracle.fuse.model;

import com.oracle.fuse.util.ADFPopupUtils;
import com.oracle.fuse.util.DataSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.ValidatorException;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.event.QueryEvent;
import oracle.adf.view.rich.event.ReturnPopupEvent;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.event.LaunchPopupEvent;
import oracle.adf.view.rich.event.LaunchPopupListener;
import oracle.adf.view.rich.model.AttributeCriterion;
import oracle.adf.view.rich.model.AttributeDescriptor;
import oracle.adf.view.rich.model.ColumnDescriptor;
import oracle.adf.view.rich.model.ConjunctionCriterion;
import oracle.adf.view.rich.model.Criterion;
import oracle.adf.view.rich.model.ListOfValuesModel;
import oracle.adf.view.rich.model.QueryDescriptor;
import oracle.adf.view.rich.model.QueryModel;
import oracle.adf.view.rich.model.TableModel;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.RowKeySetImpl;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class LOVDataBean {
    private RichInputComboboxListOfValues mainLOV;
    private RichQuery searchQuery;

    public LOVDataBean() {
        for (int i = 0; i < _DIR_DATA.length * 50; i++) {
            try {
                Object data[] = _DIR_DATA[i % _DIR_DATA.length];

                String firstName = (String)data[0] + new Integer(i).toString();
                String lastName = "Last"+ new Integer(i).toString();;
                Integer item2 = new Integer(data[2].toString());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
                Date item3 = sdf.parse(data[3].toString());
                Integer item4 = new Integer(data[4].toString());
                Integer item5 = new Integer(data[5].toString());
                Integer item6 = new Integer(data[6].toString());
                String item7 = new Integer(i).toString();
                String email = (String)data[7];
                String phone = (String)data[8];
                boolean favConFlag = new Boolean(data[9].toString());
                String favContactUrl = null;
                if(favConFlag){
                    favContactUrl = "/images/fuse-icon-favorite-on.png";
                }
                else{
                    favContactUrl = "/images/fuse-icon-favorite-off.png";
                }
                FileData _curRow =
                    new FileData(new Integer(i), firstName, lastName, (String)data[1], item2,
                                 item3, item4, item5, item6, item7, email, phone, favContactUrl);
                _values.add(_curRow);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        _filteredList.addAll(_values);
    }

    //------------------public API for binding --------------------------------//
    private String _ename;
    private String _ename1;
    private String _job;

    public void setEname(String ename) {
        _ename = ename;
    }

    public String getEname() {
        return _ename;
    }

    public void setEname1(String ename1) {
        _ename1 = ename1;
    }

    public String getEname1() {
        return _ename1;
    }

    public void setJob(String job) {
        _job = job;
    }

    public String getJob() {
        return _job;
    }
    private Object returnPopupDataValue;

    public void setReturnPopupDataValue(Object returnPopupDataValue) {
        this.returnPopupDataValue = returnPopupDataValue;
    }

    public Object getReturnPopupDataValue() {
        return returnPopupDataValue;
    }

    private Object returnPopupDataValue1;

    public void selected(SelectionEvent event) {
        setReturnPopupDataValue(event.getAddedSet());
    }

    public void returnPopupListener(ReturnPopupEvent returnPopupEvent) {
        Object value = returnPopupEvent.getReturnValue();
        if (value != null) {
            FileData rowData = _getRowData(value);
            if (rowData != null) {
                this.setEname(rowData.getFirstName());
                //this._addToRecentValuesList(rowData, this._recentValues);
            } else
                this.setEname(value.toString());
        }
    }

    public void inputReturnPopupListener(ReturnPopupEvent returnPopupEvent) {
        Object value = returnPopupEvent.getReturnValue();
        this.setEname1(value.toString());
    }

    private void _addToRecentValuesList(FileData rowData, List recentValues) {
        if (!recentValues.contains(rowData))
            recentValues.add(0, rowData);

        int size = recentValues.size();
        if (size > 3)
            recentValues.remove(3);
    }

    private FileData _getRowData(Object selectedRow) {
        if (selectedRow != null && selectedRow instanceof List) {
            List listvalue = (List)selectedRow;
            for (int i = 0; i < listvalue.size(); i++) {
                Object rowData = listvalue.get(i);
                if (rowData instanceof FileData) {
                    return ((FileData)rowData);
                }
            }
        } else if (selectedRow != null && selectedRow instanceof RowKeySet) {
            Iterator selection = ((RowKeySet)selectedRow).iterator();
            while (selection.hasNext()) {
                Object rowKey = selection.next();
                Object oldRowKey = listModel.getRowKey();
                listModel.setRowKey(rowKey);
                FileData rowData = (FileData)listModel.getRowData();
                listModel.setRowKey(oldRowKey);
                return rowData;
            }
        }
        return null;
    }

    public void validate(FacesContext facesContext, UIComponent uIComponent,
                         Object object) {
        for (Object data : _values) {
            if (((FileData)data).getFirstName().equals(object)) {
                return;
            }
        }
        FacesMessage message =
            new FacesMessage(FacesMessage.SEVERITY_ERROR, "Not a Valid Value",
                             "Not a Valid Value");
        throw new ValidatorException(message);
    }

    public List getValues() {
        return _values;
    }

    public List getRecentValues() {
        List recentValues = new ArrayList();
        recentValues.addAll(_recentValues);

        if (recentValues.size() > 0)
            recentValues.add(new FileData(null, null, null, null, null, null, null,
                                          null, null, null,null,null,null));

        return recentValues;
    }

    public List getRecentValues1() {
        List recentValues = new ArrayList();
        recentValues.addAll(_recentValues1);

        if (recentValues.size() > 0)
            recentValues.add(new FileData(null, null, null, null, null, null, null,
                                          null, null, null,null,null,null));

        return recentValues;
    }

    // "LaunchPopupListener" attribute EL reachable

    public LaunchPopupListener getLaunchPopupListener() {
        return new DemoLOVPopupListener();
    }

    private RichTable _table;

    public CollectionModel getListModel() {
        return listModel;
    }

    public String[] getAttrs() {
        return _attrs;
    }

    public ListOfValuesModel getListOfValuesModel() {
        if (_listOfValuesModel == null)
            _listOfValuesModel = new ListOfValuesModelImpl(this);
        return _listOfValuesModel;
    }

    //    public ListOfValuesModel getListOfValuesModel1() {
    //        if (_listOfValuesModel1 == null)
    //            _listOfValuesModel1 = new ListOfValuesModelImpl1(this);
    //        return _listOfValuesModel1;
    //    }

    private ListOfValuesModel _listOfValuesModel;
    private ListOfValuesModel _listOfValuesModel1;

    private void filterList(String eName, List filtered) {
        filtered.clear();
        if (eName != null) {
            for (Object data : _values) {
                if (((FileData)data).getFirstName().startsWith(eName)) {
                    filtered.add(data);
                }
            }
        }
        if (filtered.size() == 0) {
            filtered.addAll(_values);
        }
    }

    private void filterListSearch(String fName, String lName, String account, String job,
                                  String phone, String email, String favContact, List filtered) {
        filtered.clear();
        //ROHITSI: search working for First Name, Job, Phone and Email only as I dont have the real data for the design or design pattern.
        if (fName != null && lName != null && account != null && job != null && phone != null && email != null && 
            !fName.equals("") && !lName.equals("") && !account.equals("") && !job.equals("") && !phone.equals("") && !email.equals("")) {
            for (Object data : _values) {
                if (((FileData)data).getFirstName().startsWith(fName) &&
                    ((FileData)data).getLastName().startsWith(lName) &&
                    ((FileData)data).getJob().startsWith(job) &&
                    ((FileData)data).getPhone().startsWith(phone) &&
                    ((FileData)data).getEmail().startsWith(email) ) {
                    filtered.add(data);
                }
            }
        } else if (fName != null && !fName.equals("")) {
            for (Object data : _values) {
                if (((FileData)data).getFirstName().startsWith(fName)) {
                    filtered.add(data);
                }
            }
        } else if (lName != null && !lName.equals("")) {
            for (Object data : _values) {
                if (((FileData)data).getLastName().startsWith(lName)) {
                    filtered.add(data);
                }
            }
        } else if (account != null && !account.equals("")) {
            for (Object data : _values) {
                if (((FileData)data).getRowId().startsWith(account)) {
                    filtered.add(data);
                }
            }
        } else if (job != null && !job.equals("")) {
            for (Object data : _values) {
                if (((FileData)data).getJob().startsWith(job)) {
                    filtered.add(data);
                }
            }
        }  else if (email != null && !email.equals("")) {
            for (Object data : _values) {
                if (((FileData)data).getEmail().startsWith(email)) {
                    filtered.add(data);
                }
            }
        } else if (phone != null && !phone.equals("")) {
            for (Object data : _values) {
                if (((FileData)data).getPhone().startsWith(phone)) {
                    filtered.add(data);
                }
            }
        }
        if (filtered.size() == 0) {
            filtered.addAll(_values);
        }
    }


    public void setReturnPopupDataValue1(Object returnPopupDataValue1) {
        this.returnPopupDataValue1 = returnPopupDataValue1;
    }

    public Object getReturnPopupDataValue1() {
        return returnPopupDataValue1;
    }

    public void setTable(RichTable _table) {
        this._table = _table;
    }

    public RichTable getTable() {
        return _table;
    }

    public void setMainLOV(RichInputComboboxListOfValues mainLOV) {
        this.mainLOV = mainLOV;
    }

    public RichInputComboboxListOfValues getMainLOV() {
        return mainLOV;
    }

    public void processQuery(ActionEvent event) {
        getListOfValuesModel().performQuery(getListOfValuesModel().getQueryDescriptor());
    }

    public void setSearchQuery(RichQuery searchQuery) {
        this.searchQuery = searchQuery;
    }

    public RichQuery getSearchQuery() {
        return searchQuery;
    }
    
    public void cancelButton(ActionEvent actionEvent) {
       // UIComponent myForm = actionEvent.getComponent();
       // oracle.adf.view.rich.util.ResetUtils.reset(myForm);
        RichQuery queryComp = this.getSearchQuery();
        QueryModel queryModel = queryComp.getModel();
        QueryDescriptor queryDescriptor = queryComp.getValue();
        queryModel.reset(queryDescriptor);
        queryComp.refresh(FacesContext.getCurrentInstance());
        ADFPopupUtils.hideParentPopup(actionEvent.getComponent());
    }

    public void processSelectedContact(ActionEvent actionEvent) {
        if (null !=
            ADFContext.getCurrent().getPageFlowScope().get("SELECTEDCONTACT")) {
            String selectedEmpNo =
                ADFContext.getCurrent().getPageFlowScope().get("SELECTEDCONTACT").toString();
            for (int i = 0; i < _values.size(); i++) {
                FileData fd = (LOVDataBean.FileData)_values.get(i);
                if (fd.empno.toString().equals(selectedEmpNo)) {
                    DataSource dataSourceBean =
                        (DataSource)ADFContext.getCurrent().getSessionScope().get("DataSourceBean");
                    dataSourceBean.getContactList().add(new ContactModel(true,
                                                                         fd.firstName,
                                                                         "",
                                                                         fd.job,
                                                                         "",
                                                                         "first.last@domain.com"));
                    break;
                }
            }
        }
        ADFPopupUtils.hideParentPopup(actionEvent.getComponent());

    }

    public void selectValue(ValueChangeEvent valueChangeEvent) {
        if(valueChangeEvent.getComponent().getAttributes().get("value").equals(true)){
            ADFContext.getCurrent().getPageFlowScope().put("SELECTEDCONTACT", valueChangeEvent.getComponent().getAttributes().get("EMPNO").toString());
            
        }
    }

    // In the real case, LOV is using ListBinding, and the MRU support is inside
    // the datasource in the listBinding.

    class BaseLovCollection extends CollectionModel {
        public Object getRowKey() {
            if (_row != null) {
                return _row.getRowId();
            }
            return null;
        }

        /**
         * Finds the row with the matching key and makes it current
         * @param rowKey the rowKey, previously obtained from {@link #getRowKey}.
         */
        public void setRowKey(Object rowKey) {
            if (rowKey == null) {
                _row = null;
                return;
            }

            int index = -1;
            for (int i = 0; i < _filteredList.size(); i++) {
                String rowId = ((FileData)_filteredList.get(i)).getRowId();
                if (rowId.equals(rowKey)) {
                    index = i;
                    break;
                }
            }

            setRowIndex(index);
        }

        public void setRowIndex(int rowIndex) {
            int size = _filteredList.size();
            if (rowIndex < 0 || rowIndex > size || size == 0) {
                _row = null;
                _rowIndex = -1;
            } else {
                _row = (FileData)_filteredList.get(rowIndex);
                _rowIndex = rowIndex;
            }
        }

        public int getRowIndex() {
            return _rowIndex;
        }

        public Object getRowData() {
            return _row;
        }

        public int getRowCount() {
            return _filteredList.size();
        }

        public boolean isRowAvailable() {
            return (_row != null);
        }

        public Object getRowData(int rowIndex) {
            int oldIndex = getRowIndex();
            try {
                setRowIndex(rowIndex);
                return getRowData();
            } finally {
                setRowIndex(oldIndex);
            }
        }

        public boolean isSortable(String property) {
            return false;
        }

        public List getSortCriteria() {
            return Collections.EMPTY_LIST;
        }

        public Object getWrappedData() {
            return BaseLovCollection.this;
        }

        public void setWrappedData(Object data) {
            throw new UnsupportedOperationException();
        }

        public BaseLovCollection() {
        }

        FileData _row = null;
        int _rowIndex = -1;
    }

    class ListLovCollection extends CollectionModel {
        public Object getRowKey() {
            if (_row != null) {
                return _row.getRowId();
            }
            return null;
        }

        /**
         * Finds the row with the matching key and makes it current
         * @param rowKey the rowKey, previously obtained from {@link #getRowKey}.
         */
        public void setRowKey(Object rowKey) {
            if (rowKey == null) {
                _row = null;
                return;
            }

            int index = -1;
            for (int i = 0; i < _filteredList.size(); i++) {
                String rowId = ((FileData)_filteredList.get(i)).getRowId();
                if (rowId.equals(rowKey)) {
                    index = i;
                    break;
                }
            }

            setRowIndex(index);
        }

        public void setRowIndex(int rowIndex) {
            int size = _filteredList.size();
            if (rowIndex < 0 || rowIndex > size || size == 0) {
                _row = null;
                _rowIndex = -1;
            } else {
                _row = (FileData)_filteredList.get(rowIndex);
                _rowIndex = rowIndex;
            }
        }

        public int getRowIndex() {
            return _rowIndex;
        }

        public Object getRowData() {
            return _row;
        }

        public int getRowCount() {
            return _filteredList.size();
        }

        public boolean isRowAvailable() {
            return (_row != null);
        }

        public Object getRowData(int rowIndex) {
            int oldIndex = getRowIndex();
            try {
                setRowIndex(rowIndex);
                return getRowData();
            } finally {
                setRowIndex(oldIndex);
            }
        }

        public boolean isSortable(String property) {
            return false;
        }

        public List getSortCriteria() {
            return Collections.EMPTY_LIST;
        }

        public Object getWrappedData() {
            return ListLovCollection.this;
        }

        public void setWrappedData(Object data) {
            throw new UnsupportedOperationException();
        }

        FileData _row = null;
        int _rowIndex = -1;
    }

    public static class ListOfValuesModelImpl extends ListOfValuesModel {
        public ListOfValuesModelImpl(LOVDataBean bean) {
            _bean = bean;
        }

        /**
         * Not applicable as items are only supported in comboLOV
         * @return
         */
        @Override
        public List<? extends Object> getItems() {
            return _bean.getValues();
        }

        /**
         * Returns null for now.
         * @return
         */
        @Override
        public QueryModel getQueryModel() {
            return new QueryModelImpl();
        }

        /**
         * @return
         */
        @Override
        public List<? extends Object> getRecentItems() {
            return _bean.getRecentValues();
        }

        @Override
        public TableModel getTableModel() {
            return new TableModelImpl(_bean.getListModel());
        }

        @Override
        public List<ColumnDescriptor> getItemDescriptors() {
            List<ColumnDescriptor> descriptors =
                getTableModel().getColumnDescriptors();
            if (descriptors != null && descriptors.size() > 2) {
                return descriptors.subList(1, 2);
            }
            return descriptors;
        }

        @Override
        public boolean isAutoCompleteEnabled() {
            return false;
        }

        public void performQuery(QueryDescriptor qd) {
            String fName =
                (String)((AttributeCriterion)qd.getConjunctionCriterion().getCriterionList().get(0)).getValues().get(0);
            String lName =
                (String)((AttributeCriterion)qd.getConjunctionCriterion().getCriterionList().get(1)).getValues().get(0);
            String account =
                (String)((AttributeCriterion)qd.getConjunctionCriterion().getCriterionList().get(2)).getValues().get(0);
            String job =
                (String)((AttributeCriterion)qd.getConjunctionCriterion().getCriterionList().get(3)).getValues().get(0);
            String phone =
                (String)((AttributeCriterion)qd.getConjunctionCriterion().getCriterionList().get(4)).getValues().get(0);
            String emailId =
                (String)((AttributeCriterion)qd.getConjunctionCriterion().getCriterionList().get(5)).getValues().get(0);
            String favContact =
                (String)((AttributeCriterion)qd.getConjunctionCriterion().getCriterionList().get(6)).getValues().get(0);
            _bean.filterListSearch(fName, lName, account, job, phone, emailId, favContact, _bean._filteredList);
        }

        public List<Object> autoCompleteValue(Object value) {
            // wierd way of filtering and accessing _filteredList but for now its ok
            _bean.filterList((String)value, _bean._filteredList);
            if (_bean._filteredList.size() == 1) {
                List<Object> returnList = new ArrayList<Object>();
                FileData rowData = (FileData)_bean._filteredList.get(0);
                Object rowKey = rowData.getRowId();
                RowKeySet rowKeySet = new RowKeySetImpl();
                rowKeySet.add(rowKey);
                returnList.add(rowKeySet);
                return returnList;
            }
            return null;
        }

        public void valueSelected(Object value) {
            FileData rowData = _getRowData(value);
            if (rowData != null) {
                _bean.setEname(rowData.getFirstName());
                _bean._addToRecentValuesList(rowData, _bean._recentValues);
            }
        }

        @Override
        public Object getValueFromSelection(Object selectedRow) {
            FileData rowData = _getRowData(selectedRow);
            if (rowData != null) {
                return rowData.getFirstName();
            }
            return null;
        }

        private FileData _getRowData(Object selectedRow) {
            if (selectedRow != null && selectedRow instanceof List) {
                List listvalue = (List)selectedRow;
                for (int i = 0; i < listvalue.size(); i++) {
                    Object rowData = listvalue.get(i);
                    if (rowData instanceof FileData) {
                        return ((FileData)rowData);
                    }
                }
            } else if (selectedRow != null &&
                       selectedRow instanceof RowKeySet) {
                Iterator selection = ((RowKeySet)selectedRow).iterator();
                while (selection.hasNext()) {
                    Object rowKey = selection.next();
                    Object oldRowKey = _bean.listModel.getRowKey();
                    _bean.listModel.setRowKey(rowKey);
                    FileData rowData = (FileData)_bean.listModel.getRowData();
                    _bean.listModel.setRowKey(oldRowKey);
                    return rowData;
                }
            }
            return null;
        }

        public QueryDescriptor getQueryDescriptor() {
            if (_queryDescriptor == null)
                _queryDescriptor = new QueryDescriptorImpl();
            return _queryDescriptor;
        }

        private QueryDescriptor _queryDescriptor;
        private LOVDataBean _bean;

    }

    // For now return a void implementation for the querymodel to show a simple query component
    // such that the Search... link will also be displayed in the dropdown

    public static class QueryModelImpl extends QueryModel {

        public QueryDescriptor create(String name, QueryDescriptor qdBase) {
            return null;
        }

        public void delete(QueryDescriptor qd) {
        }

        public List<AttributeDescriptor> getAttributes() {
            return null;
        }

        public List<QueryDescriptor> getSystemQueries() {
            return null;
        }

        public List<QueryDescriptor> getUserQueries() {
            return null;
        }

        public void reset(QueryDescriptor qd) {
        }

        public void setCurrentDescriptor(QueryDescriptor qd) {
        }

        public void update(QueryDescriptor qd, Map<String, Object> uiHints) {
        }
    }

    // Simple implementation of the QueryDescriptor classs to display one inputText
    // field to filter the data in the table inside dialog based on the Ename

    public static class QueryDescriptorImpl extends QueryDescriptor {
        public QueryDescriptorImpl() {
            _conjCriterion = new ConjunctionCriterionImpl();
        }

        public void addCriterion(String name) {
        }

        public void changeMode(QueryDescriptor.QueryMode mode) {
        }

        public ConjunctionCriterion getConjunctionCriterion() {
            return _conjCriterion;
        }

        public void setConjunctionCriterion(ConjunctionCriterion criterion) {
            _conjCriterion = criterion;
        }

        public String getName() {
            return null;
        }

        public Map<String, Object> getUIHints() {
            return new HashMap<String, Object>();
        }

        public void removeCriterion(oracle.adf.view.rich.model.Criterion object) {
        }

        public AttributeCriterion getCurrentCriterion() {
            return null;
        }

        public void setCurrentCriterion(AttributeCriterion attrCriterion) {
        }

        ConjunctionCriterion _conjCriterion;
    }

    public static class AttributeDescriptorImpl extends AttributeDescriptor {
        private String label;
        private String componentType;

        public AttributeDescriptorImpl(String label, String componentType) {
            super();
            this.label = label;
            this.componentType = componentType;
        }

        public AttributeDescriptor.ComponentType getComponentType() {
            if(this.componentType.equals("text")){
                return AttributeDescriptor.ComponentType.inputText;    
            }
            else if(this.componentType.equals("choice")){
                return AttributeDescriptor.ComponentType.selectOneChoice;    
            }
            else{
                return AttributeDescriptor.ComponentType.inputText;    
            }
        }

        public String getDescription() {
            return null;
        }

        public String getFormat() {
            return null;
        }

        public String getLabel() {
            return label;
        }

        public int getLength() {
            return 0;
        }

        public int getMaximumLength() {
            return 0;
        }

        public Object getModel() {
            return null;
        }

        public String getName() {
            return null;
        }

        public Set<AttributeDescriptor.Operator> getSupportedOperators() {
            return null;
        }

        public Class getType() {
            return null;
        }

        public boolean isReadOnly() {
            return false;
        }

        public boolean isRequired() {
            return false;
        }
    }

    public static class ConjunctionCriterionImpl extends ConjunctionCriterion {
        List<Criterion> _criterionList;
        public ConjunctionCriterionImpl() {
            _criterionList = new ArrayList<Criterion>();
            _criterionList.add(new AttributeCriterionImpl("First Name","text"));
            _criterionList.add(new AttributeCriterionImpl("Last Name","text"));
            _criterionList.add(new AttributeCriterionImpl("Account","text"));
            _criterionList.add(new AttributeCriterionImpl("Job Title","text"));
            _criterionList.add(new AttributeCriterionImpl("Phone","text"));
            _criterionList.add(new AttributeCriterionImpl("Email","text"));
            _criterionList.add(new AttributeCriterionImpl("Favorite Contact","choice"));
        }

        public ConjunctionCriterion.Conjunction getConjunction() {
            return ConjunctionCriterion.Conjunction.OR;
        }

        public List<oracle.adf.view.rich.model.Criterion> getCriterionList() {
            return _criterionList;
        }

        public Object getKey(oracle.adf.view.rich.model.Criterion criterion) {
            return _criterionList.indexOf(criterion);
        }

        public Criterion getCriterion(Object key) {
            assert (_criterionList != null);
            return _criterionList.get(Integer.parseInt(key.toString()));
        }

        public void setConjunction(ConjunctionCriterion.Conjunction conjunction) {
        }
    }

    public static class AttributeCriterionImpl extends AttributeCriterion {
        public AttributeCriterionImpl(String label, String componentType) {
            if (_values == null) {
                _values = new ArrayList<Object>();
                _values.add("");
                this.label = label;
                this.componentType = componentType;
            }
        }
        private String label;
        private String componentType;

        public AttributeDescriptor getAttribute() {
            return new AttributeDescriptorImpl(label,componentType);
        }

        public AttributeDescriptor.Operator getOperator() {
            return null;
        }

        public Map<String, AttributeDescriptor.Operator> getOperators() {
            return null;
        }

        public List<? extends Object> getValues() {

            return _values;
        }

        public boolean isRemovable() {
            return false;
        }

        public void setOperator(AttributeDescriptor.Operator operator) {
        }

        List<Object> _values;

        public void setComponentType(String componentType) {
            this.componentType = componentType;
        }

        public String getComponentType() {
            return componentType;
        }
    }

    public static class TableModelImpl extends TableModel {
        public TableModelImpl(CollectionModel collectionModel) {
            assert (collectionModel != null);
            _collectionModel = collectionModel;
        }

        @Override
        public CollectionModel getCollectionModel() {
            return _collectionModel;
        }

        @Override
        public List<ColumnDescriptor> getColumnDescriptors() {
            if (_descriptors == null) {
                _descriptors =
                        new ArrayList<ColumnDescriptor>(_attributes.size());
                for (String attr : _attributes) {
                    _descriptors.add(new ColumnDescriptorImpl(attr));
                }
            }
            return _descriptors;
        }

        public static class ColumnDescriptorImpl extends ColumnDescriptor {
            public ColumnDescriptorImpl(String name) {
                _name = name;
            }

            @Override
            public String getFormat() {
                return null;
            }

            @Override
            public String getLabel() {
                return _name.toUpperCase();
            }

            @Override
            public String getName() {
                return _name;
            }

            @Override
            public Class getType() {
                return String.class;
            }

            @Override
            public String getAlign() {
                return null;
            }

            @Override
            public AttributeDescriptor.ComponentType getComponentType() {
                return AttributeDescriptor.ComponentType.inputText;
            }

            @Override
            public String getDescription() {
                return null;
            }

            @Override
            public Set<AttributeDescriptor.Operator> getSupportedOperators() {
                return Collections.emptySet();
            }

            @Override
            public int getLength() {
                return 0;
            }

            public int getMaximumLength() {
                return 0;
            }

            public Object getModel() {
                return null;
            }

            @Override
            public int getWidth() {
                if (_name.equalsIgnoreCase("ename"))
                    return 12 * 7 + 3;
                else if (_name.equalsIgnoreCase("empno"))
                    return 3 * 7 + 3;
                else if (_name.equalsIgnoreCase("job"))
                    return 10 * 7 + 3;
                else if (_name.equals("mgr"))
                    return 2 * 7 + 3;
                return 0;
            }

            /**
             * The column attributes are all readOnly.
             *
             * @return
             */
            @Override
            public boolean isReadOnly() {
                return true;
            }

            @Override
            public boolean isRequired() {
                return false;
            }

            private String _name;

        }


        private CollectionModel _collectionModel;
        private static List<ColumnDescriptor> _descriptors;
    }


    //Single datasource
    static Object _DIR_DATA[][] =
    { { "Adam", "Engineer", 1, "1998-01-19", 23232, 66767, 10,"a1@bb.com" ,"+91(974)234-5551)", true},
      { "Avance", "Manager", 1, "2002-04-15", 24232, 32211, 20,"a2@bb.com","+91(974)234-5551)", false },
      { "Abdul", "Analyst", 1, "2001-01-19", 25232, 444, 10,"a3@bb.com","+91(974)234-5551)" , true },
      { "Blake", "Technician", 1, "1998-01-14", 53232, 8787, 30,"a4@bb.com","+91(974)234-5551)", false },
      { "Bob", "Engineer", 1, "1998-06-19", 23432, 5454, 40,"a5@bb.com" ,"+91(974)234-5551)" , true},
      { "Brenta", "Manager", 1, "1998-04-19", 6454, 39343, 30,"a6@bb.com" ,"+91(974)234-5551)" , false},
      { "Bejond", "Analyst", 1, "2001-01-14", 5455, 23122, 10,"a7@bb.com" ,"+91(974)234-5551)", true},
      { "Calvin", "Analyst", 1, "2002-04-19", 54465, 39343, 10,"a8@bb.com" ,"+91(974)234-5551)", false},
      { "Carl", "Engineer", 1, "1998-01-12", 54345, 54544, 40,"a9@bb.com" ,"+91(974)234-5551)", true},
      { "Chris", "Technician", 1, "2002-01-23", 3212, 6565, 20,"a10@bb.com" ,"+91(974)234-5551)", false},
      { "Claire", "Manager", 1, "2001-06-19", 43234, 5555, 20,"a11@bb.com" ,"+91(974)234-5551)", true},
      { "Dave", "Operator", 1, "2002-04-11", 76456, 434343, 40,"a12@bb.com" ,"+91(974)234-5551)", false},
      { "David", "Manager", 1, "2001-01-22", 78687, 2222, 10,"a1@bb.com" ,"+91(974)234-5551)", false},
      { "Derek", "Analyst", 1, "1998-04-19", 4323, 21231, 30,"a1@bb.com" ,"+91(974)234-5551)", false},
      { "Eric", "Technician", 1, "2002-01-15", 45354, 2112, 10,"a1@bb.com" ,"+91(974)234-5551)", false},
      { "Eilane", "Engineer", 1, "2001-06-24", 9879, 4534, 40,"a1@bb.com" ,"+91(974)234-5551)", true},
      { "Frank", "Analyst", 1, "1998-06-25", 65454, 43543, 50,"a1@bb.com" ,"+91(974)234-5551)", true},
      { "Fonda", "Technician", 1, "1998-01-26", 43543, 564654, 30,"a1@bb.com" ,"+91(738)234-5551)", false},
      { "Ford", "Manager", 1, "2001-04-09", 56465, 76658, 30,"a1@bb.com" ,"+91(738)234-5551)", true},
      { "Gary", "Analyst", 1, "2002-01-21", 23232, 7676, 20,"a1@bb.com" ,"+91(738)234-5551)", true},
      { "Good", "Engineer", 1, "2002-01-08", 65465, 54565, 60,"a1@bb.com" ,"+91(738)234-5551)", false},
      { "Goodon", "Analyst", 1, "2001-04-07", 23232, 4343, 60,"a1@bb.com" ,"+91(738)234-5551)", false},
      { "T.J", "Technician", 1, "2002-01-05", 45345, 56565, 50,"a1@bb.com" ,"+91(738)234-5551)", true},
      { "James", "Engineer", 1, "2002-01-44", 43453, 5454, 10,"a1@bb.com" ,"+91(738)234-5551)", true},
      { "Henry", "Operator", 1, "2001-01-09", 7665, 7657, 20,"a1@bb.com" ,"+91(738)234-5551)", false},
      { "Howard", "DBA", 1, "2002-01-17", 4444, 21113, 20,"a1@bb.com" ,"+91(738)234-5551)", true},
      { "Ivory", "Operator", 1, "1999-12-19", 43653, 5454, 50,"a1@bb.com" ,"+91(738)234-5551)", true},
      { "Jidd", "DBA", 1, "1998-11-20", 4343, 54564, 50,"a1@bb.com" ,"+91(738)234-5551)", false},
      { "J.R.", "Consultant", 1, "2001-10-21", 47343, 5454, 70,"a1@bb.com" ,"+91(738)234-5551)", true},
      { "Jordon", "Operator", 1, "2000-09-22", 49843, 5454, 50,"a1@bb.com" ,"+91(738)234-5551)", false},
      { "Karl", "DBA", 1, "1998-08-29", 4343, 98054, 50,"a1@bb.com" ,"+91(738)234-5551)", false},
      { "Kerry", "Consultant", 1, "1996-07-23", 6553, 5454, 70,"a1@bb.com" ,"+91(738)234-5551)", true},
      { "King", "DBA", 1, "1998-06-24", 4343, 7854, 50,"a1@bb.com" ,"+1(650)642-7127)", false},
      { "Larry", "Consultant", 1, "1995-06-25", 47893, 5454, 50,"a1@bb.com" ,"+1(650)642-7127)", true},
      { "Lelsie", "Consultant", 1, "1994-05-26", 6743, 5454, 70,"a1@bb.com" ,"+1(650)642-7127)", true},
      { "Linda", "DBA", 1, "1993-04-11", 4343, 9854, 50,"a1@bb.com" ,"+1(650)642-7127)", false},
      { "Merk", "DBA", 1, "1992-03-12", 4343, 5476, 50,"a1@bb.com" ,"+1(650)642-7127)", false},
      { "Mandona", "Consultant", 1, "1991-02-13", 6643, 5454, 50,"a1@bb.com" ,"+1(650)642-7127)", false},
      { "Nomarn", "Operator", 1, "1990-01-14", 43343, 5454, 50,"a1@bb.com" ,"+1(650)642-7127)", true} };

    public class FileData {
        private Integer empno;
        private String firstName;
        private String lastName;
        private String job;
        private Integer mgr;
        private Date hireDate;
        private Integer sal;
        private Integer comm;
        private Integer deptno;
        private String rowId;
        private String email;
        private String phone;
        private String favContactImage;

        FileData(Integer empno, String firstName, String lastName, String job, Integer mgr,
                 Date hireDate, Integer sal, Integer comm, Integer deptno,
                 String rowID, String email, String phone, String favContactImage) {
            this.empno = empno;
            this.firstName = firstName;
            this.lastName = lastName;
            this.job = job;
            this.mgr = mgr;
            this.hireDate = hireDate;
            this.sal = sal;
            this.comm = comm;
            this.deptno = deptno;
            this.rowId = rowID;
            this.email = email;
            this.phone = phone;
            this.favContactImage = favContactImage;
        }

        

        public String getJob() {
            return job;
        }

        public Integer getMgr() {
            return mgr;
        }

        public Date getHireDate() {
            return hireDate;
        }

        public Integer getSal() {
            return sal;
        }

        public Integer getComm() {
            return comm;
        }

        public Integer getDeptno() {
            return deptno;
        }

        public String getRowId() {
            return rowId;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setEmpno(Integer empno) {
            this.empno = empno;
        }

        public Integer getEmpno() {
            return empno;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }

        public void setFavContactImage(String favContactImage) {
            this.favContactImage = favContactImage;
        }

        public String getFavContactImage() {
            return favContactImage;
        }
    }

    public class DemoLOVPopupListener implements LaunchPopupListener {
        public void processLaunch(LaunchPopupEvent event) {
            if (LaunchPopupEvent.PopupType.DROPDOWN_LIST.equals(event.getPopupType())) {
                //DropDown list is launched
                RichInputComboboxListOfValues comboLOV =
                    (RichInputComboboxListOfValues)event.getComponent();
                ListOfValuesModelImpl lovModel =
                    (ListOfValuesModelImpl)comboLOV.getModel();
                String value = (String)event.getSubmittedValue();

                //Here we filter the values in in dropdownlist acording to the value typed in
                lovModel._bean.filterList(value,
                                          lovModel._bean._listenersFilteredList);
            }
        }
    }

    List _values = new ArrayList();
    List _recentValues = new ArrayList();
    List _recentValues1 = new ArrayList();
    List _filteredList = new ArrayList();
    List _listenersFilteredList = new ArrayList();

    //listModel is for the table binding for table in LOV popup dialog
    private CollectionModel listModel = new ListLovCollection();
    //baseModel is for defined for the base component.
    private CollectionModel baseModel = new BaseLovCollection();
    //display attributes.
    private String[] _attrs = new String[] { "ename", "job", "sal", "email" };

    private static List<String> _attributes = new ArrayList<String>();
    static {
        _attributes.add("empno");
        _attributes.add("ename");
        _attributes.add("job");
        _attributes.add("mgr");
        _attributes.add("hireDate");
        _attributes.add("sal");
        _attributes.add("comm");
        _attributes.add("deptno");
        _attributes.add("email");
    }
}

