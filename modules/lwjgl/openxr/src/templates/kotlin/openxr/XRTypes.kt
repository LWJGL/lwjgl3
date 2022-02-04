/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr

import org.lwjgl.generator.*

// Handle types
val XrInstance = XR_DEFINE_HANDLE("XrInstance")
val XrSession = XR_DEFINE_HANDLE("XrSession")
val XrSpace = XR_DEFINE_HANDLE("XrSpace")
val XrAction = XR_DEFINE_HANDLE("XrAction")
val XrSwapchain = XR_DEFINE_HANDLE("XrSwapchain")
val XrActionSet = XR_DEFINE_HANDLE("XrActionSet")

// Enum types
val XrResult = "XrResult".enumType
val XrStructureType = "XrStructureType".enumType
val XrFormFactor = "XrFormFactor".enumType
val XrViewConfigurationType = "XrViewConfigurationType".enumType
val XrEnvironmentBlendMode = "XrEnvironmentBlendMode".enumType
val XrReferenceSpaceType = "XrReferenceSpaceType".enumType
val XrActionType = "XrActionType".enumType
val XrEyeVisibility = "XrEyeVisibility".enumType
val XrSessionState = "XrSessionState".enumType
val XrObjectType = "XrObjectType".enumType

// Bitmask types
val XrInstanceCreateFlags = typedef(XrFlags64, "XrInstanceCreateFlags")
val XrSessionCreateFlags = typedef(XrFlags64, "XrSessionCreateFlags")
val XrSpaceVelocityFlags = typedef(XrFlags64, "XrSpaceVelocityFlags")
val XrSpaceLocationFlags = typedef(XrFlags64, "XrSpaceLocationFlags")
val XrSwapchainCreateFlags = typedef(XrFlags64, "XrSwapchainCreateFlags")
val XrSwapchainUsageFlags = typedef(XrFlags64, "XrSwapchainUsageFlags")
val XrCompositionLayerFlags = typedef(XrFlags64, "XrCompositionLayerFlags")
val XrViewStateFlags = typedef(XrFlags64, "XrViewStateFlags")
val XrInputSourceLocalizedNameFlags = typedef(XrFlags64, "XrInputSourceLocalizedNameFlags")

// Struct types
val XrApiLayerProperties = struct(Module.OPENXR, "XrApiLayerProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    documentation =
        """
        Structure specifying layer properties.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_API_LAYER_PROPERTIES</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #EnumerateApiLayerProperties()
        """

    Expression("#TYPE_API_LAYER_PROPERTIES")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.").mutable()
    charUTF8("layerName", "a string specifying the name of the API layer. Use this name in the ##XrInstanceCreateInfo{@code ::enabledApiLayerNames} array to enable this API layer for an instance.")["XR_MAX_API_LAYER_NAME_SIZE"]
    XrVersion("specVersion", "the API version the API layer was written to, encoded as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#api-version-numbers-and-semantics\">API Version Numbers and Semantics</a> section.")
    uint32_t("layerVersion", "the version of this API layer. It is an integer, increasing with backward compatible changes.")
    charUTF8("description", "a string providing additional details that <b>can</b> be used by the application to identify the API layer.")["XR_MAX_API_LAYER_DESCRIPTION_SIZE"]
}

val XrExtensionProperties = struct(Module.OPENXR, "XrExtensionProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    documentation =
        """
        Returns properties of available instance extensions.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_EXTENSION_PROPERTIES</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #EnumerateInstanceExtensionProperties()
        """

    Expression("#TYPE_EXTENSION_PROPERTIES")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.").mutable()
    charUTF8("extensionName", "a {@code NULL} terminated string specifying the name of the extension.")["XR_MAX_EXTENSION_NAME_SIZE"]
    uint32_t("extensionVersion", "the version of this extension. It is an integer, incremented with backward compatible changes.")
}

val XrApplicationInfo = struct(Module.OPENXR, "XrApplicationInfo") {
    javaImport("static org.lwjgl.openxr.XR10.*")
    documentation =
        """
        Structure specifying application info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code applicationName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_APPLICATION_NAME_SIZE</li>
            <li>{@code engineName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_ENGINE_NAME_SIZE</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        When using the OpenXR API to implement a reusable engine that will be used by many applications, {@code engineName} <b>should</b> be set to a unique string that identifies the engine, and {@code engineVersion} <b>should</b> encode a representation of the engine’s version. This way, all applications that share this engine version will provide the same {@code engineName} and {@code engineVersion} to the runtime. The engine <b>should</b> then enable individual applications to choose their specific {@code applicationName} and {@code applicationVersion}, enabling one application to be distinguished from another application.

        When using the OpenXR API to implement an individual application without a shared engine, the input {@code engineName} <b>should</b> be left empty and {@code engineVersion} <b>should</b> be set to 0. The {@code applicationName} <b>should</b> then be filled in with a unique string that identifies the app and the {@code applicationVersion} <b>should</b> encode a representation of the application’s version.
        </div>

        <h5>See Also</h5>
        ##XrInstanceCreateInfo
        """

    charUTF8("applicationName", "a non-empty string containing the name of the application.")["XR_MAX_APPLICATION_NAME_SIZE"]
    uint32_t("applicationVersion", "an unsigned integer variable containing the developer-supplied version number of the application.")
    charUTF8("engineName", "a string containing the name of the engine (if any) used to create the application. It may be empty to indicate no specified engine.")["XR_MAX_ENGINE_NAME_SIZE"]
    uint32_t("engineVersion", "an unsigned integer variable containing the developer-supplied version number of the engine used to create the application. May be zero to indicate no specified engine.")
    XrVersion("apiVersion", "the version of this API against which the application will run, encoded as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#api-version-numbers-and-semantics\">API Version Numbers and Semantics</a> section. If the runtime does not support the requested {@code apiVersion} it <b>must</b> return #ERROR_API_VERSION_UNSUPPORTED.")
}

