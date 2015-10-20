/* SpagoBI, the Open Source Business Intelligence suite

 * Copyright (C) 2012 Engineering Ingegneria Informatica S.p.A. - SpagoBI Competency Center
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0, without the "Incompatible With Secondary Licenses" notice. 
 * If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package it.eng.spagobi.wapp.metadata;
// Generated 9-apr-2008 12.18.27 by Hibernate Tools 3.1.0 beta3



/**
 * SbiMenuRoleId generated by hbm2java
 */

public class SbiMenuRoleId  implements java.io.Serializable {


    // Fields    

     private Integer menuId;
     private Integer extRoleId;


    // Constructors

    /**
     * default constructor.
     */
    public SbiMenuRoleId() {
    }

    
    /**
     * full constructor.
     * 
     * @param menuId the menu id
     * @param extRoleId the ext role id
     */
    public SbiMenuRoleId(Integer menuId, Integer extRoleId) {
        this.menuId = menuId;
        this.extRoleId = extRoleId;
    }
    

   
    // Property accessors

    /**
     * Gets the menu id.
     * 
     * @return the menu id
     */
    public Integer getMenuId() {
        return this.menuId;
    }
    
    /**
     * Sets the menu id.
     * 
     * @param menuId the new menu id
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * Gets the ext role id.
     * 
     * @return the ext role id
     */
    public Integer getExtRoleId() {
        return this.extRoleId;
    }
    
    /**
     * Sets the ext role id.
     * 
     * @param extRoleId the new ext role id
     */
    public void setExtRoleId(Integer extRoleId) {
        this.extRoleId = extRoleId;
    }
   



   /* (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SbiMenuRoleId) ) return false;
		 SbiMenuRoleId castOther = ( SbiMenuRoleId ) other; 
         
		 return ( (this.getMenuId()==castOther.getMenuId()) || ( this.getMenuId()!=null && castOther.getMenuId()!=null && this.getMenuId().equals(castOther.getMenuId()) ) )
 && ( (this.getExtRoleId()==castOther.getExtRoleId()) || ( this.getExtRoleId()!=null && castOther.getExtRoleId()!=null && this.getExtRoleId().equals(castOther.getExtRoleId()) ) );
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMenuId() == null ? 0 : this.getMenuId().hashCode() );
         result = 37 * result + ( getExtRoleId() == null ? 0 : this.getExtRoleId().hashCode() );
         return result;
   }   





}