/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.*

val OVR = "OVR".nativeClass(packageName = OVR_PACKAGE, prefix = "OVR", prefixConstant = "ovr") {
	includeOVRCAPI()

	documentation =
		"""
		Native bindings to libOVR, using the <a href="https://developer.oculus.com/">Oculus SDK</a> C API.

		Overview of the API:

		<h3>Setup</h3>
		${ul(
			"#_Initialize()",
			"#Hmd_Create(0, &hmd)",
			"Call #Hmd_ConfigureTracking() to configure and initialize tracking.",
			"Use hmd members and #Hmd_GetFovTextureSize() to determine graphics configuration and #Hmd_GetRenderDesc() to get per-eye rendering parameters.",
			"Allocate render target texture sets with ovrHmd_CreateSwapTextureSetD3D11() or OVRGL#Hmd_CreateSwapTextureSetGL()."
		)}

		<h3>Application Loop</h3>
		${ul(
			"Call #Hmd_GetFrameTiming() to get the current frame timing information.",
			"Call #Hmd_GetTrackingState() and OVRUtil#_CalcEyePoses() to obtain the predicted rendering pose for each eye based on timing.",
			"""
			Render the scene content into {@code CurrentIndex} of ovrTextureSet for each eye and layer you plan to update this frame. Increment texture set
			{@code CurrentIndex}.
			""",
			"""
			Call #Hmd_SubmitFrame() to render the distorted layers to the back buffer and present them on the HMD. If #Hmd_SubmitFrame() returns
			#Success_NotVisible, there is no need to render the scene for the next loop iteration. Instead, just call #Hmd_SubmitFrame() again until it returns
			#Success.
			"""
		)}

		<h3>Shutdown</h3>
		${ul(
			"#Hmd_Destroy()",
			"#_Shutdown()"
		)}
		"""

	IntConstant(
		"Boolean values",

		"False" _ 0,
		"True" _ 1
	)

	IntConstant("This is a general success result.", "Success" _ 0)
	IntConstant(
		"""
		Returned from a call to #Hmd_SubmitFrame(). The call succeeded, but what the app rendered will not be visible on the HMD. Ideally the app should continue
		calling #Hmd_SubmitFrame(), but not do any rendering. When the result becomes #Success, rendering should continue as usual.
		""",
		"Success_NotVisible" _ 1000
	)
	// General errors
	IntConstant("Failure to allocate memory.", "Error_MemoryAllocationFailure" expr "-1000")
	IntConstant("Failure to create a socket.", "Error_SocketCreationFailure" expr "-1001")
	IntConstant("Invalid HMD parameter provided.", "Error_InvalidHmd" expr "-1002")
	IntConstant("The operation timed out.", "Error_Timeout" expr "-1003")
	IntConstant("The system or component has not been initialized.", "Error_NotInitialized" expr "-1004")
	IntConstant("Invalid parameter provided. See error info or log for details.", "Error_InvalidParameter" expr "-1005")
	IntConstant("Generic service error. See error info or log for details.", "Error_ServiceError" expr "-1006")
	IntConstant("The given HMD doesn't exist.", "Error_NoHmd" expr "-1007")
	// Audio error range, reserved for Audio errors.
	IntConstant("First Audio error.", "Error_AudioReservedBegin" expr "-2000")
	IntConstant("Last Audio error.", "Error_AudioReservedEnd" expr "-2999")
	// Initialization errors.
	IntConstant("Generic initialization error.", "Error_Initialize" expr "-3000")
	IntConstant("Couldn't load LibOVRRT.", "Error_LibLoad" expr "-3001")
	IntConstant("LibOVRRT version incompatibility.", "Error_LibVersion" expr "-3002")
	IntConstant("Couldn't connect to the OVR Service.", "Error_ServiceConnection" expr "-3003")
	IntConstant("OVR Service version incompatibility.", "Error_ServiceVersion" expr "-3004")
	IntConstant("The operating system version is incompatible.", "Error_IncompatibleOS" expr "-3005")
	IntConstant("Unable to initialize the HMD display.", "Error_DisplayInit" expr "-3006")
	IntConstant("Unable to start the server. Is it already running?", "Error_ServerStart" expr "-3007")
	IntConstant("Attempting to re-initialize with a different version.", "Error_Reinitialization" expr "-3008")
	// Hardware Errors
	IntConstant("Headset has no bundle adjustment data.", "Error_InvalidBundleAdjustment" expr "-4000")
	IntConstant("The USB hub cannot handle the camera frame bandwidth.", "Error_USBBandwidth" expr "-4001")

	IntConstant(
		"""
		When a debug library is requested, a slower debugging version of the library will run which can be used to help solve problems in the library and debug
		application code.
		""",
		"Init_Debug" _ 0x00000001
	)
	IntConstant(
		"""
		When {@code ServerOptional} is set, the #_Initialize() call not will block waiting for the server to respond. If the server is not reachable, it might
		still succeed.
		""",
		"Init_ServerOptional" _ 0x00000002
	)
	IntConstant(
		"""
		When a version is requested, the LibOVR runtime respects the {@code RequestedMinorVersion} field and verifies that the {@code RequestedMinorVersion} is
		supported.
		""",
		"Init_RequestVersion" _ 0x00000004
	)
	IntConstant("Forces debug features of LibOVR off explicitly, even if it is built in debug mode.", "Init_ForceNoDebug" _ 0x00000008)

	val LogLevels = IntConstant(
		"Logging levels",

		"LogLevel_Debug" _ 0,
		"LogLevel_Info" _ 1,
		"LogLevel_Error" _ 2
	).javaDocLinks

	val HMDType = IntConstant(
		"HMD types",

		"Hmd_None" _ 0,
		"Hmd_DK1" _ 3,
		"Hmd_DKHD" _ 4,
		"Hmd_DK2" _ 6,
		"Hmd_BlackStar" _ 7,
		"Hmd_CB" _ 8,
		"Hmd_Other" _ 9
	).javaDocLinks

	// ovrHmdCaps enum
	IntConstant("(read only) Specifies that the HMD is a virtual debug device.", "HmdCap_DebugDevice" _ 0x0010)
	IntConstant(
		"""
		Toggles low persistence mode on or off.

		This setting reduces eye-tracking based motion blur. Eye-tracking based motion blur is caused by the viewer's focal point moving more pixels than have
		refreshed in the same period of time. The disadvantage of this setting is that this reduces the average brightness of the display and causes some users
		to perceive flicker. <i>There is no performance cost for this option. Oculus recommends exposing it to the user as an optional setting.</i>
		""",
		"HmdCap_LowPersistence" _ 0x0080
	)
	IntConstant("(read/write) Adjusts prediction dynamically based on internally measured latency.", "HmdCap_DynamicPrediction" _ 0x0200)
	IntConstant("(read/write) Supports rendering without VSync for debugging.", "HmdCap_NoVSync" _ 0x1000)
	IntConstant(
		"Indicates to the developer what caps they can and cannot modify. These are processed by the client.",
		"HmdCap_Writable_Mask" expr "ovrHmdCap_LowPersistence | ovrHmdCap_DynamicPrediction | ovrHmdCap_NoVSync"
	)
	IntConstant(
		"Indicates to the developer what caps they can and cannot modify. These are processed by the service.",
		"HmdCap_Service_Mask" expr "ovrHmdCap_LowPersistence | ovrHmdCap_DynamicPrediction"
	)
	val HmdCaps = "#HmdCap_DebugDevice #HmdCap_LowPersistence #HmdCap_DynamicPrediction #HmdCap_NoVSync"

	// ovrTrackingCaps enum
	IntConstant("Supports orientation tracking (IMU).", "TrackingCap_Orientation" _ 0x0010)
	IntConstant("Supports yaw drift correction via a magnetometer or other means.", "TrackingCap_MagYawCorrection" _ 0x0020)
	IntConstant("Supports positional tracking.", "TrackingCap_Position" _ 0x0040)
	IntConstant(
		"""
		Overriding the other flags, this causes the application to ignore tracking settings. This is the internal default before #Hmd_ConfigureTracking() is
		called.
		""",
		"TrackingCap_Idle" _ 0x0100
	)
	val TrackingCaps = "#TrackingCap_Orientation #TrackingCap_MagYawCorrection #TrackingCap_Position #TrackingCap_Idle"

	val EyeType = IntConstant(
		"ovrEyeType",

		"Eye_Left" _ 0,
		"Eye_Right" _ 1,
		"Eye_Count" _ 2
	).javaDocLinks

	// ovrStatusBits enum
	IntConstant("Orientation is currently tracked (connected and in use).", "Status_OrientationTracked" _ 0x0001)
	IntConstant("Position is currently tracked (false if out of range).", "Status_PositionTracked" _ 0x0002)
	IntConstant("Camera pose is currently tracked.", "Status_CameraPoseTracked" _ 0x0004)
	IntConstant("Position tracking hardware is connected.", "Status_PositionConnected" _ 0x0020)
	IntConstant("HMD Display is available and connected.", "Status_HmdConnected" _ 0x0080)

	IntConstant(
		"Render API",

		"RenderAPI_None" _ 0,
		"RenderAPI_OpenGL" _ 1,
		"RenderAPI_Android_GLES" _ 2,
		//"RenderAPI_D3D9_Obsolete" _ 3,
		//"RenderAPI_D3D10_Obsolete" _ 4,
		"RenderAPI_D3D11" _ 5,
		"RenderAPI_Count" _ 6
	)

	ovrResult(
		"_Initialize",
		"""
		Initialize LibOVR for application usage. This includes finding and loading the LibOVRRT shared library. No LibOVR API functions, other than
		#_GetLastErrorInfo(), can be called unless ovr_Initialize succeeds. A successful call to ovr_Initialize must be eventually followed by a call to
		#_Shutdown(). ovr_Initialize calls are idempotent. Calling ovr_Initialize twice does not require two matching calls to #_Shutdown(). If already
		initialized, the return value is #Success.

		LibOVRRT shared library search order:
		${ol(
			"Current working directory (often the same as the application directory).",
			"Module directory (usually the same as the application directory, but not if the module is a separate shared library).",
			"Application directory",
			"Development directory (only if OVR_ENABLE_DEVELOPER_SEARCH is enabled, which is off by default).",
			"Standard OS shared library search location(s) (OS-specific)."
		)}
	    """,

		nullable _ const _ ovrInitParams_p.IN(
			"params",
			"an ##OVRInitParams struct that cpecifies custom initialization options. May be $NULL to indicate default options."
		),

	    returnDoc =
		"""
		an {@code ovrResult} indicating success or failure. In the case of failure, use #_GetLastErrorInfo() to get more information. Example failed results
		include:
		${ul(
			"#Error_Initialize: Generic initialization error.",
		    "#Error_LibLoad: Couldn't load LibOVRRT.",
		    "#Error_LibVersion: LibOVRRT version incompatibility.",
		    "#Error_ServiceConnection: Couldn't connect to the OVR Service.",
		    "#Error_ServiceVersion: OVR Service version incompatibility.",
		    "#Error_IncompatibleOS: The operating system version is incompatible.",
		    "#Error_DisplayInit: Unable to initialize the HMD display.",
		    "#Error_ServerStart:  Unable to start the server. Is it already running?",
		    "#Error_Reinitialization: Attempted to re-initialize with a different version."
		)}
		"""
	)

	void(
		"_Shutdown",
		"""
		Shuts down LibOVR.

		A successful call to #_Initialize() must be eventually matched by a call to ovr_Shutdown. After calling ovr_Shutdown, no LibOVR functions can be called
		except #_GetLastErrorInfo() or another #_Initialize(). ovr_Shutdown invalidates all pointers, references, and created objects previously returned by
		LibOVR functions. The LibOVRRT shared library can be unloaded by ovr_Shutdown.
		"""
	)

	void(
		"_GetLastErrorInfo",
		"""
	    Returns information about the most recent failed return value by the current thread for this library.

	    This function itself can never generate an error. The last error is never cleared by LibOVR, but will be overwritten by new errors. Do not use this
	    call to determine if there was an error in the last API call as successful API calls don't clear the last ##OVRErrorInfo. To avoid any inconsistency,
	    #_GetLastErrorInfo() should be called immediately after an API function that returned a failed {@code ovrResult}, with no other API functions called in
	    the interim.
	    """,

		ovrErrorInfo_p.OUT("errorInfo", "The last ##OVRErrorInfo for the current thread")
	)

	(const _ charUTF8_p)(
		"_GetVersionString",
		"""
		Returns the version string representing the LibOVRRT version.

		The returned string pointer is valid until the next call to #_Shutdown().

		Note that the returned version string doesn't necessarily match the current OVR_MAJOR_VERSION, etc., as the returned string refers to the LibOVRRT
		shared library version and not the locally compiled interface version.

		The format of this string is subject to change in future versions and its contents should not be interpreted.
		""",

	    returnDoc = "a UTF8-encoded null-terminated version string"
	)

	(const _ charUTF8_p)(
		"_TraceMessage",
		"""
		Writes a message string to the LibOVR tracing mechanism (if enabled).

		This message will be passed back to the application via the ##OVRLogCallback if it was registered.
		""",

		int.IN("level", "an {@code ovrLogLevel} constant", LogLevels),
		const _ charUTF8_p.IN("message", "a UTF8-encoded null-terminated string"),

		returnDoc = "the {@code strlen} of the message or a negative value if the message is too large"
	)

	// ----------------
	// HMD Management

	ovrResult(
		"Hmd_Detect",
		"""
		Detects or re-detects HMDs and reports the total number detected.

		This function is useful to determine if an HMD can be created without committing to creating it. For example, an application can use this information
		to present an HMD selection GUI.

		If one or more HMDs are present, an integer value is returned which indicates the number present. The number present indicates the range of valid
		indexes that can be passed to #Hmd_Create(). If no HMDs are present, the return value is zero. If there is an error, a negative error {@code ovrResult}
		value is returned.
		""",
		returnDoc = "an integer that specifies the number of HMDs currently present. Upon failure, {@code OVR_SUCCESS(result)} is false."
	)

	ovrResult(
		"Hmd_Create",
		"""
	    Creates a handle to an HMD which doubles as a description structure.

		Upon success the returned ovrHmd* must be freed with #Hmd_Destroy(). A second call to #Hmd_Create() with the same index as a previously successful call
		will result in an error return value.
	    """,

		int.IN("index", "a value in the range of {@code [0 .. ovrHmd_Detect()-1]]}."),
	    ovrHmd_p.OUT("pHmd", "a pointer to an {@code ovrHmd} which will be written to upon success."),

	    returnDoc = "an {@code ovrResult} indicating success or failure"
	)

	ovrResult(
		"Hmd_CreateDebug",
		"""
		Creates a fake HMD used for debugging only.

		 This is not tied to specific hardware, but may be used to debug some of the related rendering.
		""",

		ovrHmdType.IN("type", "indicates the HMD type to emulate", HMDType),
		ovrHmd_p.OUT("pHmd", "a pointer to an {@code ovrHmd} which will be written to upon success."),

		returnDoc = "an {@code ovrResult} indicating success or failure"
	)

	void(
		"Hmd_Destroy",
		"Destroys the HMD.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()")
	)

	unsigned_int(
		"Hmd_GetEnabledCaps",
		"""
	    Returns ovrHmdCaps bits that are currently enabled.

		Note that this value is different from ##OVRHmdDesc{@code ::HmdCaps}, which describes what capabilities are available for that HMD.
	    """,

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),

	    returnDoc = "a combination of zero or more {@code ovrHmdCaps}"
	)

	void(
		"Hmd_SetEnabledCaps",
		"""
		Modifies capability bits described by {@code ovrHmdCaps} that can be modified, such as #HmdCap_LowPersistence.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		unsigned_int.IN("hmdCaps", "a combination of 0 or more {@code ovrHmdCaps}", HmdCaps, LinkMode.BITFIELD)
	)

	// ----------------
	// Tracking

	ovrResult(
		"Hmd_ConfigureTracking",
		"""
		Starts sensor sampling, enabling specified capabilities, described by {@code ovrTrackingCaps}.

		Use 0 for both {@code supportedTrackingCaps} and {@code requiredTrackingCaps} to disable tracking.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		unsigned_int.IN(
			"supportedTrackingCaps",
			"""
			specifies support that is requested. The function will succeed even if these caps are not available (i.e. sensor or camera is unplugged). Support
			will automatically be enabled if such device is plugged in later. Software should check ##OVRTrackingState{@code .StatusFlags} for real-time status.
			""",
			TrackingCaps,
			LinkMode.BITFIELD
		),
		unsigned_int.IN(
			"requiredTrackingCaps",
			"""
			specify sensor capabilities required at the time of the call. If they are not available, the function will fail. Pass 0 if only specifying
			{@code supportedTrackingCaps}.
			""",
			TrackingCaps,
			LinkMode.BITFIELD
		),

	    returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #_GetLastErrorInfo() to get more information."
	)

	void(
		"Hmd_RecenterPose",
		"""
		Re-centers the sensor position and orientation.

		This resets the (x,y,z) positional components and the yaw orientation component. The Roll and pitch orientation components are always determined by
		gravity and cannot be redefined. All future tracking will report values relative to this new reference position.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()")
	)

	ovrTrackingState(
		"Hmd_GetTrackingState",
		"""
		Returns tracking state reading based on the specified absolute system time.

		Pass an {@code absTime} value of 0.0 to request the most recent sensor reading. In this case both {@code PredictedPose} and {@code SamplePose} will
		have the same value.

		This may also be used for more refined timing of front buffer rendering logic, and so on.
	    """,

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		double.IN("absTime", "the absolute future time to predict the return ##OVRTrackingState value. Use 0 to request the most recent tracking state."),

	    returnDoc = "the ##OVRTrackingState that is predicted for the given {@code absTime}"
	)

	// ----------------
	// Layers

	IntConstant(
		"Describes layer types that can be passed to #Hmd_SubmitFrame(). Each layer type has an associated struct, such as ##OVRLayerEyeFov.",

		"LayerType_Disabled" _ 0,
		"LayerType_EyeFov" _ 1,
		"LayerType_EyeFovDepth" _ 2,
		"LayerType_QuadInWorld" _ 3,
		"LayerType_QuadHeadLocked" _ 4,
		"LayerType_Direct" _ 6
	)

	IntConstant(
		"Identifies flags used by ##OVRLayerHeader and which are passed to #Hmd_SubmitFrame().",

		"LayerFlag_HighQuality" _ 0x01,
		"LayerFlag_TextureOriginAtBottomLeft" _ 0x02
	)

	// ----------------
	// SDK Distortion Rendering

	void(
		"Hmd_DestroySwapTextureSet",
	    "Destroys an ##OVRSwapTextureSet and frees all the resources associated with it.",

	    ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
	    ovrSwapTextureSet_p.IN("textureSet", "the ##OVRSwapTextureSet to destroy")
	)

	void(
		"Hmd_DestroyMirrorTexture",
		"Destroys a mirror texture previously created by one of the mirror texture creation functions.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		ovrTexture_p.IN("mirrorTexture", "the ##OVRTexture to destroy")
	)

	ovrSizei(
		"Hmd_GetFovTextureSize",
		"""
		Calculates the recommended viewport size for rendering a given eye within the HMD with a given FOV cone.

		Higher FOV will generally require larger textures to maintain quality. Apps packing multiple eye views together on the same texture should ensure there
		are at least 8 pixels of padding between them to prevent texture filtering and chromatic aberration causing images to leak between the two eye views.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		ovrEyeType.IN("eye", "which eye (left or right) to calculate for", EyeType),
		ovrFovPort.IN("fov", "the ##OVRFovPort to use"),
		float.IN(
			"pixelsPerDisplayPixel",
			"""
			the ratio of the number of render target pixels to display pixels at the center of distortion. 1.0 is the default value. Lower values can improve
			performance, higher values give improved quality.
			"""
		),

	    returnDoc = "the texture width and height size"
	)

	ovrEyeRenderDesc(
		"Hmd_GetRenderDesc",
		"Computes the distortion viewport, view adjust, and other rendering parameters for the specified eye.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		ovrEyeType.IN("eyeType", "which eye (left or right) for which to perform calculations", EyeType),
		ovrFovPort.IN("fov", "the ##OVRFovPort to use."),

	    returnDoc = "the computed ##OVREyeRenderDesc for the given {@code eyeType} and field of view"
	)

	ovrResult(
		"Hmd_SubmitFrame",
		"""
	    Submits layers for distortion and display.

	    ovrHmd_SubmitFrame triggers distortion and processing which might happen asynchronously. The function will return when there is room in the submission
	    queue and surfaces are available. Distortion might or might not have completed.
		${ul(
			"Layers are drawn in the order they are specified in the array, regardless of the layer type.",
		    """
		    Layers are not remembered between successive calls to ovrHmd_SubmitFrame. A layer must be specified in every call to ovrHmd_SubmitFrame or it won't
		    be displayed.
		    """,
		    """
		    If a {@code layerPtrList} entry that was specified in a previous call to ovrHmd_SubmitFrame is passed as $NULL or is of type #LayerType_Disabled,
		    that layer is no longer displayed.
		    """,
		    """
		    A {@code layerPtrList} entry can be of any layer type and multiple entries of the same layer type are allowed. No {@code layerPtrList} entry may be
		    duplicated (i.e. the same pointer as an earlier entry).
		    """
		)}

		<h3>Example code</h3>
		${codeBlock("""
ovrLayerEyeFov  layer0;
ovrLayerQuad    layer1;
...
ovrLayerHeader* layers[2] = { &layer0.Header, &layer1.Header };
ovrResult result = ovrHmd_SubmitFrame(hmd, frameIndex, nullptr, layers, 2);""")}
	    """,

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		unsigned_int.IN("frameIndex", "the targeted frame index, or 0, to refer to one frame after the last time #Hmd_SubmitFrame() was called"),
		nullable _ const _ ovrViewScaleDesc_p.IN(
			"viewScaleDesc",
			"""
			provides additional information needed only if {@code layerPtrList} contains a #LayerType_QuadInWorld or #LayerType_QuadHeadLocked. If $NULL, a
			default version is used based on the current configuration and a 1.0 world scale.
			"""
		),
		const _ ovrLayerHeader_p_const_p.IN(
			"layerPtrList",
			"""
			a list of {@code ovrLayer} pointers, which can include $NULL entries to indicate that any previously shown layer at that index is to not be
			displayed. Each layer header must be a part of a layer structure such as ##OVRLayerEyeFov or ##OVRLayerQuad, with {@code Header.Type} identifying
			its type. A $NULL {@code layerPtrList} entry in the array indicates the absence of the given layer.
			"""
		),
		AutoSize("layerPtrList") _ unsigned_int.IN(
			"layerCount",
			"""
			the number of valid elements in {@code layerPtrList}. The maximum supported {@code layerCount} is not currently specified, but may be specified in
			a future version.
			"""
		),

	    returnDoc =
	    """
	    an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon one of the possible success values:
	    ${ul(
			"#Success: rendering completed successfully.",
	        """
	        #Success_NotVisible: rendering completed successfully but was not displayed on the HMD, usually because another application currently has ownership
	        of the HMD. Applications receiving this result should stop rendering new content, but continue to call ovrHmd_SubmitFrame periodically until it
	        returns a value other than #Success_NotVisible.
	        """
	    )}
	    """
	)

	// ----------------
	// Frame Timing

	ovrFrameTiming(
		"Hmd_GetFrameTiming",
		"""
		Gets the ##OVRFrameTiming for the given frame index.

		The application should increment {@code frameIndex} for each successively targeted frame, and pass that index to any relevent OVR functions that need
		to apply to the frame identified by that index.

		This function is thread-safe and allows for multiple application threads to target their processing to the same displayed frame.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		unsigned_int.IN("frameIndex", "the frame the caller wishes to target")
	)

	void(
		"Hmd_ResetFrameTiming",
		"""
		Initializes and resets frame time tracking.

		This is typically not necessary, but is helpful if the application changes vsync state or video mode. vsync is assumed to be on if this isn't called.
		Resets internal frame index to the specified number.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		unsigned_int.IN("frameIndex", "the frame the caller wishes to target.")
	)

	double(
		"_GetTimeInSeconds",
		"""
		Returns global, absolute high-resolution time in seconds.

		The time frame of reference for this function is not specified and should not be depended upon.
		""",

	    returnDoc = "seconds as a floating point value"
	)

	// ----------------
	// Property Access

	ovrBool(
		"Hmd_GetBool",
		"Reads a boolean property.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid for only the call"),
		ovrBool.IN("defaultVal", "specifes the value to return if the property couldn't be read"),

	    returnDoc = "the property interpreted as a boolean value. Returns {@code defaultVal} if the property doesn't exist."
	)

	ovrBool(
		"Hmd_SetBool",
		"""
		Writes or creates a boolean property.

		If the property wasn't previously a boolean property, it is changed to a boolean property.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		ovrBool.IN("value", "the value to write"),

	    returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
	)

	int(
		"Hmd_GetInt",
		"Reads an integer property.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		int.IN("defaultVal", "specifes the value to return if the property couldn't be read"),

	    returnDoc = "the property interpreted as an integer value. Returns {@code defaultVal} if the property doesn't exist."
	)

	ovrBool(
		"Hmd_SetInt",
		"""
		Writes or creates an integer property.

		If the property wasn't previously an integer property, it is changed to an integer property.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		int.IN("value", "the value to write"),

	    returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
	)

	float(
		"Hmd_GetFloat",
		"Reads a float property.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		float.IN("defaultVal", "specifes the value to return if the property couldn't be read"),

		returnDoc = "the property interpreted as a float value. Returns {@code defaultVal} if the property doesn't exist."
	)

	ovrBool(
		"Hmd_SetFloat",
		"""
		Writes or creates a float property.

		If the property wasn't previously a float property, it's changed to a float property.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		float.IN("value", "the value to write"),

		returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
	)

	unsigned_int(
		"Hmd_GetFloatArray",
		"Reads a float array property.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		float_p.OUT("values", "an array of float to write to"),
		AutoSize("values") _ unsigned_int.IN("valuesCapacity", "the maximum number of elements to write to the values array"),

	    returnDoc = "the number of elements read, or 0 if property doesn't exist or is empty"
	)

	ovrBool(
		"Hmd_SetFloatArray",
		"Writes or creates a float array property.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		float_p.OUT("values", "an array of float to write from"),
		AutoSize("values") _ unsigned_int.IN("valuesSize", "the number of elements to write"),

		returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
	)

	(const _ charUTF8_p)(
		"Hmd_GetString",
		"""
		Reads a string property.

		Strings are UTF8-encoded and null-terminated.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		nullable _ const _ charUTF8_p.IN("defaultVal", "specifes the value to return if the property couldn't be read"),

	    returnDoc =
		"""
		the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as $NULL. The return memory is guaranteed to be valid
		until next call to ovrHmd_GetString or until the HMD is destroyed, whichever occurs first.
		"""
	)

	ovrBool(
		"Hmd_SetString",
		"""
		Writes or creates a string property.

		Strings are UTF8-encoded and null-terminated.
		""",

		ovrHmd.IN("hmddesc", "an {@code ovrHmd} previously returned by #Hmd_Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		const _ charASCII_p.IN("value", "the string property, which only needs to be valid for the duration of the call"),

	    returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
	)
}