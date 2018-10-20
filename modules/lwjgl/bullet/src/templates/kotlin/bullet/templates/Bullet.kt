/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val PhysicsClient = "PhysicsClient".nativeClass(Module.BULLET, prefixConstant = "", prefixMethod = "b3", library = BULLET_LIBRARY) {
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
        "eCNSFileIO".enum
    )

    b3PhysicsClientHandle(
        "ConnectPhysicsDirect",
        "Directly execute commands without transport (no shared memory, UDP, socket, grpc etc)."
    )

    b3PhysicsClientHandle(
        "ConnectSharedMemory",
        "",

        int.IN("key", "")
    )

    b3PhysicsClientHandle(
        "ConnectPhysicsTCP",
        "Send physics commands using TCP networking.",

        nullable..charASCII.const.p.IN("hostName", ""),
        int.IN("port", "")
    )

    b3PhysicsClientHandle(
        "ConnectPhysicsUDP",
        "Send physics commands using UDP networking.",

        nullable..charASCII.const.p.IN("hostName", ""),
        int.IN("port", "")
    )

    void(
        "DisconnectSharedMemory",
        "Disconnects the client from the server and cleans up memory.",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    intb(
        "CanSubmitCommand",
        "Checks if a command can be send. There can only be 1 outstanding command.",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryStatusHandle(
        "SubmitClientCommandAndWaitStatus",
        "Blocking submit command and wait for status.",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3SharedMemoryCommandHandle.IN("commandHandle", "")
    )

    int(
        "SubmitClientCommand",
        """
        In general it is better to use #SubmitClientCommandAndWaitStatus().

        {@code b3SubmitClientCommand} is a non-blocking submit command, which requires checking for the status manually, using #ProcessServerStatus(). Also
        before sending the next command, make sure to check if you can send a command using #CanSubmitCommand().
        """,

        b3PhysicsClientHandle.IN("physClient", ""),
        b3SharedMemoryCommandHandle.IN("commandHandle", "")
    )

    b3SharedMemoryStatusHandle(
        "ProcessServerStatus",
        "Νon-blocking check status.",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "GetStatusType",
        "Getσ the physics server return status type.",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateCustomCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    void(
        "CustomCommandLoadPlugin",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        charASCII.const.p.IN("pluginPath", "")
    )

    void(
        "CustomCommandLoadPluginSetPostFix",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        charASCII.const.p.IN("postFix", "")
    )

    int(
        "GetStatusPluginUniqueId",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

    int(
        "GetStatusPluginCommandResult",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

    void(
        "CustomCommandUnloadPlugin",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("pluginUniqueId", "")
    )

    void(
        "CustomCommandExecutePluginCommand",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("pluginUniqueId", ""),
        charASCII.const.p.IN("textArguments", "")
    )

    void(
        "CustomCommandExecuteAddIntArgument",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("intVal", "")
    )

    void(
        "CustomCommandExecuteAddFloatArgument",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        float.IN("floatVal", "")
    )

    int(
        "GetStatusBodyIndices",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        int.p.OUT("bodyIndicesOut", ""),
        AutoSize("bodyIndicesOut")..int.IN("bodyIndicesCapacity", "")
    )

    int(
        "GetStatusBodyIndex",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

	int(
        "GetStatusActualState",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        Check(1)..nullable..int.p.OUT("bodyUniqueId", ""),
        Check(1)..nullable..int.p.OUT("numDegreeOfFreedomQ", ""),
        Check(1)..nullable..int.p.OUT("numDegreeOfFreedomU", ""),
        Check(1)..nullable..double.const.p.p.OUT("rootLocalInertialFrame", ""),
        Check(1)..nullable..double.const.p.p.OUT("actualStateQ", ""),
        Check(1)..nullable..double.const.p.p.OUT("actualStateQdot", ""),
        Check(1)..nullable..double.const.p.p.OUT("jointReactionForces", "")
    )

	int(
        "GetStatusActualState2",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        Check(1)..nullable..int.p.OUT("bodyUniqueId", ""),
        Check(1)..nullable..int.p.OUT("numLinks", ""),
        Check(1)..nullable..int.p.OUT("numDegreeOfFreedomQ", ""),
        Check(1)..nullable..int.p.OUT("numDegreeOfFreedomU", ""),
        Check(1)..nullable..double.const.p.p.OUT("rootLocalInertialFrame", ""),
        Check(1)..nullable..double.const.p.p.OUT("actualStateQ", ""),
        Check(1)..nullable..double.const.p.p.OUT("actualStateQdot", ""),
        Check(1)..nullable..double.const.p.p.OUT("jointReactionForces", ""),
        Check(1)..nullable..double.const.p.p.OUT("linkLocalInertialFrames", ""),
        Check(1)..nullable..double.const.p.p.OUT("jointMotorForces", ""),
        Check(1)..nullable..double.const.p.p.OUT("linkStates", ""),
        Check(1)..nullable..double.const.p.p.OUT("linkWorldVelocities", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestCollisionInfoCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", "")
    )

    int(
        "GetStatusAABB",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        int.IN("linkIndex", ""),
        Check(3)..double.p.OUT("aabbMin", ""),
        Check(3)..double.p.OUT("aabbMax", "")
    )

    b3SharedMemoryCommandHandle(
        "InitSyncBodyInfoCommand",
        "If you re-connected to an existing server, or server changed otherwise, sync the body info and user constraints etc.",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRemoveBodyCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", "")
    )

    int(
        "GetNumBodies",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "GetBodyUniqueId",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("serialIndex", "")
    )

    int(
        "GetBodyInfo",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        b3BodyInfo.p.OUT("info", "")
    )

    int(
        "GetNumJoints",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", "")
    )

    int(
        "ComputeDofCount",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", "")
    )

    int(
        "GetJointInfo",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("jointIndex", ""),
        b3JointInfo.p.OUT("info", "")
    )

    b3SharedMemoryCommandHandle(
        "InitSyncUserDataCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitAddUserDataCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        int.IN("visualShapeIndex", ""),
        charASCII.const.p.IN("key", ""),
        UserDataValueType.IN("valueType", ""),
        AutoSize("valueData")..int.IN("valueLength", ""),
        void.const.p.IN("valueData", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRemoveUserDataCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("userDataId", "")
    )

    int(
        "GetUserData",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("userDataId", ""),
        b3UserDataValue.p.OUT("valueOut", "")
    )

    int(
        "GetUserDataId",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        int.IN("visualShapeIndex", ""),
        charASCII.const.p.IN("key", "")
    )

    int(
        "GetUserDataIdFromStatus",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

    int(
        "GetNumUserData",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", "")
    )

    void(
        "GetUserDataInfo",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("userDataIndex", ""),
        Check(1)..charASCII.const.p.p.OUT("keyOut", ""),
        Check(1)..int.p.OUT("userDataIdOut", ""),
        Check(1)..int.p.OUT("linkIndexOut", ""),
        Check(1)..int.p.OUT("visualShapeIndexOut", "")
    )

    b3SharedMemoryCommandHandle(
        "GetDynamicsInfoCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", "")
    )

    b3SharedMemoryCommandHandle(
        "GetDynamicsInfoCommandInit2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", "")
    )

    int(
        "GetDynamicsInfo",
        "Given a body unique id and link index, return the dynamics information.",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        b3DynamicsInfo.p.OUT("info", "")
    )

    b3SharedMemoryCommandHandle(
        "InitChangeDynamicsInfo",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitChangeDynamicsInfo2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", "")
    )

    int(
        "ChangeDynamicsInfoSetMass",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        double.IN("mass", "")
    )

    int(
        "ChangeDynamicsInfoSetLocalInertiaDiagonal",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        Check(3)..double.const.p.IN("localInertiaDiagonal", "")
    )

    int(
        "ChangeDynamicsInfoSetLateralFriction",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        double.IN("lateralFriction", "")
    )

    int(
        "ChangeDynamicsInfoSetSpinningFriction",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        double.IN("friction", "")
    )

    int(
        "ChangeDynamicsInfoSetRollingFriction",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        double.IN("friction", "")
    )

    int(
        "ChangeDynamicsInfoSetRestitution",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        double.IN("restitution", "")
    )

    int(
        "ChangeDynamicsInfoSetLinearDamping",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        double.IN("linearDamping", "")
    )

    int(
        "ChangeDynamicsInfoSetAngularDamping",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        double.IN("angularDamping", "")
    )

    int(
        "ChangeDynamicsInfoSetContactStiffnessAndDamping",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        double.IN("contactStiffness", ""),
        double.IN("contactDamping", "")
    )

    int(
        "ChangeDynamicsInfoSetFrictionAnchor",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        int.IN("frictionAnchor", "")
    )

    int(
        "ChangeDynamicsInfoSetCcdSweptSphereRadius",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        double.IN("ccdSweptSphereRadius", "")
    )

    int(
        "ChangeDynamicsInfoSetContactProcessingThreshold",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        double.IN("contactProcessingThreshold", "")
    )

    int(
        "ChangeDynamicsInfoSetActivationState",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("activationState", "")
    )

    b3SharedMemoryCommandHandle(
        "InitCreateUserConstraintCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("parentBodyUniqueId", ""),
        int.IN("parentJointIndex", ""),
        int.IN("childBodyUniqueId", ""),
        int.IN("childJointIndex", ""),
        b3JointInfo.p.OUT("info", "")
    )

    b3SharedMemoryCommandHandle(
        "InitCreateUserConstraintCommand2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("parentBodyUniqueId", ""),
        int.IN("parentJointIndex", ""),
        int.IN("childBodyUniqueId", ""),
        int.IN("childJointIndex", ""),
        b3JointInfo.p.OUT("info", "")
    )

    int(
        "GetStatusUserConstraintUniqueId",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "InitChangeUserConstraintCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("userConstraintUniqueId", "")
    )

    int(
        "InitChangeUserConstraintSetPivotInB",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("jointChildPivot", "")
    )

    int(
        "InitChangeUserConstraintSetFrameInB",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(4)..double.const.p.IN("jointChildFrameOrn", "")
    )

    int(
        "InitChangeUserConstraintSetMaxForce",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("maxAppliedForce", "")
    )

    int(
        "InitChangeUserConstraintSetGearRatio",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("gearRatio", "")
    )

    int(
        "InitChangeUserConstraintSetGearAuxLink",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("gearAuxLink", "")
    )

    int(
        "InitChangeUserConstraintSetRelativePositionTarget",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("relativePositionTarget", "")
    )

    int(
        "InitChangeUserConstraintSetERP",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("erp", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRemoveUserConstraintCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("userConstraintUniqueId", "")
    )

    int(
        "GetNumUserConstraints",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitGetUserConstraintStateCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.const.IN("raintUniqueId", "")
    )

    int(
        "GetStatusUserConstraintState",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        b3UserConstraintState.p.OUT("constraintState", "")
    )

    int(
        "GetUserConstraintInfo",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.const.IN("raintUniqueId", ""),
        b3UserConstraint.p.OUT("info", "")
    )

    int(
        "GetUserConstraintId",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("serialIndex", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestDebugLinesCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("debugMode", "")
    )

    void(
        "GetDebugLines",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3DebugLines.p.OUT("lines", "")
    )

    b3SharedMemoryCommandHandle(
        "InitConfigureOpenGLVisualizer",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitConfigureOpenGLVisualizer2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", "")
    )

    void(
        "ConfigureOpenGLVisualizerSetVisualizationFlags",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("flag", ""),
        intb.IN("enabled", "")
    )

    void(
        "ConfigureOpenGLVisualizerSetViewMatrix",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        float.IN("cameraDistance", ""),
        float.IN("cameraPitch", ""),
        float.IN("cameraYaw", ""),
        Check(3)..float.const.p.IN("cameraTargetPosition", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestOpenGLVisualizerCameraCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "GetStatusOpenGLVisualizerCamera",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        b3OpenGLVisualizerCameraInfo.p.OUT("camera", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugDrawAddLine3D",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        Check(3)..double.const.p.IN("fromXYZ", ""),
        Check(3)..double.const.p.IN("toXYZ", ""),
        Check(3)..double.const.p.IN("colorRGB", ""),
        double.IN("lineWidth", ""),
        double.IN("lifeTime", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugDrawAddText3D",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("txt", ""),
        Check(3)..double.const.p.IN("positionXYZ", ""),
        Check(3)..double.const.p.IN("colorRGB", ""),
        double.IN("textSize", ""),
        double.IN("lifeTime", "")
    )

    void(
        "UserDebugTextSetOptionFlags",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("optionFlags", "")
    )

    void(
        "UserDebugTextSetOrientation",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(4)..double.const.p.IN("orientation", "")
    )

    void(
        "UserDebugItemSetReplaceItemUniqueId",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("replaceItem", "")
    )

    void(
        "UserDebugItemSetParentObject",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("objectUniqueId", ""),
        int.IN("linkIndex", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugAddParameter",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("txt", ""),
        double.IN("rangeMin", ""),
        double.IN("rangeMax", ""),
        double.IN("startValue", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugReadParameter",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("debugItemUniqueId", "")
    )

    int(
        "GetStatusDebugParameterValue",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        Check(1)..double.p.OUT("paramValue", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugDrawRemove",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("debugItemUniqueId", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUserDebugDrawRemoveAll",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitDebugDrawingCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    void(
        "SetDebugObjectColor",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("objectUniqueId", ""),
        int.IN("linkIndex", ""),
        Check(3)..double.const.p.IN("objectColorRGB", "")
    )

    void(
        "RemoveDebugObjectColor",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("objectUniqueId", ""),
        int.IN("linkIndex", "")
    )

    int(
        "GetDebugItemUniqueId",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestCameraImage",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestCameraImage2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", "")
    )

    void(
        "RequestCameraImageSetCameraMatrices",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(16)..float.p.IN("viewMatrix", ""),
        Check(16)..float.p.IN("projectionMatrix", "")
    )

    void(
        "RequestCameraImageSetPixelResolution",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("width", ""),
        int.IN("height", "")
    )

    void(
        "RequestCameraImageSetLightDirection",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..float.const.p.IN("lightDirection", "")
    )

    void(
        "RequestCameraImageSetLightColor",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..float.const.p.IN("lightColor", "")
    )

    void(
        "RequestCameraImageSetLightDistance",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        float.IN("lightDistance", "")
    )

    void(
        "RequestCameraImageSetLightAmbientCoeff",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        float.IN("lightAmbientCoeff", "")
    )

    void(
        "RequestCameraImageSetLightDiffuseCoeff",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        float.IN("lightDiffuseCoeff", "")
    )

    void(
        "RequestCameraImageSetLightSpecularCoeff",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        float.IN("lightSpecularCoeff", "")
    )

    void(
        "RequestCameraImageSetShadow",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("hasShadow", "")
    )

    void(
        "RequestCameraImageSelectRenderer",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("renderer", "")
    )

    void(
        "RequestCameraImageSetFlags",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("flags", "")
    )

    void(
        "GetCameraImageData",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3CameraImageData.p.OUT("imageData", "")
    )

    void(
        "RequestCameraImageSetProjectiveTextureMatrices",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(16)..float.p.IN("viewMatrix", ""),
        Check(16)..float.p.IN("projectionMatrix", "")
    )

    void(
        "ComputeViewMatrixFromPositions",
        "",

        Check(3)..float.const.p.IN("cameraPosition", ""),
        Check(3)..float.const.p.IN("cameraTargetPosition", ""),
        Check(3)..float.const.p.IN("cameraUp", ""),
        Check(16)..float.p.OUT("viewMatrix", "")
    )

    void(
        "ComputeViewMatrixFromYawPitchRoll",
        "",

        Check(3)..float.const.p.IN("cameraTargetPosition", ""),
        float.IN("distance", ""),
        float.IN("yaw", ""),
        float.IN("pitch", ""),
        float.IN("roll", ""),
        int.IN("upAxis", ""),
        Check(16)..float.p.OUT("viewMatrix", "")
    )

    void(
        "ComputePositionFromViewMatrix",
        "",

        Check(16)..float.const.p.IN("viewMatrix", ""),
        Check(3)..float.p.OUT("cameraPosition", ""),
        Check(3)..float.p.OUT("cameraTargetPosition", ""),
        Check(3)..float.p.OUT("cameraUp", "")
    )

    void(
        "ComputeProjectionMatrix",
        "",

        float.IN("left", ""),
        float.IN("right", ""),
        float.IN("bottom", ""),
        float.IN("top", ""),
        float.IN("nearVal", ""),
        float.IN("farVal", ""),
        Check(16)..float.p.OUT("projectionMatrix", "")
    )

    void(
        "ComputeProjectionMatrixFOV",
        "",

        float.IN("fov", ""),
        float.IN("aspect", ""),
        float.IN("nearVal", ""),
        float.IN("farVal", ""),
        Check(16)..float.p.OUT("projectionMatrix", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestContactPointInformation",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    void(
        "SetContactFilterBodyA",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueIdA", "")
    )

    void(
        "SetContactFilterBodyB",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueIdB", "")
    )

    void(
        "SetContactFilterLinkA",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("linkIndexA", "")
    )

    void(
        "SetContactFilterLinkB",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("linkIndexB", "")
    )

    void(
        "GetContactPointInformation",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3ContactInformation.p.OUT("contactPointData", "")
    )

    b3SharedMemoryCommandHandle(
        "InitClosestDistanceQuery",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    void(
        "SetClosestDistanceFilterBodyA",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueIdA", "")
    )

    void(
        "SetClosestDistanceFilterLinkA",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("linkIndexA", "")
    )

    void(
        "SetClosestDistanceFilterBodyB",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueIdB", "")
    )

    void(
        "SetClosestDistanceFilterLinkB",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("linkIndexB", "")
    )

    void(
        "SetClosestDistanceThreshold",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("distance", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapeA",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("collisionShapeA", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapeB",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("collisionShapeB", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapePositionA",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("collisionShapePositionA", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapePositionB",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("collisionShapePositionB", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapeOrientationA",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(4)..double.const.p.IN("collisionShapeOrientationA", "")
    )

    void(
        "SetClosestDistanceFilterCollisionShapeOrientationB",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(4)..double.const.p.IN("collisionShapeOrientationB", "")
    )

    void(
        "GetClosestPointInformation",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3ContactInformation.p.OUT("contactPointInfo", "")
    )

    b3SharedMemoryCommandHandle(
        "InitAABBOverlapQuery",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        Check(3)..double.const.p.IN("aabbMin", ""),
        Check(3)..double.const.p.IN("aabbMax", "")
    )

    void(
        "GetAABBOverlapResults",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3AABBOverlapData.p.OUT("data", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestVisualShapeInformation",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueIdA", "")
    )

    void(
        "GetVisualShapeInformation",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3VisualShapeInformation.p.OUT("visualShapeInfo", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestCollisionShapeInformation",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", "")
    )

    void(
        "GetCollisionShapeInformation",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3CollisionShapeInformation.p.OUT("collisionShapeInfo", "")
    )

    b3SharedMemoryCommandHandle(
        "InitLoadTexture",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("filename", "")
    )

    int(
        "GetStatusTextureUniqueId",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateChangeTextureCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("textureUniqueId", ""),
        int.IN("width", ""),
        int.IN("height", ""),
        Check("3 * width * height")..char.const.p.IN("rgbPixels", "")
    )

    b3SharedMemoryCommandHandle(
        "InitUpdateVisualShape",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("jointIndex", ""),
        int.IN("shapeIndex", ""),
        int.IN("textureUniqueId", "")
    )

    void(
        "UpdateVisualShapeRGBAColor",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(4)..double.const.p.IN("rgbaColor", "")
    )

    void(
        "UpdateVisualShapeSpecularColor",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("specularColor", "")
    )

    b3SharedMemoryCommandHandle(
        "InitPhysicsParamCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitPhysicsParamCommand2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", "")
    )

    int(
        "PhysicsParamSetGravity",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("gravx", ""),
        double.IN("gravy", ""),
        double.IN("gravz", "")
    )

    int(
        "PhysicsParamSetTimeStep",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("timeStep", "")
    )

    int(
        "PhysicsParamSetDefaultContactERP",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("defaultContactERP", "")
    )

    int(
        "PhysicsParamSetDefaultNonContactERP",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("defaultNonContactERP", "")
    )

    int(
        "PhysicsParamSetDefaultFrictionERP",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("frictionERP", "")
    )

    int(
        "PhysicsParamSetDefaultGlobalCFM",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("defaultGlobalCFM", "")
    )

    int(
        "PhysicsParamSetDefaultFrictionCFM",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("frictionCFM", "")
    )

    int(
        "PhysicsParamSetNumSubSteps",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("numSubSteps", "")
    )

    int(
        "PhysicsParamSetRealTimeSimulation",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        intb.IN("enableRealTimeSimulation", "")
    )

    int(
        "PhysicsParamSetNumSolverIterations",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("numSolverIterations", "")
    )

    int(
        "PhysicsParamSetCollisionFilterMode",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("filterMode", "")
    )

    int(
        "PhysicsParamSetUseSplitImpulse",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("useSplitImpulse", "")
    )

    int(
        "PhysicsParamSetSplitImpulsePenetrationThreshold",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("splitImpulsePenetrationThreshold", "")
    )

    int(
        "PhysicsParamSetContactBreakingThreshold",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("contactBreakingThreshold", "")
    )

    int(
        "PhysicsParamSetMaxNumCommandsPer1ms",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("maxNumCmdPer1ms", "")
    )

    int(
        "PhysicsParamSetEnableFileCaching",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        intb.IN("enableFileCaching", "")
    )

    int(
        "PhysicsParamSetRestitutionVelocityThreshold",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("restitutionVelocityThreshold", "")
    )

    int(
        "PhysicsParamSetEnableConeFriction",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        intb.IN("enableConeFriction", "")
    )

    int(
        "PhysicsParameterSetDeterministicOverlappingPairs",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("deterministicOverlappingPairs", "")
    )

    int(
        "PhysicsParameterSetAllowedCcdPenetration",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("allowedCcdPenetration", "")
    )

    int(
        "PhysicsParameterSetJointFeedbackMode",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("jointFeedbackMode", "")
    )

    int(
        "PhysicsParamSetSolverResidualThreshold",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("solverResidualThreshold", "")
    )

    int(
        "PhysicsParamSetContactSlop",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("contactSlop", "")
    )

    int(
        "PhysicsParameterSetEnableSAT",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        intb.IN("enableSAT", "")
    )

    int(
        "PhysicsParameterSetConstraintSolverType",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.const.IN("raintSolverType", "")
    )

    int(
        "PhysicsParameterSetMinimumSolverIslandSize",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("minimumSolverIslandSize", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRequestPhysicsParamCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "GetStatusPhysicsSimulationParameters",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        b3PhysicsSimulationParameters.p.OUT("params", "")
    )

    int(
        "PhysicsParamSetInternalSimFlags",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("flags", "")
    )

    b3SharedMemoryCommandHandle(
        "InitStepSimulationCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitStepSimulationCommand2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "InitResetSimulationCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "InitResetSimulationCommand2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadUrdfCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("urdfFileName", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadUrdfCommandInit2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        charASCII.const.p.IN("urdfFileName", "")
    )

    int(
        "LoadUrdfCommandSetStartPosition",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("startPosX", ""),
        double.IN("startPosY", ""),
        double.IN("startPosZ", "")
    )

    int(
        "LoadUrdfCommandSetStartOrientation",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("startOrnX", ""),
        double.IN("startOrnY", ""),
        double.IN("startOrnZ", ""),
        double.IN("startOrnW", "")
    )

    int(
        "LoadUrdfCommandSetUseMultiBody",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("useMultiBody", "")
    )

    int(
        "LoadUrdfCommandSetUseFixedBase",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("useFixedBase", "")
    )

    int(
        "LoadUrdfCommandSetFlags",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("flags", "")
    )

    int(
        "LoadUrdfCommandSetGlobalScaling",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("globalScaling", "")
    )

    b3SharedMemoryCommandHandle(
        "SaveStateCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "GetStatusGetStateId",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadStateCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "LoadStateSetStateId",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("stateId", "")
    )

    int(
        "LoadStateSetFileName",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        charASCII.const.p.IN("fileName", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadBulletCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("fileName", "")
    )

    b3SharedMemoryCommandHandle(
        "SaveBulletCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("fileName", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadMJCFCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("fileName", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadMJCFCommandInit2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        charASCII.const.p.IN("fileName", "")
    )

    void(
        "LoadMJCFCommandSetFlags",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("flags", "")
    )

    b3SharedMemoryCommandHandle(
        "CalculateInverseDynamicsCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        Unsafe..double.const.p.IN("jointPositionsQ", ""),
        Unsafe..double.const.p.IN("jointVelocitiesQdot", ""),
        Unsafe..double.const.p.IN("jointAccelerations", "")
    )

    int(
        "GetStatusInverseDynamicsJointForces",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        Check(1)..nullable..int.p.OUT("bodyUniqueId", ""),
        Check(1)..nullable..int.p.OUT("dofCount", ""),
        Unsafe..nullable..double.p.OUT("jointForces", "")
    )

    b3SharedMemoryCommandHandle(
        "CalculateJacobianCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkIndex", ""),
        Check(3)..double.const.p.IN("localPosition", ""),
        Unsafe..double.const.p.IN("jointPositionsQ", ""),
        Unsafe..double.const.p.IN("jointVelocitiesQdot", ""),
        Unsafe..double.const.p.IN("jointAccelerations", "")
    )

    int(
        "GetStatusJacobian",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        Check(1)..nullable..int.p.OUT("dofCount", ""),
        Unsafe..double.p.OUT("linearJacobian", ""),
        Unsafe..double.p.OUT("angularJacobian", "")
    )

    b3SharedMemoryCommandHandle(
        "CalculateMassMatrixCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        Unsafe..double.const.p.IN("jointPositionsQ", "")
    )

    int(
        "GetStatusMassMatrix",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        Check(1)..nullable..int.p.OUT("dofCount", ""),
        Unsafe..nullable..double.p.OUT("massMatrix", "")
    )

    b3SharedMemoryCommandHandle(
        "CalculateInverseKinematicsCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", "")
    )

    void(
        "CalculateInverseKinematicsAddTargetPurePosition",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("endEffectorLinkIndex", ""),
        Check(3)..double.const.p.IN("targetPosition", "")
    )

    void(
        "CalculateInverseKinematicsAddTargetPositionWithOrientation",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("endEffectorLinkIndex", ""),
        Check(3)..double.const.p.IN("targetPosition", ""),
        Check(4)..double.const.p.IN("targetOrientation", "")
    )

    void(
        "CalculateInverseKinematicsPosWithNullSpaceVel",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        AutoSize("lowerLimit", "upperLimit", "jointRange", "restPose")..int.IN("numDof", ""),
        int.IN("endEffectorLinkIndex", ""),
        Check(3)..double.const.p.IN("targetPosition", ""),
        double.const.p.IN("lowerLimit", ""),
        double.const.p.IN("upperLimit", ""),
        double.const.p.IN("jointRange", ""),
        double.const.p.IN("restPose", "")
    )

    void(
        "CalculateInverseKinematicsPosOrnWithNullSpaceVel",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        AutoSize("lowerLimit", "upperLimit", "jointRange", "restPose")..int.IN("numDof", ""),
        int.IN("endEffectorLinkIndex", ""),
        Check(3)..double.const.p.IN("targetPosition", ""),
        Check(4)..double.const.p.IN("targetOrientation", ""),
        double.const.p.IN("lowerLimit", ""),
        double.const.p.IN("upperLimit", ""),
        double.const.p.IN("jointRange", ""),
        double.const.p.IN("restPose", "")
    )

    void(
        "CalculateInverseKinematicsSetJointDamping",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        AutoSize("jointDampingCoeff")..int.IN("numDof", ""),
        double.const.p.IN("jointDampingCoeff", "")
    )

    void(
        "CalculateInverseKinematicsSelectSolver",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("solver", "")
    )

    int(
        "GetStatusInverseKinematicsJointPositions",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        Check(1)..nullable..int.p.OUT("bodyUniqueId", ""),
        Check(1)..nullable..int.p.OUT("dofCount", ""),
        Unsafe..nullable..double.p.OUT("jointPositions", "")
    )

    void(
        "CalculateInverseKinematicsSetCurrentPositions",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        AutoSize("currentJointPositions")..int.IN("numDof", ""),
        double.const.p.IN("currentJointPositions", "")
    )

    void(
        "CalculateInverseKinematicsSetMaxNumIterations",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("maxNumIterations", "")
    )

    void(
        "CalculateInverseKinematicsSetResidualThreshold",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("residualThreshold", "")
    )

    b3SharedMemoryCommandHandle(
        "CollisionFilterCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    void(
        "SetCollisionFilterPair",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueIdA", ""),
        int.IN("bodyUniqueIdB", ""),
        int.IN("linkIndexA", ""),
        int.IN("linkIndexB", ""),
        intb.IN("enableCollision", "")
    )

    void(
        "SetCollisionFilterGroupMask",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueIdA", ""),
        int.IN("linkIndexA", ""),
        int.IN("collisionFilterGroup", ""),
        int.IN("collisionFilterMask", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadSdfCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("sdfFileName", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadSdfCommandInit2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        charASCII.const.p.IN("sdfFileName", "")
    )

    int(
        "LoadSdfCommandSetUseMultiBody",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("useMultiBody", "")
    )

    int(
        "LoadSdfCommandSetUseGlobalScaling",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("globalScaling", "")
    )

    b3SharedMemoryCommandHandle(
        "SaveWorldCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("sdfFileName", "")
    )

    b3SharedMemoryCommandHandle(
        "JointControlCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("controlMode", "")
    )

    b3SharedMemoryCommandHandle(
        "JointControlCommandInit2",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("controlMode", "")
    )

    b3SharedMemoryCommandHandle(
        "JointControlCommandInit2Internal",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("controlMode", "")
    )

    int(
        "JointControlSetDesiredPosition",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("qIndex", ""),
        double.IN("value", "")
    )

    int(
        "JointControlSetKp",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("dofIndex", ""),
        double.IN("value", "")
    )

    int(
        "JointControlSetKd",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("dofIndex", ""),
        double.IN("value", "")
    )

    int(
        "JointControlSetMaximumVelocity",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("dofIndex", ""),
        double.IN("maximumVelocity", "")
    )

    int(
        "JointControlSetDesiredVelocity",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("dofIndex", ""),
        double.IN("value", "")
    )

    int(
        "JointControlSetMaximumForce",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("dofIndex", ""),
        double.IN("value", "")
    )

    int(
        "JointControlSetDesiredForceTorque",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("dofIndex", ""),
        double.IN("value", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateCollisionShapeCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "CreateCollisionShapeAddSphere",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("radius", "")
    )

    int(
        "CreateCollisionShapeAddBox",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("halfExtents", "")
    )

    int(
        "CreateCollisionShapeAddCapsule",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("radius", ""),
        double.IN("height", "")
    )

    int(
        "CreateCollisionShapeAddCylinder",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("radius", ""),
        double.IN("height", "")
    )

    int(
        "CreateCollisionShapeAddPlane",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("planeNormal", ""),
        double.IN("planeConstant", "")
    )

    int(
        "CreateCollisionShapeAddMesh",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        charASCII.const.p.IN("fileName", ""),
        Check(3)..double.const.p.IN("meshScale", "")
    )

    void(
        "CreateCollisionSetFlag",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("shapeIndex", ""),
        int.IN("flags", "")
    )

    void(
        "CreateCollisionShapeSetChildTransform",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("shapeIndex", ""),
        Check(3)..double.const.p.IN("childPosition", ""),
        Check(4)..double.const.p.IN("childOrientation", "")
    )

    int(
        "GetStatusCollisionShapeUniqueId",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "InitRemoveCollisionShapeCommand",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("collisionShapeId", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateVisualShapeCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "CreateVisualShapeAddSphere",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("radius", "")
    )

    int(
        "CreateVisualShapeAddBox",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("halfExtents", "")
    )

    int(
        "CreateVisualShapeAddCapsule",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("radius", ""),
        double.IN("height", "")
    )

    int(
        "CreateVisualShapeAddCylinder",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("radius", ""),
        double.IN("height", "")
    )

    int(
        "CreateVisualShapeAddPlane",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("planeNormal", ""),
        double.IN("planeConstant", "")
    )

    int(
        "CreateVisualShapeAddMesh",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        charASCII.const.p.IN("fileName", ""),
        Check(3)..double.const.p.IN("meshScale", "")
    )

    void(
        "CreateVisualSetFlag",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("shapeIndex", ""),
        int.IN("flags", "")
    )

    void(
        "CreateVisualShapeSetChildTransform",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("shapeIndex", ""),
        Check(3)..double.const.p.IN("childPosition", ""),
        Check(4)..double.const.p.IN("childOrientation", "")
    )

    void(
        "CreateVisualShapeSetSpecularColor",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("shapeIndex", ""),
        Check(3)..double.const.p.IN("specularColor", "")
    )

    void(
        "CreateVisualShapeSetRGBAColor",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("shapeIndex", ""),
        Check(4)..double.const.p.IN("rgbaColor", "")
    )

    int(
        "GetStatusVisualShapeUniqueId",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateMultiBodyCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "CreateMultiBodyBase",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("mass", ""),
        int.IN("collisionShapeUnique", ""),
        int.IN("visualShapeUniqueId", ""),
        Check(3)..double.const.p.IN("basePosition", ""),
        Check(4)..double.const.p.IN("baseOrientation", ""),
        Check(3)..double.const.p.IN("baseInertialFramePosition", ""),
        Check(4)..double.const.p.IN("baseInertialFrameOrientation", "")
    )

    int(
        "CreateMultiBodyLink",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("linkMass", ""),
        double.IN("linkCollisionShapeIndex", ""),
        double.IN("linkVisualShapeIndex", ""),
        Check(3)..double.const.p.IN("linkPosition", ""),
        Check(4)..double.const.p.IN("linkOrientation", ""),
        Check(3)..double.const.p.IN("linkInertialFramePosition", ""),
        Check(4)..double.const.p.IN("linkInertialFrameOrientation", ""),
        int.IN("linkParentIndex", ""),
        int.IN("linkJointType", ""),
        Check(3)..double.const.p.IN("linkJointAxis", "")
    )

    void(
        "CreateMultiBodyUseMaximalCoordinates",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", "")
    )

    void(
        "CreateMultiBodySetFlags",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("flags", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateBoxShapeCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "CreateBoxCommandSetStartPosition",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("startPosX", ""),
        double.IN("startPosY", ""),
        double.IN("startPosZ", "")
    )

    int(
        "CreateBoxCommandSetStartOrientation",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("startOrnX", ""),
        double.IN("startOrnY", ""),
        double.IN("startOrnZ", ""),
        double.IN("startOrnW", "")
    )

    int(
        "CreateBoxCommandSetHalfExtents",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("halfExtentsX", ""),
        double.IN("halfExtentsY", ""),
        double.IN("halfExtentsZ", "")
    )

    int(
        "CreateBoxCommandSetMass",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("mass", "")
    )

    int(
        "CreateBoxCommandSetCollisionShapeType",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("collisionShapeType", "")
    )

    int(
        "CreateBoxCommandSetColorRGBA",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("red", ""),
        double.IN("green", ""),
        double.IN("blue", ""),
        double.IN("alpha", "")
    )

    b3SharedMemoryCommandHandle(
        "CreatePoseCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", "")
    )

    b3SharedMemoryCommandHandle(
        "CreatePoseCommandInit2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", "")
    )

    int(
        "CreatePoseCommandSetBasePosition",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("startPosX", ""),
        double.IN("startPosY", ""),
        double.IN("startPosZ", "")
    )

    int(
        "CreatePoseCommandSetBaseOrientation",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("startOrnX", ""),
        double.IN("startOrnY", ""),
        double.IN("startOrnZ", ""),
        double.IN("startOrnW", "")
    )

    int(
        "CreatePoseCommandSetBaseLinearVelocity",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("linVel", "")
    )

    int(
        "CreatePoseCommandSetBaseAngularVelocity",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("angVel", "")
    )

    int(
        "CreatePoseCommandSetJointPositions",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        AutoSize("jointPositions")..int.IN("numJointPositions", ""),
        double.const.p.IN("jointPositions", "")
    )

    int(
        "CreatePoseCommandSetJointPosition",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("jointIndex", ""),
        double.IN("jointPosition", "")
    )

    int(
        "CreatePoseCommandSetQ",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        AutoSize("q", "hasQ")..int.IN("numJointPositions", ""),
        double.const.p.IN("q", ""),
        int.const.p.IN("hasQ", "")
    )

    int(
        "CreatePoseCommandSetQdots",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        AutoSize("qDots", "hasQdots")..int.IN("numJointVelocities", ""),
        double.const.p.IN("qDots", ""),
        int.const.p.IN("hasQdots", "")
    )

    int(
        "CreatePoseCommandSetJointVelocities",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        AutoSize("jointVelocities")..int.IN("numJointVelocities", ""),
        double.const.p.IN("jointVelocities", "")
    )

    int(
        "CreatePoseCommandSetJointVelocity",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("jointIndex", ""),
        double.IN("jointVelocity", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateSensorCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", "")
    )

    int(
        "CreateSensorEnable6DofJointForceTorqueSensor",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("jointIndex", ""),
        intb.IN("enable", "")
    )

    int(
        "CreateSensorEnableIMUForLink",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("linkIndex", ""),
        intb.IN("enable", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestActualStateCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        int.IN("bodyUniqueId", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestActualStateCommandInit2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", "")
    )

    int(
        "RequestActualStateCommandComputeLinkVelocity",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("computeLinkVelocity", "")
    )

    int(
        "RequestActualStateCommandComputeForwardKinematics",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("computeForwardKinematics", "")
    )

    int(
        "GetJointState",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        int.IN("jointIndex", ""),
        b3JointSensorState.p.OUT("state", "")
    )

    int(
        "GetLinkState",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3SharedMemoryStatusHandle.IN("statusHandle", ""),
        int.IN("linkIndex", ""),
        b3LinkState.p.OUT("state", "")
    )

    b3SharedMemoryCommandHandle(
        "PickBody",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        double.IN("rayFromWorldX", ""),
        double.IN("rayFromWorldY", ""),
        double.IN("rayFromWorldZ", ""),
        double.IN("rayToWorldX", ""),
        double.IN("rayToWorldY", ""),
        double.IN("rayToWorldZ", "")
    )

    b3SharedMemoryCommandHandle(
        "MovePickedBody",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        double.IN("rayFromWorldX", ""),
        double.IN("rayFromWorldY", ""),
        double.IN("rayFromWorldZ", ""),
        double.IN("rayToWorldX", ""),
        double.IN("rayToWorldY", ""),
        double.IN("rayToWorldZ", "")
    )

    b3SharedMemoryCommandHandle(
        "RemovePickingConstraint",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateRaycastCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        double.IN("rayFromWorldX", ""),
        double.IN("rayFromWorldY", ""),
        double.IN("rayFromWorldZ", ""),
        double.IN("rayToWorldX", ""),
        double.IN("rayToWorldY", ""),
        double.IN("rayToWorldZ", "")
    )

    b3SharedMemoryCommandHandle(
        "CreateRaycastBatchCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    void(
        "RaycastBatchSetNumThreads",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("numThreads", "")
    )

    void(
        "RaycastBatchAddRay",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("rayFromWorld", ""),
        Check(3)..double.const.p.IN("rayToWorld", "")
    )

    void(
        "RaycastBatchAddRays",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.const.p.IN("rayFromWorld", ""),
        double.const.p.IN("rayToWorld", ""),
        AutoSize(3, "rayFromWorld", "rayToWorld")..int.IN("numRays", "")
    )

    void(
        "RaycastBatchSetParentObject",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("parentObjectUniqueId", ""),
        int.IN("parentLinkIndex", "")
    )

    void(
        "GetRaycastInformation",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3RaycastInformation.p.OUT("raycastInfo", "")
    )

    b3SharedMemoryCommandHandle(
        "ApplyExternalForceCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    void(
        "ApplyExternalForce",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkId", ""),
        Check(3)..double.const.p.IN("force", ""),
        Check(3)..double.const.p.IN("position", ""),
        int.IN("flag", "")
    )

    void(
        "ApplyExternalTorque",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyUniqueId", ""),
        int.IN("linkId", ""),
        Check(3)..double.const.p.IN("torque", ""),
        int.IN("flag", "")
    )

    b3SharedMemoryCommandHandle(
        "LoadSoftBodyCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("fileName", "")
    )

    int(
        "LoadSoftBodySetScale",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("scale", "")
    )

    int(
        "LoadSoftBodySetMass",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("mass", "")
    )

    int(
        "LoadSoftBodySetCollisionMargin",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        double.IN("collisionMargin", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestVREventsCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    void(
        "VREventsSetDeviceTypeFilter",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("deviceTypeFilter", "")
    )

    void(
        "GetVREventsData",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3VREventsData.p.OUT("vrEventsData", "")
    )

    b3SharedMemoryCommandHandle(
        "SetVRCameraStateCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "SetVRCameraRootPosition",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(3)..double.const.p.IN("rootPos", "")
    )

    int(
        "SetVRCameraRootOrientation",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        Check(4)..double.const.p.IN("rootOrn", "")
    )

    int(
        "SetVRCameraTrackingObject",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("objectUniqueId", "")
    )

    int(
        "SetVRCameraTrackingObjectFlag",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("flag", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestKeyboardEventsCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestKeyboardEventsCommandInit2",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", "")
    )

    void(
        "GetKeyboardEventsData",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3KeyboardEventsData.p.OUT("keyboardEventsData", "")
    )

    b3SharedMemoryCommandHandle(
        "RequestMouseEventsCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    void(
        "GetMouseEventsData",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        b3MouseEventsData.p.OUT("mouseEventsData", "")
    )

    b3SharedMemoryCommandHandle(
        "StateLoggingCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    int(
        "StateLoggingStart",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("loggingType", ""),
        charASCII.const.p.IN("fileName", "")
    )

    int(
        "StateLoggingAddLoggingObjectUniqueId",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("objectUniqueId", "")
    )

    int(
        "StateLoggingSetMaxLogDof",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("maxLogDof", "")
    )

    int(
        "StateLoggingSetLinkIndexA",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("linkIndexA", "")
    )

    int(
        "StateLoggingSetLinkIndexB",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("linkIndexB", "")
    )

    int(
        "StateLoggingSetBodyAUniqueId",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyAUniqueId", "")
    )

    int(
        "StateLoggingSetBodyBUniqueId",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("bodyBUniqueId", "")
    )

    int(
        "StateLoggingSetDeviceTypeFilter",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("deviceTypeFilter", "")
    )

    int(
        "StateLoggingSetLogFlags",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("logFlags", "")
    )

    int(
        "GetStatusLoggingUniqueId",
        "",

        b3SharedMemoryStatusHandle.IN("statusHandle", "")
    )

    int(
        "StateLoggingStop",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("loggingUid", "")
    )

    b3SharedMemoryCommandHandle(
        "ProfileTimingCommandInit",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("name", "")
    )

    void(
        "SetProfileTimingDuractionInMicroSeconds",
        "",

        b3SharedMemoryCommandHandle.IN("commandHandle", ""),
        int.IN("duration", "")
    )

    void(
        "PushProfileTiming",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("timingName", "")
    )

    void(
        "PopProfileTiming",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    void(
        "SetTimeOut",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        double.IN("timeOutInSeconds", "")
    )

    double(
        "GetTimeOut",
        "",

        b3PhysicsClientHandle.IN("physClient", "")
    )

    b3SharedMemoryCommandHandle(
        "SetAdditionalSearchPath",
        "",

        b3PhysicsClientHandle.IN("physClient", ""),
        charASCII.const.p.IN("path", "")
    )

    void(
        "MultiplyTransforms",
        "",

        Check(3)..double.const.p.IN("posA", ""),
        Check(4)..double.const.p.IN("ornA", ""),
        Check(3)..double.const.p.IN("posB", ""),
        Check(4)..double.const.p.IN("ornB", ""),
        Check(3)..double.p.OUT("outPos", ""),
        Check(4)..double.p.OUT("outOrn", "")
    )

    void(
        "InvertTransform",
        "",

        Check(3)..double.const.p.IN("pos", ""),
        Check(4)..double.const.p.IN("orn", ""),
        Check(3)..double.p.OUT("outPos", ""),
        Check(4)..double.p.OUT("outOrn", "")
    )
}