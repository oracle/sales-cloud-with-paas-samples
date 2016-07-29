package oracle.cloud.doccloud.rest;

/* Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved */

import oracle.cloud.doccloud.types.docCloud.File;
import oracle.cloud.doccloud.types.docCloud.Folder;
import oracle.cloud.doccloud.types.docCloud.Item;

/**
 * Collection of DocCloud Utility functions.
 *
 */



public class DocsUtil {
    public DocsUtil() {
        super();
    }

    public static boolean isFile(String type) { return "file".equals(type); };
    public static boolean isFolder(String type) { return "folder".equals(type); };

    /**
     * Convert an item object to folder object
     * @param item
     * @return
     */
    public static Folder toFolder(Item item)
    {
      if (item == null)
        throw new IllegalArgumentException("Item can not be null");
      if (!isFolder(item.getType()))
        throw new IllegalArgumentException("Item " + item.getName() + "is not a folder");
      Folder f = new Folder();
      f.setId(item.getId());
      f.setName(item.getName());
      f.setSize(item.getSize());
      f.setCreatedTime(item.getCreatedTime());
      f.setModifiedTime(item.getModifiedTime());
      f.setChildItemsCount(item.getChildItemsCount());
      return f;
    }

    /**
     * Convert an item object to file object
     * @param item 
     * @return File object
     */
    public static File toFile(Item item)
    {
      if (item == null)
        throw new IllegalArgumentException("Item can not be null");
      if (!isFile(item.getType()))
        throw new IllegalArgumentException("Item " + item.getName() + "is not a file");
      File f = new File();
      f.setId(item.getId());
      f.setName(item.getName());
      f.setSize(item.getSize());
      f.setCreatedTime(item.getCreatedTime());
      f.setModifiedTime(item.getModifiedTime());
      f.setParentID(item.getParentID());
      return f;
    }    
    
    
}
