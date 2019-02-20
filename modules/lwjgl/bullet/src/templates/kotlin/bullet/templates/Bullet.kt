/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val PhysicsClient = "PhysicsClient".nativeClass(Module.BULLET, prefixConstant = "", prefixMethod = "b3") {
    nativeDirective("""
#define BT_ENABLE_ENET
#define BT_ENABLE_CLSOCKET
#include "PhysicsClientC_API.h"""")
    documentation =
        "Native bindings to the C API of the ${url("http://bulletphysics.org/", "Bullet")} library."

    IntConstant("", "SHARED_MEMORY_KEY".."12347")
    IntConstant("", "SHARED_MEMORY_MAGIC_NUMBER".."2018090300")
    
    EnumConstant(
        "{@code enum EnumSharedMemoryClientCommand}",
        
        "CMD_INVALID".enum("", "0"),
        "CMD_LOAD_SDF".enum,
        "CMD_LOAD_URDF".enum,
        "CMD_LOAD_BULLET".enum,
        "CMD_SAVE_BULLET".enum,
        "CMD_LOAD_MJCF".enum,
        "CMD_LOAD_SOFT_BODY".enum,
        "CMD_SEND_BULLET_DATA_STREAM".enum,
        "CMD_CREATE_BOX_COLLISION_SHAPE".enum,
        "CMD_CREATE_RIGID_BODY".enum,
        "CMD_DELETE_RIGID_BODY".enum,
        "CMD_CREATE_SENSOR".enum("Enable or disable joint feedback for force/torque sensors"),
        "CMD_INIT_POSE".enum,
        "CMD_SEND_PHYSICS_SIMULATION_PARAMETERS".enum,
        "CMD_SEND_DESIRED_STATE".enum,
        "CMD_REQUEST_ACTUAL_STATE".enum,
        "CMD_REQUEST_DEBUG_LINES".enum,
        "CMD_REQUEST_BODY_INFO".enum,
        "CMD_REQUEST_INTERNAL_DATA".enum,
        "CMD_STEP_FORWARD_SIMULATION".enum,
        "CMD_RESET_SIMULATION".enum,
        "CMD_PICK_BODY".enum,
        "CMD_MOVE_PICKED_BODY".enum,
        "CMD_REMOVE_PICKING_CONSTRAINT_BODY".enum,
        "CMD_REQUEST_CAMERA_IMAGE_DATA".enum,
        "CMD_APPLY_EXTERNAL_FORCE".enum,
        "CMD_CALCULATE_INVERSE_DYNAMICS".enum,
        "CMD_CALCULATE_INVERSE_KINEMATICS".enum,
        "CMD_CALCULATE_JACOBIAN".enum,
        "CMD_CALCULATE_MASS_MATRIX".enum,
        "CMD_USER_CONSTRAINT".enum,
        "CMD_REQUEST_CONTACT_POINT_INFORMATION".enum,
        "CMD_REQUEST_RAY_CAST_INTERSECTIONS".enum,
        "CMD_REQUEST_AABB_OVERLAP".enum,
        "CMD_SAVE_WORLD".enum,
        "CMD_REQUEST_VISUAL_SHAPE_INFO".enum,
        "CMD_UPDATE_VISUAL_SHAPE".enum,
        "CMD_LOAD_TEXTURE".enum,
        "CMD_SET_SHADOW".enum,
        "CMD_USER_DEBUG_DRAW".enum,
        "CMD_REQUEST_VR_EVENTS_DATA".enum,
        "CMD_SET_VR_CAMERA_STATE".enum,
        "CMD_SYNC_BODY_INFO".enum,
        "CMD_STATE_LOGGING".enum,
        "CMD_CONFIGURE_OPENGL_VISUALIZER".enum,
        "CMD_REQUEST_KEYBOARD_EVENTS_DATA".enum,
        "CMD_REQUEST_OPENGL_VISUALIZER_CAMERA".enum,
        "CMD_REMOVE_BODY".enum,
        "CMD_CHANGE_DYNAMICS_INFO".enum,
        "CMD_GET_DYNAMICS_INFO".enum,
        "CMD_PROFILE_TIMING".enum,
        "CMD_CREATE_COLLISION_SHAPE".enum,
        "CMD_CREATE_VISUAL_SHAPE".enum,
        "CMD_CREATE_MULTI_BODY".enum,
        "CMD_REQUEST_COLLISION_INFO".enum,
        "CMD_REQUEST_MOUSE_EVENTS_DATA".enum,
        "CMD_CHANGE_TEXTURE".enum,
        "CMD_SET_ADDITIONAL_SEARCH_PATH".enum,
        "CMD_CUSTOM_COMMAND".enum,
        "CMD_REQUEST_PHYSICS_SIMULATION_PARAMETERS".enum,
        "CMD_SAVE_STATE".enum,
        "CMD_RESTORE_STATE".enum,
        "CMD_REQUEST_COLLISION_SHAPE_INFO".enum,
        "CMD_SYNC_USER_DATA".enum,
        "CMD_REQUEST_USER_DATA".enum,
        "CMD_ADD_USER_DATA".enum,
        "CMD_REMOVE_USER_DATA".enum,
        "CMD_COLLISION_FILTER".enum
    )
    
    EnumConstant(
        "{@code enum EnumSharedMemoryServerStatus}",
        
        "CMD_SHARED_MEMORY_NOT_INITIALIZED".enum("", "0"),
        "CMD_WAITING_FOR_CLIENT_COMMAND".enum,
        "CMD_CLIENT_COMMAND_COMPLETED".enum("a generic 'completed' status that doesn't need special handling on the client"),
        "CMD_UNKNOWN_COMMAND_FLUSHED".enum("the server will skip unknown command and report a status {@code CMD_UNKNOWN_COMMAND_FLUSHED}"),
        "CMD_SDF_LOADING_COMPLETED".enum,
        "CMD_SDF_LOADING_FAILED".enum,
        "CMD_URDF_LOADING_COMPLETED".enum,
        "CMD_URDF_LOADING_FAILED".enum,
        "CMD_BULLET_LOADING_COMPLETED".enum,
        "CMD_BULLET_LOADING_FAILED".enum,
        "CMD_BULLET_SAVING_COMPLETED".enum,
        "CMD_BULLET_SAVING_FAILED".enum,
        "CMD_MJCF_LOADING_COMPLETED".enum,
        "CMD_MJCF_LOADING_FAILED".enum,
        "CMD_REQUEST_INTERNAL_DATA_COMPLETED".enum,
        "CMD_REQUEST_INTERNAL_DATA_FAILED".enum,
        "CMD_BULLET_DATA_STREAM_RECEIVED_COMPLETED".enum,
        "CMD_BULLET_DATA_STREAM_RECEIVED_FAILED".enum,
        "CMD_BOX_COLLISION_SHAPE_CREATION_COMPLETED".enum,
        "CMD_RIGID_BODY_CREATION_COMPLETED".enum,
        "CMD_SET_JOINT_FEEDBACK_COMPLETED".enum,
        "CMD_ACTUAL_STATE_UPDATE_COMPLETED".enum,
        "CMD_ACTUAL_STATE_UPDATE_FAILED".enum,
        "CMD_DEBUG_LINES_COMPLETED".enum,
        "CMD_DEBUG_LINES_OVERFLOW_FAILED".enum,
        "CMD_DESIRED_STATE_RECEIVED_COMPLETED".enum,
        "CMD_STEP_FORWARD_SIMULATION_COMPLETED".enum,
        "CMD_RESET_SIMULATION_COMPLETED".enum,
        "CMD_CAMERA_IMAGE_COMPLETED".enum,
        "CMD_CAMERA_IMAGE_FAILED".enum,
        "CMD_BODY_INFO_COMPLETED".enum,
        "CMD_BODY_INFO_FAILED".enum,
        "CMD_INVALID_STATUS".enum,
        "CMD_CALCULATED_INVERSE_DYNAMICS_COMPLETED".enum,
        "CMD_CALCULATED_INVERSE_DYNAMICS_FAILED".enum,
        "CMD_CALCULATED_JACOBIAN_COMPLETED".enum,
        "CMD_CALCULATED_JACOBIAN_FAILED".enum,
        "CMD_CALCULATED_MASS_MATRIX_COMPLETED".enum,
        "CMD_CALCULATED_MASS_MATRIX_FAILED".enum,
        "CMD_CONTACT_POINT_INFORMATION_COMPLETED".enum,
        "CMD_CONTACT_POINT_INFORMATION_FAILED".enum,
        "CMD_REQUEST_AABB_OVERLAP_COMPLETED".enum,
        "CMD_REQUEST_AABB_OVERLAP_FAILED".enum,
        "CMD_CALCULATE_INVERSE_KINEMATICS_COMPLETED".enum,
        "CMD_CALCULATE_INVERSE_KINEMATICS_FAILED".enum,
        "CMD_SAVE_WORLD_COMPLETED".enum,
        "CMD_SAVE_WORLD_FAILED".enum,
        "CMD_VISUAL_SHAPE_INFO_COMPLETED".enum,
        "CMD_VISUAL_SHAPE_INFO_FAILED".enum,
        "CMD_VISUAL_SHAPE_UPDATE_COMPLETED".enum,
        "CMD_VISUAL_SHAPE_UPDATE_FAILED".enum,
        "CMD_LOAD_TEXTURE_COMPLETED".enum,
        "CMD_LOAD_TEXTURE_FAILED".enum,
        "CMD_USER_DEBUG_DRAW_COMPLETED".enum,
        "CMD_USER_DEBUG_DRAW_PARAMETER_COMPLETED".enum,
        "CMD_USER_DEBUG_DRAW_FAILED".enum,
        "CMD_USER_CONSTRAINT_COMPLETED".enum,
        "CMD_USER_CONSTRAINT_INFO_COMPLETED".enum,
        "CMD_USER_CONSTRAINT_REQUEST_STATE_COMPLETED".enum,
        "CMD_REMOVE_USER_CONSTRAINT_COMPLETED".enum,
        "CMD_CHANGE_USER_CONSTRAINT_COMPLETED".enum,
        "CMD_REMOVE_USER_CONSTRAINT_FAILED".enum,
        "CMD_CHANGE_USER_CONSTRAINT_FAILED".enum,
        "CMD_USER_CONSTRAINT_FAILED".enum,
        "CMD_REQUEST_VR_EVENTS_DATA_COMPLETED".enum,
        "CMD_REQUEST_RAY_CAST_INTERSECTIONS_COMPLETED".enum,
        "CMD_SYNC_BODY_INFO_COMPLETED".enum,
        "CMD_SYNC_BODY_INFO_FAILED".enum,
        "CMD_STATE_LOGGING_COMPLETED".enum,
        "CMD_STATE_LOGGING_START_COMPLETED".enum,
        "CMD_STATE_LOGGING_FAILED".enum,
        "CMD_REQUEST_KEYBOARD_EVENTS_DATA_COMPLETED".enum,
        "CMD_REQUEST_KEYBOARD_EVENTS_DATA_FAILED".enum,
        "CMD_REQUEST_OPENGL_VISUALIZER_CAMERA_FAILED".enum,
        "CMD_REQUEST_OPENGL_VISUALIZER_CAMERA_COMPLETED".enum,
        "CMD_REMOVE_BODY_COMPLETED".enum,
        "CMD_REMOVE_BODY_FAILED".enum,
        "CMD_GET_DYNAMICS_INFO_COMPLETED".enum,
        "CMD_GET_DYNAMICS_INFO_FAILED".enum,
        "CMD_CREATE_COLLISION_SHAPE_FAILED".enum,
        "CMD_CREATE_COLLISION_SHAPE_COMPLETED".enum,
        "CMD_CREATE_VISUAL_SHAPE_FAILED".enum,
        "CMD_CREATE_VISUAL_SHAPE_COMPLETED".enum,
        "CMD_CREATE_MULTI_BODY_FAILED".enum,
        "CMD_CREATE_MULTI_BODY_COMPLETED".enum,
        "CMD_REQUEST_COLLISION_INFO_COMPLETED".enum,
        "CMD_REQUEST_COLLISION_INFO_FAILED".enum,
        "CMD_REQUEST_MOUSE_EVENTS_DATA_COMPLETED".enum,
        "CMD_CHANGE_TEXTURE_COMMAND_FAILED".enum,
        "CMD_CUSTOM_COMMAND_COMPLETED".enum,
        "CMD_CUSTOM_COMMAND_FAILED".enum,
        "CMD_REQUEST_PHYSICS_SIMULATION_PARAMETERS_COMPLETED".enum,
        "CMD_SAVE_STATE_FAILED".enum,
        "CMD_SAVE_STATE_COMPLETED".enum,
        "CMD_RESTORE_STATE_FAILED".enum,
        "CMD_RESTORE_STATE_COMPLETED".enum,
        "CMD_COLLISION_SHAPE_INFO_COMPLETED".enum,
        "CMD_COLLISION_SHAPE_INFO_FAILED".enum,
        "CMD_LOAD_SOFT_BODY_FAILED".enum,
        "CMD_LOAD_SOFT_BODY_COMPLETED".enum,
        "CMD_SYNC_USER_DATA_COMPLETED".enum,
        "CMD_SYNC_USER_DATA_FAILED".enum,
        "CMD_REQUEST_USER_DATA_COMPLETED".enum,
        "CMD_REQUEST_USER_DATA_FAILED".enum,
        "CMD_ADD_USER_DATA_COMPLETED".enum,
        "CMD_ADD_USER_DATA_FAILED".enum,
        "CMD_REMOVE_USER_DATA_COMPLETED".enum,
        "CMD_REMOVE_USER_DATA_FAILED".enum
    )

    EnumConstant(
        "{@code enum JointInfoFlags}",

        "JOINT_HAS_MOTORIZED_POWER".enum("", "1")
    )

    EnumConstant(
        "",

        "COLLISION_SHAPE_TYPE_BOX".enum("", "1"),
        "COLLISION_SHAPE_TYPE_CYLINDER_X".enum,
        "COLLISION_SHAPE_TYPE_CYLINDER_Y".enum,
        "COLLISION_SHAPE_TYPE_CYLINDER_Z".enum,
        "COLLISION_SHAPE_TYPE_CAPSULE_X".enum,
        "COLLISION_SHAPE_TYPE_CAPSULE_Y".enum,
        "COLLISION_SHAPE_TYPE_CAPSULE_Z".enum,
        "COLLISION_SHAPE_TYPE_SPHERE".enum
    )

    EnumConstant(
        "{@code enum JointType}",

        "eRevoluteType".enum("", "0"),
        "ePrismaticType".enum,
        "eSphericalType".enum,
        "ePlanarType".enum,
        "eFixedType".enum,
        "ePoint2PointType".enum,
        "eGearType".enum
    )

    EnumConstant(
        "{@code enum b3JointInfoFlags}",

        "eJointChangeMaxForce".enum("", "1"),
        "eJointChangeChildFramePosition".enum("", "2"),
        "eJointChangeChildFrameOrientation".enum("", "4")
    )

    EnumConstant(
        "{@code enum UserDataValueType}",

        "USER_DATA_VALUE_TYPE_BYTES".enum("Data represents generic byte array.", "0"),
        "USER_DATA_VALUE_TYPE_STRING".enum("Data represents C-string", "1")
    )

    EnumConstant(
        "{@code enum DynamicsActivationState}",

        "eActivationStateEnableSleeping".enum("", "1"),
        "eActivationStateDisableSleeping".enum("", "2"),
        "eActivationStateWakeUp".enum("", "4"),
        "eActivationStateSleep".enum("", "8")
    )

    EnumConstant(
        "{@code enum SensorType}",

        "eSensorForceTorqueType".enum("", "1")
    )

    EnumConstant(
        "{@code enum b3VREventType}",

        "VR_CONTROLLER_MOVE_EVENT".enum("", "1"),
        "VR_CONTROLLER_BUTTON_EVENT".enum("", "2"),
        "VR_HMD_MOVE_EVENT".enum("", "4"),
        "VR_GENERIC_TRACKER_MOVE_EVENT".enum("", "8")
    )

    IntConstant(
        "",

        "MAX_VR_ANALOG_AXIS".."5",
        "MAX_VR_BUTTONS".."64",
        "MAX_VR_CONTROLLERS".."8",
        "MAX_KEYBOARD_EVENTS".."256",
        "MAX_MOUSE_EVENTS".."256",
        "MAX_SDF_BODIES".."512"
    )

    EnumConstant(
        "{@code enum b3VRButtonInfo}",

        "eButtonIsDown".enum("", "1"),
        "eButtonTriggered".enum("", "2"),
        "eButtonReleased".enum("", "4")
    )

    EnumConstant(
        "{@code enum eVRDeviceTypeEnums}",

        "VR_DEVICE_CONTROLLER".enum("", "1"),
        "VR_DEVICE_HMD".enum("", "2"),
        "VR_DEVICE_GENERIC_TRACKER".enum("", "4")
    )

    EnumConstant(
        "{@code enum EVRCameraFlags}",

        "VR_CAMERA_TRACK_OBJECT_ORIENTATION".enum("", "1")
    )

    EnumConstant(
        "{@code enum eMouseEventTypeEnums}",

        "MOUSE_MOVE_EVENT".enum("", "1"),
        "MOUSE_BUTTON_EVENT".enum
    )

    EnumConstant(
        "{@code enum b3NotificationType}",

        "SIMULATION_RESET".enum("", "0"),
        "BODY_ADDED".enum,
        "BODY_REMOVED".enum,
        "USER_DATA_ADDED".enum,
        "USER_DATA_REMOVED".enum,
        "LINK_DYNAMICS_CHANGED".enum,
        "VISUAL_SHAPE_CHANGED".enum,
        "TRANSFORM_CHANGED".enum,
        "SIMULATION_STEPPED".enum
    )

    EnumConstant(
        "",

        "CONTACT_QUERY_MODE_REPORT_EXISTING_CONTACT_POINTS".enum("", "0"),
        "CONTACT_QUERY_MODE_COMPUTE_CLOSEST_POINTS".enum
    )

    EnumConstant(
        "{@code enum b3StateLoggingType}",

        "STATE_LOGGING_MINITAUR".enum("", "0"),
        "STATE_LOGGING_GENERIC_ROBOT".enum,
        "STATE_LOGGING_VR_CONTROLLERS".enum,
        "STATE_LOGGING_VIDEO_MP4".enum,
        "STATE_LOGGING_COMMANDS".enum,
        "STATE_LOGGING_CONTACT_POINTS".enum,
        "STATE_LOGGING_PROFILE_TIMINGS".enum,
        "STATE_LOGGING_ALL_COMMANDS".enum,
        "STATE_REPLAY_ALL_COMMANDS".enum,
        "STATE_LOGGING_CUSTOM_TIMER".enum
    )

    IntConstant(
        "",

        "MAX_RAY_INTERSECTION_BATCH_SIZE".."256",
        "MAX_RAY_INTERSECTION_BATCH_SIZE_STREAMING".."Platform.get() == Platform.MACOSX ? (4 * 1024) : (16 * 1024)",
        "MAX_RAY_HITS".."MAX_RAY_INTERSECTION_BATCH_SIZE",
        "VISUAL_SHAPE_MAX_PATH_LEN".."1024"
    )

    EnumConstant(
        "{@code enum b3VisualShapeDataFlags}",

        "eVISUAL_SHAPE_DATA_TEXTURE_UNIQUE_IDS".enum("", "1")
    )

    EnumConstant(
        "{@code enum eLinkStateFlags}",

        "ACTUAL_STATE_COMPUTE_LINKVELOCITY".enum("", "1"),
        "ACTUAL_STATE_COMPUTE_FORWARD_KINEMATICS".enum
    )

    EnumConstant(
        "",

        "CONTROL_MODE_VELOCITY".enum("", "0"),
        "CONTROL_MODE_TORQUE".enum,
        "CONTROL_MODE_POSITION_VELOCITY_PD".enum,
        "CONTROL_MODE_PD".enum("The standard PD control implemented as soft constraint.")
    )

    EnumConstant(
        "Flags for #ApplyExternalTorque() and #ApplyExternalForce(). {@code enum EnumExternalForceFlags}",

        "EF_LINK_FRAME".enum("", "1"),
        "EF_WORLD_FRAME".enum
    )

    EnumConstant(
        "Flags to pick the renderer for synthetic camera. {@code enum EnumRenderer}",

        "ER_TINY_RENDERER".enum("", "(1 << 16)"),
        "ER_BULLET_HARDWARE_OPENGL".enum("", "(1 << 17)")
    )

    EnumConstant(
        "{@code enum EnumRendererAuxFlags}",

        "ER_SEGMENTATION_MASK_OBJECT_AND_LINKINDEX".enum("", "1"),
        "ER_USE_PROJECTIVE_TEXTURE".enum("", "2"),
        "ER_NO_SEGMENTATION_MASK".enum("", "4")
    )

    EnumConstant(
        "Flags to pick the IK solver and other options. {@code enum EnumCalculateInverseKinematicsFlags}",

        "IK_DLS".enum("", "0"),
        "IK_SDLS".enum("", "1"),
        "IK_HAS_TARGET_POSITION".enum("", "16"),
        "IK_HAS_TARGET_ORIENTATION".enum("", "32"),
        "IK_HAS_NULL_SPACE_VELOCITY".enum("", "64"),
        "IK_HAS_JOINT_DAMPING".enum("", "128"),
        "IK_HAS_CURRENT_JOINT_POSITIONS".enum("", "256"),
        "IK_HAS_MAX_ITERATIONS".enum("", "512"),
        "IK_HAS_RESIDUAL_THRESHOLD".enum("", "1024")
    )

    EnumConstant(
        "{@code enum b3ConfigureDebugVisualizerEnum}",

        "COV_ENABLE_GUI".enum("", "1"),
        "COV_ENABLE_SHADOWS".enum,
        "COV_ENABLE_WIREFRAME".enum,
        "COV_ENABLE_VR_TELEPORTING".enum,
        "COV_ENABLE_VR_PICKING".enum,
        "COV_ENABLE_VR_RENDER_CONTROLLERS".enum,
        "COV_ENABLE_RENDERING".enum,
        "COV_ENABLE_SYNC_RENDERING_INTERNAL".enum,
        "COV_ENABLE_KEYBOARD_SHORTCUTS".enum,
        "COV_ENABLE_MOUSE_PICKING".enum,
        "COV_ENABLE_Y_AXIS_UP".enum,
        "COV_ENABLE_TINY_RENDERER".enum,
        "COV_ENABLE_RGB_BUFFER_PREVIEW".enum,
        "COV_ENABLE_DEPTH_BUFFER_PREVIEW".enum,
        "COV_ENABLE_SEGMENTATION_MARK_PREVIEW".enum,
        "COV_ENABLE_PLANAR_REFLECTION".enum,
        "COV_ENABLE_SINGLE_STEP_RENDERING".enum
    )
    
    EnumConstant(
        "{@code enum b3AddUserDebugItemEnum}",

        "DEB_DEBUG_TEXT_ALWAYS_FACE_CAMERA".enum("", "1"),
        "DEB_DEBUG_TEXT_USE_TRUE_TYPE_FONTS".enum("", "2"),
        "DEB_DEBUG_TEXT_HAS_TRACKING_OBJECT".enum("", "4")
    )

    EnumConstant(
        "{@code enum eCONNECT_METHOD}",

        "eCONNECT_GUI".enum("", "1"),
        "eCONNECT_DIRECT".enum,
        "eCONNECT_SHARED_MEMORY".enum,
        "eCONNECT_UDP".enum,
        "eCONNECT_TCP".enum,
        "eCONNECT_EXISTING_EXAMPLE_BROWSER".enum,
        "eCONNECT_GUI_SERVER".enum,
        "eCONNECT_GUI_MAIN_THREAD".enum,
        "eCONNECT_SHARED_MEMORY_SERVER".enum,
        "eCONNECT_DART".enum,
        "eCONNECT_MUJOCO".enum,
        "eCONNECT_GRPC".enum
    )

    EnumConstant(
        "{@code enum eURDF_Flags}",

        "URDF_USE_INERTIA_FROM_FILE".enum("", "2"),
        "URDF_USE_SELF_COLLISION".enum("", "8"),
        "URDF_USE_SELF_COLLISION_EXCLUDE_PARENT".enum("", "16"),
        "URDF_USE_SELF_COLLISION_EXCLUDE_ALL_PARENTS".enum("", "32"),
        "URDF_RESERVED".enum("", "64"),
        "URDF_USE_IMPLICIT_CYLINDER".enum("", "128"),
        "URDF_GLOBAL_VELOCITIES_MB".enum("", "256"),
        "MJCF_COLORS_FROM_FILE".enum("", "512"),
        "URDF_ENABLE_CACHED_GRAPHICS_SHAPES".enum("", "1024"),
        "URDF_ENABLE_SLEEPING".enum("", "2048"),
        "URDF_INITIALIZE_SAT_FEATURES".enum("", "4096"),
        "URDF_USE_SELF_COLLISION_INCLUDE_PARENT".enum("", "8192"),
        "URDF_PARSE_SENSORS".enum("", "16384"),
        "URDF_USE_MATERIAL_COLORS_FROM_MTL".enum("", "32768"),
        "URDF_USE_MATERIAL_TRANSPARANCY_FROM_MTL".enum("", "65536")
    )

    EnumConstant(
        "{@code enum eUrdfGeomTypes}",

        "GEOM_SPHERE".enum("", "2"),
        "GEOM_BOX".enum,
        "GEOM_CYLINDER".enum,
        "GEOM_MESH".enum,
        "GEOM_PLANE".enum,
        "GEOM_CAPSULE".enum,
        "GEOM_UNKNOWN".enum
    )

    EnumConstant(
        "{@code enum eUrdfCollisionFlags}",

        "GEOM_FORCE_CONCAVE_TRIMESH".enum("", "1"),
        "GEOM_CONCAVE_INTERNAL_EDGE".enum
    )

    EnumConstant(
        "{@code enum eUrdfVisualFlags}",

        "GEOM_VISUAL_HAS_RGBA_COLOR".enum("", "1"),
        "GEOM_VISUAL_HAS_SPECULAR_COLOR".enum
    )

    EnumConstant(
        "{@code enum eStateLoggingFlags}",

        "STATE_LOG_JOINT_MOTOR_TORQUES".enum("", "1"),
        "STATE_LOG_JOINT_USER_TORQUES".enum,
        "STATE_LOG_JOINT_TORQUES".enum("", "STATE_LOG_JOINT_MOTOR_TORQUES + STATE_LOG_JOINT_USER_TORQUES")
    )

    EnumConstant(
        "{@code enum eJointFeedbackModes}",

        "JOINT_FEEDBACK_IN_WORLD_SPACE".enum("", "1"),
        "JOINT_FEEDBACK_IN_JOINT_FRAME".enum
    )

    IntConstant(
        "",

        "B3_MAX_PLUGIN_ARG_SIZE".."128",
        "B3_MAX_PLUGIN_ARG_TEXT_LEN".."1024"
    )

    EnumConstant(
        "{@code enum eConstraintSolverTypes}",

        "eConstraintSolverLCP_SI".enum("", "1"),
        "eConstraintSolverLCP_PGS".enum,
        "eConstraintSolverLCP_DANTZIG".enum,
        "eConstraintSolverLCP_LEMKE".enum,
        "eConstraintSolverLCP_NNCG".enum,
        "eConstraintSolverLCP_BLOCK_PGS".enum
    )

    EnumConstant(
        "{@code enum eFileIOActions}",

        "eAddFileIOAction".enum("", "1024"),
        "eRemoveFileIOAction".enum
    )

    EnumConstant(
        "{@code enum eFileIOTypes}",

        "ePosixFileIO".enum("", "1"),
        "eZipFileIO".enum,
        "eCNSFileIO".enum,
	    "eInMemoryFileIO".enum
    )

    b3PhysicsClientHandle(
        "ConnectPhysicsDirect",
        "Directly execute commands without transport (no shared memory, UDP, socket, grpc etc).",
        void()
    )

    b3PhysicsClientHandle(
        "ConnectSharedMemory",
        "",

        int("key", "")
    )

    b3PhysicsClientHandle(
        "ConnectPhysicsTCP",
        "Send physics commands using TCP networking.",

        nullable..charASCII.const.p("hostName", ""),
        int("port", "")
    )

    b3PhysicsClientHandle(
        "ConnectPhysicsUDP",
        "Send physics commands using UDP networking.",

        nullable..charASCII.const.p("hostName", ""),
        int("port", "")
    )

    void(
        "DisconnectSharedMemory",
        "Disconnects the client from the server and cleans up memory.",

        b3PhysicsClientHandle("physClient", "")
    )

    intb(
        "CanSubmitCommand",
        "Checks if a command can be send. There can only be 1 outstanding command.",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryStatusHandle(
        "SubmitClientCommandAndWaitStatus",
        "Blocking submit command and wait for status.",

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryCommandHandle("commandHandle", "")
    )

    int(
        "SubmitClientCommand",
        """
        In general it is better to use #SubmitClientCommandAndWaitStatus().

        {@code b3SubmitClientCommand} is a non-blocking submit command, which requires checking for the status manually, using #ProcessServerStatus(). Also
        before sending the next command, make sure to check if you can send a command using #CanSubmitCommand().
        """,

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryCommandHandle("commandHandle", "")
    )

    b3SharedMemoryStatusHandle(
        "ProcessServerStatus",
        "Νon-blocking check status.",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "GetStatusType",
        "Getσ the physics server return status type.",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateCustomCommand",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    void(
        "CustomCommandLoadPlugin",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        charASCII.const.p("pluginPath", "")
    )

    void(
        "CustomCommandLoadPluginSetPostFix",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        charASCII.const.p("postFix", "")
    )

    int(
        "GetStatusPluginUniqueId",
        "",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

    int(
        "GetStatusPluginCommandResult",
        "",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

    void(
        "CustomCommandUnloadPlugin",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("pluginUniqueId", "")
    )

    void(
        "CustomCommandExecutePluginCommand",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("pluginUniqueId", ""),
        charASCII.const.p("textArguments", "")
    )

    void(
        "CustomCommandExecuteAddIntArgument",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("intVal", "")
    )

    void(
        "CustomCommandExecuteAddFloatArgument",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        float("floatVal", "")
    )

    int(
        "GetStatusBodyIndices",
        "",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        int.p("bodyIndicesOut", ""),
        AutoSize("bodyIndicesOut")..int("bodyIndicesCapacity", "")
    )

    int(
        "GetStatusBodyIndex",
        "",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

	int(
        "GetStatusActualState",
        "",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        Check(1)..nullable..int.p("bodyUniqueId", ""),
        Check(1)..nullable..int.p("numDegreeOfFreedomQ", ""),
        Check(1)..nullable..int.p("numDegreeOfFreedomU", ""),
        Check(1)..nullable..double.const.p.p("rootLocalInertialFrame", ""),
        Check(1)..nullable..double.const.p.p("actualStateQ", ""),
        Check(1)..nullable..double.const.p.p("actualStateQdot", ""),
        Check(1)..nullable..double.const.p.p("jointReactionForces", "")
    )

	int(
        "GetStatusActualState2",
        "",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        Check(1)..nullable..int.p("bodyUniqueId", ""),
        Check(1)..nullable..int.p("numLinks", ""),
        Check(1)..nullable..int.p("numDegreeOfFreedomQ", ""),
        Check(1)..nullable..int.p("numDegreeOfFreedomU", ""),
        Check(1)..nullable..double.const.p.p("rootLocalInertialFrame", ""),
        Check(1)..nullable..double.const.p.p("actualStateQ", ""),
        Check(1)..nullable..double.const.p.p("actualStateQdot", ""),
        Check(1)..nullable..double.const.p.p("jointReactionForces", ""),
        Check(1)..nullable..double.const.p.p("linkLocalInertialFrames", ""),
        Check(1)..nullable..double.const.p.p("jointMotorForces", ""),
        Check(1)..nullable..double.const.p.p("linkStates", ""),
        Check(1)..nullable..double.const.p.p("linkWorldVelocities", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestCollisionInfoCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", "")
    )

    int(
        "GetStatusAABB",
        "",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        int("linkIndex", ""),
        Check(3)..double.p("aabbMin", ""),
        Check(3)..double.p("aabbMax", "")
    )

    b3SharedMemoryCommandHandle(
        "InitSyncBodyInfoCommand",
        "If you re-connected to an existing server, or server changed otherwise, sync the body info and user constraints etc.",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRemoveBodyCommand",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", "")
    )

    int(
        "GetNumBodies",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "GetBodyUniqueId",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("serialIndex", "")
    )

    int(
        "GetBodyInfo",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        b3BodyInfo.p("info", "")
    )

    int(
        "GetNumJoints",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", "")
    )

    int(
        "ComputeDofCount",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", "")
    )

    int(
        "GetJointInfo",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        int("jointIndex", ""),
        b3JointInfo.p("info", "")
    )

    b3SharedMemoryCommandHandle(
        "InitSyncUserDataCommand",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitAddUserDataCommand",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        int("visualShapeIndex", ""),
        charASCII.const.p("key", ""),
        UserDataValueType("valueType", ""),
        AutoSize("valueData")..int("valueLength", ""),
        void.const.p("valueData", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRemoveUserDataCommand",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("userDataId", "")
    )

    int(
        "GetUserData",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("userDataId", ""),
        b3UserDataValue.p("valueOut", "")
    )

    int(
        "GetUserDataId",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        int("visualShapeIndex", ""),
        charASCII.const.p("key", "")
    )

    int(
        "GetUserDataIdFromStatus",
        "",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

    int(
        "GetNumUserData",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", "")
    )

    void(
        "GetUserDataInfo",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        int("userDataIndex", ""),
        Check(1)..charASCII.const.p.p("keyOut", ""),
        Check(1)..int.p("userDataIdOut", ""),
        Check(1)..int.p("linkIndexOut", ""),
        Check(1)..int.p("visualShapeIndexOut", "")
    )

    b3SharedMemoryCommandHandle(
        "GetDynamicsInfoCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", "")
    )

    b3SharedMemoryCommandHandle(
        "GetDynamicsInfoCommandInit2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", "")
    )

    int(
        "GetDynamicsInfo",
        "Given a body unique id and link index, return the dynamics information.",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        b3DynamicsInfo.p("info", "")
    )

    b3SharedMemoryCommandHandle(
        "InitChangeDynamicsInfo",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitChangeDynamicsInfo2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", "")
    )

    int(
        "ChangeDynamicsInfoSetMass",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        double("mass", "")
    )

    int(
        "ChangeDynamicsInfoSetLocalInertiaDiagonal",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        Check(3)..double.const.p("localInertiaDiagonal", "")
    )

    int(
        "ChangeDynamicsInfoSetLateralFriction",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        double("lateralFriction", "")
    )

    int(
        "ChangeDynamicsInfoSetSpinningFriction",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        double("friction", "")
    )

    int(
        "ChangeDynamicsInfoSetRollingFriction",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        double("friction", "")
    )

    int(
        "ChangeDynamicsInfoSetRestitution",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        double("restitution", "")
    )

    int(
        "ChangeDynamicsInfoSetLinearDamping",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        double("linearDamping", "")
    )

    int(
        "ChangeDynamicsInfoSetAngularDamping",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        double("angularDamping", "")
    )

    int(
        "ChangeDynamicsInfoSetContactStiffnessAndDamping",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        double("contactStiffness", ""),
        double("contactDamping", "")
    )

    int(
        "ChangeDynamicsInfoSetFrictionAnchor",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        int("frictionAnchor", "")
    )

    int(
        "ChangeDynamicsInfoSetCcdSweptSphereRadius",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        double("ccdSweptSphereRadius", "")
    )

    int(
        "ChangeDynamicsInfoSetContactProcessingThreshold",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        double("contactProcessingThreshold", "")
    )

    int(
        "ChangeDynamicsInfoSetActivationState",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("activationState", "")
    )

    b3SharedMemoryCommandHandle(
        "InitCreateUserConstraintCommand",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("parentBodyUniqueId", ""),
        int("parentJointIndex", ""),
        int("childBodyUniqueId", ""),
        int("childJointIndex", ""),
        b3JointInfo.p("info", "")
    )

    b3SharedMemoryCommandHandle(
        "InitCreateUserConstraintCommand2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("parentBodyUniqueId", ""),
        int("parentJointIndex", ""),
        int("childBodyUniqueId", ""),
        int("childJointIndex", ""),
        b3JointInfo.p("info", "")
    )

    int(
        "GetStatusUserConstraintUniqueId",
        "",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "InitChangeUserConstraintCommand",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("userConstraintUniqueId", "")
    )

    int(
        "InitChangeUserConstraintSetPivotInB",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("jointChildPivot", "")
    )

    int(
        "InitChangeUserConstraintSetFrameInB",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(4)..double.const.p("jointChildFrameOrn", "")
    )

    int(
        "InitChangeUserConstraintSetMaxForce",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("maxAppliedForce", "")
    )

    int(
        "InitChangeUserConstraintSetGearRatio",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("gearRatio", "")
    )

    int(
        "InitChangeUserConstraintSetGearAuxLink",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("gearAuxLink", "")
    )

    int(
        "InitChangeUserConstraintSetRelativePositionTarget",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("relativePositionTarget", "")
    )

    int(
        "InitChangeUserConstraintSetERP",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("erp", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRemoveUserConstraintCommand",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("userConstraintUniqueId", "")
    )

    int(
        "GetNumUserConstraints",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitGetUserConstraintStateCommand",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int.const("raintUniqueId", "")
    )

    int(
        "GetStatusUserConstraintState",
        "",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        b3UserConstraintState.p("constraintState", "")
    )

    int(
        "GetUserConstraintInfo",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int.const("raintUniqueId", ""),
        b3UserConstraint.p("info", "")
    )

    int(
        "GetUserConstraintId",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("serialIndex", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestDebugLinesCommand",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("debugMode", "")
    )

    void(
        "GetDebugLines",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3DebugLines.p("lines", "")
    )

    b3SharedMemoryCommandHandle(
        "InitConfigureOpenGLVisualizer",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitConfigureOpenGLVisualizer2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", "")
    )

    void(
        "ConfigureOpenGLVisualizerSetVisualizationFlags",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("flag", ""),
        intb("enabled", "")
    )

    void(
        "ConfigureOpenGLVisualizerSetViewMatrix",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        float("cameraDistance", ""),
        float("cameraPitch", ""),
        float("cameraYaw", ""),
        Check(3)..float.const.p("cameraTargetPosition", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestOpenGLVisualizerCameraCommand",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "GetStatusOpenGLVisualizerCamera",
        "",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        b3OpenGLVisualizerCameraInfo.p("camera", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugDrawAddLine3D",
        "",

        b3PhysicsClientHandle("physClient", ""),
        Check(3)..double.const.p("fromXYZ", ""),
        Check(3)..double.const.p("toXYZ", ""),
        Check(3)..double.const.p("colorRGB", ""),
        double("lineWidth", ""),
        double("lifeTime", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugDrawAddText3D",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("txt", ""),
        Check(3)..double.const.p("positionXYZ", ""),
        Check(3)..double.const.p("colorRGB", ""),
        double("textSize", ""),
        double("lifeTime", "")
    )

    void(
        "UserDebugTextSetOptionFlags",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("optionFlags", "")
    )

    void(
        "UserDebugTextSetOrientation",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(4)..double.const.p("orientation", "")
    )

    void(
        "UserDebugItemSetReplaceItemUniqueId",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("replaceItem", "")
    )

    void(
        "UserDebugItemSetParentObject",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("objectUniqueId", ""),
        int("linkIndex", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugAddParameter",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("txt", ""),
        double("rangeMin", ""),
        double("rangeMax", ""),
        double("startValue", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugReadParameter",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("debugItemUniqueId", "")
    )

    int(
        "GetStatusDebugParameterValue",
        "",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        Check(1)..double.p("paramValue", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugDrawRemove",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("debugItemUniqueId", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugDrawRemoveAll",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitDebugDrawingCommand",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    void(
        "SetDebugObjectColor",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("objectUniqueId", ""),
        int("linkIndex", ""),
        Check(3)..double.const.p("objectColorRGB", "")
    )

    void(
        "RemoveDebugObjectColor",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("objectUniqueId", ""),
        int("linkIndex", "")
    )

    int(
        "GetDebugItemUniqueId",
        "",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestCameraImage",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestCameraImage2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", "")
    )

    void(
        "RequestCameraImageSetCameraMatrices",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(16)..float.p("viewMatrix", ""),
        Check(16)..float.p("projectionMatrix", "")
    )

    void(
        "RequestCameraImageSetPixelResolution",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("width", ""),
        int("height", "")
    )

    void(
        "RequestCameraImageSetLightDirection",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..float.const.p("lightDirection", "")
    )

    void(
        "RequestCameraImageSetLightColor",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..float.const.p("lightColor", "")
    )

    void(
        "RequestCameraImageSetLightDistance",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        float("lightDistance", "")
    )

    void(
        "RequestCameraImageSetLightAmbientCoeff",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        float("lightAmbientCoeff", "")
    )

    void(
        "RequestCameraImageSetLightDiffuseCoeff",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        float("lightDiffuseCoeff", "")
    )

    void(
        "RequestCameraImageSetLightSpecularCoeff",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        float("lightSpecularCoeff", "")
    )

    void(
        "RequestCameraImageSetShadow",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("hasShadow", "")
    )

    void(
        "RequestCameraImageSelectRenderer",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("renderer", "")
    )

    void(
        "RequestCameraImageSetFlags",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("flags", "")
    )

    void(
        "GetCameraImageData",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3CameraImageData.p("imageData", "")
    )

    void(
        "RequestCameraImageSetProjectiveTextureMatrices",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(16)..float.p("viewMatrix", ""),
        Check(16)..float.p("projectionMatrix", "")
    )

    void(
        "ComputeViewMatrixFromPositions",
        "",

        Check(3)..float.const.p("cameraPosition", ""),
        Check(3)..float.const.p("cameraTargetPosition", ""),
        Check(3)..float.const.p("cameraUp", ""),
        Check(16)..float.p("viewMatrix", "")
    )

    void(
        "ComputeViewMatrixFromYawPitchRoll",
        "",

        Check(3)..float.const.p("cameraTargetPosition", ""),
        float("distance", ""),
        float("yaw", ""),
        float("pitch", ""),
        float("roll", ""),
        int("upAxis", ""),
        Check(16)..float.p("viewMatrix", "")
    )

    void(
        "ComputePositionFromViewMatrix",
        "",

        Check(16)..float.const.p("viewMatrix", ""),
        Check(3)..float.p("cameraPosition", ""),
        Check(3)..float.p("cameraTargetPosition", ""),
        Check(3)..float.p("cameraUp", "")
    )

    void(
        "ComputeProjectionMatrix",
        "",

        float("left", ""),
        float("right", ""),
        float("bottom", ""),
        float("top", ""),
        float("nearVal", ""),
        float("farVal", ""),
        Check(16)..float.p("projectionMatrix", "")
    )

    void(
        "ComputeProjectionMatrixFOV",
        "",

        float("fov", ""),
        float("aspect", ""),
        float("nearVal", ""),
        float("farVal", ""),
        Check(16)..float.p("projectionMatrix", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestContactPointInformation",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    void(
        "SetContactFilterBodyA",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueIdA", "")
    )

    void(
        "SetContactFilterBodyB",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueIdB", "")
    )

    void(
        "SetContactFilterLinkA",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("linkIndexA", "")
    )

    void(
        "SetContactFilterLinkB",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("linkIndexB", "")
    )

    void(
        "GetContactPointInformation",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3ContactInformation.p("contactPointData", "")
    )

    b3SharedMemoryCommandHandle(
        "InitClosestDistanceQuery",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    void(
        "SetClosestDistanceFilterBodyA",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueIdA", "")
    )

    void(
        "SetClosestDistanceFilterLinkA",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("linkIndexA", "")
    )

    void(
        "SetClosestDistanceFilterBodyB",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueIdB", "")
    )

    void(
        "SetClosestDistanceFilterLinkB",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("linkIndexB", "")
    )

    void(
        "SetClosestDistanceThreshold",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("distance", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapeA",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("collisionShapeA", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapeB",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("collisionShapeB", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapePositionA",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("collisionShapePositionA", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapePositionB",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("collisionShapePositionB", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapeOrientationA",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(4)..double.const.p("collisionShapeOrientationA", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapeOrientationB",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(4)..double.const.p("collisionShapeOrientationB", "")
    )

    void(
        "GetClosestPointInformation",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3ContactInformation.p("contactPointInfo", "")
    )

    b3SharedMemoryCommandHandle(
        "InitAABBOverlapQuery",
        "",

        b3PhysicsClientHandle("physClient", ""),
        Check(3)..double.const.p("aabbMin", ""),
        Check(3)..double.const.p("aabbMax", "")
    )

    void(
        "GetAABBOverlapResults",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3AABBOverlapData.p("data", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestVisualShapeInformation",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueIdA", "")
    )

    void(
        "GetVisualShapeInformation",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3VisualShapeInformation.p("visualShapeInfo", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestCollisionShapeInformation",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", "")
    )

    void(
        "GetCollisionShapeInformation",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3CollisionShapeInformation.p("collisionShapeInfo", "")
    )

    b3SharedMemoryCommandHandle(
        "InitLoadTexture",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("filename", "")
    )

    int(
        "GetStatusTextureUniqueId",
        "",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateChangeTextureCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("textureUniqueId", ""),
        int("width", ""),
        int("height", ""),
        Check("3 * width * height")..char.const.p("rgbPixels", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUpdateVisualShape",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        int("jointIndex", ""),
        int("shapeIndex", ""),
        int("textureUniqueId", "")
    )

    void(
        "UpdateVisualShapeRGBAColor",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(4)..double.const.p("rgbaColor", "")
    )

    void(
        "UpdateVisualShapeSpecularColor",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("specularColor", "")
    )

    b3SharedMemoryCommandHandle(
        "InitPhysicsParamCommand",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitPhysicsParamCommand2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", "")
    )

    int(
        "PhysicsParamSetGravity",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("gravx", ""),
        double("gravy", ""),
        double("gravz", "")
    )

    int(
        "PhysicsParamSetTimeStep",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("timeStep", "")
    )

    int(
        "PhysicsParamSetDefaultContactERP",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("defaultContactERP", "")
    )

    int(
        "PhysicsParamSetDefaultNonContactERP",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("defaultNonContactERP", "")
    )

    int(
        "PhysicsParamSetDefaultFrictionERP",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("frictionERP", "")
    )

    int(
        "PhysicsParamSetDefaultGlobalCFM",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("defaultGlobalCFM", "")
    )

    int(
        "PhysicsParamSetDefaultFrictionCFM",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("frictionCFM", "")
    )

    int(
        "PhysicsParamSetNumSubSteps",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("numSubSteps", "")
    )

    int(
        "PhysicsParamSetRealTimeSimulation",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        intb("enableRealTimeSimulation", "")
    )

    int(
        "PhysicsParamSetNumSolverIterations",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("numSolverIterations", "")
    )

    int(
        "PhysicsParamSetCollisionFilterMode",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("filterMode", "")
    )

    int(
        "PhysicsParamSetUseSplitImpulse",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("useSplitImpulse", "")
    )

    int(
        "PhysicsParamSetSplitImpulsePenetrationThreshold",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("splitImpulsePenetrationThreshold", "")
    )

    int(
        "PhysicsParamSetContactBreakingThreshold",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("contactBreakingThreshold", "")
    )

    int(
        "PhysicsParamSetMaxNumCommandsPer1ms",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("maxNumCmdPer1ms", "")
    )

    int(
        "PhysicsParamSetEnableFileCaching",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        intb("enableFileCaching", "")
    )

    int(
        "PhysicsParamSetRestitutionVelocityThreshold",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("restitutionVelocityThreshold", "")
    )

    int(
        "PhysicsParamSetEnableConeFriction",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        intb("enableConeFriction", "")
    )

    int(
        "PhysicsParameterSetDeterministicOverlappingPairs",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("deterministicOverlappingPairs", "")
    )

    int(
        "PhysicsParameterSetAllowedCcdPenetration",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("allowedCcdPenetration", "")
    )

    int(
        "PhysicsParameterSetJointFeedbackMode",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("jointFeedbackMode", "")
    )

    int(
        "PhysicsParamSetSolverResidualThreshold",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("solverResidualThreshold", "")
    )

    int(
        "PhysicsParamSetContactSlop",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("contactSlop", "")
    )

    int(
        "PhysicsParameterSetEnableSAT",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        intb("enableSAT", "")
    )

    int(
        "PhysicsParameterSetConstraintSolverType",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int.const("raintSolverType", "")
    )

    int(
        "PhysicsParameterSetMinimumSolverIslandSize",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("minimumSolverIslandSize", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestPhysicsParamCommand",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "GetStatusPhysicsSimulationParameters",
        "",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        b3PhysicsSimulationParameters.p("params", "")
    )

    int(
        "PhysicsParamSetInternalSimFlags",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("flags", "")
    )

    b3SharedMemoryCommandHandle(
        "InitStepSimulationCommand",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitStepSimulationCommand2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "InitResetSimulationCommand",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitResetSimulationCommand2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadUrdfCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("urdfFileName", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadUrdfCommandInit2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        charASCII.const.p("urdfFileName", "")
    )

    int(
        "LoadUrdfCommandSetStartPosition",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("startPosX", ""),
        double("startPosY", ""),
        double("startPosZ", "")
    )

    int(
        "LoadUrdfCommandSetStartOrientation",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("startOrnX", ""),
        double("startOrnY", ""),
        double("startOrnZ", ""),
        double("startOrnW", "")
    )

    int(
        "LoadUrdfCommandSetUseMultiBody",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("useMultiBody", "")
    )

    int(
        "LoadUrdfCommandSetUseFixedBase",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("useFixedBase", "")
    )

    int(
        "LoadUrdfCommandSetFlags",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("flags", "")
    )

    int(
        "LoadUrdfCommandSetGlobalScaling",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("globalScaling", "")
    )

    b3SharedMemoryCommandHandle(
        "SaveStateCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "GetStatusGetStateId",
        "",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadStateCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "LoadStateSetStateId",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("stateId", "")
    )

    int(
        "LoadStateSetFileName",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        charASCII.const.p("fileName", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadBulletCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("fileName", "")
    )

    b3SharedMemoryCommandHandle(
        "SaveBulletCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("fileName", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadMJCFCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("fileName", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadMJCFCommandInit2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        charASCII.const.p("fileName", "")
    )

    void(
        "LoadMJCFCommandSetFlags",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("flags", "")
    )

    b3SharedMemoryCommandHandle(
        "CalculateInverseDynamicsCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        Unsafe..double.const.p("jointPositionsQ", ""),
        Unsafe..double.const.p("jointVelocitiesQdot", ""),
        Unsafe..double.const.p("jointAccelerations", "")
    )

    int(
        "GetStatusInverseDynamicsJointForces",
        "",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        Check(1)..nullable..int.p("bodyUniqueId", ""),
        Check(1)..nullable..int.p("dofCount", ""),
        Unsafe..nullable..double.p("jointForces", "")
    )

    b3SharedMemoryCommandHandle(
        "CalculateJacobianCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        int("linkIndex", ""),
        Check(3)..double.const.p("localPosition", ""),
        Unsafe..double.const.p("jointPositionsQ", ""),
        Unsafe..double.const.p("jointVelocitiesQdot", ""),
        Unsafe..double.const.p("jointAccelerations", "")
    )

    int(
        "GetStatusJacobian",
        "",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        Check(1)..nullable..int.p("dofCount", ""),
        Unsafe..double.p("linearJacobian", ""),
        Unsafe..double.p("angularJacobian", "")
    )

    b3SharedMemoryCommandHandle(
        "CalculateMassMatrixCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        Unsafe..double.const.p("jointPositionsQ", "")
    )

    int(
        "GetStatusMassMatrix",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryStatusHandle("statusHandle", ""),
        Check(1)..nullable..int.p("dofCount", ""),
        Unsafe..nullable..double.p("massMatrix", "")
    )

    b3SharedMemoryCommandHandle(
        "CalculateInverseKinematicsCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", "")
    )

    void(
        "CalculateInverseKinematicsAddTargetPurePosition",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("endEffectorLinkIndex", ""),
        Check(3)..double.const.p("targetPosition", "")
    )

    void(
        "CalculateInverseKinematicsAddTargetPositionWithOrientation",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("endEffectorLinkIndex", ""),
        Check(3)..double.const.p("targetPosition", ""),
        Check(4)..double.const.p("targetOrientation", "")
    )

    void(
        "CalculateInverseKinematicsPosWithNullSpaceVel",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        AutoSize("lowerLimit", "upperLimit", "jointRange", "restPose")..int("numDof", ""),
        int("endEffectorLinkIndex", ""),
        Check(3)..double.const.p("targetPosition", ""),
        double.const.p("lowerLimit", ""),
        double.const.p("upperLimit", ""),
        double.const.p("jointRange", ""),
        double.const.p("restPose", "")
    )

    void(
        "CalculateInverseKinematicsPosOrnWithNullSpaceVel",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        AutoSize("lowerLimit", "upperLimit", "jointRange", "restPose")..int("numDof", ""),
        int("endEffectorLinkIndex", ""),
        Check(3)..double.const.p("targetPosition", ""),
        Check(4)..double.const.p("targetOrientation", ""),
        double.const.p("lowerLimit", ""),
        double.const.p("upperLimit", ""),
        double.const.p("jointRange", ""),
        double.const.p("restPose", "")
    )

    void(
        "CalculateInverseKinematicsSetJointDamping",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        AutoSize("jointDampingCoeff")..int("numDof", ""),
        double.const.p("jointDampingCoeff", "")
    )

    void(
        "CalculateInverseKinematicsSelectSolver",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("solver", "")
    )

    int(
        "GetStatusInverseKinematicsJointPositions",
        "",

        b3SharedMemoryStatusHandle("statusHandle", ""),
        Check(1)..nullable..int.p("bodyUniqueId", ""),
        Check(1)..nullable..int.p("dofCount", ""),
        Unsafe..nullable..double.p("jointPositions", "")
    )

    void(
        "CalculateInverseKinematicsSetCurrentPositions",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        AutoSize("currentJointPositions")..int("numDof", ""),
        double.const.p("currentJointPositions", "")
    )

    void(
        "CalculateInverseKinematicsSetMaxNumIterations",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("maxNumIterations", "")
    )

    void(
        "CalculateInverseKinematicsSetResidualThreshold",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("residualThreshold", "")
    )

    b3SharedMemoryCommandHandle(
        "CollisionFilterCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    void(
        "SetCollisionFilterPair",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueIdA", ""),
        int("bodyUniqueIdB", ""),
        int("linkIndexA", ""),
        int("linkIndexB", ""),
        intb("enableCollision", "")
    )

    void(
        "SetCollisionFilterGroupMask",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueIdA", ""),
        int("linkIndexA", ""),
        int("collisionFilterGroup", ""),
        int("collisionFilterMask", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadSdfCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("sdfFileName", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadSdfCommandInit2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        charASCII.const.p("sdfFileName", "")
    )

    int(
        "LoadSdfCommandSetUseMultiBody",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("useMultiBody", "")
    )

    int(
        "LoadSdfCommandSetUseGlobalScaling",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("globalScaling", "")
    )

    b3SharedMemoryCommandHandle(
        "SaveWorldCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("sdfFileName", "")
    )

    b3SharedMemoryCommandHandle(
        "JointControlCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("controlMode", "")
    )

    b3SharedMemoryCommandHandle(
        "JointControlCommandInit2",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", ""),
        int("controlMode", "")
    )

    b3SharedMemoryCommandHandle(
        "JointControlCommandInit2Internal",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("controlMode", "")
    )

    int(
        "JointControlSetDesiredPosition",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("qIndex", ""),
        double("value", "")
    )

    int(
        "JointControlSetKp",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("dofIndex", ""),
        double("value", "")
    )

    int(
        "JointControlSetKd",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("dofIndex", ""),
        double("value", "")
    )

    int(
        "JointControlSetMaximumVelocity",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("dofIndex", ""),
        double("maximumVelocity", "")
    )

    int(
        "JointControlSetDesiredVelocity",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("dofIndex", ""),
        double("value", "")
    )

    int(
        "JointControlSetMaximumForce",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("dofIndex", ""),
        double("value", "")
    )

    int(
        "JointControlSetDesiredForceTorque",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("dofIndex", ""),
        double("value", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateCollisionShapeCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "CreateCollisionShapeAddSphere",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("radius", "")
    )

    int(
        "CreateCollisionShapeAddBox",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("halfExtents", "")
    )

    int(
        "CreateCollisionShapeAddCapsule",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("radius", ""),
        double("height", "")
    )

    int(
        "CreateCollisionShapeAddCylinder",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("radius", ""),
        double("height", "")
    )

    int(
        "CreateCollisionShapeAddPlane",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("planeNormal", ""),
        double("planeConstant", "")
    )

    int(
        "CreateCollisionShapeAddMesh",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        charASCII.const.p("fileName", ""),
        Check(3)..double.const.p("meshScale", "")
    )

    void(
        "CreateCollisionSetFlag",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("shapeIndex", ""),
        int("flags", "")
    )

    void(
        "CreateCollisionShapeSetChildTransform",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("shapeIndex", ""),
        Check(3)..double.const.p("childPosition", ""),
        Check(4)..double.const.p("childOrientation", "")
    )

    int(
        "GetStatusCollisionShapeUniqueId",
        "",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRemoveCollisionShapeCommand",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("collisionShapeId", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateVisualShapeCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "CreateVisualShapeAddSphere",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("radius", "")
    )

    int(
        "CreateVisualShapeAddBox",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("halfExtents", "")
    )

    int(
        "CreateVisualShapeAddCapsule",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("radius", ""),
        double("height", "")
    )

    int(
        "CreateVisualShapeAddCylinder",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("radius", ""),
        double("height", "")
    )

    int(
        "CreateVisualShapeAddPlane",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("planeNormal", ""),
        double("planeConstant", "")
    )

    int(
        "CreateVisualShapeAddMesh",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        charASCII.const.p("fileName", ""),
        Check(3)..double.const.p("meshScale", "")
    )

    void(
        "CreateVisualSetFlag",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("shapeIndex", ""),
        int("flags", "")
    )

    void(
        "CreateVisualShapeSetChildTransform",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("shapeIndex", ""),
        Check(3)..double.const.p("childPosition", ""),
        Check(4)..double.const.p("childOrientation", "")
    )

    void(
        "CreateVisualShapeSetSpecularColor",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("shapeIndex", ""),
        Check(3)..double.const.p("specularColor", "")
    )

    void(
        "CreateVisualShapeSetRGBAColor",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("shapeIndex", ""),
        Check(4)..double.const.p("rgbaColor", "")
    )

    int(
        "GetStatusVisualShapeUniqueId",
        "",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateMultiBodyCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "CreateMultiBodyBase",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("mass", ""),
        int("collisionShapeUnique", ""),
        int("visualShapeUniqueId", ""),
        Check(3)..double.const.p("basePosition", ""),
        Check(4)..double.const.p("baseOrientation", ""),
        Check(3)..double.const.p("baseInertialFramePosition", ""),
        Check(4)..double.const.p("baseInertialFrameOrientation", "")
    )

    int(
        "CreateMultiBodyLink",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("linkMass", ""),
        double("linkCollisionShapeIndex", ""),
        double("linkVisualShapeIndex", ""),
        Check(3)..double.const.p("linkPosition", ""),
        Check(4)..double.const.p("linkOrientation", ""),
        Check(3)..double.const.p("linkInertialFramePosition", ""),
        Check(4)..double.const.p("linkInertialFrameOrientation", ""),
        int("linkParentIndex", ""),
        int("linkJointType", ""),
        Check(3)..double.const.p("linkJointAxis", "")
    )

    void(
        "CreateMultiBodyUseMaximalCoordinates",
        "",

        b3SharedMemoryCommandHandle("commandHandle", "")
    )

    void(
        "CreateMultiBodySetFlags",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("flags", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateBoxShapeCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "CreateBoxCommandSetStartPosition",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("startPosX", ""),
        double("startPosY", ""),
        double("startPosZ", "")
    )

    int(
        "CreateBoxCommandSetStartOrientation",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("startOrnX", ""),
        double("startOrnY", ""),
        double("startOrnZ", ""),
        double("startOrnW", "")
    )

    int(
        "CreateBoxCommandSetHalfExtents",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("halfExtentsX", ""),
        double("halfExtentsY", ""),
        double("halfExtentsZ", "")
    )

    int(
        "CreateBoxCommandSetMass",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("mass", "")
    )

    int(
        "CreateBoxCommandSetCollisionShapeType",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("collisionShapeType", "")
    )

    int(
        "CreateBoxCommandSetColorRGBA",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("red", ""),
        double("green", ""),
        double("blue", ""),
        double("alpha", "")
    )

    b3SharedMemoryCommandHandle(
        "CreatePoseCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", "")
    )

    b3SharedMemoryCommandHandle(
        "CreatePoseCommandInit2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", "")
    )

    int(
        "CreatePoseCommandSetBasePosition",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("startPosX", ""),
        double("startPosY", ""),
        double("startPosZ", "")
    )

    int(
        "CreatePoseCommandSetBaseOrientation",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("startOrnX", ""),
        double("startOrnY", ""),
        double("startOrnZ", ""),
        double("startOrnW", "")
    )

    int(
        "CreatePoseCommandSetBaseLinearVelocity",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("linVel", "")
    )

    int(
        "CreatePoseCommandSetBaseAngularVelocity",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("angVel", "")
    )

    int(
        "CreatePoseCommandSetJointPositions",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        AutoSize("jointPositions")..int("numJointPositions", ""),
        double.const.p("jointPositions", "")
    )

    int(
        "CreatePoseCommandSetJointPosition",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("jointIndex", ""),
        double("jointPosition", "")
    )

    int(
        "CreatePoseCommandSetJointPositionMultiDof",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("jointIndex", ""),
        double.const.p("jointPosition", ""),
        AutoSize("jointPosition")..int("posSize", "")
    )

    int(
        "CreatePoseCommandSetQ",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        AutoSize("q", "hasQ")..int("numJointPositions", ""),
        double.const.p("q", ""),
        int.const.p("hasQ", "")
    )

    int(
        "CreatePoseCommandSetQdots",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        AutoSize("qDots", "hasQdots")..int("numJointVelocities", ""),
        double.const.p("qDots", ""),
        int.const.p("hasQdots", "")
    )

    int(
        "CreatePoseCommandSetJointVelocities",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryCommandHandle("commandHandle", ""),
        AutoSize("jointVelocities")..int("numJointVelocities", ""),
        double.const.p("jointVelocities", "")
    )

    int(
        "CreatePoseCommandSetJointVelocity",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("jointIndex", ""),
        double("jointVelocity", "")
    )

    int(
        "CreatePoseCommandSetJointVelocityMultiDof",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("jointIndex", ""),
        double.const.p("jointVelocity", ""),
        AutoSize("jointVelocity")..int("velSize", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateSensorCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", "")
    )

    int(
        "CreateSensorEnable6DofJointForceTorqueSensor",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("jointIndex", ""),
        intb("enable", "")
    )

    int(
        "CreateSensorEnableIMUForLink",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("linkIndex", ""),
        intb("enable", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestActualStateCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        int("bodyUniqueId", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestActualStateCommandInit2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", "")
    )

    int(
        "RequestActualStateCommandComputeLinkVelocity",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("computeLinkVelocity", "")
    )

    int(
        "RequestActualStateCommandComputeForwardKinematics",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("computeForwardKinematics", "")
    )

    int(
        "GetJointState",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryStatusHandle("statusHandle", ""),
        int("jointIndex", ""),
        b3JointSensorState.p("state", "")
    )

    int(
        "GetJointStateMultiDof",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryStatusHandle("statusHandle", ""),
        int("jointIndex", ""),
        b3JointSensorState2.p("state", "")
    )

    int(
        "GetLinkState",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryStatusHandle("statusHandle", ""),
        int("linkIndex", ""),
        b3LinkState.p("state", "")
    )

    b3SharedMemoryCommandHandle(
        "PickBody",
        "",

        b3PhysicsClientHandle("physClient", ""),
        double("rayFromWorldX", ""),
        double("rayFromWorldY", ""),
        double("rayFromWorldZ", ""),
        double("rayToWorldX", ""),
        double("rayToWorldY", ""),
        double("rayToWorldZ", "")
    )

    b3SharedMemoryCommandHandle(
        "MovePickedBody",
        "",

        b3PhysicsClientHandle("physClient", ""),
        double("rayFromWorldX", ""),
        double("rayFromWorldY", ""),
        double("rayFromWorldZ", ""),
        double("rayToWorldX", ""),
        double("rayToWorldY", ""),
        double("rayToWorldZ", "")
    )

    b3SharedMemoryCommandHandle(
        "RemovePickingConstraint",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateRaycastCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        double("rayFromWorldX", ""),
        double("rayFromWorldY", ""),
        double("rayFromWorldZ", ""),
        double("rayToWorldX", ""),
        double("rayToWorldY", ""),
        double("rayToWorldZ", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateRaycastBatchCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    void(
        "RaycastBatchSetNumThreads",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("numThreads", "")
    )

    void(
        "RaycastBatchAddRay",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("rayFromWorld", ""),
        Check(3)..double.const.p("rayToWorld", "")
    )

    void(
        "RaycastBatchAddRays",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3SharedMemoryCommandHandle("commandHandle", ""),
        double.const.p("rayFromWorld", ""),
        double.const.p("rayToWorld", ""),
        AutoSize(3, "rayFromWorld", "rayToWorld")..int("numRays", "")
    )

    void(
        "RaycastBatchSetParentObject",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("parentObjectUniqueId", ""),
        int("parentLinkIndex", "")
    )

    void(
        "GetRaycastInformation",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3RaycastInformation.p("raycastInfo", "")
    )

    b3SharedMemoryCommandHandle(
        "ApplyExternalForceCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    void(
        "ApplyExternalForce",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkId", ""),
        Check(3)..double.const.p("force", ""),
        Check(3)..double.const.p("position", ""),
        int("flag", "")
    )

    void(
        "ApplyExternalTorque",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyUniqueId", ""),
        int("linkId", ""),
        Check(3)..double.const.p("torque", ""),
        int("flag", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadSoftBodyCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("fileName", "")
    )

    int(
        "LoadSoftBodySetScale",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("scale", "")
    )

    int(
        "LoadSoftBodySetMass",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("mass", "")
    )

    int(
        "LoadSoftBodySetCollisionMargin",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        double("collisionMargin", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestVREventsCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    void(
        "VREventsSetDeviceTypeFilter",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("deviceTypeFilter", "")
    )

    void(
        "GetVREventsData",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3VREventsData.p("vrEventsData", "")
    )

    b3SharedMemoryCommandHandle(
        "SetVRCameraStateCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "SetVRCameraRootPosition",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(3)..double.const.p("rootPos", "")
    )

    int(
        "SetVRCameraRootOrientation",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        Check(4)..double.const.p("rootOrn", "")
    )

    int(
        "SetVRCameraTrackingObject",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("objectUniqueId", "")
    )

    int(
        "SetVRCameraTrackingObjectFlag",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("flag", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestKeyboardEventsCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestKeyboardEventsCommandInit2",
        "",

        b3SharedMemoryCommandHandle("commandHandle", "")
    )

    void(
        "GetKeyboardEventsData",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3KeyboardEventsData.p("keyboardEventsData", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestMouseEventsCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    void(
        "GetMouseEventsData",
        "",

        b3PhysicsClientHandle("physClient", ""),
        b3MouseEventsData.p("mouseEventsData", "")
    )

    b3SharedMemoryCommandHandle(
        "StateLoggingCommandInit",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    int(
        "StateLoggingStart",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("loggingType", ""),
        charASCII.const.p("fileName", "")
    )

    int(
        "StateLoggingAddLoggingObjectUniqueId",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("objectUniqueId", "")
    )

    int(
        "StateLoggingSetMaxLogDof",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("maxLogDof", "")
    )

    int(
        "StateLoggingSetLinkIndexA",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("linkIndexA", "")
    )

    int(
        "StateLoggingSetLinkIndexB",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("linkIndexB", "")
    )

    int(
        "StateLoggingSetBodyAUniqueId",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyAUniqueId", "")
    )

    int(
        "StateLoggingSetBodyBUniqueId",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("bodyBUniqueId", "")
    )

    int(
        "StateLoggingSetDeviceTypeFilter",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("deviceTypeFilter", "")
    )

    int(
        "StateLoggingSetLogFlags",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("logFlags", "")
    )

    int(
        "GetStatusLoggingUniqueId",
        "",

        b3SharedMemoryStatusHandle("statusHandle", "")
    )

    int(
        "StateLoggingStop",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("loggingUid", "")
    )

    b3SharedMemoryCommandHandle(
        "ProfileTimingCommandInit",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("name", "")
    )

    void(
        "SetProfileTimingDuractionInMicroSeconds",
        "",

        b3SharedMemoryCommandHandle("commandHandle", ""),
        int("duration", "")
    )

    void(
        "PushProfileTiming",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("timingName", "")
    )

    void(
        "PopProfileTiming",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    void(
        "SetTimeOut",
        "",

        b3PhysicsClientHandle("physClient", ""),
        double("timeOutInSeconds", "")
    )

    double(
        "GetTimeOut",
        "",

        b3PhysicsClientHandle("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "SetAdditionalSearchPath",
        "",

        b3PhysicsClientHandle("physClient", ""),
        charASCII.const.p("path", "")
    )

    void(
        "MultiplyTransforms",
        "",

        Check(3)..double.const.p("posA", ""),
        Check(4)..double.const.p("ornA", ""),
        Check(3)..double.const.p("posB", ""),
        Check(4)..double.const.p("ornB", ""),
        Check(3)..double.p("outPos", ""),
        Check(4)..double.p("outOrn", "")
    )

    void(
        "InvertTransform",
        "",

        Check(3)..double.const.p("pos", ""),
        Check(4)..double.const.p("orn", ""),
        Check(3)..double.p("outPos", ""),
        Check(4)..double.p("outOrn", "")
    )
}