package com.oracle.fuse.session;


//import com.oracle.fuse.regions.ApplicationShellBean;

import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.layout.RichPanelSpringboard;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;

import oracle.adf.view.rich.component.rich.nav.RichCommandToolbarButton;

import org.apache.myfaces.trinidad.event.DisclosureEvent;


public class SessionStateBean {

    private RichCommandToolbarButton itemOne;
    private RichCommandToolbarButton itemTwo;
    private RichCommandToolbarButton itemThree;
    private RichShowDetailItem iconItemOne;
    private RichShowDetailItem iconItemTwo;
    private RichShowDetailItem iconItemThree;
    private RichShowDetailItem iconItemFour;
    private RichShowDetailItem iconItemFive;
    private RichShowDetailItem iconItemSix;
    private RichShowDetailItem iconItemEight;
    private RichShowDetailItem iconItemNine;

    public SessionStateBean() {
        super();
    }

    private int itemGroup = 1;
    private boolean forceRefresh = false;
    private boolean forceRefresh_CareerPlanning = false;
    private boolean forceRefresh_Goals = false;
    private boolean forceRefresh_Appointments = false;
    private boolean forceRefresh_Appointments_Participants = false;
    private boolean forceRefresh_Appointments_Edit = false;
    private boolean forceRefresh_Appointments_Create = false;
    private boolean forceRefresh_Customers = false;
    private boolean forceRefresh_Leads = false;
    private boolean forceRefresh_Leads_Notes = false;

    private boolean forceRefresh_Opportunities = false;
    private boolean forceRefresh_Opportunities_Notes = false;
    private boolean forceRefresh_Contacts = false;
    private boolean forceRefresh_Contacts_Notes = false;
    private boolean forceRefresh_Contacts_Details = false;
    private boolean forceRefresh_Opportunities_Interactions = false;
    private boolean forceRefresh_Leads_Interactions = false;
    private boolean forceRefresh_Interactions_Edit = false;
    private boolean forceRefresh_Interactions_ManageContacts = false;
    private boolean forceRefresh_Personal_Information = false;
    private boolean forceRefresh_Customer_Opportunities = false;
    private boolean forceRefresh_Contacts_Opportunities = false;
    private boolean forceRefresh_Oppty_ManageResources = false;
    private boolean forceRefresh_Oppty_EditSummary = false;
    private RichPanelSpringboard springboard_component;

    public void setSpringboard_component(RichPanelSpringboard springboard_component) {
        this.springboard_component = springboard_component;
    }

    public RichPanelSpringboard getSpringboard_component() {
        return springboard_component;
    }


    /*Announcements Support*/
    private String announcements =
        "<div id=\"home-content\" class=\"md-background page-link\" style=\"opacity: 1; left: 25px; \"><h3>EMPLOYEE NEWS</h3><h4>Use Corporate Credit Card to Best Manage Company Expenses</h4><p>To best manage company expenses, the use of an Vision corporate credit card is required for all business expenses whenever possible. Visit the <a href=\"#\">Vision Corporate Card Website</a> to view card availability in your country.</p><ul><li>The card is to be used for business expenses only?personal use is strictly prohibited.</li><li>Failure to use the card can delay reimbursement of business expenses.</li></ul><h4>FY11 Global Year End Performance Documents</h4><p><a href=\"#\">Prepare FY11 Year End Performance Self-Assessment</a></p><p></p></div>";

