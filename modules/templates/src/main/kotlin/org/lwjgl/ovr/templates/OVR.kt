/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.*

val OVR = "OVR".nativeClass(packageName = OVR_PACKAGE, prefixMethod = "ovr_", prefixConstant = "ovr") {
	includeOVRCAPI()

	documentation =
		"""
		Native bindings to libOVR, using the <a href="https://developer.oculus.com/">Oculus SDK</a> C API.

		Overview of the API:

		<h3>Setup</h3>
		${ul(
			"#Initialize()",
			"#Create()(&hmd, &graphicsId)",
			"Call #ConfigureTracking() to configure and initialize tracking.",
			"Use hmd members and #GetFovTextureSize() to determine graphics configuration and #GetRenderDesc() to get per-eye rendering parameters.",
			"Allocate render target texture sets with ovr_CreateSwapTextureSetD3D11() or OVRGL#CreateSwapTextureSetGL()."
		)}

		<h3>Application Loop</h3>
		${ul(
			"Call #GetFrameTiming() to get the current frame timing information.",
			"Call #GetTrackingState() and OVRUtil#CalcEyePoses() to obtain the predicted rendering pose for each eye based on timing.",
			"""
			Render the scene content into {@code CurrentIndex} of ovrTextureSet for each eye and layer you plan to update this frame. Increment texture set
			{@code CurrentIndex}.
			""",
			"""
			Call #SubmitFrame() to render the distorted layers to the back buffer and present them on the HMD. If #SubmitFrame() returns
			OVRErrorCode#Success_NotVisible, there is no need to render the scene for the next loop iteration. Instead, just call #SubmitFrame() again
			until it returns OVRErrorCode#Success.
			"""
		)}

		<h3>Shutdown</h3>
		${ul(
			"#Destroy()",
			"#Shutdown()"
		)}
		"""

	IntConstant(
		"Boolean values",

		"False" _ 0,
		"True" _ 1
	)

	IntConstant(
		"""
		When a debug library is requested, a slower debugging version of the library will run which can be used to help solve problems in the library and debug
		application code.
		""",
		"Init_Debug" _ 0x00000001
	)
	IntConstant(
		"""
		When {@code ServerOptional} is set, the #Initialize() call not will block waiting for the server to respond. If the server is not reachable, it might
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
	IntConstant("These bits are writable by user code.", "Init_WritableBits" _ 0x00ffffff)

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
		"Hmd_CB" _ 8,
		"Hmd_Other" _ 9,
		"Hmd_E3_2015" _ 10,
	    "Hmd_ES06" _ 11
	).javaDocLinks

	// ovrHmdCaps enum
	IntConstant("(read only) Specifies that the HMD is a virtual debug device.", "HmdCap_DebugDevice" _ 0x0010)
	IntConstant("Indicates to the developer what caps they can and cannot modify. These are processed by the client.", "HmdCap_Writable_Mask" _ 0x0000)
	IntConstant("Indicates to the developer what caps they can and cannot modify. These are processed by the service.", "HmdCap_Service_Mask" _ 0x0000)
	val HmdCaps = "#HmdCap_DebugDevice"

	// ovrTrackingCaps enum
	IntConstant("Supports orientation tracking (IMU).", "TrackingCap_Orientation" _ 0x0010)
	IntConstant("Supports yaw drift correction via a magnetometer or other means.", "TrackingCap_MagYawCorrection" _ 0x0020)
	IntConstant("Supports positional tracking.", "TrackingCap_Position" _ 0x0040)
	IntConstant(
		"""
		Overriding the other flags, this causes the application to ignore tracking settings. This is the internal default before #ConfigureTracking() is
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
		"RenderAPI_D3D11" _ 5
	)

	IntConstant(
		"Button input types.",

		"Button_A" _ 0x00000001,
		"Button_B" _ 0x00000002,
		"Button_RThumb" _ 0x00000004,
		"Button_RShoulder" _ 0x00000008,
		"Button_X" _ 0x00000100,
		"Button_Y" _ 0x00000200,
		"Button_LThumb" _ 0x00000400,
		"Button_LShoulder" _ 0x00000800,

		// Navigation through DPad.
		"Button_Up" _ 0x00010000,
		"Button_Down" _ 0x00020000,
		"Button_Left" _ 0x00040000,
		"Button_Right" _ 0x00080000,
		"Button_Enter" _ 0x00100000, // Start on XBox controller.
		"Button_Back" _ 0x00200000 // Back on Xbox controller.
	)

	IntConstant(
		"Touch input types.",

		"Touch_A" expr "ovrButton_A",
	    "Touch_B" expr "ovrButton_B",
	    "Touch_RThumb" expr "ovrButton_RThumb",
	    "Touch_RIndexTrigger" _ 0x00000010,
	    "Touch_X" expr "ovrButton_X",
	    "Touch_Y" expr "ovrButton_Y",
	    "Touch_LThumb" expr "ovrButton_LThumb",
	    "Touch_LIndexTrigger" _ 0x00001000,

	    // Finger pose state
	    // Derived internally based on distance, proximity to sensors and filtering.
	    "Touch_RIndexPointing" _ 0x00000020,
	    "Touch_RThumbUp" _ 0x00000040,
	    "Touch_LIndexPointing" _ 0x00002000,
	    "Touch_LThumbUp" _ 0x00004000
	)

	IntConstant(
		"Which controller is connected; multiple can be connected at once.",

		"ControllerType_LTouch" _ 0x01,
		"ControllerType_RTouch" _ 0x02,
		"ControllerType_Touch" _ 0x03,
		"ControllerType_All" _ 0xff
	)

	IntConstant(
		"Names for the left and right hand array indexes.",

		"Hand_Left" _ 0,
		"Hand_Right" _ 1
	)

	ovrResult(
		"Initialize",
		"""
		Initialize LibOVR for application usage. This includes finding and loading the LibOVRRT shared library. No LibOVR API functions, other than
		#GetLastErrorInfo(), can be called unless ovr_Initialize succeeds. A successful call to ovr_Initialize must be eventually followed by a call to
		#Shutdown(). ovr_Initialize calls are idempotent. Calling ovr_Initialize twice does not require two matching calls to #Shutdown(). If already
		initialized, the return value is OVRErrorCode#Success.

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
		an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information. Example failed results
		include:
		${ul(
			"OVRErrorCode#Error_Initialize: Generic initialization error.",
		    "OVRErrorCode#Error_LibLoad: Couldn't load LibOVRRT.",
		    "OVRErrorCode#Error_LibVersion: LibOVRRT version incompatibility.",
		    "OVRErrorCode#Error_ServiceConnection: Couldn't connect to the OVR Service.",
		    "OVRErrorCode#Error_ServiceVersion: OVR Service version incompatibility.",
		    "OVRErrorCode#Error_IncompatibleOS: The operating system version is incompatible.",
		    "OVRErrorCode#Error_DisplayInit: Unable to initialize the HMD display.",
		    "OVRErrorCode#Error_ServerStart:  Unable to start the server. Is it already running?",
		    "OVRErrorCode#Error_Reinitialization: Attempted to re-initialize with a different version."
		)}
		"""
	)

	void(
		"Shutdown",
		"""
		Shuts down LibOVR.

		A successful call to #Initialize() must be eventually matched by a call to ovr_Shutdown. After calling ovr_Shutdown, no LibOVR functions can be called
		except #GetLastErrorInfo() or another #Initialize(). ovr_Shutdown invalidates all pointers, references, and created objects previously returned by
		LibOVR functions. The LibOVRRT shared library can be unloaded by ovr_Shutdown.
		"""
	)

	void(
		"GetLastErrorInfo",
		"""
	    Returns information about the most recent failed return value by the current thread for this library.

	    This function itself can never generate an error. The last error is never cleared by LibOVR, but will be overwritten by new errors. Do not use this
	    call to determine if there was an error in the last API call as successful API calls don't clear the last ##OVRErrorInfo. To avoid any inconsistency,
	    #GetLastErrorInfo() should be called immediately after an API function that returned a failed {@code ovrResult}, with no other API functions called in
	    the interim.
	    """,

		ovrErrorInfo_p.OUT("errorInfo", "The last ##OVRErrorInfo for the current thread")
	)

	(const _ charUTF8_p)(
		"GetVersionString",
		"""
		Returns the version string representing the LibOVRRT version.

		The returned string pointer is valid until the next call to #Shutdown().

		Note that the returned version string doesn't necessarily match the current OVR_MAJOR_VERSION, etc., as the returned string refers to the LibOVRRT
		shared library version and not the locally compiled interface version.

		The format of this string is subject to change in future versions and its contents should not be interpreted.
		""",

	    returnDoc = "a UTF8-encoded null-terminated version string"
	)

	(const _ charUTF8_p)(
		"TraceMessage",
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

	ovrHmdDesc(
		"GetHmdDesc",
        """
        Returns information about the given HMD.

        #Initialize() must have first been called in order for this to succeed, otherwise ovrHmdDesc::Type will be reported as #Hmd_None.
        """,

        nullable _ ovrHmd.IN(
	        "hmd",
	        """
	        an {@code ovrHmd} previously returned by #Create(), else $NULL in which case this function detects whether an HMD is present and returns its info if
	        so.
	        """
        ),

	    returnDoc = "an ##OVRHmdDesc. If the {@code hmd} is $NULL and ovrHmdDesc::Type is #Hmd_None then no HMD is present."
	)

	ovrResult(
		"Create",
		"""
	    Creates a handle to an HMD.

		Upon success the returned {@code ovrHmd} must be eventually freed with #Destroy() when it is no longer needed. A second call to #Create() will result
		in an error return value if the previous {@code Hmd} has not been destroyed.
	    """,

	    Check(1) _ ovrHmd_p.OUT("pHmd", "a pointer to an {@code ovrHmd} which will be written to upon success."),
	    Check(1) _ ovrGraphicsLuid_p.OUT(
		    "luid",
		    """
		    a system specific graphics adapter identifier that locates which graphics adapter has the HMD attached. This must match the adapter used by the
		    application or no rendering output will be possible. This is important for stability on multi-adapter systems. An application that simply chooses
		    the default adapter will not run reliably on multi-adapter systems.
			"""
	    ),

	    returnDoc = "an {@code ovrResult} indicating success or failure. Upon failure the returned {@code pHmd} will be $NULL."
	)

	void(
		"Destroy",
		"Destroys the HMD.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()")
	)

	unsigned_int(
		"GetEnabledCaps",
		"""
	    Returns ovrHmdCaps bits that are currently enabled.

		Note that this value is different from ##OVRHmdDesc{@code ::AvailableHmdCaps}, which describes what capabilities are available for that HMD.
	    """,

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),

	    returnDoc = "a combination of zero or more {@code ovrHmdCaps}"
	)

	void(
		"SetEnabledCaps",
		"""
		Modifies capability bits described by {@code ovrHmdCaps} that can be modified.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		unsigned_int.IN("hmdCaps", "a combination of 0 or more {@code ovrHmdCaps}", HmdCaps, LinkMode.BITFIELD)
	)

	// ----------------
	// Tracking

	ovrResult(
		"ConfigureTracking",
		"""
		Starts sensor sampling, enabling specified capabilities, described by {@code ovrTrackingCaps}.

		Use 0 for both {@code requestedTrackingCaps} and {@code requiredTrackingCaps} to disable tracking. ovr_ConfigureTracking can be called multiple
		times with the same or different values for a given {@code ovrHmd}.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		unsigned_int.IN(
			"requestedTrackingCaps",
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
			{@code requestedTrackingCaps}.
			""",
			TrackingCaps,
			LinkMode.BITFIELD
		),

	    returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
	)

	void(
		"RecenterPose",
		"""
		Re-centers the sensor position and orientation.

		This resets the (x,y,z) positional components and the yaw orientation component. The Roll and pitch orientation components are always determined by
		gravity and cannot be redefined. All future tracking will report values relative to this new reference position.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()")
	)

	ovrTrackingState(
		"GetTrackingState",
		"""
		Returns tracking state reading based on the specified absolute system time.

		Pass an {@code absTime} value of 0.0 to request the most recent sensor reading. In this case both {@code PredictedPose} and {@code SamplePose} will
		have the same value.

		This may also be used for more refined timing of front buffer rendering logic, and so on.
	    """,

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		double.IN("absTime", "the absolute future time to predict the return ##OVRTrackingState value. Use 0 to request the most recent tracking state."),

	    returnDoc = "the ##OVRTrackingState that is predicted for the given {@code absTime}"
	)

	ovrResult(
		"GetInputState",
        """
        Returns the most recent input state for controllers, without positional tracking info. Developers can tell whether the same state was returned by
        checking the {@code PacketNumber}.
        """,

	    ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
	    unsigned_int.IN("controllerTypeMask", "which controllers the input will be returned for"),
	    ovrInputState_p.IN("inputState", "the input state that will be filled in"),

	    returnDoc = "OVRErrorCode#Success if the new state was successfully obtained"
	)

	ovrResult(
		"SetControllerVibration",
        """
        Turns on vibration of the given controller.

		To disable vibration, call ovr_SetControllerVibration with an amplitude of 0. Vibration automatically stops after a nominal amount of time, so if you
		want vibration to be continuous over multiple seconds then you need to call this function periodically.
        """,

	    ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		unsigned_int.IN("controllerTypeMask", "the controllers to apply the vibration to"),
		float.IN(
			"frequency",
			"""
			a vibration frequency in the range of 0.0 to 1.0. Currently the only valid values are 0.0, 0.5, and 1.0 and other values will be clamped to one of
			these.
			"""),
		float.IN("amplitude", "a vibration amplitude in the range of 0.0 to 1.0."),

	    returnDoc = "OVRErrorCode#Success upon success"
	)


	// ----------------
	// Layers

	IntConstant(
		"Describes layer types that can be passed to #SubmitFrame(). Each layer type has an associated struct, such as ##OVRLayerEyeFov.",

		"LayerType_Disabled" _ 0,
		"LayerType_EyeFov" _ 1,
		"LayerType_EyeFovDepth" _ 2,
		"LayerType_QuadInWorld" _ 3,
		"LayerType_QuadHeadLocked" _ 4,
		"LayerType_Direct" _ 6
	)

	IntConstant(
		"Identifies flags used by ##OVRLayerHeader and which are passed to #SubmitFrame().",

		"LayerFlag_HighQuality" _ 0x01,
		"LayerFlag_TextureOriginAtBottomLeft" _ 0x02
	)

	// ----------------
	// SDK Distortion Rendering

	void(
		"DestroySwapTextureSet",
	    "Destroys an ##OVRSwapTextureSet and frees all the resources associated with it.",

	    ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
	    nullable _ ovrSwapTextureSet_p.IN("textureSet", "the ##OVRSwapTextureSet to destroy. If it is $NULL then this function has no effect.")
	)

	void(
		"DestroyMirrorTexture",
		"Destroys a mirror texture previously created by one of the mirror texture creation functions.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		nullable _ ovrTexture_p.IN("mirrorTexture", "the ##OVRTexture to destroy. If it is $NULL then this function has no effect.")
	)

	ovrSizei(
		"GetFovTextureSize",
		"""
		Calculates the recommended viewport size for rendering a given eye within the HMD with a given FOV cone.

		Higher FOV will generally require larger textures to maintain quality. Apps packing multiple eye views together on the same texture should ensure there
		are at least 8 pixels of padding between them to prevent texture filtering and chromatic aberration causing images to leak between the two eye views.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
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
		"GetRenderDesc",
		"Computes the distortion viewport, view adjust, and other rendering parameters for the specified eye.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		ovrEyeType.IN("eyeType", "which eye (left or right) for which to perform calculations", EyeType),
		ovrFovPort.IN("fov", "the ##OVRFovPort to use."),

	    returnDoc = "the computed ##OVREyeRenderDesc for the given {@code eyeType} and field of view"
	)

	ovrResult(
		"SubmitFrame",
		"""
	    Submits layers for distortion and display.

	    ovr_SubmitFrame triggers distortion and processing which might happen asynchronously. The function will return when there is room in the submission
	    queue and surfaces are available. Distortion might or might not have completed.
		${ul(
			"Layers are drawn in the order they are specified in the array, regardless of the layer type.",
		    """
		    Layers are not remembered between successive calls to ovr_SubmitFrame. A layer must be specified in every call to ovr_SubmitFrame or it won't
		    be displayed.
		    """,
		    """
		    If a {@code layerPtrList} entry that was specified in a previous call to ovr_SubmitFrame is passed as $NULL or is of type #LayerType_Disabled,
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
ovrResult result = ovr_SubmitFrame(hmd, frameIndex, nullptr, layers, 2);""")}
	    """,

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		unsigned_int.IN("frameIndex", "the targeted application frame index, or 0 to refer to one frame after the last time #SubmitFrame() was called"),
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
			"OVRErrorCode#Success: rendering completed successfully.",
	        """
	        OVRErrorCode#Success_NotVisible: rendering completed successfully but was not displayed on the HMD, usually because another application currently
	        has ownership of the HMD. Applications receiving this result should stop rendering new content, but continue to call ovr_SubmitFrame
	        periodically until it returns a value other than OVRErrorCode#Success_NotVisible.
	        """,
	        """
	        OVRErrorCode#Error_DisplayLost: The session has become invalid (such as due to a device removal) and the shared resources need to be released
	        (#DestroySwapTextureSet()), the session needs to destroyed (#Destroy()) and recreated (#Create()), and new resources need to be created
	        ({@code ovr_CreateSwapTextureSetXXX}). The application's existing private graphics resources do not need to be recreated unless the new #Create()
	        call returns a different {@code GraphicsLuid}.
	        """
	    )}
	    """
	)

	// ----------------
	// Frame Timing

	ovrFrameTiming(
		"GetFrameTiming",
		"""
		Gets the ##OVRFrameTiming for the given frame index.

		The application should increment {@code frameIndex} for each successively targeted frame, and pass that index to any relevent OVR functions that need
		to apply to the frame identified by that index.

		This function is thread-safe and allows for multiple application threads to target their processing to the same displayed frame.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		unsigned_int.IN("frameIndex", "the frame the caller wishes to target")
	)

	double(
		"GetTimeInSeconds",
		"""
		Returns global, absolute high-resolution time in seconds.

		The time frame of reference for this function is not specified and should not be depended upon.
		""",

	    returnDoc = "seconds as a floating point value"
	)

	IntConstant(
		"""
		Performance HUD enables the HMD user to see information critical to the real-time operation of the VR application such as latency timing, and CPU & GPU
		performance metrics.

		App can toggle performance HUD modes as such:
		${codeBlock("""
ovrPerfHudMode PerfHudMode = ovrPerfHud_LatencyTiming;
ovr_SetInt(Hmd, OVR_PERF_HUD_MODE, (int)PerfHudMode);""")}
		""",

		"PerfHud_Off" _ 0,
		"PerfHud_LatencyTiming" _ 1,
	    "PerfHud_RenderTiming" _ 2,
		"PerfHud_PerfHeadroom" _ 3,
		"PerfHud_VersionInfo" _ 4
	)

	IntConstant(
		"Visual properties of the stereo guide.",

	    "DebugHudStereo_Off" _ 0,  ///< Turns off the Stereo Debug HUD
		"DebugHudStereo_Quad" _ 1,  ///< Renders Quad in world for Stereo Debugging
        "DebugHudStereo_QuadWithCrosshair" _ 2,  ///< Renders Quad+crosshair in world for Stereo Debugging
        "DebugHudStereo_CrosshairAtInfinity" _ 3  ///< Renders screen-space crosshair at infinity for Stereo Debugging
	)

	void(
		"ResetBackOfHeadTracking",
	    "Should be called when the headset is placed on a new user.",

	    ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()")
	)

	void(
		"ResetMulticameraTracking",
		"Should be called when a tracking camera is moved.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()")
	)

	// ----------------
	// Property Access

	ovrBool(
		"GetBool",
		"Reads a boolean property.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid for only the call"),
		ovrBool.IN("defaultVal", "specifes the value to return if the property couldn't be read"),

	    returnDoc = "the property interpreted as a boolean value. Returns {@code defaultVal} if the property doesn't exist."
	)

	ovrBool(
		"SetBool",
		"""
		Writes or creates a boolean property.

		If the property wasn't previously a boolean property, it is changed to a boolean property.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		ovrBool.IN("value", "the value to write"),

	    returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
	)

	int(
		"GetInt",
		"Reads an integer property.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		int.IN("defaultVal", "specifes the value to return if the property couldn't be read"),

	    returnDoc = "the property interpreted as an integer value. Returns {@code defaultVal} if the property doesn't exist."
	)

	ovrBool(
		"SetInt",
		"""
		Writes or creates an integer property.

		If the property wasn't previously an integer property, it is changed to an integer property.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		int.IN("value", "the value to write"),

	    returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
	)

	float(
		"GetFloat",
		"Reads a float property.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		float.IN("defaultVal", "specifes the value to return if the property couldn't be read"),

		returnDoc = "the property interpreted as a float value. Returns {@code defaultVal} if the property doesn't exist."
	)

	ovrBool(
		"SetFloat",
		"""
		Writes or creates a float property.

		If the property wasn't previously a float property, it's changed to a float property.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		float.IN("value", "the value to write"),

		returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
	)

	unsigned_int(
		"GetFloatArray",
		"Reads a float array property.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		float_p.OUT("values", "an array of float to write to"),
		AutoSize("values") _ unsigned_int.IN("valuesCapacity", "the maximum number of elements to write to the values array"),

	    returnDoc = "the number of elements read, or 0 if property doesn't exist or is empty"
	)

	ovrBool(
		"SetFloatArray",
		"Writes or creates a float array property.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		float_p.OUT("values", "an array of float to write from"),
		AutoSize("values") _ unsigned_int.IN("valuesSize", "the number of elements to write"),

		returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
	)

	(const _ charUTF8_p)(
		"GetString",
		"""
		Reads a string property.

		Strings are UTF8-encoded and null-terminated.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by #Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		nullable _ const _ charUTF8_p.IN("defaultVal", "specifes the value to return if the property couldn't be read"),

	    returnDoc =
		"""
		the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as $NULL. The return memory is guaranteed to be valid
		until next call to ovr_GetString or until the HMD is destroyed, whichever occurs first.
		"""
	)

	ovrBool(
		"SetString",
		"""
		Writes or creates a string property.

		Strings are UTF8-encoded and null-terminated.
		""",

		ovrHmd.IN("hmddesc", "an {@code ovrHmd} previously returned by #Create()"),
		const _ charASCII_p.IN("propertyName", "the name of the property, which needs to be valid only for the call"),
		const _ charASCII_p.IN("value", "the string property, which only needs to be valid for the duration of the call"),

	    returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
	)
}