val XrInstanceCreateInfo = struct(Module.OPENXR, "XrInstanceCreateInfo") {
    documentation =
        """
        Structure specifying params of a newly created instance.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_INSTANCE_CREATE_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrDebugUtilsMessengerCreateInfoEXT</li>
            <li>{@code createFlags} <b>must</b> be 0</li>
            <li>{@code applicationInfo} <b>must</b> be a valid ##XrApplicationInfo structure</li>
            <li>If {@code enabledApiLayerCount} is not 0, {@code enabledApiLayerNames} <b>must</b> be a pointer to an array of {@code enabledApiLayerCount} null-terminated UTF-8 strings</li>
            <li>If {@code enabledExtensionCount} is not 0, {@code enabledExtensionNames} <b>must</b> be a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings</li>
        </ul>

        <h5>See Also</h5>
        ##XrApplicationInfo, #CreateInstance()
        """

    Expression("#TYPE_INSTANCE_CREATE_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrDebugUtilsMessengerCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrInstanceCreateFlags("createFlags", "a bitmask of {@code XrInstanceCreateFlags} that identifies options that apply to the creation.")
    XrApplicationInfo("applicationInfo", "an instance of ##XrApplicationInfo. This information helps runtimes recognize behavior inherent to classes of applications. ##XrApplicationInfo is defined in detail below.")
    AutoSize("enabledApiLayerNames", optional = true)..uint32_t("enabledApiLayerCount", "the number of global API layers to enable.")
    charUTF8.const.p.const.p("enabledApiLayerNames", "a pointer to an array of {@code enabledApiLayerCount} strings containing the names of API layers to enable for the created instance. See the <a target=\"_blank\" href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#api-layers-and-extensions\">API Layers And Extensions</a> section for further details.")
    AutoSize("enabledExtensionNames", optional = true)..uint32_t("enabledExtensionCount", "the number of global extensions to enable.")
    charUTF8.const.p.const.p("enabledExtensionNames", "a pointer to an array of {@code enabledExtensionCount} strings containing the names of extensions to enable.")
}

val XrInstanceProperties = struct(Module.OPENXR, "XrInstanceProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    documentation =
        """
        Contains information about the instance.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_INSTANCE_PROPERTIES</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetInstanceProperties()
        """

    Expression("#TYPE_INSTANCE_PROPERTIES")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.").mutable()
    XrVersion("runtimeVersion", "the runtime’s version (not necessarily related to an OpenXR API version), expressed in the format of #XR_MAKE_VERSION().")
    charUTF8("runtimeName", "the name of the runtime.")["XR_MAX_RUNTIME_NAME_SIZE"]
}

val XrEventDataBuffer = struct(Module.OPENXR, "XrEventDataBuffer") {
    documentation =
        """
        Event buffer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_BUFFER</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataBaseHeader, #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_BUFFER")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    uint8_t("varying", "a fixed sized output buffer big enough to hold returned data elements for all specified event data types.")[4000]
}

val XrSystemGetInfo = struct(Module.OPENXR, "XrSystemGetInfo") {
    documentation =
        """
        Specifies desired attributes of the system.

        <h5>Description</h5>
        The ##XrSystemGetInfo structure specifies attributes about a system as desired by an application.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_GET_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code formFactor} <b>must</b> be a valid {@code XrFormFactor} value</li>
        </ul>

        <h5>See Also</h5>
        #GetSystem()
        """

    Expression("#TYPE_SYSTEM_GET_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrFormFactor("formFactor", "the {@code XrFormFactor} requested by the application.")
}

val XrSystemGraphicsProperties = struct(Module.OPENXR, "XrSystemGraphicsProperties") {
    documentation =
        """
        Graphics-related properties of a particular system.

        <h5>See Also</h5>
        ##XrSystemProperties, ##XrSystemTrackingProperties, #GetSystem(), #GetSystemProperties()
        """

    uint32_t("maxSwapchainImageHeight", "the maximum swapchain image pixel height supported by this system.")
    uint32_t("maxSwapchainImageWidth", "the maximum swapchain image pixel width supported by this system.")
    uint32_t("maxLayerCount", "the maximum number of composition layers supported by this system. The runtime <b>must</b> support at least #MIN_COMPOSITION_LAYERS_SUPPORTED layers.")
}

val XrSystemTrackingProperties = struct(Module.OPENXR, "XrSystemTrackingProperties") {
    documentation =
        """
        Tracking-related properties of a particular system.

        <h5>See Also</h5>
        ##XrSystemGraphicsProperties, ##XrSystemProperties, #GetSystem(), #GetSystemProperties()
        """

    XrBool32("orientationTracking", "set to #TRUE to indicate the system supports orientational tracking of the view pose(s), #FALSE otherwise.")
    XrBool32("positionTracking", "set to #TRUE to indicate the system supports positional tracking of the view pose(s), #FALSE otherwise.")
}

val XrSystemProperties = struct(Module.OPENXR, "XrSystemProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    documentation =
        """
        Properties of a particular system.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_PROPERTIES</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSystemColorSpacePropertiesFB, ##XrSystemEyeGazeInteractionPropertiesEXT, ##XrSystemFacialTrackingPropertiesHTC, ##XrSystemFoveatedRenderingPropertiesVARJO, ##XrSystemHandTrackingMeshPropertiesMSFT, ##XrSystemHandTrackingPropertiesEXT, ##XrSystemKeyboardTrackingPropertiesFB, ##XrSystemMarkerTrackingPropertiesVARJO, ##XrSystemPassthroughPropertiesFB, ##XrSystemRenderModelPropertiesFB, ##XrSystemSpaceWarpPropertiesFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemGraphicsProperties, ##XrSystemTrackingProperties, #GetSystem(), #GetSystemProperties()
        """

    Expression("#TYPE_SYSTEM_PROPERTIES")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    PointerSetter(
        "XrSystemColorSpacePropertiesFB", "XrSystemEyeGazeInteractionPropertiesEXT", "XrSystemFacialTrackingPropertiesHTC", "XrSystemFoveatedRenderingPropertiesVARJO", "XrSystemHandTrackingMeshPropertiesMSFT", "XrSystemHandTrackingPropertiesEXT", "XrSystemKeyboardTrackingPropertiesFB", "XrSystemMarkerTrackingPropertiesVARJO", "XrSystemPassthroughPropertiesFB", "XrSystemRenderModelPropertiesFB", "XrSystemSpaceWarpPropertiesFB",
        prepend = true
    )..nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.").mutable()
    XrSystemId("systemId", "the {@code XrSystemId} identifying the system.")
    uint32_t("vendorId", "a unique identifier for the vendor of the system.")
    charUTF8("systemName", "a string containing the name of the system.")["XR_MAX_SYSTEM_NAME_SIZE"]
    XrSystemGraphicsProperties("graphicsProperties", "an ##XrSystemGraphicsProperties structure specifying the system graphics properties.")
    XrSystemTrackingProperties("trackingProperties", "an ##XrSystemTrackingProperties structure specifying system tracking properties.")
}

val XrSessionCreateInfo = struct(Module.OPENXR, "XrSessionCreateInfo") {
    documentation =
        """
        Creates a session.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code systemId} <b>must</b> be a valid {@code XrSystemId} or #ERROR_SYSTEM_INVALID <b>must</b> be returned.</li>
            <li>{@code next}, unless otherwise specified via an extension, <b>must</b> contain exactly one graphics API binding structure (a structure whose name begins with “XrGraphicsBinding”) or #ERROR_GRAPHICS_DEVICE_INVALID <b>must</b> be returned.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_SESSION_CREATE_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrGraphicsBindingEGLMNDX, ##XrGraphicsBindingOpenGLWaylandKHR, ##XrGraphicsBindingOpenGLWin32KHR, ##XrGraphicsBindingOpenGLXcbKHR, ##XrGraphicsBindingOpenGLXlibKHR, ##XrGraphicsBindingVulkanKHR, ##XrHolographicWindowAttachmentMSFT, ##XrSessionCreateInfoOverlayEXTX</li>
            <li>{@code createFlags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CreateSession()
        """

    Expression("#TYPE_SESSION_CREATE_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrGraphicsBindingEGLMNDX", "XrGraphicsBindingOpenGLWaylandKHR", "XrGraphicsBindingOpenGLWin32KHR", "XrGraphicsBindingOpenGLXcbKHR", "XrGraphicsBindingOpenGLXlibKHR", "XrGraphicsBindingVulkan2KHR", "XrGraphicsBindingVulkanKHR", "XrHolographicWindowAttachmentMSFT", "XrSessionCreateInfoOverlayEXTX",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. Note that in most cases one graphics API extension specific struct needs to be in this next chain.")
    XrSessionCreateFlags("createFlags", "identifies {@code XrSessionCreateFlags} that apply to the creation.")
    XrSystemId("systemId", "the {@code XrSystemId} representing the system of devices to be used by this session.")
}

val XrVector3f = struct(Module.OPENXR, "XrVector3f") {
    documentation =
        """
        Three-dimensional vector.

        <h5>Description</h5>
        If used to represent physical distances (rather than e.g. velocity or angular velocity) and not otherwise specified, values <b>must</b> be in meters.

        <h5>See Also</h5>
        ##XrCompositionLayerReprojectionPlaneOverrideMSFT, ##XrGeometryInstanceCreateInfoFB, ##XrGeometryInstanceTransformFB, ##XrHandCapsuleFB, ##XrHandJointVelocityEXT, ##XrHandMeshVertexMSFT, ##XrHandTrackingMeshFB, ##XrKeyboardTrackingDescriptionFB, ##XrPosef, ##XrQuaternionf, ##XrSceneMeshVertexBufferMSFT, ##XrSceneOrientedBoxBoundMSFT, ##XrSceneSphereBoundMSFT, ##XrSpaceVelocity, ##XrTriangleMeshCreateInfoFB, ##XrVector2f, ##XrVector4f, #TriangleMeshGetVertexBufferFB()
        """

    float("x", "the x coordinate of the vector.")
    float("y", "the y coordinate of the vector.")
    float("z", "the z coordinate of the vector.")
}

val XrSpaceVelocity = struct(Module.OPENXR, "XrSpaceVelocity") {
    documentation =
        """
        Contains info about a space.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_VELOCITY</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code velocityFlags} <b>must</b> be 0 or a valid combination of {@code XrSpaceVelocityFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpaceLocation, ##XrVector3f, #LocateSpace()
        """

    Expression("#TYPE_SPACE_VELOCITY")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrSpaceVelocityFlags("velocityFlags", "a bitfield, with bit masks defined in {@code XrSpaceVelocityFlagBits}, to indicate which members contain valid data. If none of the bits are set, no other fields in this structure <b>should</b> be considered to be valid or meaningful.")
    XrVector3f("linearVelocity", "the relative linear velocity of the origin of #LocateSpace(){@code ::space} with respect to and expressed in the reference frame of #LocateSpace(){@code ::baseSpace}, in units of meters per second.")
    XrVector3f("angularVelocity", "the relative angular velocity of #LocateSpace(){@code ::space} with respect to #LocateSpace(){@code ::baseSpace}. The vector’s direction is expressed in the reference frame of #LocateSpace(){@code ::baseSpace} and is parallel to the rotational axis of #LocateSpace(){@code ::space}. The vector’s magnitude is the relative angular speed of #LocateSpace(){@code ::space} in radians per second. The vector follows the right-hand rule for torque/rotation.")
}

val XrQuaternionf = struct(Module.OPENXR, "XrQuaternionf") {
    documentation =
        """
        Unit Quaternion.

        <h5>See Also</h5>
        ##XrCompositionLayerCubeKHR, ##XrPosef, ##XrVector2f, ##XrVector3f, ##XrVector4f
        """

    float("x", "the x coordinate of the quaternion.")
    float("y", "the y coordinate of the quaternion.")
    float("z", "the z coordinate of the quaternion.")
    float("w", "the w coordinate of the quaternion.")
}

val XrPosef = struct(Module.OPENXR, "XrPosef") {
    documentation =
        """
        Location and orientation in a space.

        <h5>Description</h5>
        A runtime <b>must</b> return #ERROR_POSE_INVALID if the {@code orientation} norm deviates by more than 1% from unit length.

        <h5>See Also</h5>
        ##XrActionSpaceCreateInfo, ##XrCompositionLayerCylinderKHR, ##XrCompositionLayerEquirect2KHR, ##XrCompositionLayerEquirectKHR, ##XrCompositionLayerProjectionView, ##XrCompositionLayerQuad, ##XrCompositionLayerSpaceWarpInfoFB, ##XrControllerModelNodeStateMSFT, ##XrEventDataReferenceSpaceChangePending, ##XrGeometryInstanceCreateInfoFB, ##XrGeometryInstanceTransformFB, ##XrHandJointLocationEXT, ##XrHandMeshSpaceCreateInfoMSFT, ##XrHandTrackingAimStateFB, ##XrHandTrackingMeshFB, ##XrMarkerSpaceCreateInfoVARJO, ##XrQuaternionf, ##XrReferenceSpaceCreateInfo, ##XrSceneComponentLocationMSFT, ##XrSceneFrustumBoundMSFT, ##XrSceneOrientedBoxBoundMSFT, ##XrSpaceLocation, ##XrSpatialAnchorCreateInfoMSFT, ##XrSpatialAnchorSpaceCreateInfoMSFT, ##XrSpatialGraphNodeSpaceCreateInfoMSFT, ##XrVector2f, ##XrVector3f, ##XrVector4f, ##XrView, #SetInputDeviceLocationEXT()
        """

    XrQuaternionf("orientation", "an ##XrQuaternionf representing the orientation within a space.")
    XrVector3f("position", "an ##XrVector3f representing position within a space.")
}

val XrReferenceSpaceCreateInfo = struct(Module.OPENXR, "XrReferenceSpaceCreateInfo") {
    documentation =
        """
        Creation info for a reference space.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_REFERENCE_SPACE_CREATE_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code referenceSpaceType} <b>must</b> be a valid {@code XrReferenceSpaceType} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateReferenceSpace()
        """

    Expression("#TYPE_REFERENCE_SPACE_CREATE_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrReferenceSpaceType("referenceSpaceType", "the chosen {@code XrReferenceSpaceType}.")
    XrPosef("poseInReferenceSpace", "an ##XrPosef defining the position and orientation of the new space’s origin within the natural reference frame of the reference space.")
}

val XrExtent2Df = struct(Module.OPENXR, "XrExtent2Df") {
    documentation =
        """
        Extent in two dimensions.

        <h5>Description</h5>
        This structure is used for component values that may be fractional (floating-point). If used to represent physical distances, values <b>must</b> be in meters.

        The {@code width} and {@code height} value <b>must</b> be non-negative.

        <h5>See Also</h5>
        ##XrCompositionLayerQuad, ##XrOffset2Df, ##XrRect2Df, ##XrScenePlaneMSFT, #GetMarkerSizeVARJO(), #GetReferenceSpaceBoundsRect()
        """

    float("width", "the floating-point width of the extent.")
    float("height", "the floating-point height of the extent.")
}

val XrActionSpaceCreateInfo = struct(Module.OPENXR, "XrActionSpaceCreateInfo") {
    documentation =
        """
        Creation info for an action space.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_ACTION_SPACE_CREATE_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateActionSpace()
        """

    Expression("#TYPE_ACTION_SPACE_CREATE_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrAction("action", "a handle to a pose {@code XrAction} previously created with #CreateAction().")
    XrPath("subactionPath", "#NULL_PATH or an {@code XrPath} that was specified when the action was created. If {@code subactionPath} is a valid path not specified when the action was created the runtime <b>must</b> return #ERROR_PATH_UNSUPPORTED. If this parameter is set, the runtime <b>must</b> create a space that is relative to only that subaction’s pose binding.")
    XrPosef("poseInActionSpace", "an ##XrPosef defining the position and orientation of the new space’s origin within the natural reference frame of the pose action.")
}

val XrSpaceLocation = struct(Module.OPENXR, "XrSpaceLocation") {
    documentation =
        """
        Contains info about a space.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_LOCATION</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrEyeGazeSampleTimeEXT, ##XrSpaceVelocity</li>
            <li>{@code locationFlags} <b>must</b> be 0 or a valid combination of {@code XrSpaceLocationFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, ##XrSpaceVelocity, #LocateSpace()
        """

    Expression("#TYPE_SPACE_LOCATION")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrEyeGazeSampleTimeEXT", "XrSpaceVelocity",
        prepend = true
    )..nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain, such as ##XrSpaceVelocity.")
    XrSpaceLocationFlags("locationFlags", "a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}, to indicate which members contain valid data. If none of the bits are set, no other fields in this structure <b>should</b> be considered to be valid or meaningful.")
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the origin of #LocateSpace(){@code ::space} within the reference frame of #LocateSpace(){@code ::baseSpace}.")
}

val XrViewConfigurationProperties = struct(Module.OPENXR, "XrViewConfigurationProperties") {
    documentation =
        """
        Detailed configuration properties for an XrViewConfigurationProperties.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_VIEW_CONFIGURATION_PROPERTIES</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrViewConfigurationView, #GetViewConfigurationProperties()
        """

    Expression("#TYPE_VIEW_CONFIGURATION_PROPERTIES")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrViewConfigurationType("viewConfigurationType", "the {@code XrViewConfigurationType} of the configuration.")
    XrBool32("fovMutable", "indicates if the view field of view can be modified by the application.")
}

val XrViewConfigurationView = struct(Module.OPENXR, "XrViewConfigurationView") {
    documentation =
        """
        Individual view configuration.

        <h5>Description</h5>
        See ##XrSwapchainSubImage for more information about {@code imageRect} values, and ##XrSwapchainCreateInfo for more information about creating swapchains appropriately sized to support those {@code imageRect} values.

        The array of ##XrViewConfigurationView returned by the runtime <b>must</b> adhere to the rules defined in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#view_configuration_type">{@code XrViewConfigurationType}</a>, such as the count and association to the left and right eyes.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_VIEW_CONFIGURATION_VIEW</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrFoveatedViewConfigurationViewVARJO, ##XrViewConfigurationDepthRangeEXT, ##XrViewConfigurationViewFovEPIC</li>
        </ul>

        <h5>See Also</h5>
        ##XrViewConfigurationProperties, #EnumerateViewConfigurationViews()
        """

    Expression("#TYPE_VIEW_CONFIGURATION_VIEW")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrFoveatedViewConfigurationViewVARJO", "XrViewConfigurationDepthRangeEXT", "XrViewConfigurationViewFovEPIC",
        prepend = true
    )..nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    uint32_t("recommendedImageRectWidth", "the optimal width of {@code imageRect} to use when rendering this view into a swapchain.")
    uint32_t("maxImageRectWidth", "the maximum width of {@code imageRect} supported when rendering this view into a swapchain.")
    uint32_t("recommendedImageRectHeight", "the optimal height of {@code imageRect} to use when rendering this view into a swapchain.")
    uint32_t("maxImageRectHeight", "the maximum height of {@code imageRect} supported when rendering this view into a swapchain.")
    uint32_t("recommendedSwapchainSampleCount", "the recommended number of sub-data element samples to create for each swapchain image that will be rendered into for this view.")
    uint32_t("maxSwapchainSampleCount", "the maximum number of sub-data element samples supported for swapchain images that will be rendered into for this view.")
}

val XrSwapchainCreateInfo = struct(Module.OPENXR, "XrSwapchainCreateInfo") {
    documentation =
        """
        Creation info for a swapchain.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_CREATE_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSecondaryViewConfigurationSwapchainCreateInfoMSFT, ##XrSwapchainCreateInfoFoveationFB</li>
            <li>{@code createFlags} <b>must</b> be 0 or a valid combination of {@code XrSwapchainCreateFlagBits} values</li>
            <li>{@code usageFlags} <b>must</b> be 0 or a valid combination of {@code XrSwapchainUsageFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        #CreateSession(), #CreateSwapchain(), #EnumerateSwapchainFormats()
        """

    Expression("#TYPE_SWAPCHAIN_CREATE_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrSecondaryViewConfigurationSwapchainCreateInfoMSFT", "XrSwapchainCreateInfoFoveationFB",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrSwapchainCreateFlags("createFlags", "a bitmask of {@code XrSwapchainCreateFlagBits} describing additional properties of the swapchain.")
    XrSwapchainUsageFlags("usageFlags", "a bitmask of {@code XrSwapchainUsageFlagBits} describing the intended usage of the swapchain’s images. The usage flags define how the corresponding graphics API objects are created. A mismatch <b>may</b> result in swapchain images that do not support the application’s usage.")
    int64_t("format", "a graphics API-specific texture format identifier. For example, if the graphics API specified in #CreateSession() is Vulkan, then this format is a Vulkan format such as {@code VK_FORMAT_R8G8B8A8_SRGB}. The format identifies the format that the runtime will interpret the texture as upon submission. Valid formats are indicated by #EnumerateSwapchainFormats().")
    uint32_t("sampleCount", "the number of sub-data element samples in the image, <b>must</b> not be 0 or greater than the graphics API’s maximum limit.")
    uint32_t("width", "the width of the image, <b>must</b> not be 0 or greater than the graphics API’s maximum limit.")
    uint32_t("height", "the height of the image, <b>must</b> not be 0 or greater than the graphics API’s maximum limit.")
    uint32_t("faceCount", "the number of faces, which can be either 6 (for cubemaps) or 1.")
    uint32_t("arraySize", "the number of array layers in the image or 1 for a 2D image, <b>must</b> not be 0 or greater than the graphics API’s maximum limit.")
    uint32_t("mipCount", "describes the number of levels of detail available for minified sampling of the image, <b>must</b> not be 0 or greater than the graphics API’s maximum limit.")
}

val XrSwapchainImageBaseHeader = struct(Module.OPENXR, "XrSwapchainImageBaseHeader") {
    documentation =
        """
        Image base header for a swapchain image.

        <h5>Description</h5>
        The ##XrSwapchainImageBaseHeader is a base structure that can be overridden by a graphics API-specific stext:XrSwapchainImage* child structure.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be one of the following XrStructureType values: #TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR, #TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR, #TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #EnumerateSwapchainImages()
        """

    XrStructureType("type", "the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
}

val XrSwapchainImageAcquireInfo = struct(Module.OPENXR, "XrSwapchainImageAcquireInfo") {
    documentation =
        """
        Describes a swapchain image acquisition.

        <h5>Description</h5>
        Because this structure only exists to support extension-specific structures, #AcquireSwapchainImage() will accept a {@code NULL} argument for {@code acquireInfo} for applications that are not using any relevant extensions.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #AcquireSwapchainImage()
        """

    Expression("#TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
}

val XrSwapchainImageWaitInfo = struct(Module.OPENXR, "XrSwapchainImageWaitInfo") {
    documentation =
        """
        Describes a swapchain image wait operation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_IMAGE_WAIT_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #WaitSwapchainImage()
        """

    Expression("#TYPE_SWAPCHAIN_IMAGE_WAIT_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrDuration("timeout", "indicates how many nanoseconds the call should block waiting for the image to become available for writing.")
}

val XrSwapchainImageReleaseInfo = struct(Module.OPENXR, "XrSwapchainImageReleaseInfo") {
    documentation =
        """
        Describes a swapchain image release.

        <h5>Description</h5>
        Because this structure only exists to support extension-specific structures, #ReleaseSwapchainImage() will accept a {@code NULL} argument for {@code releaseInfo} for applications that are not using any relevant extensions.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_IMAGE_RELEASE_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #ReleaseSwapchainImage()
        """

    Expression("#TYPE_SWAPCHAIN_IMAGE_RELEASE_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
}

val XrSessionBeginInfo = struct(Module.OPENXR, "XrSessionBeginInfo") {
    documentation =
        """
        Struct containing session begin info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_SESSION_BEGIN_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSecondaryViewConfigurationSessionBeginInfoMSFT</li>
            <li>{@code primaryViewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
        </ul>

        <h5>See Also</h5>
        #BeginSession()
        """

    Expression("#TYPE_SESSION_BEGIN_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrSecondaryViewConfigurationSessionBeginInfoMSFT",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrViewConfigurationType("primaryViewConfigurationType", "the {@code XrViewConfigurationType} to use during this session to provide images for the form factor’s primary displays.")
}

val XrFrameWaitInfo = struct(Module.OPENXR, "XrFrameWaitInfo") {
    documentation =
        """
        Wait frame information structure.

        <h5>Description</h5>
        Because this structure only exists to support extension-specific structures, #WaitFrame() <b>must</b> accept a {@code NULL} argument for {@code frameWaitInfo} for applications that are not using any relevant extensions.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_FRAME_WAIT_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrFrameState, #WaitFrame()
        """

    Expression("#TYPE_FRAME_WAIT_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
}

val XrFrameState = struct(Module.OPENXR, "XrFrameState") {
    documentation =
        """
        Frame prediction structure.

        <h5>Description</h5>
        ##XrFrameState describes the time at which the next frame will be displayed to the user. {@code predictedDisplayTime} <b>must</b> refer to the midpoint of the interval during which the frame is displayed. The runtime <b>may</b> report a different {@code predictedDisplayPeriod} from the hardware’s refresh cycle.

        For any frame where {@code shouldRender} is #FALSE, the application <b>should</b> avoid heavy GPU work for that frame, for example by not rendering its layers. This typically happens when the application is transitioning into or out of a running session, or when some system UI is fully covering the application at the moment. As long as the session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_running">is running</a>, the application <b>should</b> keep running the frame loop to maintain the frame synchronization to the runtime, even if this requires calling #EndFrame() with all layers omitted.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_FRAME_STATE</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSecondaryViewConfigurationFrameStateMSFT</li>
        </ul>

        <h5>See Also</h5>
        ##XrFrameWaitInfo, #WaitFrame()
        """

    Expression("#TYPE_FRAME_STATE")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrSecondaryViewConfigurationFrameStateMSFT",
        prepend = true
    )..nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrTime("predictedDisplayTime", "the anticipated display {@code XrTime} for the next application-generated frame.")
    XrDuration("predictedDisplayPeriod", "the {@code XrDuration} of the display period for the next application-generated frame, for use in predicting display times beyond the next one.")
    XrBool32("shouldRender", "#TRUE if the application <b>should</b> render its layers as normal and submit them to #EndFrame(). When this value is #FALSE, the application <b>should</b> avoid heavy GPU work where possible, for example by skipping layer rendering and then omitting those layers when calling #EndFrame().")
}

val XrFrameBeginInfo = struct(Module.OPENXR, "XrFrameBeginInfo") {
    documentation =
        """
        Begin frame information.

        <h5>Description</h5>
        Because this structure only exists to support extension-specific structures, #BeginFrame() will accept a {@code NULL} argument for {@code frameBeginInfo} for applications that are not using any relevant extensions.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_FRAME_BEGIN_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #BeginFrame(), #WaitFrame()
        """

    Expression("#TYPE_FRAME_BEGIN_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
}

val XrCompositionLayerBaseHeader = struct(Module.OPENXR, "XrCompositionLayerBaseHeader") {
    documentation =
        """
        Composition layer base header.

        <h5>Description</h5>
        All composition layer structures begin with the elements described in the ##XrCompositionLayerBaseHeader. The ##XrCompositionLayerBaseHeader structure is not intended to be directly used, but forms a basis for defining current and future structures containing composition layer information. The ##XrFrameEndInfo structure contains an array of pointers to these polymorphic header structures. All composition layer type pointers <b>must</b> be type-castable as an ##XrCompositionLayerBaseHeader pointer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be one of the following XrStructureType values: #TYPE_COMPOSITION_LAYER_CUBE_KHR, #TYPE_COMPOSITION_LAYER_CYLINDER_KHR, #TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR, #TYPE_COMPOSITION_LAYER_EQUIRECT_KHR, #TYPE_COMPOSITION_LAYER_PROJECTION, #TYPE_COMPOSITION_LAYER_QUAD</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrCompositionLayerAlphaBlendFB, ##XrCompositionLayerColorScaleBiasKHR, ##XrCompositionLayerImageLayoutFB, ##XrCompositionLayerPassthroughFB, ##XrCompositionLayerSecureContentFB</li>
            <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerFlagBits} values</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrFrameEndInfo, ##XrSecondaryViewConfigurationLayerInfoMSFT, ##XrSwapchainSubImage
        """

    XrStructureType("type", "the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value.")
    PointerSetter(
        "XrCompositionLayerAlphaBlendFB", "XrCompositionLayerColorScaleBiasKHR", "XrCompositionLayerImageLayoutFB", "XrCompositionLayerPassthroughFB", "XrCompositionLayerSecureContentFB",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrCompositionLayerFlags("layerFlags", "a bitmask of {@code XrCompositionLayerFlagBits} describing flags to apply to the layer.")
    XrSpace("space", "the {@code XrSpace} in which the layer will be kept stable over time.")
}

val XrFrameEndInfo = struct(Module.OPENXR, "XrFrameEndInfo") {
    documentation =
        """
        End frame information.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_FRAME_END_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSecondaryViewConfigurationFrameEndInfoMSFT</li>
            <li>{@code environmentBlendMode} <b>must</b> be a valid {@code XrEnvironmentBlendMode} value</li>
            <li>If {@code layerCount} is not 0, {@code layers} <b>must</b> be a pointer to an array of {@code layerCount} valid ##XrCompositionLayerBaseHeader-based structures. See also: ##XrCompositionLayerCubeKHR, ##XrCompositionLayerCylinderKHR, ##XrCompositionLayerEquirect2KHR, ##XrCompositionLayerEquirectKHR, ##XrCompositionLayerProjection, ##XrCompositionLayerQuad</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, #EndFrame()
        """

    Expression("#TYPE_FRAME_END_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrSecondaryViewConfigurationFrameEndInfoMSFT",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrTime("displayTime", "the {@code XrTime} at which this frame <b>should</b> be displayed.")
    XrEnvironmentBlendMode("environmentBlendMode", "the {@code XrEnvironmentBlendMode} value representing the desired <a target=\"_blank\" href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#environment_blend_mode\">environment blend mode</a> for this frame.")
    AutoSize("layers", optional = true)..uint32_t("layerCount", "the number of composition layers in this frame. The maximum supported layer count is identified by ##XrSystemGraphicsProperties::maxLayerCount. If layerCount is greater than the maximum supported layer count then #ERROR_LAYER_LIMIT_EXCEEDED <b>must</b> be returned.")
    nullable..XrCompositionLayerBaseHeader.const.p.const.p("layers", "a pointer to an array of ##XrCompositionLayerBaseHeader pointers.")
}

val XrViewLocateInfo = struct(Module.OPENXR, "XrViewLocateInfo") {
    documentation =
        """
        Struct containing view locate information.

        <h5>Description</h5>
        The ##XrViewLocateInfo structure contains the display time and space used to locate the view ##XrView structures.

        The runtime <b>must</b> return error #ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED if the given {@code viewConfigurationType} is not one of the supported type reported by #EnumerateViewConfigurations().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_VIEW_LOCATE_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrViewLocateFoveatedRenderingVARJO</li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrView, ##XrViewState, #LocateViews()
        """

    Expression("#TYPE_VIEW_LOCATE_INFO")..XrStructureType("type", "")
    PointerSetter(
        "XrViewLocateFoveatedRenderingVARJO",
        prepend = true
    )..nullable..opaque_const_p("next", "")
    XrViewConfigurationType("viewConfigurationType", "{@code XrViewConfigurationType} to query for.")
    XrTime("displayTime", "the time for which the view poses are predicted.")
    XrSpace("space", "the {@code XrSpace} in which the {@code pose} in each ##XrView is expressed.")
}

val XrViewState = struct(Module.OPENXR, "XrViewState") {
    documentation =
        """
        Struct containing additional view state.

        <h5>Description</h5>
        The ##XrViewState contains additional view state from #LocateViews() common to all views of the active view configuration.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_VIEW_STATE</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code viewStateFlags} <b>must</b> be 0 or a valid combination of {@code XrViewStateFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrView, #LocateViews()
        """

    Expression("#TYPE_VIEW_STATE")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrViewStateFlags("viewStateFlags", "a bitmask of {@code XrViewStateFlagBits} indicating state for all views.")
}

val XrFovf = struct(Module.OPENXR, "XrFovf") {
    documentation =
        """
        Field of view.

        <h5>Description</h5>
        Angles to the right of the center and upwards from the center are positive, and angles to the left of the center and down from the center are negative. The total horizontal field of view is {@code angleRight} minus {@code angleLeft}, and the total vertical field of view is {@code angleUp} minus {@code angleDown}. For a symmetric FoV, {@code angleRight} and {@code angleUp} will have positive values, {@code angleLeft} will be -{@code angleRight}, and {@code angleDown} will be -{@code angleUp}.

        The angles <b>must</b> be specified in radians, and <b>must</b> be between <code>-π/2</code> and <code>π/2</code> exclusively.

        When {@code angleLeft} &gt; {@code angleRight}, the content of the view <b>must</b> be flipped horizontally. When {@code angleDown} &gt; {@code angleUp}, the content of the view <b>must</b> be flipped vertically.

        <h5>See Also</h5>
        ##XrCompositionLayerProjectionView, ##XrSceneFrustumBoundMSFT, ##XrView, ##XrViewConfigurationViewFovEPIC
        """

    float("angleLeft", "the angle of the left side of the field of view. For a symmetric field of view this value is negative.")
    float("angleRight", "the angle of the right side of the field of view.")
    float("angleUp", "the angle of the top part of the field of view.")
    float("angleDown", "the angle of the bottom part of the field of view. For a symmetric field of view this value is negative.")
}

val XrView = struct(Module.OPENXR, "XrView") {
    documentation =
        """
        Struct containing view projection state.

        <h5>Description</h5>
        The ##XrView structure contains view pose and projection state necessary to render a single projection view in the view configuration.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_VIEW</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrFovf, ##XrPosef, ##XrViewLocateInfo, ##XrViewState, #LocateViews()
        """

    Expression("#TYPE_VIEW")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrPosef("pose", "an ##XrPosef defining the location and orientation of the view in the {@code space} specified by the #LocateViews() function.")
    XrFovf("fov", "the ##XrFovf for the four sides of the projection.")
}

val XrActionSetCreateInfo = struct(Module.OPENXR, "XrActionSetCreateInfo") {
    javaImport("static org.lwjgl.openxr.XR10.*")
    documentation =
        """
        XrActionSet creation info.

        <h5>Description</h5>
        When multiple actions are bound to the same input source, the {@code priority} of each action set determines which bindings are suppressed. Runtimes <b>must</b> ignore input sources from action sets with a lower priority number if those specific input sources are also present in active actions within a higher priority action set. If multiple action sets with the same priority are bound to the same input source and that is the highest priority number, runtimes <b>must</b> process all those bindings at the same time.

        Two actions are considered to be bound to the same input source if they use the same <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#semantic-path-input">identifier and optional location</a> path segments, even if they have different component segments.

        When runtimes are ignoring bindings because of priority, they <b>must</b> treat the binding to that input source as though they do not exist. That means the {@code isActive} field <b>must</b> be #FALSE when retrieving action data, and that the runtime <b>must</b> not provide any visual, haptic, or other feedback related to the binding of that action to that input source. Other actions in the same action set which are bound to input sources that do not collide are not affected and are processed as normal.

        If {@code actionSetName} or {@code localizedActionSetName} are empty strings, the runtime <b>must</b> return #ERROR_NAME_INVALID or #ERROR_LOCALIZED_NAME_INVALID respectively. If {@code actionSetName} or {@code localizedActionSetName} are duplicates of the corresponding field for any existing action set in the specified instance, the runtime <b>must</b> return #ERROR_NAME_DUPLICATED or #ERROR_LOCALIZED_NAME_DUPLICATED respectively. If the conflicting action set is destroyed, the conflicting field is no longer considered duplicated. If {@code actionSetName} contains characters which are not allowed in a single level of a <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#well-formed-path-strings">well-formed path string</a>, the runtime <b>must</b> return #ERROR_PATH_FORMAT_INVALID.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_ACTION_SET_CREATE_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code actionSetName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_ACTION_SET_NAME_SIZE</li>
            <li>{@code localizedActionSetName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_LOCALIZED_ACTION_SET_NAME_SIZE</li>
        </ul>

        <h5>See Also</h5>
        #CreateActionSet()
        """

    Expression("#TYPE_ACTION_SET_CREATE_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    charUTF8("actionSetName", "an array containing a {@code NULL} terminated non-empty string with the name of this action set.")["XR_MAX_ACTION_SET_NAME_SIZE"]
    charUTF8("localizedActionSetName", "an array containing a {@code NULL} terminated {@code UTF}-8 string that can be presented to the user as a description of the action set. This string should be presented in the system’s current active locale.")["XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE"]
    uint32_t("priority", "defines which action sets' actions are active on a given input source when actions on multiple active action sets are bound to the same input source. Larger priority numbers take precedence over smaller priority numbers.")
}

val XrActionCreateInfo = struct(Module.OPENXR, "XrActionCreateInfo") {
    javaImport("static org.lwjgl.openxr.XR10.*")
    documentation =
        """
        XrAction creation info.

        <h5>Description</h5>
        Subaction paths are a mechanism that enables applications to use the same action name and handle on multiple devices. Applications can query action state using subaction paths that differentiate data coming from each device. This allows the runtime to group logically equivalent actions together in system UI. For instance, an application could create a single actionname:pick_up action with the pathname:/user/hand/left and pathname:/user/hand/right subaction paths and use the subaction paths to independently query the state of actionname:pick_up_with_left_hand and actionname:pick_up_with_right_hand.

        Applications <b>can</b> create actions with or without the {@code subactionPaths} set to a list of paths. If this list of paths is omitted (i.e. {@code subactionPaths} is set to {@code NULL}, and {@code countSubactionPaths} is set to 0), the application is opting out of filtering action results by subaction paths and any call to get action data must also omit subaction paths.

        If {@code subactionPaths} is specified and any of the following conditions are not satisfied, the runtime <b>must</b> return #ERROR_PATH_UNSUPPORTED:

        <ul>
            <li>
                Each path provided is one of:
                <ul>
                    <li>pathname:/user/head</li>
                    <li>pathname:/user/hand/left</li>
                    <li>pathname:/user/hand/right</li>
                    <li>pathname:/user/gamepad</li>
                </ul>
            </li>
            <li>No path appears in the list more than once</li>
        </ul>

        Extensions <b>may</b> append additional top level user paths to the above list.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Earlier revisions of the spec mentioned pathname:/user but it could not be implemented as specified and was removed as errata.
        </div>

        The runtime <b>must</b> return #ERROR_PATH_UNSUPPORTED in the following circumstances:

        <ul>
            <li>The application specified subaction paths at action creation and the application called {@code xrGetActionState*} or a haptic function with an empty subaction path array.</li>
            <li>The application called {@code xrGetActionState*} or a haptic function with a subaction path that was not specified when the action was created.</li>
        </ul>

        If {@code actionName} or {@code localizedActionName} are empty strings, the runtime <b>must</b> return #ERROR_NAME_INVALID or #ERROR_LOCALIZED_NAME_INVALID respectively. If {@code actionName} or {@code localizedActionName} are duplicates of the corresponding field for any existing action in the specified action set, the runtime <b>must</b> return #ERROR_NAME_DUPLICATED or #ERROR_LOCALIZED_NAME_DUPLICATED respectively. If the conflicting action is destroyed, the conflicting field is no longer considered duplicated. If {@code actionName} contains characters which are not allowed in a single level of a <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#well-formed-path-strings">well-formed path string</a>, the runtime <b>must</b> return #ERROR_PATH_FORMAT_INVALID.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_ACTION_CREATE_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code actionName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_ACTION_NAME_SIZE</li>
            <li>{@code actionType} <b>must</b> be a valid {@code XrActionType} value</li>
            <li>If {@code countSubactionPaths} is not 0, {@code subactionPaths} <b>must</b> be a pointer to an array of {@code countSubactionPaths} valid {@code XrPath} values</li>
            <li>{@code localizedActionName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_LOCALIZED_ACTION_NAME_SIZE</li>
        </ul>

        <h5>See Also</h5>
        #CreateAction(), #CreateActionSet()
        """

    Expression("#TYPE_ACTION_CREATE_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    charUTF8("actionName", "an array containing a {@code NULL} terminated string with the name of this action.")["XR_MAX_ACTION_NAME_SIZE"]
    XrActionType("actionType", "the {@code XrActionType} of the action to be created.")
    AutoSize("subactionPaths", optional = true)..uint32_t("countSubactionPaths", "the number of elements in the {@code subactionPaths} array. If {@code subactionPaths} is NULL, this parameter must be 0.")
    nullable..XrPath.const.p("subactionPaths", "an array of {@code XrPath} or {@code NULL}. If this array is specified, it contains one or more subaction paths that the application intends to query action state for.")
    charUTF8("localizedActionName", "an array containing a {@code NULL} terminated {@code UTF}-8 string that can be presented to the user as a description of the action. This string should be in the system’s current active locale.")["XR_MAX_LOCALIZED_ACTION_NAME_SIZE"]
}

val XrActionSuggestedBinding = struct(Module.OPENXR, "XrActionSuggestedBinding") {
    documentation =
        """
        Suggested binding for a single action.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrInteractionProfileSuggestedBinding, #SuggestInteractionProfileBindings()
        """

    XrAction("action", "the {@code XrAction} handle for an action")
    XrPath("binding", "the {@code XrPath} of a binding for the action specified in {@code action}. This path is any top level user path plus input source path, for example pathname:/user/hand/right/input/trigger/click. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#input-suggested-bindings\">suggested bindings</a> for more details.")
}

val XrInteractionProfileSuggestedBinding = struct(Module.OPENXR, "XrInteractionProfileSuggestedBinding") {
    documentation =
        """
        Suggested bindings for a interaction profile.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrBindingModificationsKHR</li>
            <li>{@code suggestedBindings} <b>must</b> be a pointer to an array of {@code countSuggestedBindings} valid ##XrActionSuggestedBinding structures</li>
            <li>The {@code countSuggestedBindings} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrActionSuggestedBinding, #SuggestInteractionProfileBindings()
        """

    Expression("#TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrBindingModificationsKHR",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrPath("interactionProfile", "the {@code XrPath} of an interaction profile.")
    AutoSize("suggestedBindings")..uint32_t("countSuggestedBindings", "the number of suggested bindings in the array pointed to by {@code suggestedBindings}.")
    XrActionSuggestedBinding.const.p("suggestedBindings", "a pointer to an array of ##XrActionSuggestedBinding structures that define all of the application’s suggested bindings for the specified interaction profile.")
}

val XrSessionActionSetsAttachInfo = struct(Module.OPENXR, "XrSessionActionSetsAttachInfo") {
    documentation =
        """
        Information to attach action sets to a session.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_SESSION_ACTION_SETS_ATTACH_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code actionSets} <b>must</b> be a pointer to an array of {@code countActionSets} valid {@code XrActionSet} handles</li>
            <li>The {@code countActionSets} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        #AttachSessionActionSets()
        """

    Expression("#TYPE_SESSION_ACTION_SETS_ATTACH_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    AutoSize("actionSets")..uint32_t("countActionSets", "an integer specifying the number of valid elements in the {@code actionSets} array.")
    XrActionSet.const.p("actionSets", "a pointer to an array of one or more {@code XrActionSet} handles to be attached to the session.")
}

val XrInteractionProfileState = struct(Module.OPENXR, "XrInteractionProfileState") {
    documentation =
        """
        Receives active interaction profile for a top level path.

        <h5>Description</h5>
        The runtime <b>must</b> only include interaction profiles that the application has provided bindings for via #SuggestInteractionProfileBindings() or #NULL_PATH. If the runtime is rebinding an interaction profile provided by the application to a device that the application did not provide bindings for, it <b>must</b> return the interaction profile path that it is emulating. If the runtime is unable to provide input because it cannot emulate any of the application-provided interaction profiles, it <b>must</b> return #NULL_PATH.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_INTERACTION_PROFILE_STATE</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrActionSuggestedBinding, #GetCurrentInteractionProfile(), #SuggestInteractionProfileBindings()
        """

    Expression("#TYPE_INTERACTION_PROFILE_STATE")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrPath("interactionProfile", "the {@code XrPath} of the interaction profile path for the {@code topLevelUserPath} used to retrieve this state, or #NULL_PATH if there is no active interaction profile at that top level user path.")
}

val XrActionStateGetInfo = struct(Module.OPENXR, "XrActionStateGetInfo") {
    documentation =
        """
        Information to get action state.

        <h5>Description</h5>
        See ##XrActionCreateInfo for a description of subaction paths, and the restrictions on their use.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_ACTION_STATE_GET_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
        </ul>

        <h5>See Also</h5>
        #GetActionStateBoolean(), #GetActionStateFloat(), #GetActionStatePose(), #GetActionStateVector2f()
        """

    Expression("#TYPE_ACTION_STATE_GET_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrAction("action", "the {@code XrAction} being queried.")
    XrPath("subactionPath", "the subaction path {@code XrPath} to query data from, or #NULL_PATH to specify all subaction paths. If the subaction path is specified, it is one of the subaction paths that were specified when the action was created. If the subaction path was not specified when the action was created, the runtime <b>must</b> return #ERROR_PATH_UNSUPPORTED. If this parameter is specified, the runtime <b>must</b> return data that originates only from the subaction paths specified.")
}

val XrActionStateBoolean = struct(Module.OPENXR, "XrActionStateBoolean") {
    documentation =
        """
        Boolean action state.

        <h5>Description</h5>
        When multiple input sources are bound to this action, the {@code currentState} follows <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#multiple_inputs">the previously defined rule to resolve ambiguity</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_ACTION_STATE_BOOLEAN</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetActionStateBoolean()
        """

    Expression("#TYPE_ACTION_STATE_BOOLEAN")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrBool32("currentState", "the current state of the action.")
    XrBool32("changedSinceLastSync", "#TRUE if the value of {@code currentState} is different than it was before the most recent call to #SyncActions(). This parameter can be combined with {@code currentState} to detect rising and falling edges since the previous call to #SyncActions(). E.g. if both {@code changedSinceLastSync} and {@code currentState} are #TRUE then a rising edge (#FALSE to #TRUE) has taken place.")
    XrTime("lastChangeTime", "the {@code XrTime} when this action’s value last changed.")
    XrBool32("isActive", "#TRUE if and only if there exists an input source that is contributing to the current state of this action.")
}

val XrActionStateFloat = struct(Module.OPENXR, "XrActionStateFloat") {
    documentation =
        """
        Floating point action state.

        <h5>Description</h5>
        When multiple input sources are bound to this action, the {@code currentState} follows <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#multiple_inputs">the previously defined rule to resolve ambiguity</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_ACTION_STATE_FLOAT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetActionStateFloat()
        """

    Expression("#TYPE_ACTION_STATE_FLOAT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    float("currentState", "the current state of the Action.")
    XrBool32("changedSinceLastSync", "#TRUE if the value of {@code currentState} is different than it was before the most recent call to #SyncActions().")
    XrTime("lastChangeTime", "the {@code XrTime} in nanoseconds since this action’s value last changed.")
    XrBool32("isActive", "#TRUE if and only if there exists an input source that is contributing to the current state of this action.")
}

val XrVector2f = struct(Module.OPENXR, "XrVector2f") {
    documentation =
        """
        Two-dimensional vector.

        <h5>Description</h5>
        If used to represent physical distances (rather than e.g. normalized direction) and not otherwise specified, values <b>must</b> be in meters.

        <h5>See Also</h5>
        ##XrActionStateVector2f, ##XrCompositionLayerEquirectKHR, ##XrHandTrackingMeshFB, ##XrPosef, ##XrQuaternionf, ##XrVector3f, ##XrVector4f, ##XrVisibilityMaskKHR, #SetInputDeviceStateVector2fEXT()
        """

    float("x", "the x coordinate of the vector.")
    float("y", "the y coordinate of the vector.")
}

val XrActionStateVector2f = struct(Module.OPENXR, "XrActionStateVector2f") {
    documentation =
        """
        2D float vector action state.

        <h5>Description</h5>
        When multiple input sources are bound to this action, the {@code currentState} follows <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#multiple_inputs">the previously defined rule to resolve ambiguity</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_ACTION_STATE_VECTOR2F</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrVector2f, #GetActionStateVector2f()
        """

    Expression("#TYPE_ACTION_STATE_VECTOR2F")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrVector2f("currentState", "the current ##XrVector2f state of the Action.")
    XrBool32("changedSinceLastSync", "#TRUE if the value of {@code currentState} is different than it was before the most recent call to #SyncActions().")
    XrTime("lastChangeTime", "the {@code XrTime} in nanoseconds since this action’s value last changed.")
    XrBool32("isActive", "#TRUE if and only if there exists an input source that is contributing to the current state of this action.")
}

val XrActionStatePose = struct(Module.OPENXR, "XrActionStatePose") {
    documentation =
        """
        Pose action metadata.

        <h5>Description</h5>
        A pose action <b>must</b> not be bound to multiple input sources, according to <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#multiple_inputs">the previously defined rule</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_ACTION_STATE_POSE</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetActionStatePose()
        """

    Expression("#TYPE_ACTION_STATE_POSE")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrBool32("isActive", "#TRUE if and only if there exists an input source that is being tracked by this pose action.")
}

val XrActiveActionSet = struct(Module.OPENXR, "XrActiveActionSet") {
    documentation =
        """
        Describes an active action set.

        <h5>Description</h5>
        This structure defines a single active action set and subaction path combination. Applications <b>can</b> provide a list of these structures to the #SyncActions() function.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code actionSet} <b>must</b> be a valid {@code XrActionSet} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrActionsSyncInfo, #SyncActions()
        """

    XrActionSet("actionSet", "the handle of the action set to activate.")
    XrPath("subactionPath", "a subaction path that was declared when one or more actions in the action set was created or #NULL_PATH. If the application wants to activate the action set on more than one subaction path, it <b>can</b> include additional ##XrActiveActionSet structs with the other {@code subactionPath} values. Using #NULL_PATH as the value for {@code subactionPath}, acts as a wildcard for all subaction paths on the actions in the action set. If the subaction path was not specified on any of the actions in the actionSet when that action was created, the runtime <b>must</b> return #ERROR_PATH_UNSUPPORTED.")
}

val XrActionsSyncInfo = struct(Module.OPENXR, "XrActionsSyncInfo") {
    documentation =
        """
        Information to sync actions.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_ACTIONS_SYNC_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code countActiveActionSets} is not 0, {@code activeActionSets} <b>must</b> be a pointer to an array of {@code countActiveActionSets} valid ##XrActiveActionSet structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrActiveActionSet, #SyncActions()
        """

    Expression("#TYPE_ACTIONS_SYNC_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    AutoSize("activeActionSets", optional = true)..uint32_t("countActiveActionSets", "an integer specifying the number of valid elements in the {@code activeActionSets} array.")
    nullable..XrActiveActionSet.const.p("activeActionSets", "{@code NULL} or a pointer to an array of one or more ##XrActiveActionSet structures that should be synchronized.")
}

val XrBoundSourcesForActionEnumerateInfo = struct(Module.OPENXR, "XrBoundSourcesForActionEnumerateInfo") {
    documentation =
        """
        Information to query the bound input sources for an action.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
        </ul>

        <h5>See Also</h5>
        #EnumerateBoundSourcesForAction()
        """

    Expression("#TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrAction("action", "the handle of the action to query.")
}

val XrInputSourceLocalizedNameGetInfo = struct(Module.OPENXR, "XrInputSourceLocalizedNameGetInfo") {
    documentation =
        """
        Information to query the bound input sources for an action.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code whichComponents} <b>must</b> be a valid combination of {@code XrInputSourceLocalizedNameFlagBits} values</li>
            <li>{@code whichComponents} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        #EnumerateBoundSourcesForAction(), #GetInputSourceLocalizedName()
        """

    Expression("#TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrPath("sourcePath", "")
    XrInputSourceLocalizedNameFlags("whichComponents", "any set of flags from {@code XrInputSourceLocalizedNameFlagBits}.")
}

val XrHapticActionInfo = struct(Module.OPENXR, "XrHapticActionInfo") {
    documentation =
        """
        Information to output haptic feedback.

        <h5>Description</h5>
        See ##XrActionCreateInfo for a description of subaction paths, and the restrictions on their use.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_HAPTIC_ACTION_INFO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
        </ul>

        <h5>See Also</h5>
        #ApplyHapticFeedback(), #StopHapticFeedback()
        """

    Expression("#TYPE_HAPTIC_ACTION_INFO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrAction("action", "the {@code XrAction} handle for the desired output haptic action.")
    XrPath("subactionPath", "the subaction path {@code XrPath} of the device to send the haptic event to, or #NULL_PATH to specify all subaction paths. If the subaction path is specified, it is one of the subaction paths that were specified when the action was created. If the subaction path was not specified when the action was created, the runtime <b>must</b> return #ERROR_PATH_UNSUPPORTED. If this parameter is specified, the runtime <b>must</b> trigger the haptic events only on the device from the subaction path.")
}

val XrHapticBaseHeader = struct(Module.OPENXR, "XrHapticBaseHeader") {
    documentation =
        """
        Base header for haptic feedback.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_HAPTIC_VIBRATION</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrHapticVibration, ##XrInteractionProfileAnalogThresholdVALVE, #ApplyHapticFeedback()
        """

    XrStructureType("type", "the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
}

val _XrBaseInStructure = struct(Module.OPENXR, "XrBaseInStructure")
val XrBaseInStructure = struct(Module.OPENXR, "XrBaseInStructure") {
    documentation =
        """
        Convenience type for iterating (read only).

        <h5>Description</h5>
        ##XrBaseInStructure can be used to facilitate iterating through a read-only structure pointer chain.

        <h5>See Also</h5>
        ##XrBaseInStructure, ##XrBaseOutStructure
        """

    XrStructureType("type", "the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value.")
    _XrBaseInStructure.const.p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
}

val _XrBaseOutStructure = struct(Module.OPENXR, "XrBaseOutStructure")
val XrBaseOutStructure = struct(Module.OPENXR, "XrBaseOutStructure") {
    documentation =
        """
        Convenience type for iterating (mutable).

        <h5>Description</h5>
        ##XrBaseOutStructure can be used to facilitate iterating through a structure pointer chain that returns data back to the application.

        <h5>See Also</h5>
        ##XrBaseInStructure, ##XrBaseOutStructure
        """

    XrStructureType("type", "the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value.")
    _XrBaseOutStructure.p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
}

val XrOffset2Di = struct(Module.OPENXR, "XrOffset2Di") {
    documentation =
        """
        Offset in two dimensions.

        <h5>Description</h5>
        This variant is for representing discrete values such as texels. For representing physical distances, the floating-point variant <b>must</b> be used instead.

        <h5>See Also</h5>
        ##XrExtent2Di, ##XrRect2Di
        """

    int32_t("x", "the integer offset in the x direction.")
    int32_t("y", "the integer offset in the y direction.")
}

val XrExtent2Di = struct(Module.OPENXR, "XrExtent2Di") {
    documentation =
        """
        Extent in two dimensions.

        <h5>Description</h5>
        This variant is for representing discrete values such as texels. For representing physical distances, the floating-point variant <b>must</b> be used instead.

        The {@code width} and {@code height} value <b>must</b> be non-negative.

        <h5>See Also</h5>
        ##XrOffset2Di, ##XrRect2Di
        """

    int32_t("width", "the integer width of the extent.")
    int32_t("height", "the integer height of the extent.")
}

val XrRect2Di = struct(Module.OPENXR, "XrRect2Di") {
    documentation =
        """
        Rect in two dimensions.

        <h5>Description</h5>
        This variant is for representing discrete values such as texels. For representing physical distances, the floating-point variant <b>must</b> be used instead.

        <h5>See Also</h5>
        ##XrExtent2Di, ##XrOffset2Di, ##XrSwapchainSubImage
        """

    XrOffset2Di("offset", "the ##XrOffset2Di specifying the integer rectangle offset.")
    XrExtent2Di("extent", "the ##XrExtent2Di specifying the integer rectangle extent.")
}

val XrSwapchainSubImage = struct(Module.OPENXR, "XrSwapchainSubImage") {
    documentation =
        """
        Composition layer data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerCylinderKHR, ##XrCompositionLayerDepthInfoKHR, ##XrCompositionLayerEquirect2KHR, ##XrCompositionLayerEquirectKHR, ##XrCompositionLayerProjectionView, ##XrCompositionLayerQuad, ##XrCompositionLayerSpaceWarpInfoFB, ##XrFrameEndInfo, ##XrRect2Di
        """

    XrSwapchain("swapchain", "the {@code XrSwapchain} to be displayed.")
    XrRect2Di("imageRect", "an ##XrRect2Di representing the valid portion of the image to use, in pixels. It also implicitly defines the transform from normalized image coordinates into pixel coordinates. The coordinate origin depends on which graphics API is being used. See the graphics API extension details for more information on the coordinate origin definition. Note that the compositor <b>may</b> bleed in pixels from outside the bounds in some cases, for instance due to mipmapping.")
    uint32_t("imageArrayIndex", "the image array index, with 0 meaning the first or only array element.")
}

val XrCompositionLayerProjectionView = struct(Module.OPENXR, "XrCompositionLayerProjectionView") {
    documentation =
        """
        Projection layer element.

        <h5>Description</h5>
        The count and order of view poses submitted with ##XrCompositionLayerProjection <b>must</b> be the same order as that returned by #LocateViews(). The ##XrCompositionLayerProjectionView{@code ::pose} and ##XrCompositionLayerProjectionView{@code ::fov} <b>should</b> almost always derive from ##XrView{@code ::pose} and ##XrView{@code ::fov} as found in the #LocateViews(){@code ::views} array. However, applications <b>may</b> submit an ##XrCompositionLayerProjectionView which has a different view or FOV than that from #LocateViews(). In this case, the runtime will map the view and FOV to the system display appropriately. In the case that two submitted views within a single layer overlap, they <b>must</b> be composited in view array order.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_PROJECTION_VIEW</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrCompositionLayerDepthInfoKHR, ##XrCompositionLayerSpaceWarpInfoFB</li>
            <li>{@code subImage} <b>must</b> be a valid ##XrSwapchainSubImage structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerProjection, ##XrFovf, ##XrPosef, ##XrSwapchainSubImage
        """

    Expression("#TYPE_COMPOSITION_LAYER_PROJECTION_VIEW")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrCompositionLayerDepthInfoKHR", "XrCompositionLayerSpaceWarpInfoFB",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrPosef("pose", "an ##XrPosef defining the location and orientation of this projection element in the {@code space} of the corresponding ##XrCompositionLayerProjectionView.")
    XrFovf("fov", "the ##XrFovf for this projection element.")
    XrSwapchainSubImage("subImage", "the image layer ##XrSwapchainSubImage to use.")
}

val XrCompositionLayerProjection = struct(Module.OPENXR, "XrCompositionLayerProjection", parentStruct = XrCompositionLayerBaseHeader) {
    documentation =
        """
        Composition layer for projection.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Because a runtime may reproject the layer over time, a projection layer should specify an {@code XrSpace} in which to maximize stability of the layer content. For example, a projection layer containing world-locked content should use an {@code XrSpace} which is also world-locked, such as the {@code LOCAL} or {@code STAGE} reference spaces. In the case that the projection layer should be head-locked, such as a heads up display, the {@code VIEW} reference space would provide the highest quality layer reprojection.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_PROJECTION</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrCompositionLayerDepthTestVARJO, ##XrCompositionLayerReprojectionInfoMSFT, ##XrCompositionLayerReprojectionPlaneOverrideMSFT</li>
            <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerFlagBits} values</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code views} <b>must</b> be a pointer to an array of {@code viewCount} valid ##XrCompositionLayerProjectionView structures</li>
            <li>The {@code viewCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrCompositionLayerProjectionView, ##XrSwapchainSubImage
        """

    Expression("#TYPE_COMPOSITION_LAYER_PROJECTION")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrCompositionLayerDepthTestVARJO", "XrCompositionLayerReprojectionInfoMSFT", "XrCompositionLayerReprojectionPlaneOverrideMSFT",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrCompositionLayerFlags("layerFlags", "a bitmask of {@code XrCompositionLayerFlagBits} describing flags to apply to the layer.")
    XrSpace("space", "the {@code XrSpace} in which the {@code pose} of each ##XrCompositionLayerProjectionView is evaluated over time by the compositor.")
    AutoSize("views")..uint32_t("viewCount", "the count of views in the {@code views} array. This <b>must</b> be equal to the number of view poses returned by #LocateViews().")
    XrCompositionLayerProjectionView.const.p("views", "the array of type ##XrCompositionLayerProjectionView containing each projection layer view.")
}

val XrCompositionLayerQuad = struct(Module.OPENXR, "XrCompositionLayerQuad", parentStruct = XrCompositionLayerBaseHeader) {
    documentation =
        """
        Quad composition layer.

        <h5>Description</h5>
        The ##XrCompositionLayerQuad layer is useful for user interface elements or 2D content rendered into the virtual world. The layer’s ##XrSwapchainSubImage::swapchain image is applied to a quad in the virtual world space. Only front face of the quad surface is visible; the back face is not visible and <b>must</b> not be drawn by the runtime. A quad layer has no thickness; it is a two-dimensional object positioned and oriented in 3D space. The position of a quad refers to the center of the quad within the given {@code XrSpace}. The orientation of the quad refers to the orientation of the normal vector from the front face. The size of a quad refers to the quad’s size in the <code>x-y</code> plane of the given {@code XrSpace}’s coordinate system. A quad with a position of {0,0,0}, rotation of {0,0,0,1} (no rotation), and a size of {1,1} refers to a 1 meter x 1 meter quad centered at {0,0,0} with its front face normal vector coinciding with the +z axis.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_QUAD</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerFlagBits} values</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code eyeVisibility} <b>must</b> be a valid {@code XrEyeVisibility} value</li>
            <li>{@code subImage} <b>must</b> be a valid ##XrSwapchainSubImage structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrExtent2Df, ##XrPosef, ##XrSwapchainSubImage
        """

    Expression("#TYPE_COMPOSITION_LAYER_QUAD")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrCompositionLayerFlags("layerFlags", "a bitmask of {@code XrCompositionLayerFlagBits} describing flags to apply to the layer.")
    XrSpace("space", "the {@code XrSpace} in which the {@code pose} of the quad layer is evaluated over time.")
    XrEyeVisibility("eyeVisibility", "the {@code XrEyeVisibility} for this layer.")
    XrSwapchainSubImage("subImage", "the image layer ##XrSwapchainSubImage to use.")
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the quad in the reference frame of the {@code space}.")
    XrExtent2Df("size", "the width and height of the quad in meters.")
}

val XrEventDataBaseHeader = struct(Module.OPENXR, "XrEventDataBaseHeader") {
    documentation =
        """
        Base header for an event.

        <h5>Description</h5>
        The ##XrEventDataBaseHeader is a generic structure used to identify the common event data elements.

        Upon receipt, the ##XrEventDataBaseHeader pointer should be type-cast to a pointer of the appropriate event data based on the {@code type} parameter.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be one of the following XrStructureType values: #TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB, #TYPE_EVENT_DATA_EVENTS_LOST, #TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING, #TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED, #TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX, #TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO, #TYPE_EVENT_DATA_PERF_SETTINGS_EXT, #TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING, #TYPE_EVENT_DATA_SESSION_STATE_CHANGED, #TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR, #TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #PollEvent()
        """

    XrStructureType("type", "the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
}

val XrEventDataEventsLost = struct(Module.OPENXR, "XrEventDataEventsLost", parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Event indicating events were lost.

        <h5>Description</h5>
        Receiving the ##XrEventDataEventsLost event structure indicates that the event queue overflowed and some events were removed at the position within the queue at which this event was found.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_EVENTS_LOST</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataBaseHeader, #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_EVENTS_LOST")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    uint32_t("lostEventCount", "the number of events which have overflowed since the last call to #PollEvent().")
}

val XrEventDataInstanceLossPending = struct(Module.OPENXR, "XrEventDataInstanceLossPending", parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Event indicating instance loss will occur.

        <h5>Description</h5>
        After the application has destroyed all of its instances and their children and waited past the specified time, it may then re-try #CreateInstance() in a loop waiting for whatever maintenance the runtime is performing to complete. The runtime will return #ERROR_RUNTIME_UNAVAILABLE from #CreateInstance() as long as it is unable to create the instance. Once the runtime has returned and is able to continue, it <b>must</b> resume returning #SUCCESS from #CreateInstance() if valid data is passed in.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.</li>
            <li>{@code lossTime} is the absolute time at which the indicated instance will be considered lost and become unusable.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataBaseHeader, #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrTime("lossTime", "")
}

val XrEventDataSessionStateChanged = struct(Module.OPENXR, "XrEventDataSessionStateChanged", parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Event indicating session state changed.

        <h5>Description</h5>
        Receiving the ##XrEventDataSessionStateChanged event structure indicates that the application has changed lifecycle state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_SESSION_STATE_CHANGED</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code state} <b>must</b> be a valid {@code XrSessionState} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataBaseHeader, #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_SESSION_STATE_CHANGED")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrSession("session", "the {@code XrSession} which has changed state.")
    XrSessionState("state", "the current {@code XrSessionState} of the {@code session}.")
    XrTime("time", "an {@code XrTime} which indicates the time of the state change.")
}

val XrEventDataReferenceSpaceChangePending = struct(Module.OPENXR, "XrEventDataReferenceSpaceChangePending", parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Notifies the application that a reference space is changing.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code referenceSpaceType} <b>must</b> be a valid {@code XrReferenceSpaceType} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateReferenceSpace()
        """

    Expression("#TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrSession("session", "the {@code XrSession} for which the reference space is changing.")
    XrReferenceSpaceType("referenceSpaceType", "the {@code XrReferenceSpaceType} that is changing.")
    XrTime("changeTime", "the target {@code XrTime} after which #LocateSpace() or #LocateViews() will return values that respect this change.")
    XrBool32("poseValid", "true if the runtime can determine the {@code pose} of the new space in the previous space before the change.")
    XrPosef("poseInPreviousSpace", "an ##XrPosef defining the position and orientation of the new reference space’s natural origin within the natural reference frame of its previous space.")
}

val XrEventDataInteractionProfileChanged = struct(Module.OPENXR, "XrEventDataInteractionProfileChanged", parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Notifies the application than the active interaction profile has changed.

        <h5>Description</h5>
        The ##XrEventDataInteractionProfileChanged event is sent to the application to notify it that the active input form factor for one or more top level user paths has changed. This event <b>must</b> only be sent for interaction profiles that the application indicated its support for via #SuggestInteractionProfileBindings(). This event <b>must</b> only be sent for running sessions.

        The application <b>can</b> call #GetCurrentInteractionProfile() if it wants to change its own behavior based on the active hardware.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>See Also</h5>
        #GetCurrentInteractionProfile(), #SuggestInteractionProfileBindings()
        """

    Expression("#TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrSession("session", "the {@code XrSession} for which at least one of the interaction profiles for a top level path has changed.")
}

val XrHapticVibration = struct(Module.OPENXR, "XrHapticVibration", parentStruct = XrHapticBaseHeader) {
    documentation =
        """
        Base header for haptic feedback.

        <h5>Description</h5>
        The ##XrHapticVibration is used in calls to #ApplyHapticFeedback() that trigger actionname:vibration output actions.

        The {@code duration}, and {@code frequency} parameters <b>may</b> be clamped to implementation-dependent ranges.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be #TYPE_HAPTIC_VIBRATION</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrHapticBaseHeader, #ApplyHapticFeedback()
        """

    Expression("#TYPE_HAPTIC_VIBRATION")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrDuration("duration", "the number of nanoseconds the vibration <b>should</b> last. If #MIN_HAPTIC_DURATION is specified, the runtime <b>must</b> produce a short haptics pulse of minimal supported duration for the haptic device.")
    float("frequency", "the frequency of the vibration in Hz. If #FREQUENCY_UNSPECIFIED is specified, it is left to the runtime to decide the optimal frequency value to use.")
    float("amplitude", "the amplitude of the vibration between <code>0.0</code> and <code>1.0</code>.")
}

val XrOffset2Df = struct(Module.OPENXR, "XrOffset2Df") {
    documentation =
        """
        Float offset in two dimensions.

        <h5>Description</h5>
        This structure is used for component values that may be fractional (floating-point). If used to represent physical distances, values <b>must</b> be in meters.

        <h5>See Also</h5>
        ##XrExtent2Df, ##XrRect2Df
        """

    float("x", "the floating-point offset in the x direction.")
    float("y", "the floating-point offset in the y direction.")
}

val XrRect2Df = struct(Module.OPENXR, "XrRect2Df") {
    documentation =
        """
        Rect in two dimensions.

        <h5>Description</h5>
        This structure is used for component values that may be fractional (floating-point).

        <h5>See Also</h5>
        ##XrExtent2Df, ##XrOffset2Df
        """

    XrOffset2Df("offset", "the ##XrOffset2Df specifying the rectangle offset.")
    XrExtent2Df("extent", "the ##XrExtent2Df specifying the rectangle extent.")
}

val XrVector4f = struct(Module.OPENXR, "XrVector4f") {
    documentation =
        """
        Four-dimensional vector.

        <h5>Description</h5>
        If used to represent physical distances, {@code x}, {@code y}, and {@code z} values <b>must</b> be in meters.

        <h5>See Also</h5>
        ##XrHandTrackingMeshFB, ##XrPosef, ##XrQuaternionf, ##XrVector2f, ##XrVector3f
        """

    float("x", "the x coordinate of the vector.")
    float("y", "the y coordinate of the vector.")
    float("z", "the z coordinate of the vector.")
    float("w", "the w coordinate of the vector.")
}

val XrColor4f = struct(Module.OPENXR, "XrColor4f") {
    documentation =
        """
        Color Vector.

        <h5>Description</h5>
        Unless otherwise specified, colors are encoded as linear (not with sRGB nor other gamma compression) values with individual components being in the range of 0.0 through 1.0, and without the RGB components being premultiplied by the alpha component.

        If color encoding is specified as being premultiplied by the alpha component, the RGB components are set to zero if the alpha component is zero.

        <h5>See Also</h5>
        ##XrCompositionLayerColorScaleBiasKHR, ##XrPassthroughColorMapMonoToRgbaFB, ##XrPassthroughStyleFB, ##XrSwapchainStateSamplerOpenGLESFB, ##XrSwapchainStateSamplerVulkanFB
        """

    float("r", "the red component of the color.")
    float("g", "the green component of the color.")
    float("b", "the blue component of the color.")
    float("a", "the alpha component of the color.")
}