    private String crm_announcements =
        "<div id='home-content' class='md-background page-link' style='opacity: 1; left: 25px; '><h3 style='font-size: small; '>NEWS</h3><h4><span style='font-size: large;'>24</span><span style='font-size: small;'> days to Close of Quarter</span></h4><p style='font-size: small; '><ul><li>Submit your travel expenses</li><li>Work with legal and contract team for a timely close</li><li>Submit your forecast for next quarter</li></ul><p><span style='font-weight: bold;'>Win of the Week</span><br></p><ul><li><a href='#'>Startek Research Inc</a><br></li></ul><p></p><p><span style='font-weight: bold;'>In the Know</span><br></p><ul><li>3 days to go for <a href='#'>Enterprise Systems Executive Summit</a>&nbsp;</li><li>Have you watched the <a href='#'>winning sales cycle video</a> yet?</li><li>Spotlight Feature: <a href='#'>Building Engineered Systems</a></li><li><a href='#'>Product Roadmap Webinar</a> rolled out</li><li><a href='#'>Opportunity Checklist</a> updated<br></li><li><a href='#'>TexMagic Group buys Simplydot systems</a></li></ul></p><p style='font-size: small; '><br></p><p style='font-size: small; '></p></div>";
    private String hcm_announcements =
        "<div id=\"home-content\" class=\"md-background page-link\" style=\"opacity: 1; left: 25px; \"><h3 style=\"font-family: Tahoma; \"><span style=\"font-size: medium;\">Employee News</span></h3><h4 style=\"font-family: Tahoma; font-size: small; \">Expense Reports and payable invoices submission guidelines for end of quarter<br><span style=\"font-weight: normal;\">As the end of the quarter approaches, please be aware of the following accounts payable invoice and expense reimbursements close cutoff so you can make sure your expenses are reflected by end of quarter.</span></h4><p><ul style=\"font-family: Tahoma; font-size: small; \"><li><span style=\"font-weight: bold;\">Expense Reports</span> must be entered with receipts scanned/submitted and approved by management by the end of the month.</li><li><span style=\"font-weight: bold;\">Invoices</span> must be scanned/submitted to the Accounts Payable team for entry by the end of the month</li></ul><span style=\"font-family: Tahoma; font-size: small;\"><p><span style=\"font-family: Tahoma; font-size: small;\"><br></span></p><span style=\"font-weight: bold;\">Benefits Open Enrollment Begins in 10 Days!<br></span></span><span style=\"font-family: Tahoma; font-size: small; \">Review your <a href=\"#\">current elections</a>.</span></p><p><span style=\"font-family: Tahoma; font-size: small; \"><br><span style=\"font-weight: bold;\">Global Performance Review<br></span></span><span style=\"font-family: Tahoma; font-size: small; \"><a href=\"#\">Prepare for your performance self-assessment</a></span></p><p><span style=\"font-family: Tahoma; font-size: small;\"><br></span></p><p style=\"font-family: Tahoma; font-size: small; \"></p></div>";
    private String all_announcements =
        "<div id=\"home-content\" class=\"md-background page-link\" style=\"opacity: 1; left: 25px; \"><h3>EMPLOYEE NEWS</h3><h4>Use Corporate Credit Card to Best Manage Company Expenses</h4><p>To best manage company expenses, the use of an Vision corporate credit card is required for all business expenses whenever possible. Visit the <a href=\"#\">Vision Corporate Card Website</a> to view card availability in your country.</p><ul><li>The card is to be used for business expenses only?personal use is strictly prohibited.</li><li>Failure to use the card can delay reimbursement of business expenses.</li></ul><h4>FY11 Global Year End Performance Documents</h4><p><a href=\"#\">Prepare FY11 Year End Performance Self-Assessment</a></p><p></p></div>";
    private String admin_announcements =
        "<div id=\"home-content\" class=\"md-background page-link\" style=\"opacity: 1; left: 25px; \"><h3>ADMIN NEWS</h3><h4>Use Corporate Credit Card to Best Manage Company Expenses</h4><p>To best manage company expenses, the use of an Vision corporate credit card is required for all business expenses whenever possible. Visit the <a href=\"#\">Vision Corporate Card Website</a> to view card availability in your country.</p><ul><li>The card is to be used for business expenses only?personal use is strictly prohibited.</li><li>Failure to use the card can delay reimbursement of business expenses.</li></ul><h4>FY11 Global Year End Performance Documents</h4><p><a href=\"#\">Prepare FY11 Year End Performance Self-Assessment</a></p><p></p></div>";


//    public void setAnnouncements(String s) {
//
//        ApplicationShellBean applicationShell =
//            (ApplicationShellBean)FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get("ApplicationShellBean");
//
//        applicationShell.setAnnouncements(s);
//        this.announcements = s;
//    }
//
//    public String getAnnouncements() {
//        ApplicationShellBean applicationShell =
//            (ApplicationShellBean)FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get("ApplicationShellBean");
//
//        this.announcements = applicationShell.getAnnouncements();
//        return announcements;
//    }

