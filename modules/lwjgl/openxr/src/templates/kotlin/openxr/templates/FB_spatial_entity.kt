/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity = "FBSpatialEntity".nativeClassXR("FB_spatial_entity", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_spatial_entity">XR_FB_spatial_entity</a> extension.

        This extension enables applications to use spatial entities to specify world-locked frames of reference. It enables applications to persist the real world location of content over time and contains definitions for the Entity-Component System. All Facebook spatial entity and scene extensions are dependent on this one.

        We use OpenXR {@code XrSpace} handles to give applications access to spatial entities such as Spatial Anchors. In other words, any operation which involves spatial entities uses {@code XrSpace} handles to identify the affected spatial entities.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.

        This extension allows:

        <ul>
            <li>An application to create a Spatial Anchor (a type of spatial entity).</li>
            <li>An application to enumerate supported components for a given spatial entity.</li>
            <li>An application to enable or disable a component for a given spatial entity.</li>
            <li>An application to get the status of a component for a given spatial entity.</li>
        </ul>
        """

    IntConstant(
        "The extension specification version.",

        "FB_spatial_entity_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "FB_SPATIAL_ENTITY_EXTENSION_NAME".."XR_FB_spatial_entity"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB".."1000113004",
        "TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB".."1000113003",
        "TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB".."1000113007",
        "TYPE_SPACE_COMPONENT_STATUS_FB".."1000113001",
        "TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB".."1000113005",
        "TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB".."1000113006"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB".."-1000113000",
        "ERROR_SPACE_COMPONENT_NOT_ENABLED_FB".."-1000113001",
        "ERROR_SPACE_COMPONENT_STATUS_PENDING_FB".."-1000113002",
        "ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB".."-1000113003"
    )

    EnumConstant(
        """
        XrSpaceComponentTypeFB - Component type

        <h5>Description</h5>
        Specify the component interfaces attached to the spatial entity.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SPACE_COMPONENT_TYPE_LOCATABLE_FB — Enables tracking the 6 DOF pose of the {@code XrSpace} with #LocateSpace().</li>
            <li>#SPACE_COMPONENT_TYPE_STORABLE_FB — Enables persistence operations: save and erase.</li>
            <li>#SPACE_COMPONENT_TYPE_SHARABLE_FB — Enables sharing of spatial entities.</li>
            <li>#SPACE_COMPONENT_TYPE_BOUNDED_2D_FB — Bounded 2D component.</li>
            <li>#SPACE_COMPONENT_TYPE_BOUNDED_3D_FB — Bounded 3D component.</li>
            <li>#SPACE_COMPONENT_TYPE_SEMANTIC_LABELS_FB — Semantic labels component.</li>
            <li>#SPACE_COMPONENT_TYPE_ROOM_LAYOUT_FB — Room layout component.</li>
            <li>#SPACE_COMPONENT_TYPE_SPACE_CONTAINER_FB — Space container component.</li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataSpaceSetStatusCompleteFB, ##XrSpaceComponentFilterInfoFB, ##XrSpaceComponentStatusSetInfoFB, #EnumerateSpaceSupportedComponentsFB(), #GetSpaceComponentStatusFB()
        """,

        "SPACE_COMPONENT_TYPE_LOCATABLE_FB".."0",
        "SPACE_COMPONENT_TYPE_STORABLE_FB".."1",
        "SPACE_COMPONENT_TYPE_SHARABLE_FB".."2",
        "SPACE_COMPONENT_TYPE_BOUNDED_2D_FB".."3",
        "SPACE_COMPONENT_TYPE_BOUNDED_3D_FB".."4",
        "SPACE_COMPONENT_TYPE_SEMANTIC_LABELS_FB".."5",
        "SPACE_COMPONENT_TYPE_ROOM_LAYOUT_FB".."6",
        "SPACE_COMPONENT_TYPE_SPACE_CONTAINER_FB".."7"
    )

    XrResult(
        "CreateSpatialAnchorFB",
        """
        Creates a new spatial anchor.

        <h5>C Specification</h5>
        The #CreateSpatialAnchorFB() function is defined as:

        <pre><code>
￿XrResult xrCreateSpatialAnchorFB(
￿    XrSession                                   session,
￿    const XrSpatialAnchorCreateInfoFB*          info,
￿    XrAsyncRequestIdFB*                         requestId);</code></pre>

        <h5>Description</h5>
        Creates a Spatial Anchor using the specified tracking origin and pose relative to the specified tracking origin. The anchor will be locatable at the time of creation, and the 6 DOF pose relative to the tracking origin <b>can</b> be queried using the #LocateSpace() method. This operation is asynchronous and the runtime <b>must</b> post an ##XrEventDataSpatialAnchorCreateCompleteFB event when the operation completes successfully or encounters an error. If this function returns a failure code, no event is posted. The {@code requestId} <b>can</b> be used to later refer to the request, such as identifying which request has completed when an ##XrEventDataSpatialAnchorCreateCompleteFB is posted to the event queue.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to calling #CreateSpatialAnchorFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrSpatialAnchorCreateInfoFB structure</li>
            <li>{@code requestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorCreateInfoFB
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpatialAnchorCreateInfoFB.const.p("info", "a pointer to an ##XrSpatialAnchorCreateInfoFB structure containing information about how to create the anchor."),
        Check(1)..XrAsyncRequestIdFB.p("requestId", "the output parameter that points to the ID of this asynchronous request.")
    )

    XrResult(
        "GetSpaceUuidFB",
        """
        Gets an entity.

        <h5>C Specification</h5>
        The #GetSpaceUuidFB() function is defined as:

        <pre><code>
￿XrResult xrGetSpaceUuidFB(
￿    XrSpace                                     space,
￿    XrUuidEXT*                                  uuid);</code></pre>

        <h5>Description</h5>
        Gets the UUID for a spatial entity. If this space was previously created as a spatial anchor, {@code uuid} <b>must</b> be equal to the ##XrEventDataSpatialAnchorCreateCompleteFB{@code ::uuid} in the event corresponding to the creation of that space. Subsequent calls to #GetSpaceUuidFB() using the same {@code XrSpace} <b>must</b> return the same ##XrUuidEXT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to calling #GetSpaceUuidFB()</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code uuid} <b>must</b> be a pointer to an ##XrUuidEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrUuidEXT
        """,

        XrSpace("space", "the {@code XrSpace} handle of a spatial entity."),
        XrUuidEXT.p("uuid", "an output parameter pointing to the entity’s UUID.")
    )

    XrResult(
        "EnumerateSpaceSupportedComponentsFB",
        """
        Enumerates supported components for a given spatial entity.

        <h5>C Specification</h5>
        The #EnumerateSpaceSupportedComponentsFB() function is defined as:

        <pre><code>
￿XrResult xrEnumerateSpaceSupportedComponentsFB(
￿    XrSpace                                     space,
￿    uint32_t                                    componentTypeCapacityInput,
￿    uint32_t*                                   componentTypeCountOutput,
￿    XrSpaceComponentTypeFB*                     componentTypes);</code></pre>

        <h5>Description</h5>
        Lists any component types that an entity supports. The list of component types available for an entity depends on which extensions are enabled. Component types <b>must</b> not be enumerated unless the corresponding extension that defines them is also enabled.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to calling #EnumerateSpaceSupportedComponentsFB()</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code componentTypeCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code componentTypeCapacityInput} is not 0, {@code componentTypes} <b>must</b> be a pointer to an array of {@code componentTypeCapacityInput} {@code XrSpaceComponentTypeFB} values</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrSpace("space", "the {@code XrSpace} handle to the spatial entity."),
        AutoSize("componentTypes")..uint32_t("componentTypeCapacityInput", "the capacity of the {@code componentTypes} array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("componentTypeCountOutput", "a pointer to the count of {@code componentTypes} written, or a pointer to the required capacity in the case that {@code componentTypeCapacityInput} is insufficient."),
        nullable..XrSpaceComponentTypeFB.p("componentTypes", "a pointer to an array of {@code XrSpaceComponentTypeFB} values, but <b>can</b> be {@code NULL} if {@code componentTypeCapacityInput} is 0.")
    )

    XrResult(
        "SetSpaceComponentStatusFB",
        """
        Enables or disables supported component interfaces for an entity.

        <h5>C Specification</h5>
        The #SetSpaceComponentStatusFB() function is defined as:

        <pre><code>
￿XrResult xrSetSpaceComponentStatusFB(
￿    XrSpace                                     space,
￿    const XrSpaceComponentStatusSetInfoFB*      info,
￿    XrAsyncRequestIdFB*                         requestId);</code></pre>

        <h5>Description</h5>
        Enables or disables the specified component for the specified entity. This operation is asynchronous and always returns immediately, regardless of the value of {@code timeout}. The {@code requestId} <b>can</b> be used to later refer to the request, such as identifying which request has completed when an ##XrEventDataSpaceSetStatusCompleteFB is posted to the event queue. If this function returns a failure code, no event is posted. This function <b>must</b> return #ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB if the {@code XrSpace} does not support the specified component type.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to calling #SetSpaceComponentStatusFB()</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrSpaceComponentStatusSetInfoFB structure</li>
            <li>{@code requestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SPACE_COMPONENT_STATUS_PENDING_FB</li>
                <li>#ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB</li>
                <li>#ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpaceComponentStatusSetInfoFB
        """,

        XrSpace("space", "the {@code XrSpace} handle to the spatial entity."),
        XrSpaceComponentStatusSetInfoFB.const.p("info", "a pointer to an ##XrSpaceComponentStatusSetInfoFB structure containing information about the component to be enabled or disabled."),
        Check(1)..XrAsyncRequestIdFB.p("requestId", "the output parameter that points to the ID of this asynchronous request.")
    )

    XrResult(
        "GetSpaceComponentStatusFB",
        """
        Provides the current state of a component.

        <h5>C Specification</h5>
        The #GetSpaceComponentStatusFB() function is defined as:

        <pre><code>
￿XrResult xrGetSpaceComponentStatusFB(
￿    XrSpace                                     space,
￿    XrSpaceComponentTypeFB                      componentType,
￿    XrSpaceComponentStatusFB*                   status);</code></pre>

        <h5>Description</h5>
        Gets the current status of the specified component for the specified entity. This function <b>must</b> return #ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB if the {@code XrSpace} does not support the specified component type.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to calling #GetSpaceComponentStatusFB()</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code componentType} <b>must</b> be a valid {@code XrSpaceComponentTypeFB} value</li>
            <li>{@code status} <b>must</b> be a pointer to an ##XrSpaceComponentStatusFB structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpaceComponentStatusFB
        """,

        XrSpace("space", "the {@code XrSpace} handle of a spatial entity."),
        XrSpaceComponentTypeFB("componentType", "the component type to query."),
        XrSpaceComponentStatusFB.p("status", "an output parameter pointing to the structure containing the status of the component that was queried.")
    )
}