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

		Basic steps to use the API:
		<h3>Setup</h3>
		${ul(
			"#_Initialize()",
			"ovrHMD hmd = #Hmd_Create(0)",
			"Use hmd members and #Hmd_GetFovTextureSize() to determine graphics configuration.",
			"Call #Hmd_ConfigureTracking() to configure and initialize tracking.",
			"""
			Call #Hmd_ConfigureRendering() to setup graphics for SDK rendering, which is the preferred approach. Please refer to "Client Distortion Rendering"
			below if you prefer to do that instead.
			""",
			"If the ovrHmdCap_ExtendDesktop flag is not set, then use #Hmd_AttachToWindow() to associate the relevant application window with the hmd.",
			"Allocate render target textures as needed."
		)}
		<h3>Game Loop</h3>
		${ul(
			"Call #Hmd_BeginFrame() to get the current frame timing information.",
		    "Render each eye using #Hmd_GetEyePoses() to get each eye pose.",
		    "Call #Hmd_EndFrame() to render the distorted textures to the back buffer and present them on the hmd."
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

	IntConstant(
		"Flags for #_Initialize()",

		// When a debug library is requested, a slower debugging version of the library will
        // be run which can be used to help solve problems in the library and debug game code.
        "Init_Debug" _ 0x00000001,

        // When ServerOptional is set, the ovr_Initialize() call not will block waiting for
        // the server to respond.  If the server is not reachable it may still succeed.
        "Init_ServerOptional" _ 0x00000002,

		// When a version is requested, LibOVR runtime will respect the RequestedMinorVersion
        // field and will verify that the RequestedMinorVersion is supported.
        "Init_RequestVersion" _ 0x00000004,

        // Forces debug features of LibOVR off explicitly, even if it is built in debug mode.
        "Init_ForceNoDebug" _ 0x00000008
	)

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

	val HmdCaps = IntConstant(
		"HMD caps",

		"HmdCap_Present" _ 0x0001, /// (read only) The HMD is plugged in and detected by the system.
		"HmdCap_Available" _ 0x0002, /// (read only) The HMD and its sensor are available for ownership use. i.e. it is not already owned by another application.
		"HmdCap_Captured" _ 0x0004, /// (read only) Set to 'true' if we captured ownership of this HMD.

		// These flags are intended for use with the new driver display mode.
		"HmdCap_ExtendDesktop" _ 0x0008, /// (read only) Means the display driver works via acting as an addition display monitor.
		"HmdCap_DebugDevice" _ 0x0010, /// (read only) Means HMD device is a virtual debug device.

		// Modifiable flags (through ovrHmd_SetEnabledCaps).
		"HmdCap_NoMirrorToWindow" _ 0x2000, /// Disables mirroring of HMD output to the window. This may improve  rendering performance slightly (only if 'ExtendDesktop' is off).
		"HmdCap_DisplayOff" _ 0x0040, /// Turns off HMD screen and output (only if 'ExtendDesktop' is off).

		"HmdCap_LowPersistence" _ 0x0080, /// HMD supports low persistence mode.
		"HmdCap_DynamicPrediction" _ 0x0200, /// Adjust prediction dynamically based on internally measured latency.
		"HmdCap_NoVSync" _ 0x1000, /// Support rendering without VSync for debugging.

		// These bits can be modified by ovrHmd_SetEnabledCaps.
		"HmdCap_Writable_Mask".expr<Int>(
			"ovrHmdCap_NoMirrorToWindow | ovrHmdCap_DisplayOff | ovrHmdCap_LowPersistence | ovrHmdCap_DynamicPrediction | ovrHmdCap_NoVSync"
		),

		/// These flags are currently passed into the service. May change without notice.
		"HmdCap_Service_Mask".expr<Int>(
			"ovrHmdCap_NoMirrorToWindow | ovrHmdCap_DisplayOff | ovrHmdCap_LowPersistence | ovrHmdCap_DynamicPrediction"
		)
	).javaDocLinks

	val TrackingCaps = IntConstant(
		"Tracking capability bits reported by the device. Used with #Hmd_ConfigureTracking().",

		"TrackingCap_Orientation" _ 0x0010,   /// Supports orientation tracking (IMU).
        "TrackingCap_MagYawCorrection" _ 0x0020,   /// Supports yaw drift correction via a magnetometer or other means.
        "TrackingCap_Position" _ 0x0040,   /// Supports positional tracking.
        /// Overrides the other flags. Indicates that the application
        /// doesn't care about tracking settings. This is the internal
        /// default before ovrHmd_ConfigureTracking is called.
        "TrackingCap_Idle" _ 0x0100
	).javaDocLinks

	val DistortionCaps = IntConstant(
		"Distortion capability bits reported by device. Used with #Hmd_ConfigureRendering() and #Hmd_CreateDistortionMesh().",

		"DistortionCap_Chromatic" _ 0x01, /// Supports chromatic aberration correction.
		"DistortionCap_TimeWarp" _ 0x02, /// Supports timewarp.
		// 0x04 unused
		"DistortionCap_Vignette" _ 0x08, /// Supports vignetting around the edges of the view.
		"DistortionCap_NoRestore" _ 0x10, /// Do not save and restore the graphics and compute state when rendering distortion.
		"DistortionCap_FlipInput" _ 0x20, /// Flip the vertical texture coordinate of input images.
		"DistortionCap_SRGB" _ 0x40, /// Assume input images are in sRGB gamma-corrected color space.
		"DistortionCap_Overdrive" _ 0x80, /// Overdrive brightness transitions to reduce artifacts on DK2+ displays
		"DistortionCap_HqDistortion" _ 0x100, /// High-quality sampling of distortion buffer for anti-aliasing
		"DistortionCap_LinuxDevFullscreen" _ 0x200, /// Indicates window is fullscreen on a device when set. The SDK will automatically apply distortion mesh rotation if needed.
		"DistortionCap_ComputeShader" _ 0x400, /// Using compute shader (DX11+ only)
	    "DistortionCap_TimewarpJitDelay" _ 0x1000, /// Enables a spin-wait that tries to push time-warp to be as close to V-sync as possible. WARNING - this may backfire and cause framerate loss - use with caution.

		"DistortionCap_ProfileNoTimewarpSpinWaits" _ 0x10000 /// Use when profiling with timewarp to remove false positives
	).javaDocLinks

	val EyeType = IntConstant(
		"Eye types",

		"Eye_left" _ 0,
		"Eye_Right" _ 1,
		"Eye_Count" _ 2
	).javaDocLinks

	IntConstant(
		"Bit flags describing the current status of sensor tracking.",

		"Status_OrientationTracked" _ 0x0001, /// Orientation is currently tracked (connected and in use).
		"Status_PositionTracked" _ 0x0002, /// Position is currently tracked (false if out of range).
		"Status_CameraPoseTracked" _ 0x0004, /// Camera pose is currently tracked.
		"Status_PositionConnected" _ 0x0020, /// Position tracking hardware is connected.
		"Status_HmdConnected" _ 0x0080    /// HMD Display is available and connected.
	)

	IntConstant(
		"Render API",

	    "RenderAPI_None" _ 0,
		"RenderAPI_OpenGL" _ 1,
		"RenderAPI_Android_GLES" _ 2,
		"RenderAPI_D3D9" _ 3,
		"RenderAPI_D3D10" _ 4,
		"RenderAPI_D3D11" _ 5,
		"RenderAPI_Count" _ 6
	)

	ovrBool(
		"_InitializeRenderingShimVersion",
		"Same as #_InitializeRenderingShim() except it requests to support at least the given minor LibOVR library version.",

	    int.IN("requestedMinorVersion", "the requested minor LibOVR library version")
	)

	ovrBool(
		"_InitializeRenderingShim",
		"""
		Initializes the rendering shim apart from everything else in LibOVR. This may be helpful if the application prefers to avoid creating any OVR resources
		(allocations, service connections, etc) at this point. ovr_InitializeRenderingShim does not bring up anything within LibOVR except the necessary hooks
		to enable the Direct-to-Rift functionality.

		Either #_InitializeRenderingShim() or #_Initialize() must be called before any Direct3D or OpenGL initialization is done by application (creation of
		devices, etc). #_Initialize() must still be called after to use the rest of LibOVR APIs.
	    """
	)

	ovrBool(
		"_Initialize",
		"""
		Initializes all Oculus functionality. Pass $NULL to initialize with default parameters, suitable for released games.

	    Library init/shutdown, must be called around all other OVR code. No other functions calls besides #_InitializeRenderingShim() are allowed before
	    ovr_Initialize succeeds or after #_Shutdown().

	    A second call to ovr_Initialize after successful second call returns #True.

		LibOVRRT shared library search order:
		${ol(
			"Current working directory (often the same as the application directory).",
		    "Module directory (usually the same as the application directory, but not if the module is a separate shared library).",
		    "Application directory",
		    "Development directory (only if OVR_ENABLE_DEVELOPER_SEARCH is enabled, which is off by default).",
		    "Standard OS shared library search location(s) (OS-specific)."
		)}
	    """,

		nullable _ ovrInitParams_const_p.IN("params", "an ##OVRInitParams structure")
	)

	void(
		"_Shutdown",
		"Shuts down all Oculus functionality."
	)

	(const _ charASCII_p)(
		"_GetVersionString",
		"Returns version string representing libOVR version. Static, so string remains valid for app lifespan."
	)

	int(
		"Hmd_Detect",
		"Detects or re-detects HMDs and reports the total number detected. Users can get information about each HMD by calling #Hmd_Create() with an index.",
	    returnDoc = "the number of HMDs detected or -1 when the service is unreachable"
	)

	ovrHmd(
		"Hmd_Create",
		"""
	    Creates a handle to an HMD which doubles as a description structure. Index can be ${code("[0 .. #Hmd_Detect()-1]")}. Index mappings can cange after each
	    #Hmd_Detect() call. If not null, then the returned handle must be freed with #Hmd_Destroy().
	    """,

		int.IN("index", "the HMD index")
	)

	void(
		"Hmd_Destroy",
		"Destroys an HMD handle.",

		ovrHmd.IN("hmd", "the HMD handle to destroy")
	)

	ovrHmd(
		"Hmd_CreateDebug",
		"Creates a 'fake' HMD used for debugging only. This is not tied to specific hardware, but may be used to debug some of the related rendering.",

		ovrHmdType.IN("type", "the HMD type", HMDType)
	)

	(const _ charASCII_p)(
		"Hmd_GetLastError",
		"""
	    Returns last error for HMD state. Returns null for no error. String is valid until next call of GetLastError or HMD is destroyed. Pass null {@code hmd}
	    to get global errors (during create etc).
	    """,

		nullable _ ovrHmd.IN("hmd", "the HMD handle")
	)

	ovrBool(
		"Hmd_AttachToWindow",
		"""
	    Platform specific function to specify the application window whose output will be displayed on the HMD. Only used if the #HmdCap_ExtendDesktop flag is
	    false.

	    Notes:
	    ${ul(
			"""
		    <b>Windows</b>: SwapChain associated with this window will be displayed on the HMD. Specify {@code destMirrorRect} in window coordinates to
		    indicate an area of the render target output that will be mirrored from {@code sourceRenderTargetRect}. Null pointers mean "full size".
		    """,
			"Source and dest mirror rects are not yet implemented."
		)}
	    """,

		ovrHmd.IN("hmd", ""),
		voidptr.IN("window", ""),
		mods(nullable, const) _ ovrRecti_p.IN("destMirrorRect", ""),
		mods(nullable, const) _ ovrRecti_p.IN("sourceRenderTargetRect", "")
	)

	unsigned_int(
		"Hmd_GetEnabledCaps",
		"""
	    Returns capability bits that are enabled at this time as described by ovrHmdCaps. Note that this value is different from ovrHmdDesc::HmdCaps, which
	    describes what capabilities are available for that HMD.
	    """,

		ovrHmd.IN("hmd", "")
	)

	void(
		"Hmd_SetEnabledCaps",
		"Modifies capability bits described by ovrHmdCaps that can be modified, such as #HmdCap_LowPersistence.",

		ovrHmd.IN("hmd", ""),
		unsigned_int.IN("hmdCaps", "", HmdCaps)
	)

	ovrBool(
		"Hmd_ConfigureTracking",
		"""
		Starts sensor sampling, enabling specified capabilities, described by ovrTrackingCaps. Pass 0 for both {@code supportedTrackingCaps} and
		{@code requiredTrackingCaps} to disable tracking.
		""",

		ovrHmd.IN("hmd", ""),
		unsigned_int.IN(
			"supportedTrackingCaps",
			"""
			specifies support that is requested. The function will succeed even if these caps are not available (i.e. sensor or camera is unplugged). Support
			will automatically be enabled if such device is plugged in later. Software should check ovrTrackingState.StatusFlags for real-time status.
			""",
			TrackingCaps
		),
		unsigned_int.IN(
			"requiredTrackingCaps",
			"""
			specify sensor capabilities required at the time of the call. If they are not available, the function will fail. Pass 0 if only specifying
			{@code supportedTrackingCaps}.
			""",
			TrackingCaps
		)
	)

	void(
		"Hmd_RecenterPose",
	    "Re-centers the sensor orientation. Normally this will recenter the (x,y,z) translational components and the yaw component of orientation.",

	    ovrHmd.IN("hmd", "")
	)

	ovrTrackingState(
		"Hmd_GetTrackingState",
	    """
		Returns tracking state reading based on the specified absolute system time. Pass an absTime value of 0.0 to request the most recent sensor reading. In
		this case both PredictedPose and SamplePose will have the same value. ovrHmd_GetEyePoses relies on a valid ovrTrackingState. This may also be used for
		more refined timing of FrontBuffer rendering logic, etc.
	    """,

	    ovrHmd.IN("hmd", ""),
	    double.IN("absTime", "")
	)

	ovrSizei(
		"Hmd_GetFovTextureSize",
		"""
		Calculates the recommended viewport size for rendering a given eye within the HMD with a given FOV cone. Higher FOV will generally require larger
		textures to maintain quality.

		Apps packing multiple eye views together on the same textue should ensure there is roughly 8 pixels of padding between them to prevent texture
		filtering and chromatic aberration causing images to "leak" between the two eye views.
		""",

		ovrHmd.IN("hmd", ""),
		ovrEyeType.IN("eye", "", EyeType),
		ovrFovPort.IN("fov", ""),
		float.IN(
			"pixelsPerDisplayPixel",
			"""
			specifies the ratio of the number of render target pixels to display pixels at the center of distortion. 1.0 is the default value. Lower values can
			improve performance, higher values give improved quality.
			"""
		)
	)

	ovrBool(
		"Hmd_ConfigureRendering",
	    """
	    Configures rendering and fills in computed render parameters. This function can be called multiple times to change rendering settings.
	    {@code eyeRenderDescOut} is a pointer to an array of two ##OVREyeRenderDesc structs that are used to return complete rendering information for each eye.
	    """,

	    ovrHmd.IN("hmd", ""),
	    const _ ovrRenderAPIConfig_p.IN("apiConfig", ""),
	    unsigned_int.IN("distortionCaps", "", DistortionCaps),
	    mods(Check(2), const) _ ovrFovPort_p.IN("eyeFovIn", ""),
		Check(2) _ ovrEyeRenderDesc_p.OUT("eyeRenderDescOut", "")
	)

	ovrFrameTiming(
		"Hmd_BeginFrame",
	    """
	    Begins a frame, returning timing information. This should be called at the beginning of the game rendering loop (on the render thread). Pass 0 for the
	    frame index if not using #Hmd_GetFrameTiming().
	    """,

	    ovrHmd.IN("hmd", ""),
	    unsigned_int.IN("frameIndex", "")
	)

	void(
		"Hmd_EndFrame",
	    """
	    Ends a frame, submitting the rendered textures to the frame buffer.
	    ${ul(
		    "RenderViewport within each eyeTexture can change per frame if necessary.",
	        "This may perform distortion and scaling internally, assuming is it not delegated to another thread.",
	        "Must be called on the same thread as BeginFrame.",
	        "If ovrDistortionCap_DepthProjectedTimeWarp is enabled, then app must provide eyeDepthTexture and posTimewarpDesc. Otherwise both can be $NULL.",
		    "*** This Function will call Present/SwapBuffers and potentially wait for GPU Sync ***"
		)}
	    """,

	    ovrHmd.IN("hmd", ""),
	    mods(Check(2), const) _ ovrPosef_p.IN(
		    "renderPose",
		    "will typically be the value returned from #Hmd_GetEyePoses() but can be different if a different head pose was used for rendering."
	    ),
		mods(Check(2), const) _ ovrTexture_p.IN("eyeTexture", "")
	)

	void(
		"Hmd_GetEyePoses",
	    """
	    Returns predicted head pose in {@code outHmdTrackingState} and offset eye poses in {@code outEyePoses} as an atomic operation. Caller need not worry
	    about applying HmdToEyeViewOffset to the returned {@code outEyePoses} variables.
	    ${ul(
		    """
		    Thread-safe function where caller should increment frameIndex with every frame and pass the index where applicable to functions called on the
		    rendering thread.
		    """,
	        """
	        hmdToEyeViewOffset[2] can be ovrEyeRenderDesc.HmdToEyeViewOffset returned from #Hmd_ConfigureRendering() or #Hmd_GetRenderDesc(). For monoscopic
	        rendering, use a vector that is the average of the two vectors for both eyes.
	        """,
	        "If frameIndex is not being utilized, pass in 0.",
	        "Assuming outEyePoses are used for rendering, it should be passed into #Hmd_EndFrame().",
	        "If caller doesn't need {@code outHmdTrackingState}, it can be passed in as $NULL"
	    )}
	    """,

	    ovrHmd.IN("hmd", ""),
	    unsigned_int.IN("frameIndex", ""),
	    Check(2) _ ovrVector3f_p.IN("hmdToEyeViewOffset", ""),
		Check(2) _ ovrPosef_p.OUT("outEyePoses", ""),
	    ovrTrackingState_p.OUT("outHmdTrackingState", "")
	)

	ovrPosef(
		"Hmd_GetHmdPosePerEye",
	    """
		Returns the predicted head pose to use when rendering the specified eye.
		${ul(
		    "Important: Caller must apply HmdToEyeViewOffset before using ovrPosef for rendering",
	        "Must be called between #Hmd_BeginFrameTiming() and #Hmd_EndFrameTiming().",
	        "If returned pose is used for rendering the eye, it should be passed to #Hmd_EndFrame().",
	        "Parameter 'eye' is used internally for prediction timing only"
	    )}
	    """,

	    ovrHmd.IN("hmd", ""),
	    ovrEyeType.IN("eye", "")
	)

	ovrEyeRenderDesc(
		"Hmd_GetRenderDesc",
		"""
		Computes the distortion viewport, view adjust, and other rendering parameters for the specified eye. This can be used instead of
		#Hmd_ConfigureRendering() to do setup for client rendered distortion.
		""",

		ovrHmd.IN("hmd", ""),
		ovrEyeType.IN("eyeType", ""),
		ovrFovPort.IN("fov", "")
	)

	ovrBool(
		"Hmd_CreateDistortionMesh",
		"""
		Generate distortion mesh per eye. Distortion capabilities will depend on 'distortionCaps' flags. Users should render using the appropriate shaders
		based on their settings. Distortion mesh data will be allocated and written into the ovrDistortionMesh data structure, which should be explicitly freed
		with #Hmd_DestroyDistortionMesh(). Users should call #Hmd_GetRenderScaleAndOffset() to get uvScale and Offset values for rendering. The function
		shouldn't fail unless theres is a configuration or memory error, in which case ovrDistortionMesh values will be set to null. This is the only function
		in the SDK reliant on eye relief, currently imported from profiles, or overridden here.
		""",

		ovrHmd.IN("hmd", ""),
		ovrEyeType.IN("eyeType", ""),
		ovrFovPort.IN("fov", ""),
		unsigned_int.IN("distortionCaps", "", DistortionCaps),
		ovrDistortionMesh_p.OUT("meshData", "")
	)

	ovrBool(
		"Hmd_CreateDistortionMeshDebug",
		"Debug version of #Hmd_CreateDistortionMesh().",

		ovrHmd.IN("hmddesc", ""),
		ovrEyeType.IN("eyeType", ""),
		ovrFovPort.IN("fov", ""),
		unsigned_int.IN("distortionCaps", "", DistortionCaps),
		ovrDistortionMesh_p.OUT("meshData", ""),
		float.IN("debugEyeReliefOverrideInMetres", "")
	)

	void(
		"Hmd_DestroyDistortionMesh",
		"Used to free the distortion mesh allocated by #Hmd_CreateDistortionMesh(). {@code meshData} elements are set to null and zeroes after the call.",

		ovrDistortionMesh_p.OUT("meshData", "")
	)

	void(
		"Hmd_GetRenderScaleAndOffset",
		"""
		Computes updated 'uvScaleOffsetOut' to be used with a distortion if render target size or viewport changes after the fact. This can be used to adjust
		render size every frame if desired.
		""",

		ovrFovPort.IN("fov", ""),
		ovrSizei.IN("textureSize", ""),
		ovrRecti.IN("renderViewport", ""),
		Check(2) _ ovrVector2f_p.OUT("uvScaleOffsetOut", "")
	)

	ovrFrameTiming(
		"Hmd_GetFrameTiming",
		"""
		Thread-safe timing function for the main thread. Caller should increment frameIndex with every frame and pass the index where applicable to functions
		called on the rendering thread.
		""",

		ovrHmd.IN("hmd", ""),
		unsigned_int.IN("frameIndex", "")
	)

	ovrFrameTiming(
		"Hmd_BeginFrameTiming",
		"""
		Called at the beginning of the frame on the rendering thread. Pass frameIndex == 0 if #Hmd_GetFrameTiming() isn't being used. Otherwise, pass the same
		frame index as was used for GetFrameTiming on the main thread.
		""",

		ovrHmd.IN("hmd", ""),
		unsigned_int.IN("frameIndex", "")
	)

	void(
		"Hmd_EndFrameTiming",
		"""
		Marks the end of client distortion rendered frame, tracking the necessary timing information. This function must be called immediately after
		Present/SwapBuffers + GPU sync. GPU sync is important before this call to reduce latency and ensure proper timing.
		""",

		ovrHmd.IN("hmd", "")
	)

	void(
		"Hmd_ResetFrameTiming",
		"""
		Initializes and resets frame time tracking. This is typically not necessary, but is helpful if game changes vsync state or video mode. vsync is assumed
		to be on if this isn't called. Resets internal frame index to the specified number.
		""",

		ovrHmd.IN("hmd", ""),
		unsigned_int.IN("frameIndex", "")
	)

	void(
		"Hmd_GetEyeTimewarpMatrices",
		"""
		Computes timewarp matrices used by distortion mesh shader, these are used to adjust for head orientation change since the last call to
		#Hmd_GetEyePoses() when rendering this eye. The ovrDistortionVertex::TimeWarpFactor is used to blend between the matrices, usually representing two
		different sides of the screen.

		Set 'calcPosition' to true when using depth based positional timewarp.

		Must be called on the same thread as #Hmd_BeginFrameTiming().
		""",

		ovrHmd.IN("hmd", ""),
		ovrEyeType.IN("eye", ""),
		ovrPosef.IN("renderPose", ""),
		Check(2) _ ovrMatrix4f_p.OUT("twmOut", "")
	)

	void(
		"Hmd_GetEyeTimewarpMatricesDebug",
		"Debug version of #Hmd_GetEyeTimewarpMatrices().",

		ovrHmd.IN("hmd", ""),
		ovrEyeType.IN("eye", ""),
		ovrPosef.IN("renderPose", ""),
		ovrQuatf.IN("playerTorsoMotion", ""),
		Check(2) _ ovrMatrix4f_p.OUT("twmOut", ""),
		double.IN("debugTimingOffsetInSeconds", "")
	)

	double(
		"_GetTimeInSeconds",
		"Returns global, absolute high-resolution time in seconds. This is the same value as used in sensor messages."
	)

	ovrBool(
		"Hmd_ProcessLatencyTest",
		"Does latency test processing and returns 'TRUE' if specified rgb color should be used to clear the screen.",

		ovrHmd.IN("hmd", ""),
		Check(3) _ unsigned_char_p.OUT("rgbColorOut", "")
	)

	(const _ charASCII_p)(
		"Hmd_GetLatencyTestResult",
		"Returns non-null string once with latency test result, when it is available. Buffer is valid until next call.",

		ovrHmd.IN("hmd", "")
	)

	ovrBool(
		"Hmd_GetLatencyTest2DrawColor",
		"""
		Returns the latency testing color in rgbColorOut to render when using a DK2. Returns false if this feature is disabled or not-applicable (e.g. using a
		DK1).
		""",

		ovrHmd.IN("hmddesc", ""),
		Check(3) _ unsigned_char_p.OUT("rgbColorOut", "")
	)

	void(
		"Hmd_GetHSWDisplayState",
		"""
		Returns the current state of the HSW display. If the application is doing the rendering of the HSW display then this function serves to indicate that
		the warning should be currently displayed. If the application is using SDK-based eye rendering then the SDK by default automatically handles the
		drawing of the HSW display. An application that uses application-based eye rendering should use this function to know when to start drawing the HSW
		display itself and can optionally use it in conjunction with ovrhmd_DismissHSWDisplay as described below.

		Example usage for application-based rendering:
		${codeBlock("""
bool HSWDisplayCurrentlyDisplayed = false; // global or class member variable
ovrHSWDisplayState hswDisplayState;
ovrhmd_GetHSWDisplayState(Hmd, &hswDisplayState);

if (hswDisplayState.Displayed && !HSWDisplayCurrentlyDisplayed) {
	<insert model into the scene that stays in front of the user>
	HSWDisplayCurrentlyDisplayed = true;
}""")}
		""",

		ovrHmd.IN("hmd", ""),
		ovrHSWDisplayState_p.OUT("hasWarningState", "")
	)


	ovrBool(
		"Hmd_DismissHSWDisplay",
		"""
		Requests a dismissal of the HSWDisplay at the earliest possible time, which may be seconds into the future due to display longevity requirements.

		Example usage:
		${codeBlock("""
void ProcessEvent(int key) {
	if ( key == escape )
		ovrhmd_DismissHSWDisplay(hmd);
}""")}
		""",

		ovrHmd.IN("hmd", ""),

	    returnDoc = "true if the display is valid, in which case the request can always be honored"
	)

	ovrBool(
		"Hmd_GetBool",
		"Get boolean property. Returns first element if property is a boolean array. Returns defaultValue if property doesn't exist.",

		ovrHmd.IN("hmd", ""),
		const _ charASCII_p.IN("propertyName", ""),
		ovrBool.IN("defaultVal", "")
	)

	ovrBool(
		"Hmd_SetBool",
		"Modify bool property; false if property doesn't exist or is readonly.",

		ovrHmd.IN("hmd", ""),
		const _ charASCII_p.IN("propertyName", ""),
		ovrBool.IN("value", "")
	)

	int(
		"Hmd_GetInt",
		"Get integer property. Returns first element if property is an integer array. Returns defaultValue if property doesn't exist.",

		ovrHmd.IN("hmd", ""),
		const _ charASCII_p.IN("propertyName", ""),
		int.IN("defaultVal", "")
	)

	ovrBool(
		"Hmd_SetInt",
		"Modify integer property; false if property doesn't exist or is readonly.",

		ovrHmd.IN("hmd", ""),
		const _ charASCII_p.IN("propertyName", ""),
		int.IN("value", "")
	)

	float(
		"Hmd_GetFloat",
		"Get float property. Returns first element if property is a float array. Returns defaultValue if property doesn't exist.",

		ovrHmd.IN("hmd", ""),
		const _ charASCII_p.IN("propertyName", ""),
		float.IN("defaultVal", "")
	)

	ovrBool(
		"Hmd_SetFloat",
		"Modify float property; false if property doesn't exist or is readonly.",

		ovrHmd.IN("hmd", ""),
		const _ charASCII_p.IN("propertyName", ""),
		float.IN("value", "")
	)

	unsigned_int(
		"Hmd_GetFloatArray",
		"Get float[] property. Returns the number of elements filled in, 0 if property doesn't exist. Maximum of arraySize elements will be written.",

		ovrHmd.IN("hmd", ""),
		const _ charASCII_p.IN("propertyName", ""),
		float_p.OUT("values", ""),
		AutoSize("values") _ unsigned_int.IN("arraySize", "")
	)

	ovrBool(
		"Hmd_SetFloatArray",
		"Modify float[] property; false if property doesn't exist or is readonly.",

		ovrHmd.IN("hmd", ""),
		const _ charASCII_p.IN("propertyName", ""),
		float_p.OUT("values", ""),
		AutoSize("values") _ unsigned_int.IN("arraySize", "")
	)

	(const _ charASCII_p)(
		"Hmd_GetString",
		"""
		Get string property. Returns first element if property is a string array. Returns defaultValue if property doesn't exist. String memory is guaranteed
		to exist until next call to GetString or GetStringArray, or HMD is destroyed.
		""",

		ovrHmd.IN("hmd", ""),
		const _ charASCII_p.IN("propertyName", ""),
		const _ charASCII_p.IN("defaultVal", "")
	)

	ovrBool(
		"Hmd_SetString",
		"Set string property",

		ovrHmd.IN("hmddesc", ""),
		const _ charASCII_p.IN("propertyName", ""),
		const _ charASCII_p.IN("value", "")
	)

	int(
		"_TraceMessage",
	    "Sends a message string to the system tracing mechanism if enabled (currently Event Tracing for Windows)",

	    int.IN("level", "the log level", LogLevels),
	    const _ charASCII_p.IN("message", "the message"),

	    returnDoc = "the length of the message, or -1 if message is too large"
	)
}