    /*Role Based UI Support*/
    private String role = "all";

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

//    public void changeRoleToAdmin() {
//        setRole("admin");
//        setAnnouncements(admin_announcements);
//        objectNavigatorItem = "Settings";
//        refreshUI();
//    }
//
//    public void changeRoleToAll() {
//        setRole("all");
//        setAnnouncements(all_announcements);
//        objectNavigatorItem = "Social";
//        refreshUI();
//    }
//
//    public void changeRoleToCRM() {
//        setRole("crm");
//        setAnnouncements(crm_announcements);
//        objectNavigatorItem = "Opportunities";
//        refreshUI();
//    }
//
//    public void changeRoleToHCM() {
//        setRole("hcm");
//        setAnnouncements(hcm_announcements);
//        objectNavigatorItem = "Personal Information";
//        refreshUI();
//    }

    private String userType;

//    public void setUserType(String user_id) {
//        if (user_id.equals("hcm"))
//            changeRoleToHCM();
//        else if (user_id.equals("crm"))
//            changeRoleToCRM();
//        else if (user_id.equals("all"))
//            changeRoleToAll();
//        else
//            changeRoleToAdmin();
//    }

    public Boolean getRenderOpportunities() {
        return (role.equals("admin") || role.equals("crm") ||
                role.equals("all"));
    }

    public Boolean getRenderLeads() {
        return (role.equals("admin") || role.equals("crm") ||
                role.equals("all"));
    }

    public Boolean getRenderCustomers() {
        return (role.equals("admin") || role.equals("crm") ||
                role.equals("all"));
    }

    public Boolean getRenderCustomerContacts() {
        return (role.equals("admin") || role.equals("crm") ||
                role.equals("all"));
    }

    public Boolean getRenderPersonalInfo() {
        return (role.equals("admin") || role.equals("no-crm") ||
                role.equals("hcm") || role.equals("all"));
    }

    public Boolean getRenderDirectory() {
        return (role.equals("admin") || role.equals("no-crm") ||
                role.equals("hcm") || role.equals("all"));
    }

    public Boolean getRenderTime() {
        return (role.equals("admin") || role.equals("no-hcm") ||
                role.equals("crm") || role.equals("all"));
    }

    public Boolean getRenderSocial() {
        return (role.equals("no-admin") || role.equals("crm") ||
                role.equals("hcm") || role.equals("all"));
    }

    public Boolean getRenderCareer() {
        return (role.equals("admin") || role.equals("no-crm") ||
                role.equals("hcm") || role.equals("all"));
    }

    public Boolean getRenderNavigator() {
        return (role.equals("admin") || role.equals("crm") ||
                role.equals("hcm") || role.equals("all"));
    }

    public Boolean getRenderSettings() {
        return (role.equals("admin") || role.equals("crm") ||
                role.equals("hcm"));
    }


    public Boolean getIsHCMUser() {
        return (role.equals("admin") || role.equals("hcm") ||
                role.equals("all"));
    }

    public Boolean getIsCRMUser() {
        return (role.equals("admin") || role.equals("crm") ||
                role.equals("all"));
    }

    public Boolean getIsAdminUser() {
        return role.equals("admin");
    }


    public String getSelectedTaskFlow() {
        if (role.equals("hcm"))
            return "Directory";
        else if (role.equals("crm"))
            return "Opportunities";
        else if (role.equals("all"))
            return "Opportunities";
        else
            return "Opportunities";
    }


    private String objectNavigatorItem = "";

    public String getObjectNavigatorItem() {
        return objectNavigatorItem;
    }

    public void setObjectNavigatorItem(String s) {
        this.objectNavigatorItem = s;
    }

    private String objectNavigatorIconStripMode = "no";

    public String getObjectNavigatorIconStripMode() {
        return objectNavigatorIconStripMode;
    }

    public void setObjectNavigatorIconStripMode(String s) {
        this.objectNavigatorIconStripMode = s;
    }

    private String objectNavigatorMode = "grid";


    public String getObjectNavigatorMode() {
        return objectNavigatorMode;
    }

    public void setObjectNavigatorMode(String s) {
        this.objectNavigatorMode = s;
    }

    /* delays task flow load to allow springboard animation to complete*/

