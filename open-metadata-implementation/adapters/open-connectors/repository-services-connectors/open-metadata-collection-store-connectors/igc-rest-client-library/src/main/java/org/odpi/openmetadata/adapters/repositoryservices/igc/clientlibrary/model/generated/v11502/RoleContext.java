/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.generated.v11502;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * POJO for the 'role_context' asset type in IGC, displayed as 'Role Context' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class RoleContext extends Reference {

    public static String getIgcTypeId() { return "role_context"; }
    public static String getIgcTypeDisplayName() { return "Role Context"; }

    /**
     * The 'context_id' property, displayed as 'Context Id' in the IGC UI.
     */
    protected String context_id;

    /**
     * The 'defines_role_assignment' property, displayed as 'Defines Role Assignment' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link RoleAssignment} objects.
     */
    protected ReferenceList defines_role_assignment;

    /**
     * The 'created_by' property, displayed as 'Created By' in the IGC UI.
     */
    protected String created_by;

    /**
     * The 'created_on' property, displayed as 'Created On' in the IGC UI.
     */
    protected Date created_on;

    /**
     * The 'modified_by' property, displayed as 'Modified By' in the IGC UI.
     */
    protected String modified_by;

    /**
     * The 'modified_on' property, displayed as 'Modified On' in the IGC UI.
     */
    protected Date modified_on;


    /** @see #context_id */ @JsonProperty("context_id")  public String getContextId() { return this.context_id; }
    /** @see #context_id */ @JsonProperty("context_id")  public void setContextId(String context_id) { this.context_id = context_id; }

    /** @see #defines_role_assignment */ @JsonProperty("defines_role_assignment")  public ReferenceList getDefinesRoleAssignment() { return this.defines_role_assignment; }
    /** @see #defines_role_assignment */ @JsonProperty("defines_role_assignment")  public void setDefinesRoleAssignment(ReferenceList defines_role_assignment) { this.defines_role_assignment = defines_role_assignment; }

    /** @see #created_by */ @JsonProperty("created_by")  public String getCreatedBy() { return this.created_by; }
    /** @see #created_by */ @JsonProperty("created_by")  public void setCreatedBy(String created_by) { this.created_by = created_by; }

    /** @see #created_on */ @JsonProperty("created_on")  public Date getCreatedOn() { return this.created_on; }
    /** @see #created_on */ @JsonProperty("created_on")  public void setCreatedOn(Date created_on) { this.created_on = created_on; }

    /** @see #modified_by */ @JsonProperty("modified_by")  public String getModifiedBy() { return this.modified_by; }
    /** @see #modified_by */ @JsonProperty("modified_by")  public void setModifiedBy(String modified_by) { this.modified_by = modified_by; }

    /** @see #modified_on */ @JsonProperty("modified_on")  public Date getModifiedOn() { return this.modified_on; }
    /** @see #modified_on */ @JsonProperty("modified_on")  public void setModifiedOn(Date modified_on) { this.modified_on = modified_on; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return true; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "context_id",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = Arrays.asList(
        "defines_role_assignment"
    );
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "context_id",
        "defines_role_assignment",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isRoleContext(Object obj) { return (obj.getClass() == RoleContext.class); }

}
