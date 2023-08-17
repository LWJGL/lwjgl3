/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_spatial_entity">XR_FB_spatial_entity</a> extension.
 * 
 * <p>This extension enables applications to use spatial entities to specify world-locked frames of reference. It enables applications to persist the real world location of content over time and contains definitions for the Entity-Component System. All Facebook spatial entity and scene extensions are dependent on this one.</p>
 * 
 * <p>We use OpenXR {@code XrSpace} handles to give applications access to spatial entities such as Spatial Anchors. In other words, any operation which involves spatial entities uses {@code XrSpace} handles to identify the affected spatial entities.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 * 
 * <p>This extension allows:</p>
 * 
 * <ul>
 * <li>An application to create a Spatial Anchor (a type of spatial entity).</li>
 * <li>An application to enumerate supported components for a given spatial entity.</li>
 * <li>An application to enable or disable a component for a given spatial entity.</li>
 * <li>An application to get the status of a component for a given spatial entity.</li>
 * </ul>
 */
public class FBSpatialEntity {

    /** The extension specification version. */
    public static final int XR_FB_spatial_entity_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_FB_SPATIAL_ENTITY_EXTENSION_NAME = "XR_FB_spatial_entity";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB}</li>
     * <li>{@link #XR_TYPE_SPACE_COMPONENT_STATUS_FB TYPE_SPACE_COMPONENT_STATUS_FB}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB          = 1000113004,
        XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB                = 1000113003,
        XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB           = 1000113007,
        XR_TYPE_SPACE_COMPONENT_STATUS_FB                    = 1000113001,
        XR_TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB = 1000113005,
        XR_TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB      = 1000113006;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB ERROR_SPACE_COMPONENT_NOT_ENABLED_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_COMPONENT_STATUS_PENDING_FB ERROR_SPACE_COMPONENT_STATUS_PENDING_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB      = -1000113000,
        XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB        = -1000113001,
        XR_ERROR_SPACE_COMPONENT_STATUS_PENDING_FB     = -1000113002,
        XR_ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB = -1000113003;

    /**
     * XrSpaceComponentTypeFB - Component type
     * 
     * <h5>Description</h5>
     * 
     * <p>Specify the component interfaces attached to the spatial entity.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SPACE_COMPONENT_TYPE_LOCATABLE_FB SPACE_COMPONENT_TYPE_LOCATABLE_FB} — Enables tracking the 6 DOF pose of the {@code XrSpace} with {@link XR10#xrLocateSpace LocateSpace}.</li>
     * <li>{@link #XR_SPACE_COMPONENT_TYPE_STORABLE_FB SPACE_COMPONENT_TYPE_STORABLE_FB} — Enables persistence operations: save and erase.</li>
     * <li>{@link #XR_SPACE_COMPONENT_TYPE_SHARABLE_FB SPACE_COMPONENT_TYPE_SHARABLE_FB} — Enables sharing of spatial entities.</li>
     * <li>{@link #XR_SPACE_COMPONENT_TYPE_BOUNDED_2D_FB SPACE_COMPONENT_TYPE_BOUNDED_2D_FB} — Bounded 2D component.</li>
     * <li>{@link #XR_SPACE_COMPONENT_TYPE_BOUNDED_3D_FB SPACE_COMPONENT_TYPE_BOUNDED_3D_FB} — Bounded 3D component.</li>
     * <li>{@link #XR_SPACE_COMPONENT_TYPE_SEMANTIC_LABELS_FB SPACE_COMPONENT_TYPE_SEMANTIC_LABELS_FB} — Semantic labels component.</li>
     * <li>{@link #XR_SPACE_COMPONENT_TYPE_ROOM_LAYOUT_FB SPACE_COMPONENT_TYPE_ROOM_LAYOUT_FB} — Room layout component.</li>
     * <li>{@link #XR_SPACE_COMPONENT_TYPE_SPACE_CONTAINER_FB SPACE_COMPONENT_TYPE_SPACE_CONTAINER_FB} — Space container component.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataSpaceSetStatusCompleteFB}, {@link XrSpaceComponentFilterInfoFB}, {@link XrSpaceComponentStatusSetInfoFB}, {@link #xrEnumerateSpaceSupportedComponentsFB EnumerateSpaceSupportedComponentsFB}, {@link #xrGetSpaceComponentStatusFB GetSpaceComponentStatusFB}</p>
     */
    public static final int
        XR_SPACE_COMPONENT_TYPE_LOCATABLE_FB       = 0,
        XR_SPACE_COMPONENT_TYPE_STORABLE_FB        = 1,
        XR_SPACE_COMPONENT_TYPE_SHARABLE_FB        = 2,
        XR_SPACE_COMPONENT_TYPE_BOUNDED_2D_FB      = 3,
        XR_SPACE_COMPONENT_TYPE_BOUNDED_3D_FB      = 4,
        XR_SPACE_COMPONENT_TYPE_SEMANTIC_LABELS_FB = 5,
        XR_SPACE_COMPONENT_TYPE_ROOM_LAYOUT_FB     = 6,
        XR_SPACE_COMPONENT_TYPE_SPACE_CONTAINER_FB = 7;

    protected FBSpatialEntity() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorFB ] ---

    /** Unsafe version of: {@link #xrCreateSpatialAnchorFB CreateSpatialAnchorFB} */
    public static int nxrCreateSpatialAnchorFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorFB;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorCreateInfoFB.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /**
     * Creates a new spatial anchor.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSpatialAnchorFB CreateSpatialAnchorFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpatialAnchorFB(
     *     XrSession                                   session,
     *     const XrSpatialAnchorCreateInfoFB*          info,
     *     XrAsyncRequestIdFB*                         requestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates a Spatial Anchor using the specified tracking origin and pose relative to the specified tracking origin. The anchor will be locatable at the time of creation, and the 6 DOF pose relative to the tracking origin <b>can</b> be queried using the {@link XR10#xrLocateSpace LocateSpace} method. This operation is asynchronous and the runtime <b>must</b> post an {@link XrEventDataSpatialAnchorCreateCompleteFB} event when the operation completes successfully or encounters an error. If this function returns a failure code, no event is posted. The {@code requestId} <b>can</b> be used to later refer to the request, such as identifying which request has completed when an {@link XrEventDataSpatialAnchorCreateCompleteFB} is posted to the event queue.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpatialAnchorFB CreateSpatialAnchorFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorCreateInfoFB} structure</li>
     * <li>{@code requestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorCreateInfoFB}</p>
     *
     * @param session   a handle to an {@code XrSession}.
     * @param info      a pointer to an {@link XrSpatialAnchorCreateInfoFB} structure containing information about how to create the anchor.
     * @param requestId the output parameter that points to the ID of this asynchronous request.
     */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorFB(XrSession session, @NativeType("XrSpatialAnchorCreateInfoFB const *") XrSpatialAnchorCreateInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrCreateSpatialAnchorFB(session, info.address(), memAddress(requestId));
    }

    // --- [ xrGetSpaceUuidFB ] ---

    /** Unsafe version of: {@link #xrGetSpaceUuidFB GetSpaceUuidFB} */
    public static int nxrGetSpaceUuidFB(XrSpace space, long uuid) {
        long __functionAddress = space.getCapabilities().xrGetSpaceUuidFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(space.address(), uuid, __functionAddress);
    }

    /**
     * Gets an entity.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpaceUuidFB GetSpaceUuidFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpaceUuidFB(
     *     XrSpace                                     space,
     *     XrUuidEXT*                                  uuid);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Gets the UUID for a spatial entity. If this space was previously created as a spatial anchor, {@code uuid} <b>must</b> be equal to the {@link XrEventDataSpatialAnchorCreateCompleteFB}{@code ::uuid} in the event corresponding to the creation of that space. Subsequent calls to {@link #xrGetSpaceUuidFB GetSpaceUuidFB} using the same {@code XrSpace} <b>must</b> return the same {@link XrUuidEXT}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to calling {@link #xrGetSpaceUuidFB GetSpaceUuidFB}</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code uuid} <b>must</b> be a pointer to an {@link XrUuidEXT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrUuidEXT}</p>
     *
     * @param space the {@code XrSpace} handle of a spatial entity.
     * @param uuid  an output parameter pointing to the entity’s UUID.
     */
    @NativeType("XrResult")
    public static int xrGetSpaceUuidFB(XrSpace space, @NativeType("XrUuidEXT *") XrUuidEXT uuid) {
        return nxrGetSpaceUuidFB(space, uuid.address());
    }

    // --- [ xrEnumerateSpaceSupportedComponentsFB ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateSpaceSupportedComponentsFB EnumerateSpaceSupportedComponentsFB}
     *
     * @param componentTypeCapacityInput the capacity of the {@code componentTypes} array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateSpaceSupportedComponentsFB(XrSpace space, int componentTypeCapacityInput, long componentTypeCountOutput, long componentTypes) {
        long __functionAddress = space.getCapabilities().xrEnumerateSpaceSupportedComponentsFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(space.address(), componentTypeCapacityInput, componentTypeCountOutput, componentTypes, __functionAddress);
    }

    /**
     * Enumerates supported components for a given spatial entity.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateSpaceSupportedComponentsFB EnumerateSpaceSupportedComponentsFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateSpaceSupportedComponentsFB(
     *     XrSpace                                     space,
     *     uint32_t                                    componentTypeCapacityInput,
     *     uint32_t*                                   componentTypeCountOutput,
     *     XrSpaceComponentTypeFB*                     componentTypes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Lists any component types that an entity supports. The list of component types available for an entity depends on which extensions are enabled. Component types <b>must</b> not be enumerated unless the corresponding extension that defines them is also enabled.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to calling {@link #xrEnumerateSpaceSupportedComponentsFB EnumerateSpaceSupportedComponentsFB}</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code componentTypeCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code componentTypeCapacityInput} is not 0, {@code componentTypes} <b>must</b> be a pointer to an array of {@code componentTypeCapacityInput} {@code XrSpaceComponentTypeFB} values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param space                    the {@code XrSpace} handle to the spatial entity.
     * @param componentTypeCountOutput a pointer to the count of {@code componentTypes} written, or a pointer to the required capacity in the case that {@code componentTypeCapacityInput} is insufficient.
     * @param componentTypes           a pointer to an array of {@code XrSpaceComponentTypeFB} values, but <b>can</b> be {@code NULL} if {@code componentTypeCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateSpaceSupportedComponentsFB(XrSpace space, @NativeType("uint32_t *") IntBuffer componentTypeCountOutput, @Nullable @NativeType("XrSpaceComponentTypeFB *") IntBuffer componentTypes) {
        if (CHECKS) {
            check(componentTypeCountOutput, 1);
        }
        return nxrEnumerateSpaceSupportedComponentsFB(space, remainingSafe(componentTypes), memAddress(componentTypeCountOutput), memAddressSafe(componentTypes));
    }

    // --- [ xrSetSpaceComponentStatusFB ] ---

    /** Unsafe version of: {@link #xrSetSpaceComponentStatusFB SetSpaceComponentStatusFB} */
    public static int nxrSetSpaceComponentStatusFB(XrSpace space, long info, long requestId) {
        long __functionAddress = space.getCapabilities().xrSetSpaceComponentStatusFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(space.address(), info, requestId, __functionAddress);
    }

    /**
     * Enables or disables supported component interfaces for an entity.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetSpaceComponentStatusFB SetSpaceComponentStatusFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSetSpaceComponentStatusFB(
     *     XrSpace                                     space,
     *     const XrSpaceComponentStatusSetInfoFB*      info,
     *     XrAsyncRequestIdFB*                         requestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Enables or disables the specified component for the specified entity. This operation is asynchronous and always returns immediately, regardless of the value of {@code timeout}. The {@code requestId} <b>can</b> be used to later refer to the request, such as identifying which request has completed when an {@link XrEventDataSpaceSetStatusCompleteFB} is posted to the event queue. If this function returns a failure code, no event is posted. This function <b>must</b> return {@link #XR_ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB} if the {@code XrSpace} does not support the specified component type.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to calling {@link #xrSetSpaceComponentStatusFB SetSpaceComponentStatusFB}</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrSpaceComponentStatusSetInfoFB} structure</li>
     * <li>{@code requestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SPACE_COMPONENT_STATUS_PENDING_FB ERROR_SPACE_COMPONENT_STATUS_PENDING_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceComponentStatusSetInfoFB}</p>
     *
     * @param space     the {@code XrSpace} handle to the spatial entity.
     * @param info      a pointer to an {@link XrSpaceComponentStatusSetInfoFB} structure containing information about the component to be enabled or disabled.
     * @param requestId the output parameter that points to the ID of this asynchronous request.
     */
    @NativeType("XrResult")
    public static int xrSetSpaceComponentStatusFB(XrSpace space, @NativeType("XrSpaceComponentStatusSetInfoFB const *") XrSpaceComponentStatusSetInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrSetSpaceComponentStatusFB(space, info.address(), memAddress(requestId));
    }

    // --- [ xrGetSpaceComponentStatusFB ] ---

    /** Unsafe version of: {@link #xrGetSpaceComponentStatusFB GetSpaceComponentStatusFB} */
    public static int nxrGetSpaceComponentStatusFB(XrSpace space, int componentType, long status) {
        long __functionAddress = space.getCapabilities().xrGetSpaceComponentStatusFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(space.address(), componentType, status, __functionAddress);
    }

    /**
     * Provides the current state of a component.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpaceComponentStatusFB GetSpaceComponentStatusFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpaceComponentStatusFB(
     *     XrSpace                                     space,
     *     XrSpaceComponentTypeFB                      componentType,
     *     XrSpaceComponentStatusFB*                   status);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Gets the current status of the specified component for the specified entity. This function <b>must</b> return {@link #XR_ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB} if the {@code XrSpace} does not support the specified component type.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to calling {@link #xrGetSpaceComponentStatusFB GetSpaceComponentStatusFB}</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code componentType} <b>must</b> be a valid {@code XrSpaceComponentTypeFB} value</li>
     * <li>{@code status} <b>must</b> be a pointer to an {@link XrSpaceComponentStatusFB} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceComponentStatusFB}</p>
     *
     * @param space         the {@code XrSpace} handle of a spatial entity.
     * @param componentType the component type to query.
     * @param status        an output parameter pointing to the structure containing the status of the component that was queried.
     */
    @NativeType("XrResult")
    public static int xrGetSpaceComponentStatusFB(XrSpace space, @NativeType("XrSpaceComponentTypeFB") int componentType, @NativeType("XrSpaceComponentStatusFB *") XrSpaceComponentStatusFB status) {
        return nxrGetSpaceComponentStatusFB(space, componentType, status.address());
    }

}