    public void delay(DisclosureEvent disclosureEvent) {
        RichShowDetailItem sdi =
            (RichShowDetailItem)disclosureEvent.getSource();
        objectNavigatorItem = sdi.getText();
        objectNavigatorIconStripMode = "yes";
        objectNavigatorMode = "strip";
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
        }
    }

    public void objectNavigator_SetGridMode(ActionEvent actionEvent) {
        objectNavigatorIconStripMode = "no";
        objectNavigatorMode = "grid";
        //springboard_component.setSprung("no");
        springboard_component.setDisplayMode("grid");
    }


    public void killSession() {

        objectNavigatorIconStripMode = "no";
        objectNavigatorMode = "grid";
        //springboard_component.setSprung("no");
        springboard_component.setDisplayMode("grid");
        /*
        HttpServletResponse response = ((HttpServletResponse)ADFContext.getCurrent().getEnvironment().getResponse());
        HttpServletRequest request = ((HttpServletRequest)ADFContext.getCurrent().getEnvironment().getRequest());
        HttpSession sessionADF = request.getSession();
        sessionADF.invalidate();
        */
    }

    public void refreshUI() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String refreshpage = facesContext.getViewRoot().getViewId();
        ViewHandler viewHandler =
            facesContext.getApplication().getViewHandler();
        UIViewRoot viewroot =
            viewHandler.createView(facesContext, refreshpage);
        viewroot.setViewId(refreshpage);
        facesContext.setViewRoot(viewroot);
    }


    public void setForceRefresh(boolean forceRefresh) {
        this.forceRefresh = forceRefresh;
    }

    public boolean getForceRefresh() {
        return forceRefresh;
    }


    public void setForceRefresh_Appointments(boolean forceRefresh_Appointments) {
        this.forceRefresh_Appointments = forceRefresh_Appointments;
    }

    public boolean isForceRefresh_Appointments() {
        return forceRefresh_Appointments;
    }

    public void setForceRefresh_Leads(boolean forceRefresh_Leads) {
        this.forceRefresh_Leads = forceRefresh_Leads;
    }

    public boolean isForceRefresh_Leads() {
        return forceRefresh_Leads;
    }

    public void setForceRefresh_Leads_Notes(boolean forceRefresh_Leads_Notes) {
        this.forceRefresh_Leads_Notes = forceRefresh_Leads_Notes;
    }

    public boolean isForceRefresh_Leads_Notes() {
        return forceRefresh_Leads_Notes;
    }


    public void setForceRefresh_Opportunities(boolean forceRefresh_Opportunities) {
        this.forceRefresh_Opportunities = forceRefresh_Opportunities;
    }

    public boolean isForceRefresh_Opportunities() {
        return forceRefresh_Opportunities;
    }

    public void setForceRefresh_Opportunities_Notes(boolean forceRefresh_Opportunities_Notes) {
        this.forceRefresh_Opportunities_Notes =
                forceRefresh_Opportunities_Notes;
    }

    public boolean isForceRefresh_Opportunities_Notes() {
        return forceRefresh_Opportunities_Notes;
    }


    public void setForceRefresh_Contacts(boolean forceRefresh_Contacts) {
        this.forceRefresh_Contacts = forceRefresh_Contacts;
    }

    public boolean isForceRefresh_Contacts() {
        return forceRefresh_Contacts;
    }


    public void setForceRefresh_Opportunities_Interactions(boolean forceRefresh_Opportunities_Interactions) {
        this.forceRefresh_Opportunities_Interactions =
                forceRefresh_Opportunities_Interactions;
    }

    public boolean isForceRefresh_Opportunities_Interactions() {
        return forceRefresh_Opportunities_Interactions;
    }

    public void setForceRefresh_Contacts_Details(boolean forceRefresh_Contacts_Details) {
        this.forceRefresh_Contacts_Details = forceRefresh_Contacts_Details;
    }

    public boolean isForceRefresh_Contacts_Details() {
        return forceRefresh_Contacts_Details;
    }

    public void setForceRefresh_Customers(boolean forceRefresh_Customers) {
        this.forceRefresh_Customers = forceRefresh_Customers;
    }

    public boolean isForceRefresh_Customers() {
        return forceRefresh_Customers;
    }


    public void setForceRefresh_CareerPlanning(boolean forceRefresh_CareerPlanning) {
        this.forceRefresh_CareerPlanning = forceRefresh_CareerPlanning;
    }

    public boolean isForceRefresh_CareerPlanning() {
        return forceRefresh_CareerPlanning;
    }

    public void setForceRefresh_Goals(boolean forceRefresh_Goals) {
        this.forceRefresh_Goals = forceRefresh_Goals;
    }

    public boolean isForceRefresh_Goals() {
        return forceRefresh_Goals;
    }


    public void setForceRefresh_Personal_Information(boolean forceRefresh_Personal_Information) {
        this.forceRefresh_Personal_Information =
                forceRefresh_Personal_Information;
    }

    public boolean isForceRefresh_Personal_Information() {
        return forceRefresh_Personal_Information;
    }

    public void setForceRefresh_Leads_Interactions(boolean forceRefresh_Leads_Interactions) {
        this.forceRefresh_Leads_Interactions = forceRefresh_Leads_Interactions;
    }

    public boolean isForceRefresh_Leads_Interactions() {
        return forceRefresh_Leads_Interactions;
    }

    public String previousItem() {
        int itemGroup = getItemGroup();
        itemGroup--;
        if (itemGroup < 1)
            itemGroup = 3;
        setItemGroup(itemGroup);
        changeItemMenu(itemGroup);
        return null;
    }

    public String nextItem() {
        int itemGroup = getItemGroup();
        itemGroup++;
        if (itemGroup > 3)
            itemGroup = 1;
        setItemGroup(itemGroup);
        changeItemMenu(itemGroup);
        return null;
    }

    public String itemOneAction() {
        changeItemMenu(1);
        return null;
    }

    public String itemTwoAction() {
        changeItemMenu(2);
        return null;
    }

    public String itemThreeAction() {
        changeItemMenu(3);
        return null;
    }

    public void setItemGroup(int itemGroup) {
        this.itemGroup = itemGroup;
    }

    public int getItemGroup() {
        return itemGroup;
    }

    public void changeItemMenu(int itemGroup) {
        RichCommandToolbarButton itemOne = getItemOne();
        RichCommandToolbarButton itemTwo = getItemTwo();
        RichCommandToolbarButton itemThree = getItemThree();

        RichShowDetailItem iconItemOne = getIconItemOne();
        RichShowDetailItem iconItemTow = getIconItemTwo();
        RichShowDetailItem iconItemThree = getIconItemThree();
        RichShowDetailItem iconItemFour = getIconItemFour();
        RichShowDetailItem iconItemFive = getIconItemFive();
        RichShowDetailItem iconItemSix = getIconItemSix();
        RichShowDetailItem iconItemEight = getIconItemEight();
        RichShowDetailItem iconItemNine = getIconItemNine();

        String pathImage = "/skins/images/object-navigator/";
        String mateImage = "matte/";
        String richImage = "rich/";
        String shinyImage = "shiny/";

        if (itemGroup > 3)
            itemGroup = 1;
        else if (itemGroup < 1)
            itemGroup = 3;


        switch (itemGroup) {
        case 1:
            itemOne.setIcon("/skins/images/icons/fuse-icon-panel-active.png");
            itemTwo.setIcon("/skins/images/icons/fuse-icon-panel-inactive.png");
            itemThree.setIcon("/skins/images/icons/fuse-icon-panel-inactive.png");
            iconItemOne.setIcon(pathImage + mateImage +
                                "fuse-obj-nav-matte-opportunities.png");
            iconItemTow.setIcon(pathImage + mateImage +
                                "fuse-obj-nav-matte-leads.png");
            iconItemThree.setIcon(pathImage + mateImage +
                                  "fuse-obj-nav-matte-customers.png");
            iconItemFour.setIcon(pathImage + mateImage +
                                 "fuse-obj-nav-matte-customercontact.png");
            iconItemFive.setIcon(pathImage + mateImage +
                                 "fuse-obj-nav-matte-social.png");
            iconItemSix.setIcon(pathImage + mateImage +
                                "fuse-obj-nav-matte-notifications.png");
            iconItemEight.setIcon(pathImage + mateImage +
                                  "fuse-obj-nav-matte-navigator.png");
            iconItemNine.setIcon(pathImage + mateImage +
                                 "fuse-obj-nav-matte-settings.png");
            break;
        case 2:
            itemOne.setIcon("/skins/images/icons/fuse-icon-panel-inactive.png");
            itemTwo.setIcon("/skins/images/icons/fuse-icon-panel-active.png");
            itemThree.setIcon("/skins/images/icons/fuse-icon-panel-inactive.png");
            iconItemOne.setIcon(pathImage + richImage +
                                "fuse-obj-nav-rich-opportunities.png");
            iconItemTow.setIcon(pathImage + richImage +
                                "fuse-obj-nav-rich-leads.png");
            iconItemThree.setIcon(pathImage + richImage +
                                  "fuse-obj-nav-rich-customers.png");
            iconItemFour.setIcon(pathImage + richImage +
                                 "fuse-obj-nav-rich-customercontact.png");
            iconItemFive.setIcon(pathImage + richImage +
                                 "fuse-obj-nav-rich-social.png");
            iconItemSix.setIcon(pathImage + richImage +
                                "fuse-obj-nav-rich-notifications.png");
            iconItemEight.setIcon(pathImage + richImage +
                                  "fuse-obj-nav-rich-navigator.png");
            iconItemNine.setIcon(pathImage + richImage +
                                 "fuse-obj-nav-rich-settings.png");
            break;
        case 3:
            itemOne.setIcon("/skins/images/icons/fuse-icon-panel-inactive.png");
            itemTwo.setIcon("/skins/images/icons/fuse-icon-panel-inactive.png");
            itemThree.setIcon("/skins/images/icons/fuse-icon-panel-active.png");
            iconItemOne.setIcon(pathImage + shinyImage +
                                "fuse-obj-nav-shiny-opportunities.png");
            iconItemTow.setIcon(pathImage + shinyImage +
                                "fuse-obj-nav-shiny-leads.png");
            iconItemThree.setIcon(pathImage + shinyImage +
                                  "fuse-obj-nav-shiny-customers.png");
            iconItemFour.setIcon(pathImage + shinyImage +
                                 "fuse-obj-nav-shiny-customercontact.png");
            iconItemFive.setIcon(pathImage + shinyImage +
                                 "fuse-obj-nav-shiny-social.png");
            iconItemSix.setIcon(pathImage + shinyImage +
                                "fuse-obj-nav-shiny-notifications.png");
            iconItemEight.setIcon(pathImage + shinyImage +
                                  "fuse-obj-nav-shiny-navigator.png");
            iconItemNine.setIcon(pathImage + shinyImage +
                                 "fuse-obj-nav-shiny-settings.png");
            break;
        default:
            break;
        }

        setItemOne(itemOne);
        setItemTwo(itemTwo);
        setItemThree(itemThree);

        setItemGroup(itemGroup);


    }

    public void setItemOne(RichCommandToolbarButton itemOne) {
        this.itemOne = itemOne;
    }

    public RichCommandToolbarButton getItemOne() {
        return itemOne;
    }

    public void setItemTwo(RichCommandToolbarButton itemTwo) {
        this.itemTwo = itemTwo;
    }

    public RichCommandToolbarButton getItemTwo() {
        return itemTwo;
    }

    public void setItemThree(RichCommandToolbarButton itemThree) {
        this.itemThree = itemThree;


    }

    public RichCommandToolbarButton getItemThree() {
        return itemThree;


    }

    public void setIconItemOne(RichShowDetailItem iconItemOne) {
        this.iconItemOne = iconItemOne;


    }

    public RichShowDetailItem getIconItemOne() {
        return iconItemOne;


    }

    public void setIconItemTwo(RichShowDetailItem iconItemTwo) {
        this.iconItemTwo = iconItemTwo;


    }

    public RichShowDetailItem getIconItemTwo() {
        return iconItemTwo;


    }

    public void setIconItemThree(RichShowDetailItem iconItemThree) {
        this.iconItemThree = iconItemThree;


    }

    public RichShowDetailItem getIconItemThree() {
        return iconItemThree;


    }

    public void setIconItemFour(RichShowDetailItem iconItemFour) {
        this.iconItemFour = iconItemFour;


    }

    public RichShowDetailItem getIconItemFour() {
        return iconItemFour;


    }

    public void setIconItemFive(RichShowDetailItem iconItemFive) {
        this.iconItemFive = iconItemFive;


    }

    public RichShowDetailItem getIconItemFive() {
        return iconItemFive;


    }

    public void setIconItemSix(RichShowDetailItem iconItemSix) {
        this.iconItemSix = iconItemSix;


    }

    public RichShowDetailItem getIconItemSix() {
        return iconItemSix;


    }

    public void setIconItemEight(RichShowDetailItem iconItemEight) {
        this.iconItemEight = iconItemEight;


    }

    public RichShowDetailItem getIconItemEight() {
        return iconItemEight;


    }

    public void setIconItemNine(RichShowDetailItem iconItemNine) {
        this.iconItemNine = iconItemNine;


    }

    public RichShowDetailItem getIconItemNine() {
        return iconItemNine;


    }


    public void setForceRefresh_Contacts_Notes(boolean forceRefresh_Contacts_Notes) {
        this.forceRefresh_Contacts_Notes = forceRefresh_Contacts_Notes;
    }

    public boolean isForceRefresh_Contacts_Notes() {
        return forceRefresh_Contacts_Notes;
    }

    public void setForceRefresh_Customer_Opportunities(boolean forceRefresh_Customer_Opportunities) {
        this.forceRefresh_Customer_Opportunities =
                forceRefresh_Customer_Opportunities;
    }

    public boolean isForceRefresh_Customer_Opportunities() {
        return forceRefresh_Customer_Opportunities;
    }

    public void setForceRefresh_Contacts_Opportunities(boolean forceRefresh_Contacts_Opportunities) {
        this.forceRefresh_Contacts_Opportunities =
                forceRefresh_Contacts_Opportunities;
    }

    public boolean isForceRefresh_Contacts_Opportunities() {
        return forceRefresh_Contacts_Opportunities;
    }

    public void setForceRefresh_Appointments_Participants(boolean forceRefresh_Appointments_Participants) {
        this.forceRefresh_Appointments_Participants =
                forceRefresh_Appointments_Participants;
    }

    public boolean isForceRefresh_Appointments_Participants() {
        return forceRefresh_Appointments_Participants;
    }

    public void setForceRefresh_Appointments_Edit(boolean forceRefresh_Appointments_Edit) {
        this.forceRefresh_Appointments_Edit = forceRefresh_Appointments_Edit;
    }

    public boolean isForceRefresh_Appointments_Edit() {
        return forceRefresh_Appointments_Edit;
    }

    public void setForceRefresh_Appointments_Create(boolean forceRefresh_Appointments_Create) {
        this.forceRefresh_Appointments_Create =
                forceRefresh_Appointments_Create;
    }

    public boolean isForceRefresh_Appointments_Create() {
        return forceRefresh_Appointments_Create;
    }

    public void setForceRefresh_Interactions_Edit(boolean forceRefresh_Interactions_Edit) {
        this.forceRefresh_Interactions_Edit = forceRefresh_Interactions_Edit;
    }

    public boolean isForceRefresh_Interactions_Edit() {
        return forceRefresh_Interactions_Edit;
    }

    public void setForceRefresh_Interactions_ManageContacts(boolean forceRefresh_Interactions_ManageContacts) {
        this.forceRefresh_Interactions_ManageContacts =
                forceRefresh_Interactions_ManageContacts;
    }

    public boolean isForceRefresh_Interactions_ManageContacts() {
        return forceRefresh_Interactions_ManageContacts;
    }

    public void setForceRefresh_Oppty_ManageResources(boolean forceRefresh_Oppty_ManageResources) {
        this.forceRefresh_Oppty_ManageResources =
                forceRefresh_Oppty_ManageResources;
    }

    public boolean isForceRefresh_Oppty_ManageResources() {
        return forceRefresh_Oppty_ManageResources;
    }

    public void setForceRefresh_Oppty_EditSummary(boolean forceRefresh_Oppty_EditSummary) {
        this.forceRefresh_Oppty_EditSummary = forceRefresh_Oppty_EditSummary;
    }

    public boolean isForceRefresh_Oppty_EditSummary() {
        return forceRefresh_Oppty_EditSummary;
    }
}
