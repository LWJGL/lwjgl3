/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the C API of the <a target="_blank" href="http://bulletphysics.org/">Bullet</a> library. */
public class PhysicsClient {

    public static final int SHARED_MEMORY_KEY = 12347;

    public static final int SHARED_MEMORY_MAGIC_NUMBER = 2018090300;

    /**
     * {@code enum EnumSharedMemoryClientCommand}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CMD_INVALID CMD_INVALID}</li>
     * <li>{@link #CMD_LOAD_SDF CMD_LOAD_SDF}</li>
     * <li>{@link #CMD_LOAD_URDF CMD_LOAD_URDF}</li>
     * <li>{@link #CMD_LOAD_BULLET CMD_LOAD_BULLET}</li>
     * <li>{@link #CMD_SAVE_BULLET CMD_SAVE_BULLET}</li>
     * <li>{@link #CMD_LOAD_MJCF CMD_LOAD_MJCF}</li>
     * <li>{@link #CMD_LOAD_SOFT_BODY CMD_LOAD_SOFT_BODY}</li>
     * <li>{@link #CMD_SEND_BULLET_DATA_STREAM CMD_SEND_BULLET_DATA_STREAM}</li>
     * <li>{@link #CMD_CREATE_BOX_COLLISION_SHAPE CMD_CREATE_BOX_COLLISION_SHAPE}</li>
     * <li>{@link #CMD_CREATE_RIGID_BODY CMD_CREATE_RIGID_BODY}</li>
     * <li>{@link #CMD_DELETE_RIGID_BODY CMD_DELETE_RIGID_BODY}</li>
     * <li>{@link #CMD_CREATE_SENSOR CMD_CREATE_SENSOR} - Enable or disable joint feedback for force/torque sensors</li>
     * <li>{@link #CMD_INIT_POSE CMD_INIT_POSE}</li>
     * <li>{@link #CMD_SEND_PHYSICS_SIMULATION_PARAMETERS CMD_SEND_PHYSICS_SIMULATION_PARAMETERS}</li>
     * <li>{@link #CMD_SEND_DESIRED_STATE CMD_SEND_DESIRED_STATE}</li>
     * <li>{@link #CMD_REQUEST_ACTUAL_STATE CMD_REQUEST_ACTUAL_STATE}</li>
     * <li>{@link #CMD_REQUEST_DEBUG_LINES CMD_REQUEST_DEBUG_LINES}</li>
     * <li>{@link #CMD_REQUEST_BODY_INFO CMD_REQUEST_BODY_INFO}</li>
     * <li>{@link #CMD_REQUEST_INTERNAL_DATA CMD_REQUEST_INTERNAL_DATA}</li>
     * <li>{@link #CMD_STEP_FORWARD_SIMULATION CMD_STEP_FORWARD_SIMULATION}</li>
     * <li>{@link #CMD_RESET_SIMULATION CMD_RESET_SIMULATION}</li>
     * <li>{@link #CMD_PICK_BODY CMD_PICK_BODY}</li>
     * <li>{@link #CMD_MOVE_PICKED_BODY CMD_MOVE_PICKED_BODY}</li>
     * <li>{@link #CMD_REMOVE_PICKING_CONSTRAINT_BODY CMD_REMOVE_PICKING_CONSTRAINT_BODY}</li>
     * <li>{@link #CMD_REQUEST_CAMERA_IMAGE_DATA CMD_REQUEST_CAMERA_IMAGE_DATA}</li>
     * <li>{@link #CMD_APPLY_EXTERNAL_FORCE CMD_APPLY_EXTERNAL_FORCE}</li>
     * <li>{@link #CMD_CALCULATE_INVERSE_DYNAMICS CMD_CALCULATE_INVERSE_DYNAMICS}</li>
     * <li>{@link #CMD_CALCULATE_INVERSE_KINEMATICS CMD_CALCULATE_INVERSE_KINEMATICS}</li>
     * <li>{@link #CMD_CALCULATE_JACOBIAN CMD_CALCULATE_JACOBIAN}</li>
     * <li>{@link #CMD_CALCULATE_MASS_MATRIX CMD_CALCULATE_MASS_MATRIX}</li>
     * <li>{@link #CMD_USER_CONSTRAINT CMD_USER_CONSTRAINT}</li>
     * <li>{@link #CMD_REQUEST_CONTACT_POINT_INFORMATION CMD_REQUEST_CONTACT_POINT_INFORMATION}</li>
     * <li>{@link #CMD_REQUEST_RAY_CAST_INTERSECTIONS CMD_REQUEST_RAY_CAST_INTERSECTIONS}</li>
     * <li>{@link #CMD_REQUEST_AABB_OVERLAP CMD_REQUEST_AABB_OVERLAP}</li>
     * <li>{@link #CMD_SAVE_WORLD CMD_SAVE_WORLD}</li>
     * <li>{@link #CMD_REQUEST_VISUAL_SHAPE_INFO CMD_REQUEST_VISUAL_SHAPE_INFO}</li>
     * <li>{@link #CMD_UPDATE_VISUAL_SHAPE CMD_UPDATE_VISUAL_SHAPE}</li>
     * <li>{@link #CMD_LOAD_TEXTURE CMD_LOAD_TEXTURE}</li>
     * <li>{@link #CMD_SET_SHADOW CMD_SET_SHADOW}</li>
     * <li>{@link #CMD_USER_DEBUG_DRAW CMD_USER_DEBUG_DRAW}</li>
     * <li>{@link #CMD_REQUEST_VR_EVENTS_DATA CMD_REQUEST_VR_EVENTS_DATA}</li>
     * <li>{@link #CMD_SET_VR_CAMERA_STATE CMD_SET_VR_CAMERA_STATE}</li>
     * <li>{@link #CMD_SYNC_BODY_INFO CMD_SYNC_BODY_INFO}</li>
     * <li>{@link #CMD_STATE_LOGGING CMD_STATE_LOGGING}</li>
     * <li>{@link #CMD_CONFIGURE_OPENGL_VISUALIZER CMD_CONFIGURE_OPENGL_VISUALIZER}</li>
     * <li>{@link #CMD_REQUEST_KEYBOARD_EVENTS_DATA CMD_REQUEST_KEYBOARD_EVENTS_DATA}</li>
     * <li>{@link #CMD_REQUEST_OPENGL_VISUALIZER_CAMERA CMD_REQUEST_OPENGL_VISUALIZER_CAMERA}</li>
     * <li>{@link #CMD_REMOVE_BODY CMD_REMOVE_BODY}</li>
     * <li>{@link #CMD_CHANGE_DYNAMICS_INFO CMD_CHANGE_DYNAMICS_INFO}</li>
     * <li>{@link #CMD_GET_DYNAMICS_INFO CMD_GET_DYNAMICS_INFO}</li>
     * <li>{@link #CMD_PROFILE_TIMING CMD_PROFILE_TIMING}</li>
     * <li>{@link #CMD_CREATE_COLLISION_SHAPE CMD_CREATE_COLLISION_SHAPE}</li>
     * <li>{@link #CMD_CREATE_VISUAL_SHAPE CMD_CREATE_VISUAL_SHAPE}</li>
     * <li>{@link #CMD_CREATE_MULTI_BODY CMD_CREATE_MULTI_BODY}</li>
     * <li>{@link #CMD_REQUEST_COLLISION_INFO CMD_REQUEST_COLLISION_INFO}</li>
     * <li>{@link #CMD_REQUEST_MOUSE_EVENTS_DATA CMD_REQUEST_MOUSE_EVENTS_DATA}</li>
     * <li>{@link #CMD_CHANGE_TEXTURE CMD_CHANGE_TEXTURE}</li>
     * <li>{@link #CMD_SET_ADDITIONAL_SEARCH_PATH CMD_SET_ADDITIONAL_SEARCH_PATH}</li>
     * <li>{@link #CMD_CUSTOM_COMMAND CMD_CUSTOM_COMMAND}</li>
     * <li>{@link #CMD_REQUEST_PHYSICS_SIMULATION_PARAMETERS CMD_REQUEST_PHYSICS_SIMULATION_PARAMETERS}</li>
     * <li>{@link #CMD_SAVE_STATE CMD_SAVE_STATE}</li>
     * <li>{@link #CMD_RESTORE_STATE CMD_RESTORE_STATE}</li>
     * <li>{@link #CMD_REQUEST_COLLISION_SHAPE_INFO CMD_REQUEST_COLLISION_SHAPE_INFO}</li>
     * <li>{@link #CMD_SYNC_USER_DATA CMD_SYNC_USER_DATA}</li>
     * <li>{@link #CMD_REQUEST_USER_DATA CMD_REQUEST_USER_DATA}</li>
     * <li>{@link #CMD_ADD_USER_DATA CMD_ADD_USER_DATA}</li>
     * <li>{@link #CMD_REMOVE_USER_DATA CMD_REMOVE_USER_DATA}</li>
     * <li>{@link #CMD_COLLISION_FILTER CMD_COLLISION_FILTER}</li>
     * </ul>
     */
    public static final int
        CMD_INVALID                               = 0,
        CMD_LOAD_SDF                              = 1,
        CMD_LOAD_URDF                             = 2,
        CMD_LOAD_BULLET                           = 3,
        CMD_SAVE_BULLET                           = 4,
        CMD_LOAD_MJCF                             = 5,
        CMD_LOAD_SOFT_BODY                        = 6,
        CMD_SEND_BULLET_DATA_STREAM               = 7,
        CMD_CREATE_BOX_COLLISION_SHAPE            = 8,
        CMD_CREATE_RIGID_BODY                     = 9,
        CMD_DELETE_RIGID_BODY                     = 10,
        CMD_CREATE_SENSOR                         = 11,
        CMD_INIT_POSE                             = 12,
        CMD_SEND_PHYSICS_SIMULATION_PARAMETERS    = 13,
        CMD_SEND_DESIRED_STATE                    = 14,
        CMD_REQUEST_ACTUAL_STATE                  = 15,
        CMD_REQUEST_DEBUG_LINES                   = 16,
        CMD_REQUEST_BODY_INFO                     = 17,
        CMD_REQUEST_INTERNAL_DATA                 = 18,
        CMD_STEP_FORWARD_SIMULATION               = 19,
        CMD_RESET_SIMULATION                      = 20,
        CMD_PICK_BODY                             = 21,
        CMD_MOVE_PICKED_BODY                      = 22,
        CMD_REMOVE_PICKING_CONSTRAINT_BODY        = 23,
        CMD_REQUEST_CAMERA_IMAGE_DATA             = 24,
        CMD_APPLY_EXTERNAL_FORCE                  = 25,
        CMD_CALCULATE_INVERSE_DYNAMICS            = 26,
        CMD_CALCULATE_INVERSE_KINEMATICS          = 27,
        CMD_CALCULATE_JACOBIAN                    = 28,
        CMD_CALCULATE_MASS_MATRIX                 = 29,
        CMD_USER_CONSTRAINT                       = 30,
        CMD_REQUEST_CONTACT_POINT_INFORMATION     = 31,
        CMD_REQUEST_RAY_CAST_INTERSECTIONS        = 32,
        CMD_REQUEST_AABB_OVERLAP                  = 33,
        CMD_SAVE_WORLD                            = 34,
        CMD_REQUEST_VISUAL_SHAPE_INFO             = 35,
        CMD_UPDATE_VISUAL_SHAPE                   = 36,
        CMD_LOAD_TEXTURE                          = 37,
        CMD_SET_SHADOW                            = 38,
        CMD_USER_DEBUG_DRAW                       = 39,
        CMD_REQUEST_VR_EVENTS_DATA                = 40,
        CMD_SET_VR_CAMERA_STATE                   = 41,
        CMD_SYNC_BODY_INFO                        = 42,
        CMD_STATE_LOGGING                         = 43,
        CMD_CONFIGURE_OPENGL_VISUALIZER           = 44,
        CMD_REQUEST_KEYBOARD_EVENTS_DATA          = 45,
        CMD_REQUEST_OPENGL_VISUALIZER_CAMERA      = 46,
        CMD_REMOVE_BODY                           = 47,
        CMD_CHANGE_DYNAMICS_INFO                  = 48,
        CMD_GET_DYNAMICS_INFO                     = 49,
        CMD_PROFILE_TIMING                        = 50,
        CMD_CREATE_COLLISION_SHAPE                = 51,
        CMD_CREATE_VISUAL_SHAPE                   = 52,
        CMD_CREATE_MULTI_BODY                     = 53,
        CMD_REQUEST_COLLISION_INFO                = 54,
        CMD_REQUEST_MOUSE_EVENTS_DATA             = 55,
        CMD_CHANGE_TEXTURE                        = 56,
        CMD_SET_ADDITIONAL_SEARCH_PATH            = 57,
        CMD_CUSTOM_COMMAND                        = 58,
        CMD_REQUEST_PHYSICS_SIMULATION_PARAMETERS = 59,
        CMD_SAVE_STATE                            = 60,
        CMD_RESTORE_STATE                         = 61,
        CMD_REQUEST_COLLISION_SHAPE_INFO          = 62,
        CMD_SYNC_USER_DATA                        = 63,
        CMD_REQUEST_USER_DATA                     = 64,
        CMD_ADD_USER_DATA                         = 65,
        CMD_REMOVE_USER_DATA                      = 66,
        CMD_COLLISION_FILTER                      = 67;

    /**
     * {@code enum EnumSharedMemoryServerStatus}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CMD_SHARED_MEMORY_NOT_INITIALIZED CMD_SHARED_MEMORY_NOT_INITIALIZED}</li>
     * <li>{@link #CMD_WAITING_FOR_CLIENT_COMMAND CMD_WAITING_FOR_CLIENT_COMMAND}</li>
     * <li>{@link #CMD_CLIENT_COMMAND_COMPLETED CMD_CLIENT_COMMAND_COMPLETED} - a generic 'completed' status that doesn't need special handling on the client</li>
     * <li>{@link #CMD_UNKNOWN_COMMAND_FLUSHED CMD_UNKNOWN_COMMAND_FLUSHED} - the server will skip unknown command and report a status {@code CMD_UNKNOWN_COMMAND_FLUSHED}</li>
     * <li>{@link #CMD_SDF_LOADING_COMPLETED CMD_SDF_LOADING_COMPLETED}</li>
     * <li>{@link #CMD_SDF_LOADING_FAILED CMD_SDF_LOADING_FAILED}</li>
     * <li>{@link #CMD_URDF_LOADING_COMPLETED CMD_URDF_LOADING_COMPLETED}</li>
     * <li>{@link #CMD_URDF_LOADING_FAILED CMD_URDF_LOADING_FAILED}</li>
     * <li>{@link #CMD_BULLET_LOADING_COMPLETED CMD_BULLET_LOADING_COMPLETED}</li>
     * <li>{@link #CMD_BULLET_LOADING_FAILED CMD_BULLET_LOADING_FAILED}</li>
     * <li>{@link #CMD_BULLET_SAVING_COMPLETED CMD_BULLET_SAVING_COMPLETED}</li>
     * <li>{@link #CMD_BULLET_SAVING_FAILED CMD_BULLET_SAVING_FAILED}</li>
     * <li>{@link #CMD_MJCF_LOADING_COMPLETED CMD_MJCF_LOADING_COMPLETED}</li>
     * <li>{@link #CMD_MJCF_LOADING_FAILED CMD_MJCF_LOADING_FAILED}</li>
     * <li>{@link #CMD_REQUEST_INTERNAL_DATA_COMPLETED CMD_REQUEST_INTERNAL_DATA_COMPLETED}</li>
     * <li>{@link #CMD_REQUEST_INTERNAL_DATA_FAILED CMD_REQUEST_INTERNAL_DATA_FAILED}</li>
     * <li>{@link #CMD_BULLET_DATA_STREAM_RECEIVED_COMPLETED CMD_BULLET_DATA_STREAM_RECEIVED_COMPLETED}</li>
     * <li>{@link #CMD_BULLET_DATA_STREAM_RECEIVED_FAILED CMD_BULLET_DATA_STREAM_RECEIVED_FAILED}</li>
     * <li>{@link #CMD_BOX_COLLISION_SHAPE_CREATION_COMPLETED CMD_BOX_COLLISION_SHAPE_CREATION_COMPLETED}</li>
     * <li>{@link #CMD_RIGID_BODY_CREATION_COMPLETED CMD_RIGID_BODY_CREATION_COMPLETED}</li>
     * <li>{@link #CMD_SET_JOINT_FEEDBACK_COMPLETED CMD_SET_JOINT_FEEDBACK_COMPLETED}</li>
     * <li>{@link #CMD_ACTUAL_STATE_UPDATE_COMPLETED CMD_ACTUAL_STATE_UPDATE_COMPLETED}</li>
     * <li>{@link #CMD_ACTUAL_STATE_UPDATE_FAILED CMD_ACTUAL_STATE_UPDATE_FAILED}</li>
     * <li>{@link #CMD_DEBUG_LINES_COMPLETED CMD_DEBUG_LINES_COMPLETED}</li>
     * <li>{@link #CMD_DEBUG_LINES_OVERFLOW_FAILED CMD_DEBUG_LINES_OVERFLOW_FAILED}</li>
     * <li>{@link #CMD_DESIRED_STATE_RECEIVED_COMPLETED CMD_DESIRED_STATE_RECEIVED_COMPLETED}</li>
     * <li>{@link #CMD_STEP_FORWARD_SIMULATION_COMPLETED CMD_STEP_FORWARD_SIMULATION_COMPLETED}</li>
     * <li>{@link #CMD_RESET_SIMULATION_COMPLETED CMD_RESET_SIMULATION_COMPLETED}</li>
     * <li>{@link #CMD_CAMERA_IMAGE_COMPLETED CMD_CAMERA_IMAGE_COMPLETED}</li>
     * <li>{@link #CMD_CAMERA_IMAGE_FAILED CMD_CAMERA_IMAGE_FAILED}</li>
     * <li>{@link #CMD_BODY_INFO_COMPLETED CMD_BODY_INFO_COMPLETED}</li>
     * <li>{@link #CMD_BODY_INFO_FAILED CMD_BODY_INFO_FAILED}</li>
     * <li>{@link #CMD_INVALID_STATUS CMD_INVALID_STATUS}</li>
     * <li>{@link #CMD_CALCULATED_INVERSE_DYNAMICS_COMPLETED CMD_CALCULATED_INVERSE_DYNAMICS_COMPLETED}</li>
     * <li>{@link #CMD_CALCULATED_INVERSE_DYNAMICS_FAILED CMD_CALCULATED_INVERSE_DYNAMICS_FAILED}</li>
     * <li>{@link #CMD_CALCULATED_JACOBIAN_COMPLETED CMD_CALCULATED_JACOBIAN_COMPLETED}</li>
     * <li>{@link #CMD_CALCULATED_JACOBIAN_FAILED CMD_CALCULATED_JACOBIAN_FAILED}</li>
     * <li>{@link #CMD_CALCULATED_MASS_MATRIX_COMPLETED CMD_CALCULATED_MASS_MATRIX_COMPLETED}</li>
     * <li>{@link #CMD_CALCULATED_MASS_MATRIX_FAILED CMD_CALCULATED_MASS_MATRIX_FAILED}</li>
     * <li>{@link #CMD_CONTACT_POINT_INFORMATION_COMPLETED CMD_CONTACT_POINT_INFORMATION_COMPLETED}</li>
     * <li>{@link #CMD_CONTACT_POINT_INFORMATION_FAILED CMD_CONTACT_POINT_INFORMATION_FAILED}</li>
     * <li>{@link #CMD_REQUEST_AABB_OVERLAP_COMPLETED CMD_REQUEST_AABB_OVERLAP_COMPLETED}</li>
     * <li>{@link #CMD_REQUEST_AABB_OVERLAP_FAILED CMD_REQUEST_AABB_OVERLAP_FAILED}</li>
     * <li>{@link #CMD_CALCULATE_INVERSE_KINEMATICS_COMPLETED CMD_CALCULATE_INVERSE_KINEMATICS_COMPLETED}</li>
     * <li>{@link #CMD_CALCULATE_INVERSE_KINEMATICS_FAILED CMD_CALCULATE_INVERSE_KINEMATICS_FAILED}</li>
     * <li>{@link #CMD_SAVE_WORLD_COMPLETED CMD_SAVE_WORLD_COMPLETED}</li>
     * <li>{@link #CMD_SAVE_WORLD_FAILED CMD_SAVE_WORLD_FAILED}</li>
     * <li>{@link #CMD_VISUAL_SHAPE_INFO_COMPLETED CMD_VISUAL_SHAPE_INFO_COMPLETED}</li>
     * <li>{@link #CMD_VISUAL_SHAPE_INFO_FAILED CMD_VISUAL_SHAPE_INFO_FAILED}</li>
     * <li>{@link #CMD_VISUAL_SHAPE_UPDATE_COMPLETED CMD_VISUAL_SHAPE_UPDATE_COMPLETED}</li>
     * <li>{@link #CMD_VISUAL_SHAPE_UPDATE_FAILED CMD_VISUAL_SHAPE_UPDATE_FAILED}</li>
     * <li>{@link #CMD_LOAD_TEXTURE_COMPLETED CMD_LOAD_TEXTURE_COMPLETED}</li>
     * <li>{@link #CMD_LOAD_TEXTURE_FAILED CMD_LOAD_TEXTURE_FAILED}</li>
     * <li>{@link #CMD_USER_DEBUG_DRAW_COMPLETED CMD_USER_DEBUG_DRAW_COMPLETED}</li>
     * <li>{@link #CMD_USER_DEBUG_DRAW_PARAMETER_COMPLETED CMD_USER_DEBUG_DRAW_PARAMETER_COMPLETED}</li>
     * <li>{@link #CMD_USER_DEBUG_DRAW_FAILED CMD_USER_DEBUG_DRAW_FAILED}</li>
     * <li>{@link #CMD_USER_CONSTRAINT_COMPLETED CMD_USER_CONSTRAINT_COMPLETED}</li>
     * <li>{@link #CMD_USER_CONSTRAINT_INFO_COMPLETED CMD_USER_CONSTRAINT_INFO_COMPLETED}</li>
     * <li>{@link #CMD_USER_CONSTRAINT_REQUEST_STATE_COMPLETED CMD_USER_CONSTRAINT_REQUEST_STATE_COMPLETED}</li>
     * <li>{@link #CMD_REMOVE_USER_CONSTRAINT_COMPLETED CMD_REMOVE_USER_CONSTRAINT_COMPLETED}</li>
     * <li>{@link #CMD_CHANGE_USER_CONSTRAINT_COMPLETED CMD_CHANGE_USER_CONSTRAINT_COMPLETED}</li>
     * <li>{@link #CMD_REMOVE_USER_CONSTRAINT_FAILED CMD_REMOVE_USER_CONSTRAINT_FAILED}</li>
     * <li>{@link #CMD_CHANGE_USER_CONSTRAINT_FAILED CMD_CHANGE_USER_CONSTRAINT_FAILED}</li>
     * <li>{@link #CMD_USER_CONSTRAINT_FAILED CMD_USER_CONSTRAINT_FAILED}</li>
     * <li>{@link #CMD_REQUEST_VR_EVENTS_DATA_COMPLETED CMD_REQUEST_VR_EVENTS_DATA_COMPLETED}</li>
     * <li>{@link #CMD_REQUEST_RAY_CAST_INTERSECTIONS_COMPLETED CMD_REQUEST_RAY_CAST_INTERSECTIONS_COMPLETED}</li>
     * <li>{@link #CMD_SYNC_BODY_INFO_COMPLETED CMD_SYNC_BODY_INFO_COMPLETED}</li>
     * <li>{@link #CMD_SYNC_BODY_INFO_FAILED CMD_SYNC_BODY_INFO_FAILED}</li>
     * <li>{@link #CMD_STATE_LOGGING_COMPLETED CMD_STATE_LOGGING_COMPLETED}</li>
     * <li>{@link #CMD_STATE_LOGGING_START_COMPLETED CMD_STATE_LOGGING_START_COMPLETED}</li>
     * <li>{@link #CMD_STATE_LOGGING_FAILED CMD_STATE_LOGGING_FAILED}</li>
     * <li>{@link #CMD_REQUEST_KEYBOARD_EVENTS_DATA_COMPLETED CMD_REQUEST_KEYBOARD_EVENTS_DATA_COMPLETED}</li>
     * <li>{@link #CMD_REQUEST_KEYBOARD_EVENTS_DATA_FAILED CMD_REQUEST_KEYBOARD_EVENTS_DATA_FAILED}</li>
     * <li>{@link #CMD_REQUEST_OPENGL_VISUALIZER_CAMERA_FAILED CMD_REQUEST_OPENGL_VISUALIZER_CAMERA_FAILED}</li>
     * <li>{@link #CMD_REQUEST_OPENGL_VISUALIZER_CAMERA_COMPLETED CMD_REQUEST_OPENGL_VISUALIZER_CAMERA_COMPLETED}</li>
     * <li>{@link #CMD_REMOVE_BODY_COMPLETED CMD_REMOVE_BODY_COMPLETED}</li>
     * <li>{@link #CMD_REMOVE_BODY_FAILED CMD_REMOVE_BODY_FAILED}</li>
     * <li>{@link #CMD_GET_DYNAMICS_INFO_COMPLETED CMD_GET_DYNAMICS_INFO_COMPLETED}</li>
     * <li>{@link #CMD_GET_DYNAMICS_INFO_FAILED CMD_GET_DYNAMICS_INFO_FAILED}</li>
     * <li>{@link #CMD_CREATE_COLLISION_SHAPE_FAILED CMD_CREATE_COLLISION_SHAPE_FAILED}</li>
     * <li>{@link #CMD_CREATE_COLLISION_SHAPE_COMPLETED CMD_CREATE_COLLISION_SHAPE_COMPLETED}</li>
     * <li>{@link #CMD_CREATE_VISUAL_SHAPE_FAILED CMD_CREATE_VISUAL_SHAPE_FAILED}</li>
     * <li>{@link #CMD_CREATE_VISUAL_SHAPE_COMPLETED CMD_CREATE_VISUAL_SHAPE_COMPLETED}</li>
     * <li>{@link #CMD_CREATE_MULTI_BODY_FAILED CMD_CREATE_MULTI_BODY_FAILED}</li>
     * <li>{@link #CMD_CREATE_MULTI_BODY_COMPLETED CMD_CREATE_MULTI_BODY_COMPLETED}</li>
     * <li>{@link #CMD_REQUEST_COLLISION_INFO_COMPLETED CMD_REQUEST_COLLISION_INFO_COMPLETED}</li>
     * <li>{@link #CMD_REQUEST_COLLISION_INFO_FAILED CMD_REQUEST_COLLISION_INFO_FAILED}</li>
     * <li>{@link #CMD_REQUEST_MOUSE_EVENTS_DATA_COMPLETED CMD_REQUEST_MOUSE_EVENTS_DATA_COMPLETED}</li>
     * <li>{@link #CMD_CHANGE_TEXTURE_COMMAND_FAILED CMD_CHANGE_TEXTURE_COMMAND_FAILED}</li>
     * <li>{@link #CMD_CUSTOM_COMMAND_COMPLETED CMD_CUSTOM_COMMAND_COMPLETED}</li>
     * <li>{@link #CMD_CUSTOM_COMMAND_FAILED CMD_CUSTOM_COMMAND_FAILED}</li>
     * <li>{@link #CMD_REQUEST_PHYSICS_SIMULATION_PARAMETERS_COMPLETED CMD_REQUEST_PHYSICS_SIMULATION_PARAMETERS_COMPLETED}</li>
     * <li>{@link #CMD_SAVE_STATE_FAILED CMD_SAVE_STATE_FAILED}</li>
     * <li>{@link #CMD_SAVE_STATE_COMPLETED CMD_SAVE_STATE_COMPLETED}</li>
     * <li>{@link #CMD_RESTORE_STATE_FAILED CMD_RESTORE_STATE_FAILED}</li>
     * <li>{@link #CMD_RESTORE_STATE_COMPLETED CMD_RESTORE_STATE_COMPLETED}</li>
     * <li>{@link #CMD_COLLISION_SHAPE_INFO_COMPLETED CMD_COLLISION_SHAPE_INFO_COMPLETED}</li>
     * <li>{@link #CMD_COLLISION_SHAPE_INFO_FAILED CMD_COLLISION_SHAPE_INFO_FAILED}</li>
     * <li>{@link #CMD_LOAD_SOFT_BODY_FAILED CMD_LOAD_SOFT_BODY_FAILED}</li>
     * <li>{@link #CMD_LOAD_SOFT_BODY_COMPLETED CMD_LOAD_SOFT_BODY_COMPLETED}</li>
     * <li>{@link #CMD_SYNC_USER_DATA_COMPLETED CMD_SYNC_USER_DATA_COMPLETED}</li>
     * <li>{@link #CMD_SYNC_USER_DATA_FAILED CMD_SYNC_USER_DATA_FAILED}</li>
     * <li>{@link #CMD_REQUEST_USER_DATA_COMPLETED CMD_REQUEST_USER_DATA_COMPLETED}</li>
     * <li>{@link #CMD_REQUEST_USER_DATA_FAILED CMD_REQUEST_USER_DATA_FAILED}</li>
     * <li>{@link #CMD_ADD_USER_DATA_COMPLETED CMD_ADD_USER_DATA_COMPLETED}</li>
     * <li>{@link #CMD_ADD_USER_DATA_FAILED CMD_ADD_USER_DATA_FAILED}</li>
     * <li>{@link #CMD_REMOVE_USER_DATA_COMPLETED CMD_REMOVE_USER_DATA_COMPLETED}</li>
     * <li>{@link #CMD_REMOVE_USER_DATA_FAILED CMD_REMOVE_USER_DATA_FAILED}</li>
     * </ul>
     */
    public static final int
        CMD_SHARED_MEMORY_NOT_INITIALIZED                   = 0,
        CMD_WAITING_FOR_CLIENT_COMMAND                      = 1,
        CMD_CLIENT_COMMAND_COMPLETED                        = 2,
        CMD_UNKNOWN_COMMAND_FLUSHED                         = 3,
        CMD_SDF_LOADING_COMPLETED                           = 4,
        CMD_SDF_LOADING_FAILED                              = 5,
        CMD_URDF_LOADING_COMPLETED                          = 6,
        CMD_URDF_LOADING_FAILED                             = 7,
        CMD_BULLET_LOADING_COMPLETED                        = 8,
        CMD_BULLET_LOADING_FAILED                           = 9,
        CMD_BULLET_SAVING_COMPLETED                         = 10,
        CMD_BULLET_SAVING_FAILED                            = 11,
        CMD_MJCF_LOADING_COMPLETED                          = 12,
        CMD_MJCF_LOADING_FAILED                             = 13,
        CMD_REQUEST_INTERNAL_DATA_COMPLETED                 = 14,
        CMD_REQUEST_INTERNAL_DATA_FAILED                    = 15,
        CMD_BULLET_DATA_STREAM_RECEIVED_COMPLETED           = 16,
        CMD_BULLET_DATA_STREAM_RECEIVED_FAILED              = 17,
        CMD_BOX_COLLISION_SHAPE_CREATION_COMPLETED          = 18,
        CMD_RIGID_BODY_CREATION_COMPLETED                   = 19,
        CMD_SET_JOINT_FEEDBACK_COMPLETED                    = 20,
        CMD_ACTUAL_STATE_UPDATE_COMPLETED                   = 21,
        CMD_ACTUAL_STATE_UPDATE_FAILED                      = 22,
        CMD_DEBUG_LINES_COMPLETED                           = 23,
        CMD_DEBUG_LINES_OVERFLOW_FAILED                     = 24,
        CMD_DESIRED_STATE_RECEIVED_COMPLETED                = 25,
        CMD_STEP_FORWARD_SIMULATION_COMPLETED               = 26,
        CMD_RESET_SIMULATION_COMPLETED                      = 27,
        CMD_CAMERA_IMAGE_COMPLETED                          = 28,
        CMD_CAMERA_IMAGE_FAILED                             = 29,
        CMD_BODY_INFO_COMPLETED                             = 30,
        CMD_BODY_INFO_FAILED                                = 31,
        CMD_INVALID_STATUS                                  = 32,
        CMD_CALCULATED_INVERSE_DYNAMICS_COMPLETED           = 33,
        CMD_CALCULATED_INVERSE_DYNAMICS_FAILED              = 34,
        CMD_CALCULATED_JACOBIAN_COMPLETED                   = 35,
        CMD_CALCULATED_JACOBIAN_FAILED                      = 36,
        CMD_CALCULATED_MASS_MATRIX_COMPLETED                = 37,
        CMD_CALCULATED_MASS_MATRIX_FAILED                   = 38,
        CMD_CONTACT_POINT_INFORMATION_COMPLETED             = 39,
        CMD_CONTACT_POINT_INFORMATION_FAILED                = 40,
        CMD_REQUEST_AABB_OVERLAP_COMPLETED                  = 41,
        CMD_REQUEST_AABB_OVERLAP_FAILED                     = 42,
        CMD_CALCULATE_INVERSE_KINEMATICS_COMPLETED          = 43,
        CMD_CALCULATE_INVERSE_KINEMATICS_FAILED             = 44,
        CMD_SAVE_WORLD_COMPLETED                            = 45,
        CMD_SAVE_WORLD_FAILED                               = 46,
        CMD_VISUAL_SHAPE_INFO_COMPLETED                     = 47,
        CMD_VISUAL_SHAPE_INFO_FAILED                        = 48,
        CMD_VISUAL_SHAPE_UPDATE_COMPLETED                   = 49,
        CMD_VISUAL_SHAPE_UPDATE_FAILED                      = 50,
        CMD_LOAD_TEXTURE_COMPLETED                          = 51,
        CMD_LOAD_TEXTURE_FAILED                             = 52,
        CMD_USER_DEBUG_DRAW_COMPLETED                       = 53,
        CMD_USER_DEBUG_DRAW_PARAMETER_COMPLETED             = 54,
        CMD_USER_DEBUG_DRAW_FAILED                          = 55,
        CMD_USER_CONSTRAINT_COMPLETED                       = 56,
        CMD_USER_CONSTRAINT_INFO_COMPLETED                  = 57,
        CMD_USER_CONSTRAINT_REQUEST_STATE_COMPLETED         = 58,
        CMD_REMOVE_USER_CONSTRAINT_COMPLETED                = 59,
        CMD_CHANGE_USER_CONSTRAINT_COMPLETED                = 60,
        CMD_REMOVE_USER_CONSTRAINT_FAILED                   = 61,
        CMD_CHANGE_USER_CONSTRAINT_FAILED                   = 62,
        CMD_USER_CONSTRAINT_FAILED                          = 63,
        CMD_REQUEST_VR_EVENTS_DATA_COMPLETED                = 64,
        CMD_REQUEST_RAY_CAST_INTERSECTIONS_COMPLETED        = 65,
        CMD_SYNC_BODY_INFO_COMPLETED                        = 66,
        CMD_SYNC_BODY_INFO_FAILED                           = 67,
        CMD_STATE_LOGGING_COMPLETED                         = 68,
        CMD_STATE_LOGGING_START_COMPLETED                   = 69,
        CMD_STATE_LOGGING_FAILED                            = 70,
        CMD_REQUEST_KEYBOARD_EVENTS_DATA_COMPLETED          = 71,
        CMD_REQUEST_KEYBOARD_EVENTS_DATA_FAILED             = 72,
        CMD_REQUEST_OPENGL_VISUALIZER_CAMERA_FAILED         = 73,
        CMD_REQUEST_OPENGL_VISUALIZER_CAMERA_COMPLETED      = 74,
        CMD_REMOVE_BODY_COMPLETED                           = 75,
        CMD_REMOVE_BODY_FAILED                              = 76,
        CMD_GET_DYNAMICS_INFO_COMPLETED                     = 77,
        CMD_GET_DYNAMICS_INFO_FAILED                        = 78,
        CMD_CREATE_COLLISION_SHAPE_FAILED                   = 79,
        CMD_CREATE_COLLISION_SHAPE_COMPLETED                = 80,
        CMD_CREATE_VISUAL_SHAPE_FAILED                      = 81,
        CMD_CREATE_VISUAL_SHAPE_COMPLETED                   = 82,
        CMD_CREATE_MULTI_BODY_FAILED                        = 83,
        CMD_CREATE_MULTI_BODY_COMPLETED                     = 84,
        CMD_REQUEST_COLLISION_INFO_COMPLETED                = 85,
        CMD_REQUEST_COLLISION_INFO_FAILED                   = 86,
        CMD_REQUEST_MOUSE_EVENTS_DATA_COMPLETED             = 87,
        CMD_CHANGE_TEXTURE_COMMAND_FAILED                   = 88,
        CMD_CUSTOM_COMMAND_COMPLETED                        = 89,
        CMD_CUSTOM_COMMAND_FAILED                           = 90,
        CMD_REQUEST_PHYSICS_SIMULATION_PARAMETERS_COMPLETED = 91,
        CMD_SAVE_STATE_FAILED                               = 92,
        CMD_SAVE_STATE_COMPLETED                            = 93,
        CMD_RESTORE_STATE_FAILED                            = 94,
        CMD_RESTORE_STATE_COMPLETED                         = 95,
        CMD_COLLISION_SHAPE_INFO_COMPLETED                  = 96,
        CMD_COLLISION_SHAPE_INFO_FAILED                     = 97,
        CMD_LOAD_SOFT_BODY_FAILED                           = 98,
        CMD_LOAD_SOFT_BODY_COMPLETED                        = 99,
        CMD_SYNC_USER_DATA_COMPLETED                        = 100,
        CMD_SYNC_USER_DATA_FAILED                           = 101,
        CMD_REQUEST_USER_DATA_COMPLETED                     = 102,
        CMD_REQUEST_USER_DATA_FAILED                        = 103,
        CMD_ADD_USER_DATA_COMPLETED                         = 104,
        CMD_ADD_USER_DATA_FAILED                            = 105,
        CMD_REMOVE_USER_DATA_COMPLETED                      = 106,
        CMD_REMOVE_USER_DATA_FAILED                         = 107;

    /** {@code enum JointInfoFlags} */
    public static final int JOINT_HAS_MOTORIZED_POWER = 1;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #COLLISION_SHAPE_TYPE_BOX COLLISION_SHAPE_TYPE_BOX}</li>
     * <li>{@link #COLLISION_SHAPE_TYPE_CYLINDER_X COLLISION_SHAPE_TYPE_CYLINDER_X}</li>
     * <li>{@link #COLLISION_SHAPE_TYPE_CYLINDER_Y COLLISION_SHAPE_TYPE_CYLINDER_Y}</li>
     * <li>{@link #COLLISION_SHAPE_TYPE_CYLINDER_Z COLLISION_SHAPE_TYPE_CYLINDER_Z}</li>
     * <li>{@link #COLLISION_SHAPE_TYPE_CAPSULE_X COLLISION_SHAPE_TYPE_CAPSULE_X}</li>
     * <li>{@link #COLLISION_SHAPE_TYPE_CAPSULE_Y COLLISION_SHAPE_TYPE_CAPSULE_Y}</li>
     * <li>{@link #COLLISION_SHAPE_TYPE_CAPSULE_Z COLLISION_SHAPE_TYPE_CAPSULE_Z}</li>
     * <li>{@link #COLLISION_SHAPE_TYPE_SPHERE COLLISION_SHAPE_TYPE_SPHERE}</li>
     * </ul>
     */
    public static final int
        COLLISION_SHAPE_TYPE_BOX        = 1,
        COLLISION_SHAPE_TYPE_CYLINDER_X = 2,
        COLLISION_SHAPE_TYPE_CYLINDER_Y = 3,
        COLLISION_SHAPE_TYPE_CYLINDER_Z = 4,
        COLLISION_SHAPE_TYPE_CAPSULE_X  = 5,
        COLLISION_SHAPE_TYPE_CAPSULE_Y  = 6,
        COLLISION_SHAPE_TYPE_CAPSULE_Z  = 7,
        COLLISION_SHAPE_TYPE_SPHERE     = 8;

    /**
     * {@code enum JointType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #eRevoluteType eRevoluteType}</li>
     * <li>{@link #ePrismaticType ePrismaticType}</li>
     * <li>{@link #eSphericalType eSphericalType}</li>
     * <li>{@link #ePlanarType ePlanarType}</li>
     * <li>{@link #eFixedType eFixedType}</li>
     * <li>{@link #ePoint2PointType ePoint2PointType}</li>
     * <li>{@link #eGearType eGearType}</li>
     * </ul>
     */
    public static final int
        eRevoluteType    = 0,
        ePrismaticType   = 1,
        eSphericalType   = 2,
        ePlanarType      = 3,
        eFixedType       = 4,
        ePoint2PointType = 5,
        eGearType        = 6;

    /**
     * {@code enum b3JointInfoFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #eJointChangeMaxForce eJointChangeMaxForce}</li>
     * <li>{@link #eJointChangeChildFramePosition eJointChangeChildFramePosition}</li>
     * <li>{@link #eJointChangeChildFrameOrientation eJointChangeChildFrameOrientation}</li>
     * </ul>
     */
    public static final int
        eJointChangeMaxForce              = 1,
        eJointChangeChildFramePosition    = 2,
        eJointChangeChildFrameOrientation = 4;

    /**
     * {@code enum UserDataValueType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #USER_DATA_VALUE_TYPE_BYTES USER_DATA_VALUE_TYPE_BYTES} - Data represents generic byte array.</li>
     * <li>{@link #USER_DATA_VALUE_TYPE_STRING USER_DATA_VALUE_TYPE_STRING} - Data represents C-string</li>
     * </ul>
     */
    public static final int
        USER_DATA_VALUE_TYPE_BYTES  = 0,
        USER_DATA_VALUE_TYPE_STRING = 1;

    /**
     * {@code enum DynamicsActivationState}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #eActivationStateEnableSleeping eActivationStateEnableSleeping}</li>
     * <li>{@link #eActivationStateDisableSleeping eActivationStateDisableSleeping}</li>
     * <li>{@link #eActivationStateWakeUp eActivationStateWakeUp}</li>
     * <li>{@link #eActivationStateSleep eActivationStateSleep}</li>
     * </ul>
     */
    public static final int
        eActivationStateEnableSleeping  = 1,
        eActivationStateDisableSleeping = 2,
        eActivationStateWakeUp          = 4,
        eActivationStateSleep           = 8;

    /** {@code enum SensorType} */
    public static final int eSensorForceTorqueType = 1;

    /**
     * {@code enum b3VREventType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VR_CONTROLLER_MOVE_EVENT VR_CONTROLLER_MOVE_EVENT}</li>
     * <li>{@link #VR_CONTROLLER_BUTTON_EVENT VR_CONTROLLER_BUTTON_EVENT}</li>
     * <li>{@link #VR_HMD_MOVE_EVENT VR_HMD_MOVE_EVENT}</li>
     * <li>{@link #VR_GENERIC_TRACKER_MOVE_EVENT VR_GENERIC_TRACKER_MOVE_EVENT}</li>
     * </ul>
     */
    public static final int
        VR_CONTROLLER_MOVE_EVENT      = 1,
        VR_CONTROLLER_BUTTON_EVENT    = 2,
        VR_HMD_MOVE_EVENT             = 4,
        VR_GENERIC_TRACKER_MOVE_EVENT = 8;

    public static final int
        MAX_VR_ANALOG_AXIS  = 5,
        MAX_VR_BUTTONS      = 64,
        MAX_VR_CONTROLLERS  = 8,
        MAX_KEYBOARD_EVENTS = 256,
        MAX_MOUSE_EVENTS    = 256,
        MAX_SDF_BODIES      = 512;

    /**
     * {@code enum b3VRButtonInfo}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #eButtonIsDown eButtonIsDown}</li>
     * <li>{@link #eButtonTriggered eButtonTriggered}</li>
     * <li>{@link #eButtonReleased eButtonReleased}</li>
     * </ul>
     */
    public static final int
        eButtonIsDown    = 1,
        eButtonTriggered = 2,
        eButtonReleased  = 4;

    /**
     * {@code enum eVRDeviceTypeEnums}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VR_DEVICE_CONTROLLER VR_DEVICE_CONTROLLER}</li>
     * <li>{@link #VR_DEVICE_HMD VR_DEVICE_HMD}</li>
     * <li>{@link #VR_DEVICE_GENERIC_TRACKER VR_DEVICE_GENERIC_TRACKER}</li>
     * </ul>
     */
    public static final int
        VR_DEVICE_CONTROLLER      = 1,
        VR_DEVICE_HMD             = 2,
        VR_DEVICE_GENERIC_TRACKER = 4;

    /** {@code enum EVRCameraFlags} */
    public static final int VR_CAMERA_TRACK_OBJECT_ORIENTATION = 1;

    /**
     * {@code enum eMouseEventTypeEnums}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MOUSE_MOVE_EVENT MOUSE_MOVE_EVENT}</li>
     * <li>{@link #MOUSE_BUTTON_EVENT MOUSE_BUTTON_EVENT}</li>
     * </ul>
     */
    public static final int
        MOUSE_MOVE_EVENT   = 1,
        MOUSE_BUTTON_EVENT = 2;

    /**
     * {@code enum b3NotificationType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SIMULATION_RESET SIMULATION_RESET}</li>
     * <li>{@link #BODY_ADDED BODY_ADDED}</li>
     * <li>{@link #BODY_REMOVED BODY_REMOVED}</li>
     * <li>{@link #USER_DATA_ADDED USER_DATA_ADDED}</li>
     * <li>{@link #USER_DATA_REMOVED USER_DATA_REMOVED}</li>
     * <li>{@link #LINK_DYNAMICS_CHANGED LINK_DYNAMICS_CHANGED}</li>
     * <li>{@link #VISUAL_SHAPE_CHANGED VISUAL_SHAPE_CHANGED}</li>
     * <li>{@link #TRANSFORM_CHANGED TRANSFORM_CHANGED}</li>
     * <li>{@link #SIMULATION_STEPPED SIMULATION_STEPPED}</li>
     * </ul>
     */
    public static final int
        SIMULATION_RESET      = 0,
        BODY_ADDED            = 1,
        BODY_REMOVED          = 2,
        USER_DATA_ADDED       = 3,
        USER_DATA_REMOVED     = 4,
        LINK_DYNAMICS_CHANGED = 5,
        VISUAL_SHAPE_CHANGED  = 6,
        TRANSFORM_CHANGED     = 7,
        SIMULATION_STEPPED    = 8;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CONTACT_QUERY_MODE_REPORT_EXISTING_CONTACT_POINTS CONTACT_QUERY_MODE_REPORT_EXISTING_CONTACT_POINTS}</li>
     * <li>{@link #CONTACT_QUERY_MODE_COMPUTE_CLOSEST_POINTS CONTACT_QUERY_MODE_COMPUTE_CLOSEST_POINTS}</li>
     * </ul>
     */
    public static final int
        CONTACT_QUERY_MODE_REPORT_EXISTING_CONTACT_POINTS = 0,
        CONTACT_QUERY_MODE_COMPUTE_CLOSEST_POINTS         = 1;

    /**
     * {@code enum b3StateLoggingType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STATE_LOGGING_MINITAUR STATE_LOGGING_MINITAUR}</li>
     * <li>{@link #STATE_LOGGING_GENERIC_ROBOT STATE_LOGGING_GENERIC_ROBOT}</li>
     * <li>{@link #STATE_LOGGING_VR_CONTROLLERS STATE_LOGGING_VR_CONTROLLERS}</li>
     * <li>{@link #STATE_LOGGING_VIDEO_MP4 STATE_LOGGING_VIDEO_MP4}</li>
     * <li>{@link #STATE_LOGGING_COMMANDS STATE_LOGGING_COMMANDS}</li>
     * <li>{@link #STATE_LOGGING_CONTACT_POINTS STATE_LOGGING_CONTACT_POINTS}</li>
     * <li>{@link #STATE_LOGGING_PROFILE_TIMINGS STATE_LOGGING_PROFILE_TIMINGS}</li>
     * <li>{@link #STATE_LOGGING_ALL_COMMANDS STATE_LOGGING_ALL_COMMANDS}</li>
     * <li>{@link #STATE_REPLAY_ALL_COMMANDS STATE_REPLAY_ALL_COMMANDS}</li>
     * <li>{@link #STATE_LOGGING_CUSTOM_TIMER STATE_LOGGING_CUSTOM_TIMER}</li>
     * </ul>
     */
    public static final int
        STATE_LOGGING_MINITAUR        = 0,
        STATE_LOGGING_GENERIC_ROBOT   = 1,
        STATE_LOGGING_VR_CONTROLLERS  = 2,
        STATE_LOGGING_VIDEO_MP4       = 3,
        STATE_LOGGING_COMMANDS        = 4,
        STATE_LOGGING_CONTACT_POINTS  = 5,
        STATE_LOGGING_PROFILE_TIMINGS = 6,
        STATE_LOGGING_ALL_COMMANDS    = 7,
        STATE_REPLAY_ALL_COMMANDS     = 8,
        STATE_LOGGING_CUSTOM_TIMER    = 9;

    public static final int
        MAX_RAY_INTERSECTION_BATCH_SIZE           = 256,
        MAX_RAY_INTERSECTION_BATCH_SIZE_STREAMING = Platform.get() == Platform.MACOSX ? (4 * 1024) : (16 * 1024),
        MAX_RAY_HITS                              = MAX_RAY_INTERSECTION_BATCH_SIZE,
        VISUAL_SHAPE_MAX_PATH_LEN                 = 1024;

    /** {@code enum b3VisualShapeDataFlags} */
    public static final int eVISUAL_SHAPE_DATA_TEXTURE_UNIQUE_IDS = 1;

    /**
     * {@code enum eLinkStateFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ACTUAL_STATE_COMPUTE_LINKVELOCITY ACTUAL_STATE_COMPUTE_LINKVELOCITY}</li>
     * <li>{@link #ACTUAL_STATE_COMPUTE_FORWARD_KINEMATICS ACTUAL_STATE_COMPUTE_FORWARD_KINEMATICS}</li>
     * </ul>
     */
    public static final int
        ACTUAL_STATE_COMPUTE_LINKVELOCITY       = 1,
        ACTUAL_STATE_COMPUTE_FORWARD_KINEMATICS = 2;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CONTROL_MODE_VELOCITY CONTROL_MODE_VELOCITY}</li>
     * <li>{@link #CONTROL_MODE_TORQUE CONTROL_MODE_TORQUE}</li>
     * <li>{@link #CONTROL_MODE_POSITION_VELOCITY_PD CONTROL_MODE_POSITION_VELOCITY_PD}</li>
     * <li>{@link #CONTROL_MODE_PD CONTROL_MODE_PD} - The standard PD control implemented as soft constraint.</li>
     * </ul>
     */
    public static final int
        CONTROL_MODE_VELOCITY             = 0,
        CONTROL_MODE_TORQUE               = 1,
        CONTROL_MODE_POSITION_VELOCITY_PD = 2,
        CONTROL_MODE_PD                   = 3;

    /**
     * Flags for {@link #b3ApplyExternalTorque ApplyExternalTorque} and {@link #b3ApplyExternalForce ApplyExternalForce}. {@code enum EnumExternalForceFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EF_LINK_FRAME EF_LINK_FRAME}</li>
     * <li>{@link #EF_WORLD_FRAME EF_WORLD_FRAME}</li>
     * </ul>
     */
    public static final int
        EF_LINK_FRAME  = 1,
        EF_WORLD_FRAME = 2;

    /**
     * Flags to pick the renderer for synthetic camera. {@code enum EnumRenderer}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ER_TINY_RENDERER ER_TINY_RENDERER}</li>
     * <li>{@link #ER_BULLET_HARDWARE_OPENGL ER_BULLET_HARDWARE_OPENGL}</li>
     * </ul>
     */
    public static final int
        ER_TINY_RENDERER          = (1 << 16),
        ER_BULLET_HARDWARE_OPENGL = (1 << 17);

    /**
     * {@code enum EnumRendererAuxFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ER_SEGMENTATION_MASK_OBJECT_AND_LINKINDEX ER_SEGMENTATION_MASK_OBJECT_AND_LINKINDEX}</li>
     * <li>{@link #ER_USE_PROJECTIVE_TEXTURE ER_USE_PROJECTIVE_TEXTURE}</li>
     * <li>{@link #ER_NO_SEGMENTATION_MASK ER_NO_SEGMENTATION_MASK}</li>
     * </ul>
     */
    public static final int
        ER_SEGMENTATION_MASK_OBJECT_AND_LINKINDEX = 1,
        ER_USE_PROJECTIVE_TEXTURE                 = 2,
        ER_NO_SEGMENTATION_MASK                   = 4;

    /**
     * Flags to pick the IK solver and other options. {@code enum EnumCalculateInverseKinematicsFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IK_DLS IK_DLS}</li>
     * <li>{@link #IK_SDLS IK_SDLS}</li>
     * <li>{@link #IK_HAS_TARGET_POSITION IK_HAS_TARGET_POSITION}</li>
     * <li>{@link #IK_HAS_TARGET_ORIENTATION IK_HAS_TARGET_ORIENTATION}</li>
     * <li>{@link #IK_HAS_NULL_SPACE_VELOCITY IK_HAS_NULL_SPACE_VELOCITY}</li>
     * <li>{@link #IK_HAS_JOINT_DAMPING IK_HAS_JOINT_DAMPING}</li>
     * <li>{@link #IK_HAS_CURRENT_JOINT_POSITIONS IK_HAS_CURRENT_JOINT_POSITIONS}</li>
     * <li>{@link #IK_HAS_MAX_ITERATIONS IK_HAS_MAX_ITERATIONS}</li>
     * <li>{@link #IK_HAS_RESIDUAL_THRESHOLD IK_HAS_RESIDUAL_THRESHOLD}</li>
     * </ul>
     */
    public static final int
        IK_DLS                         = 0,
        IK_SDLS                        = 1,
        IK_HAS_TARGET_POSITION         = 16,
        IK_HAS_TARGET_ORIENTATION      = 32,
        IK_HAS_NULL_SPACE_VELOCITY     = 64,
        IK_HAS_JOINT_DAMPING           = 128,
        IK_HAS_CURRENT_JOINT_POSITIONS = 256,
        IK_HAS_MAX_ITERATIONS          = 512,
        IK_HAS_RESIDUAL_THRESHOLD      = 1024;

    /**
     * {@code enum b3ConfigureDebugVisualizerEnum}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #COV_ENABLE_GUI COV_ENABLE_GUI}</li>
     * <li>{@link #COV_ENABLE_SHADOWS COV_ENABLE_SHADOWS}</li>
     * <li>{@link #COV_ENABLE_WIREFRAME COV_ENABLE_WIREFRAME}</li>
     * <li>{@link #COV_ENABLE_VR_TELEPORTING COV_ENABLE_VR_TELEPORTING}</li>
     * <li>{@link #COV_ENABLE_VR_PICKING COV_ENABLE_VR_PICKING}</li>
     * <li>{@link #COV_ENABLE_VR_RENDER_CONTROLLERS COV_ENABLE_VR_RENDER_CONTROLLERS}</li>
     * <li>{@link #COV_ENABLE_RENDERING COV_ENABLE_RENDERING}</li>
     * <li>{@link #COV_ENABLE_SYNC_RENDERING_INTERNAL COV_ENABLE_SYNC_RENDERING_INTERNAL}</li>
     * <li>{@link #COV_ENABLE_KEYBOARD_SHORTCUTS COV_ENABLE_KEYBOARD_SHORTCUTS}</li>
     * <li>{@link #COV_ENABLE_MOUSE_PICKING COV_ENABLE_MOUSE_PICKING}</li>
     * <li>{@link #COV_ENABLE_Y_AXIS_UP COV_ENABLE_Y_AXIS_UP}</li>
     * <li>{@link #COV_ENABLE_TINY_RENDERER COV_ENABLE_TINY_RENDERER}</li>
     * <li>{@link #COV_ENABLE_RGB_BUFFER_PREVIEW COV_ENABLE_RGB_BUFFER_PREVIEW}</li>
     * <li>{@link #COV_ENABLE_DEPTH_BUFFER_PREVIEW COV_ENABLE_DEPTH_BUFFER_PREVIEW}</li>
     * <li>{@link #COV_ENABLE_SEGMENTATION_MARK_PREVIEW COV_ENABLE_SEGMENTATION_MARK_PREVIEW}</li>
     * <li>{@link #COV_ENABLE_PLANAR_REFLECTION COV_ENABLE_PLANAR_REFLECTION}</li>
     * <li>{@link #COV_ENABLE_SINGLE_STEP_RENDERING COV_ENABLE_SINGLE_STEP_RENDERING}</li>
     * </ul>
     */
    public static final int
        COV_ENABLE_GUI                       = 1,
        COV_ENABLE_SHADOWS                   = 2,
        COV_ENABLE_WIREFRAME                 = 3,
        COV_ENABLE_VR_TELEPORTING            = 4,
        COV_ENABLE_VR_PICKING                = 5,
        COV_ENABLE_VR_RENDER_CONTROLLERS     = 6,
        COV_ENABLE_RENDERING                 = 7,
        COV_ENABLE_SYNC_RENDERING_INTERNAL   = 8,
        COV_ENABLE_KEYBOARD_SHORTCUTS        = 9,
        COV_ENABLE_MOUSE_PICKING             = 10,
        COV_ENABLE_Y_AXIS_UP                 = 11,
        COV_ENABLE_TINY_RENDERER             = 12,
        COV_ENABLE_RGB_BUFFER_PREVIEW        = 13,
        COV_ENABLE_DEPTH_BUFFER_PREVIEW      = 14,
        COV_ENABLE_SEGMENTATION_MARK_PREVIEW = 15,
        COV_ENABLE_PLANAR_REFLECTION         = 16,
        COV_ENABLE_SINGLE_STEP_RENDERING     = 17;

    /**
     * {@code enum b3AddUserDebugItemEnum}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #DEB_DEBUG_TEXT_ALWAYS_FACE_CAMERA DEB_DEBUG_TEXT_ALWAYS_FACE_CAMERA}</li>
     * <li>{@link #DEB_DEBUG_TEXT_USE_TRUE_TYPE_FONTS DEB_DEBUG_TEXT_USE_TRUE_TYPE_FONTS}</li>
     * <li>{@link #DEB_DEBUG_TEXT_HAS_TRACKING_OBJECT DEB_DEBUG_TEXT_HAS_TRACKING_OBJECT}</li>
     * </ul>
     */
    public static final int
        DEB_DEBUG_TEXT_ALWAYS_FACE_CAMERA  = 1,
        DEB_DEBUG_TEXT_USE_TRUE_TYPE_FONTS = 2,
        DEB_DEBUG_TEXT_HAS_TRACKING_OBJECT = 4;

    /**
     * {@code enum eCONNECT_METHOD}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #eCONNECT_GUI eCONNECT_GUI}</li>
     * <li>{@link #eCONNECT_DIRECT eCONNECT_DIRECT}</li>
     * <li>{@link #eCONNECT_SHARED_MEMORY eCONNECT_SHARED_MEMORY}</li>
     * <li>{@link #eCONNECT_UDP eCONNECT_UDP}</li>
     * <li>{@link #eCONNECT_TCP eCONNECT_TCP}</li>
     * <li>{@link #eCONNECT_EXISTING_EXAMPLE_BROWSER eCONNECT_EXISTING_EXAMPLE_BROWSER}</li>
     * <li>{@link #eCONNECT_GUI_SERVER eCONNECT_GUI_SERVER}</li>
     * <li>{@link #eCONNECT_GUI_MAIN_THREAD eCONNECT_GUI_MAIN_THREAD}</li>
     * <li>{@link #eCONNECT_SHARED_MEMORY_SERVER eCONNECT_SHARED_MEMORY_SERVER}</li>
     * <li>{@link #eCONNECT_DART eCONNECT_DART}</li>
     * <li>{@link #eCONNECT_MUJOCO eCONNECT_MUJOCO}</li>
     * <li>{@link #eCONNECT_GRPC eCONNECT_GRPC}</li>
     * </ul>
     */
    public static final int
        eCONNECT_GUI                      = 1,
        eCONNECT_DIRECT                   = 2,
        eCONNECT_SHARED_MEMORY            = 3,
        eCONNECT_UDP                      = 4,
        eCONNECT_TCP                      = 5,
        eCONNECT_EXISTING_EXAMPLE_BROWSER = 6,
        eCONNECT_GUI_SERVER               = 7,
        eCONNECT_GUI_MAIN_THREAD          = 8,
        eCONNECT_SHARED_MEMORY_SERVER     = 9,
        eCONNECT_DART                     = 10,
        eCONNECT_MUJOCO                   = 11,
        eCONNECT_GRPC                     = 12;

    /**
     * {@code enum eURDF_Flags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #URDF_USE_INERTIA_FROM_FILE URDF_USE_INERTIA_FROM_FILE}</li>
     * <li>{@link #URDF_USE_SELF_COLLISION URDF_USE_SELF_COLLISION}</li>
     * <li>{@link #URDF_USE_SELF_COLLISION_EXCLUDE_PARENT URDF_USE_SELF_COLLISION_EXCLUDE_PARENT}</li>
     * <li>{@link #URDF_USE_SELF_COLLISION_EXCLUDE_ALL_PARENTS URDF_USE_SELF_COLLISION_EXCLUDE_ALL_PARENTS}</li>
     * <li>{@link #URDF_RESERVED URDF_RESERVED}</li>
     * <li>{@link #URDF_USE_IMPLICIT_CYLINDER URDF_USE_IMPLICIT_CYLINDER}</li>
     * <li>{@link #URDF_GLOBAL_VELOCITIES_MB URDF_GLOBAL_VELOCITIES_MB}</li>
     * <li>{@link #MJCF_COLORS_FROM_FILE MJCF_COLORS_FROM_FILE}</li>
     * <li>{@link #URDF_ENABLE_CACHED_GRAPHICS_SHAPES URDF_ENABLE_CACHED_GRAPHICS_SHAPES}</li>
     * <li>{@link #URDF_ENABLE_SLEEPING URDF_ENABLE_SLEEPING}</li>
     * <li>{@link #URDF_INITIALIZE_SAT_FEATURES URDF_INITIALIZE_SAT_FEATURES}</li>
     * <li>{@link #URDF_USE_SELF_COLLISION_INCLUDE_PARENT URDF_USE_SELF_COLLISION_INCLUDE_PARENT}</li>
     * <li>{@link #URDF_PARSE_SENSORS URDF_PARSE_SENSORS}</li>
     * <li>{@link #URDF_USE_MATERIAL_COLORS_FROM_MTL URDF_USE_MATERIAL_COLORS_FROM_MTL}</li>
     * <li>{@link #URDF_USE_MATERIAL_TRANSPARANCY_FROM_MTL URDF_USE_MATERIAL_TRANSPARANCY_FROM_MTL}</li>
     * </ul>
     */
    public static final int
        URDF_USE_INERTIA_FROM_FILE                  = 2,
        URDF_USE_SELF_COLLISION                     = 8,
        URDF_USE_SELF_COLLISION_EXCLUDE_PARENT      = 16,
        URDF_USE_SELF_COLLISION_EXCLUDE_ALL_PARENTS = 32,
        URDF_RESERVED                               = 64,
        URDF_USE_IMPLICIT_CYLINDER                  = 128,
        URDF_GLOBAL_VELOCITIES_MB                   = 256,
        MJCF_COLORS_FROM_FILE                       = 512,
        URDF_ENABLE_CACHED_GRAPHICS_SHAPES          = 1024,
        URDF_ENABLE_SLEEPING                        = 2048,
        URDF_INITIALIZE_SAT_FEATURES                = 4096,
        URDF_USE_SELF_COLLISION_INCLUDE_PARENT      = 8192,
        URDF_PARSE_SENSORS                          = 16384,
        URDF_USE_MATERIAL_COLORS_FROM_MTL           = 32768,
        URDF_USE_MATERIAL_TRANSPARANCY_FROM_MTL     = 65536;

    /**
     * {@code enum eUrdfGeomTypes}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #GEOM_SPHERE GEOM_SPHERE}</li>
     * <li>{@link #GEOM_BOX GEOM_BOX}</li>
     * <li>{@link #GEOM_CYLINDER GEOM_CYLINDER}</li>
     * <li>{@link #GEOM_MESH GEOM_MESH}</li>
     * <li>{@link #GEOM_PLANE GEOM_PLANE}</li>
     * <li>{@link #GEOM_CAPSULE GEOM_CAPSULE}</li>
     * <li>{@link #GEOM_UNKNOWN GEOM_UNKNOWN}</li>
     * </ul>
     */
    public static final int
        GEOM_SPHERE   = 2,
        GEOM_BOX      = 3,
        GEOM_CYLINDER = 4,
        GEOM_MESH     = 5,
        GEOM_PLANE    = 6,
        GEOM_CAPSULE  = 7,
        GEOM_UNKNOWN  = 8;

    /**
     * {@code enum eUrdfCollisionFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #GEOM_FORCE_CONCAVE_TRIMESH GEOM_FORCE_CONCAVE_TRIMESH}</li>
     * <li>{@link #GEOM_CONCAVE_INTERNAL_EDGE GEOM_CONCAVE_INTERNAL_EDGE}</li>
     * </ul>
     */
    public static final int
        GEOM_FORCE_CONCAVE_TRIMESH = 1,
        GEOM_CONCAVE_INTERNAL_EDGE = 2;

    /**
     * {@code enum eUrdfVisualFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #GEOM_VISUAL_HAS_RGBA_COLOR GEOM_VISUAL_HAS_RGBA_COLOR}</li>
     * <li>{@link #GEOM_VISUAL_HAS_SPECULAR_COLOR GEOM_VISUAL_HAS_SPECULAR_COLOR}</li>
     * </ul>
     */
    public static final int
        GEOM_VISUAL_HAS_RGBA_COLOR     = 1,
        GEOM_VISUAL_HAS_SPECULAR_COLOR = 2;

    /**
     * {@code enum eStateLoggingFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STATE_LOG_JOINT_MOTOR_TORQUES STATE_LOG_JOINT_MOTOR_TORQUES}</li>
     * <li>{@link #STATE_LOG_JOINT_USER_TORQUES STATE_LOG_JOINT_USER_TORQUES}</li>
     * <li>{@link #STATE_LOG_JOINT_TORQUES STATE_LOG_JOINT_TORQUES}</li>
     * </ul>
     */
    public static final int
        STATE_LOG_JOINT_MOTOR_TORQUES = 1,
        STATE_LOG_JOINT_USER_TORQUES  = 2,
        STATE_LOG_JOINT_TORQUES       = STATE_LOG_JOINT_MOTOR_TORQUES + STATE_LOG_JOINT_USER_TORQUES;

    /**
     * {@code enum eJointFeedbackModes}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #JOINT_FEEDBACK_IN_WORLD_SPACE JOINT_FEEDBACK_IN_WORLD_SPACE}</li>
     * <li>{@link #JOINT_FEEDBACK_IN_JOINT_FRAME JOINT_FEEDBACK_IN_JOINT_FRAME}</li>
     * </ul>
     */
    public static final int
        JOINT_FEEDBACK_IN_WORLD_SPACE = 1,
        JOINT_FEEDBACK_IN_JOINT_FRAME = 2;

    public static final int
        B3_MAX_PLUGIN_ARG_SIZE     = 128,
        B3_MAX_PLUGIN_ARG_TEXT_LEN = 1024;

    /**
     * {@code enum eConstraintSolverTypes}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #eConstraintSolverLCP_SI eConstraintSolverLCP_SI}</li>
     * <li>{@link #eConstraintSolverLCP_PGS eConstraintSolverLCP_PGS}</li>
     * <li>{@link #eConstraintSolverLCP_DANTZIG eConstraintSolverLCP_DANTZIG}</li>
     * <li>{@link #eConstraintSolverLCP_LEMKE eConstraintSolverLCP_LEMKE}</li>
     * <li>{@link #eConstraintSolverLCP_NNCG eConstraintSolverLCP_NNCG}</li>
     * <li>{@link #eConstraintSolverLCP_BLOCK_PGS eConstraintSolverLCP_BLOCK_PGS}</li>
     * </ul>
     */
    public static final int
        eConstraintSolverLCP_SI        = 1,
        eConstraintSolverLCP_PGS       = 2,
        eConstraintSolverLCP_DANTZIG   = 3,
        eConstraintSolverLCP_LEMKE     = 4,
        eConstraintSolverLCP_NNCG      = 5,
        eConstraintSolverLCP_BLOCK_PGS = 6;

    /**
     * {@code enum eFileIOActions}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #eAddFileIOAction eAddFileIOAction}</li>
     * <li>{@link #eRemoveFileIOAction eRemoveFileIOAction}</li>
     * </ul>
     */
    public static final int
        eAddFileIOAction    = 1024,
        eRemoveFileIOAction = 1025;

    /**
     * {@code enum eFileIOTypes}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ePosixFileIO ePosixFileIO}</li>
     * <li>{@link #eZipFileIO eZipFileIO}</li>
     * <li>{@link #eCNSFileIO eCNSFileIO}</li>
     * <li>{@link #eInMemoryFileIO eInMemoryFileIO}</li>
     * </ul>
     */
    public static final int
        ePosixFileIO    = 1,
        eZipFileIO      = 2,
        eCNSFileIO      = 3,
        eInMemoryFileIO = 4;

    static { LibBullet.initialize(); }

    protected PhysicsClient() {
        throw new UnsupportedOperationException();
    }

    // --- [ b3ConnectPhysicsDirect ] ---

    /** Directly execute commands without transport (no shared memory, UDP, socket, grpc etc). */
    @NativeType("b3PhysicsClientHandle")
    public static native long b3ConnectPhysicsDirect();

    // --- [ b3ConnectSharedMemory ] ---

    @NativeType("b3PhysicsClientHandle")
    public static native long b3ConnectSharedMemory(int key);

    // --- [ b3ConnectPhysicsTCP ] ---

    /** Unsafe version of: {@link #b3ConnectPhysicsTCP ConnectPhysicsTCP} */
    public static native long nb3ConnectPhysicsTCP(long hostName, int port);

    /** Send physics commands using TCP networking. */
    @NativeType("b3PhysicsClientHandle")
    public static long b3ConnectPhysicsTCP(@Nullable @NativeType("char const *") ByteBuffer hostName, int port) {
        if (CHECKS) {
            checkNT1Safe(hostName);
        }
        return nb3ConnectPhysicsTCP(memAddressSafe(hostName), port);
    }

    /** Send physics commands using TCP networking. */
    @NativeType("b3PhysicsClientHandle")
    public static long b3ConnectPhysicsTCP(@Nullable @NativeType("char const *") CharSequence hostName, int port) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCIISafe(hostName, true);
            long hostNameEncoded = hostName == null ? NULL : stack.getPointerAddress();
            return nb3ConnectPhysicsTCP(hostNameEncoded, port);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3ConnectPhysicsUDP ] ---

    /** Unsafe version of: {@link #b3ConnectPhysicsUDP ConnectPhysicsUDP} */
    public static native long nb3ConnectPhysicsUDP(long hostName, int port);

    /** Send physics commands using UDP networking. */
    @NativeType("b3PhysicsClientHandle")
    public static long b3ConnectPhysicsUDP(@Nullable @NativeType("char const *") ByteBuffer hostName, int port) {
        if (CHECKS) {
            checkNT1Safe(hostName);
        }
        return nb3ConnectPhysicsUDP(memAddressSafe(hostName), port);
    }

    /** Send physics commands using UDP networking. */
    @NativeType("b3PhysicsClientHandle")
    public static long b3ConnectPhysicsUDP(@Nullable @NativeType("char const *") CharSequence hostName, int port) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCIISafe(hostName, true);
            long hostNameEncoded = hostName == null ? NULL : stack.getPointerAddress();
            return nb3ConnectPhysicsUDP(hostNameEncoded, port);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3DisconnectSharedMemory ] ---

    /** Unsafe version of: {@link #b3DisconnectSharedMemory DisconnectSharedMemory} */
    public static native void nb3DisconnectSharedMemory(long physClient);

    /** Disconnects the client from the server and cleans up memory. */
    public static void b3DisconnectSharedMemory(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        nb3DisconnectSharedMemory(physClient);
    }

    // --- [ b3CanSubmitCommand ] ---

    /** Unsafe version of: {@link #b3CanSubmitCommand CanSubmitCommand} */
    public static native int nb3CanSubmitCommand(long physClient);

    /** Checks if a command can be send. There can only be 1 outstanding command. */
    @NativeType("int")
    public static boolean b3CanSubmitCommand(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CanSubmitCommand(physClient) != 0;
    }

    // --- [ b3SubmitClientCommandAndWaitStatus ] ---

    /** Unsafe version of: {@link #b3SubmitClientCommandAndWaitStatus SubmitClientCommandAndWaitStatus} */
    public static native long nb3SubmitClientCommandAndWaitStatus(long physClient, long commandHandle);

    /** Blocking submit command and wait for status. */
    @NativeType("b3SharedMemoryStatusHandle")
    public static long b3SubmitClientCommandAndWaitStatus(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryCommandHandle") long commandHandle) {
        if (CHECKS) {
            check(physClient);
            check(commandHandle);
        }
        return nb3SubmitClientCommandAndWaitStatus(physClient, commandHandle);
    }

    // --- [ b3SubmitClientCommand ] ---

    /** Unsafe version of: {@link #b3SubmitClientCommand SubmitClientCommand} */
    public static native int nb3SubmitClientCommand(long physClient, long commandHandle);

    /**
     * In general it is better to use {@link #b3SubmitClientCommandAndWaitStatus SubmitClientCommandAndWaitStatus}.
     * 
     * <p>{@code b3SubmitClientCommand} is a non-blocking submit command, which requires checking for the status manually, using {@link #b3ProcessServerStatus ProcessServerStatus}. Also
     * before sending the next command, make sure to check if you can send a command using {@link #b3CanSubmitCommand CanSubmitCommand}.</p>
     */
    public static int b3SubmitClientCommand(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryCommandHandle") long commandHandle) {
        if (CHECKS) {
            check(physClient);
            check(commandHandle);
        }
        return nb3SubmitClientCommand(physClient, commandHandle);
    }

    // --- [ b3ProcessServerStatus ] ---

    /** Unsafe version of: {@link #b3ProcessServerStatus ProcessServerStatus} */
    public static native long nb3ProcessServerStatus(long physClient);

    /** Νon-blocking check status. */
    @NativeType("b3SharedMemoryStatusHandle")
    public static long b3ProcessServerStatus(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3ProcessServerStatus(physClient);
    }

    // --- [ b3GetStatusType ] ---

    /** Unsafe version of: {@link #b3GetStatusType GetStatusType} */
    public static native int nb3GetStatusType(long statusHandle);

    /** Getσ the physics server return status type. */
    public static int b3GetStatusType(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusType(statusHandle);
    }

    // --- [ b3CreateCustomCommand ] ---

    public static native long nb3CreateCustomCommand(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CreateCustomCommand(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CreateCustomCommand(physClient);
    }

    // --- [ b3CustomCommandLoadPlugin ] ---

    public static native void nb3CustomCommandLoadPlugin(long commandHandle, long pluginPath);

    public static void b3CustomCommandLoadPlugin(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") ByteBuffer pluginPath) {
        if (CHECKS) {
            check(commandHandle);
            checkNT1(pluginPath);
        }
        nb3CustomCommandLoadPlugin(commandHandle, memAddress(pluginPath));
    }

    public static void b3CustomCommandLoadPlugin(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") CharSequence pluginPath) {
        if (CHECKS) {
            check(commandHandle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pluginPath, true);
            long pluginPathEncoded = stack.getPointerAddress();
            nb3CustomCommandLoadPlugin(commandHandle, pluginPathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3CustomCommandLoadPluginSetPostFix ] ---

    public static native void nb3CustomCommandLoadPluginSetPostFix(long commandHandle, long postFix);

    public static void b3CustomCommandLoadPluginSetPostFix(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") ByteBuffer postFix) {
        if (CHECKS) {
            check(commandHandle);
            checkNT1(postFix);
        }
        nb3CustomCommandLoadPluginSetPostFix(commandHandle, memAddress(postFix));
    }

    public static void b3CustomCommandLoadPluginSetPostFix(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") CharSequence postFix) {
        if (CHECKS) {
            check(commandHandle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(postFix, true);
            long postFixEncoded = stack.getPointerAddress();
            nb3CustomCommandLoadPluginSetPostFix(commandHandle, postFixEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3GetStatusPluginUniqueId ] ---

    public static native int nb3GetStatusPluginUniqueId(long statusHandle);

    public static int b3GetStatusPluginUniqueId(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusPluginUniqueId(statusHandle);
    }

    // --- [ b3GetStatusPluginCommandResult ] ---

    public static native int nb3GetStatusPluginCommandResult(long statusHandle);

    public static int b3GetStatusPluginCommandResult(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusPluginCommandResult(statusHandle);
    }

    // --- [ b3CustomCommandUnloadPlugin ] ---

    public static native void nb3CustomCommandUnloadPlugin(long commandHandle, int pluginUniqueId);

    public static void b3CustomCommandUnloadPlugin(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int pluginUniqueId) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CustomCommandUnloadPlugin(commandHandle, pluginUniqueId);
    }

    // --- [ b3CustomCommandExecutePluginCommand ] ---

    public static native void nb3CustomCommandExecutePluginCommand(long commandHandle, int pluginUniqueId, long textArguments);

    public static void b3CustomCommandExecutePluginCommand(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int pluginUniqueId, @NativeType("char const *") ByteBuffer textArguments) {
        if (CHECKS) {
            check(commandHandle);
            checkNT1(textArguments);
        }
        nb3CustomCommandExecutePluginCommand(commandHandle, pluginUniqueId, memAddress(textArguments));
    }

    public static void b3CustomCommandExecutePluginCommand(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int pluginUniqueId, @NativeType("char const *") CharSequence textArguments) {
        if (CHECKS) {
            check(commandHandle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(textArguments, true);
            long textArgumentsEncoded = stack.getPointerAddress();
            nb3CustomCommandExecutePluginCommand(commandHandle, pluginUniqueId, textArgumentsEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3CustomCommandExecuteAddIntArgument ] ---

    public static native void nb3CustomCommandExecuteAddIntArgument(long commandHandle, int intVal);

    public static void b3CustomCommandExecuteAddIntArgument(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int intVal) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CustomCommandExecuteAddIntArgument(commandHandle, intVal);
    }

    // --- [ b3CustomCommandExecuteAddFloatArgument ] ---

    public static native void nb3CustomCommandExecuteAddFloatArgument(long commandHandle, float floatVal);

    public static void b3CustomCommandExecuteAddFloatArgument(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, float floatVal) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CustomCommandExecuteAddFloatArgument(commandHandle, floatVal);
    }

    // --- [ b3GetStatusBodyIndices ] ---

    public static native int nb3GetStatusBodyIndices(long statusHandle, long bodyIndicesOut, int bodyIndicesCapacity);

    public static int b3GetStatusBodyIndices(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, @NativeType("int *") IntBuffer bodyIndicesOut) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusBodyIndices(statusHandle, memAddress(bodyIndicesOut), bodyIndicesOut.remaining());
    }

    // --- [ b3GetStatusBodyIndex ] ---

    public static native int nb3GetStatusBodyIndex(long statusHandle);

    public static int b3GetStatusBodyIndex(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusBodyIndex(statusHandle);
    }

    // --- [ b3GetStatusActualState ] ---

    public static native int nb3GetStatusActualState(long statusHandle, long bodyUniqueId, long numDegreeOfFreedomQ, long numDegreeOfFreedomU, long rootLocalInertialFrame, long actualStateQ, long actualStateQdot, long jointReactionForces);

    public static int b3GetStatusActualState(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, @Nullable @NativeType("int *") IntBuffer bodyUniqueId, @Nullable @NativeType("int *") IntBuffer numDegreeOfFreedomQ, @Nullable @NativeType("int *") IntBuffer numDegreeOfFreedomU, @Nullable @NativeType("double const **") PointerBuffer rootLocalInertialFrame, @Nullable @NativeType("double const **") PointerBuffer actualStateQ, @Nullable @NativeType("double const **") PointerBuffer actualStateQdot, @Nullable @NativeType("double const **") PointerBuffer jointReactionForces) {
        if (CHECKS) {
            check(statusHandle);
            checkSafe(bodyUniqueId, 1);
            checkSafe(numDegreeOfFreedomQ, 1);
            checkSafe(numDegreeOfFreedomU, 1);
            checkSafe(rootLocalInertialFrame, 1);
            checkSafe(actualStateQ, 1);
            checkSafe(actualStateQdot, 1);
            checkSafe(jointReactionForces, 1);
        }
        return nb3GetStatusActualState(statusHandle, memAddressSafe(bodyUniqueId), memAddressSafe(numDegreeOfFreedomQ), memAddressSafe(numDegreeOfFreedomU), memAddressSafe(rootLocalInertialFrame), memAddressSafe(actualStateQ), memAddressSafe(actualStateQdot), memAddressSafe(jointReactionForces));
    }

    // --- [ b3GetStatusActualState2 ] ---

    public static native int nb3GetStatusActualState2(long statusHandle, long bodyUniqueId, long numLinks, long numDegreeOfFreedomQ, long numDegreeOfFreedomU, long rootLocalInertialFrame, long actualStateQ, long actualStateQdot, long jointReactionForces, long linkLocalInertialFrames, long jointMotorForces, long linkStates, long linkWorldVelocities);

    public static int b3GetStatusActualState2(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, @Nullable @NativeType("int *") IntBuffer bodyUniqueId, @Nullable @NativeType("int *") IntBuffer numLinks, @Nullable @NativeType("int *") IntBuffer numDegreeOfFreedomQ, @Nullable @NativeType("int *") IntBuffer numDegreeOfFreedomU, @Nullable @NativeType("double const **") PointerBuffer rootLocalInertialFrame, @Nullable @NativeType("double const **") PointerBuffer actualStateQ, @Nullable @NativeType("double const **") PointerBuffer actualStateQdot, @Nullable @NativeType("double const **") PointerBuffer jointReactionForces, @Nullable @NativeType("double const **") PointerBuffer linkLocalInertialFrames, @Nullable @NativeType("double const **") PointerBuffer jointMotorForces, @Nullable @NativeType("double const **") PointerBuffer linkStates, @Nullable @NativeType("double const **") PointerBuffer linkWorldVelocities) {
        if (CHECKS) {
            check(statusHandle);
            checkSafe(bodyUniqueId, 1);
            checkSafe(numLinks, 1);
            checkSafe(numDegreeOfFreedomQ, 1);
            checkSafe(numDegreeOfFreedomU, 1);
            checkSafe(rootLocalInertialFrame, 1);
            checkSafe(actualStateQ, 1);
            checkSafe(actualStateQdot, 1);
            checkSafe(jointReactionForces, 1);
            checkSafe(linkLocalInertialFrames, 1);
            checkSafe(jointMotorForces, 1);
            checkSafe(linkStates, 1);
            checkSafe(linkWorldVelocities, 1);
        }
        return nb3GetStatusActualState2(statusHandle, memAddressSafe(bodyUniqueId), memAddressSafe(numLinks), memAddressSafe(numDegreeOfFreedomQ), memAddressSafe(numDegreeOfFreedomU), memAddressSafe(rootLocalInertialFrame), memAddressSafe(actualStateQ), memAddressSafe(actualStateQdot), memAddressSafe(jointReactionForces), memAddressSafe(linkLocalInertialFrames), memAddressSafe(jointMotorForces), memAddressSafe(linkStates), memAddressSafe(linkWorldVelocities));
    }

    // --- [ b3RequestCollisionInfoCommandInit ] ---

    public static native long nb3RequestCollisionInfoCommandInit(long physClient, int bodyUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3RequestCollisionInfoCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3RequestCollisionInfoCommandInit(physClient, bodyUniqueId);
    }

    // --- [ b3GetStatusAABB ] ---

    public static native int nb3GetStatusAABB(long statusHandle, int linkIndex, long aabbMin, long aabbMax);

    public static int b3GetStatusAABB(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, int linkIndex, @NativeType("double *") DoubleBuffer aabbMin, @NativeType("double *") DoubleBuffer aabbMax) {
        if (CHECKS) {
            check(statusHandle);
            check(aabbMin, 3);
            check(aabbMax, 3);
        }
        return nb3GetStatusAABB(statusHandle, linkIndex, memAddress(aabbMin), memAddress(aabbMax));
    }

    // --- [ b3InitSyncBodyInfoCommand ] ---

    /** Unsafe version of: {@link #b3InitSyncBodyInfoCommand InitSyncBodyInfoCommand} */
    public static native long nb3InitSyncBodyInfoCommand(long physClient);

    /** If you re-connected to an existing server, or server changed otherwise, sync the body info and user constraints etc. */
    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitSyncBodyInfoCommand(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitSyncBodyInfoCommand(physClient);
    }

    // --- [ b3InitRemoveBodyCommand ] ---

    public static native long nb3InitRemoveBodyCommand(long physClient, int bodyUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRemoveBodyCommand(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitRemoveBodyCommand(physClient, bodyUniqueId);
    }

    // --- [ b3GetNumBodies ] ---

    public static native int nb3GetNumBodies(long physClient);

    public static int b3GetNumBodies(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetNumBodies(physClient);
    }

    // --- [ b3GetBodyUniqueId ] ---

    public static native int nb3GetBodyUniqueId(long physClient, int serialIndex);

    public static int b3GetBodyUniqueId(@NativeType("b3PhysicsClientHandle") long physClient, int serialIndex) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetBodyUniqueId(physClient, serialIndex);
    }

    // --- [ b3GetBodyInfo ] ---

    public static native int nb3GetBodyInfo(long physClient, int bodyUniqueId, long info);

    public static int b3GetBodyInfo(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, @NativeType("struct b3BodyInfo *") B3BodyInfo info) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetBodyInfo(physClient, bodyUniqueId, info.address());
    }

    // --- [ b3GetNumJoints ] ---

    public static native int nb3GetNumJoints(long physClient, int bodyUniqueId);

    public static int b3GetNumJoints(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetNumJoints(physClient, bodyUniqueId);
    }

    // --- [ b3ComputeDofCount ] ---

    public static native int nb3ComputeDofCount(long physClient, int bodyUniqueId);

    public static int b3ComputeDofCount(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3ComputeDofCount(physClient, bodyUniqueId);
    }

    // --- [ b3GetJointInfo ] ---

    public static native int nb3GetJointInfo(long physClient, int bodyUniqueId, int jointIndex, long info);

    public static int b3GetJointInfo(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, int jointIndex, @NativeType("struct b3JointInfo *") B3JointInfo info) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetJointInfo(physClient, bodyUniqueId, jointIndex, info.address());
    }

    // --- [ b3InitSyncUserDataCommand ] ---

    public static native long nb3InitSyncUserDataCommand(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitSyncUserDataCommand(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitSyncUserDataCommand(physClient);
    }

    // --- [ b3InitAddUserDataCommand ] ---

    public static native long nb3InitAddUserDataCommand(long physClient, int bodyUniqueId, int linkIndex, int visualShapeIndex, long key, int valueType, int valueLength, long valueData);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitAddUserDataCommand(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, int linkIndex, int visualShapeIndex, @NativeType("char const *") ByteBuffer key, @NativeType("enum UserDataValueType") int valueType, @NativeType("void const *") ByteBuffer valueData) {
        if (CHECKS) {
            check(physClient);
            checkNT1(key);
        }
        return nb3InitAddUserDataCommand(physClient, bodyUniqueId, linkIndex, visualShapeIndex, memAddress(key), valueType, valueData.remaining(), memAddress(valueData));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitAddUserDataCommand(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, int linkIndex, int visualShapeIndex, @NativeType("char const *") CharSequence key, @NativeType("enum UserDataValueType") int valueType, @NativeType("void const *") ByteBuffer valueData) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(key, true);
            long keyEncoded = stack.getPointerAddress();
            return nb3InitAddUserDataCommand(physClient, bodyUniqueId, linkIndex, visualShapeIndex, keyEncoded, valueType, valueData.remaining(), memAddress(valueData));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3InitRemoveUserDataCommand ] ---

    public static native long nb3InitRemoveUserDataCommand(long physClient, int userDataId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRemoveUserDataCommand(@NativeType("b3PhysicsClientHandle") long physClient, int userDataId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitRemoveUserDataCommand(physClient, userDataId);
    }

    // --- [ b3GetUserData ] ---

    public static native int nb3GetUserData(long physClient, int userDataId, long valueOut);

    public static int b3GetUserData(@NativeType("b3PhysicsClientHandle") long physClient, int userDataId, @NativeType("struct b3UserDataValue *") B3UserDataValue valueOut) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetUserData(physClient, userDataId, valueOut.address());
    }

    // --- [ b3GetUserDataId ] ---

    public static native int nb3GetUserDataId(long physClient, int bodyUniqueId, int linkIndex, int visualShapeIndex, long key);

    public static int b3GetUserDataId(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, int linkIndex, int visualShapeIndex, @NativeType("char const *") ByteBuffer key) {
        if (CHECKS) {
            check(physClient);
            checkNT1(key);
        }
        return nb3GetUserDataId(physClient, bodyUniqueId, linkIndex, visualShapeIndex, memAddress(key));
    }

    public static int b3GetUserDataId(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, int linkIndex, int visualShapeIndex, @NativeType("char const *") CharSequence key) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(key, true);
            long keyEncoded = stack.getPointerAddress();
            return nb3GetUserDataId(physClient, bodyUniqueId, linkIndex, visualShapeIndex, keyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3GetUserDataIdFromStatus ] ---

    public static native int nb3GetUserDataIdFromStatus(long statusHandle);

    public static int b3GetUserDataIdFromStatus(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetUserDataIdFromStatus(statusHandle);
    }

    // --- [ b3GetNumUserData ] ---

    public static native int nb3GetNumUserData(long physClient, int bodyUniqueId);

    public static int b3GetNumUserData(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetNumUserData(physClient, bodyUniqueId);
    }

    // --- [ b3GetUserDataInfo ] ---

    public static native void nb3GetUserDataInfo(long physClient, int bodyUniqueId, int userDataIndex, long keyOut, long userDataIdOut, long linkIndexOut, long visualShapeIndexOut);

    public static void b3GetUserDataInfo(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, int userDataIndex, @NativeType("char const **") PointerBuffer keyOut, @NativeType("int *") IntBuffer userDataIdOut, @NativeType("int *") IntBuffer linkIndexOut, @NativeType("int *") IntBuffer visualShapeIndexOut) {
        if (CHECKS) {
            check(physClient);
            check(keyOut, 1);
            check(userDataIdOut, 1);
            check(linkIndexOut, 1);
            check(visualShapeIndexOut, 1);
        }
        nb3GetUserDataInfo(physClient, bodyUniqueId, userDataIndex, memAddress(keyOut), memAddress(userDataIdOut), memAddress(linkIndexOut), memAddress(visualShapeIndexOut));
    }

    // --- [ b3GetDynamicsInfoCommandInit ] ---

    public static native long nb3GetDynamicsInfoCommandInit(long physClient, int bodyUniqueId, int linkIndex);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3GetDynamicsInfoCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, int linkIndex) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetDynamicsInfoCommandInit(physClient, bodyUniqueId, linkIndex);
    }

    // --- [ b3GetDynamicsInfoCommandInit2 ] ---

    public static native long nb3GetDynamicsInfoCommandInit2(long commandHandle, int bodyUniqueId, int linkIndex);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3GetDynamicsInfoCommandInit2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkIndex) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3GetDynamicsInfoCommandInit2(commandHandle, bodyUniqueId, linkIndex);
    }

    // --- [ b3GetDynamicsInfo ] ---

    /** Unsafe version of: {@link #b3GetDynamicsInfo GetDynamicsInfo} */
    public static native int nb3GetDynamicsInfo(long statusHandle, long info);

    /** Given a body unique id and link index, return the dynamics information. */
    public static int b3GetDynamicsInfo(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, @NativeType("struct b3DynamicsInfo *") B3DynamicsInfo info) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetDynamicsInfo(statusHandle, info.address());
    }

    // --- [ b3InitChangeDynamicsInfo ] ---

    public static native long nb3InitChangeDynamicsInfo(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitChangeDynamicsInfo(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitChangeDynamicsInfo(physClient);
    }

    // --- [ b3InitChangeDynamicsInfo2 ] ---

    public static native long nb3InitChangeDynamicsInfo2(long commandHandle);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitChangeDynamicsInfo2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitChangeDynamicsInfo2(commandHandle);
    }

    // --- [ b3ChangeDynamicsInfoSetMass ] ---

    public static native int nb3ChangeDynamicsInfoSetMass(long commandHandle, int bodyUniqueId, int linkIndex, double mass);

    public static int b3ChangeDynamicsInfoSetMass(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkIndex, double mass) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetMass(commandHandle, bodyUniqueId, linkIndex, mass);
    }

    // --- [ b3ChangeDynamicsInfoSetLocalInertiaDiagonal ] ---

    public static native int nb3ChangeDynamicsInfoSetLocalInertiaDiagonal(long commandHandle, int bodyUniqueId, int linkIndex, long localInertiaDiagonal);

    public static int b3ChangeDynamicsInfoSetLocalInertiaDiagonal(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkIndex, @NativeType("double const *") DoubleBuffer localInertiaDiagonal) {
        if (CHECKS) {
            check(commandHandle);
            check(localInertiaDiagonal, 3);
        }
        return nb3ChangeDynamicsInfoSetLocalInertiaDiagonal(commandHandle, bodyUniqueId, linkIndex, memAddress(localInertiaDiagonal));
    }

    // --- [ b3ChangeDynamicsInfoSetLateralFriction ] ---

    public static native int nb3ChangeDynamicsInfoSetLateralFriction(long commandHandle, int bodyUniqueId, int linkIndex, double lateralFriction);

    public static int b3ChangeDynamicsInfoSetLateralFriction(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkIndex, double lateralFriction) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetLateralFriction(commandHandle, bodyUniqueId, linkIndex, lateralFriction);
    }

    // --- [ b3ChangeDynamicsInfoSetSpinningFriction ] ---

    public static native int nb3ChangeDynamicsInfoSetSpinningFriction(long commandHandle, int bodyUniqueId, int linkIndex, double friction);

    public static int b3ChangeDynamicsInfoSetSpinningFriction(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkIndex, double friction) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetSpinningFriction(commandHandle, bodyUniqueId, linkIndex, friction);
    }

    // --- [ b3ChangeDynamicsInfoSetRollingFriction ] ---

    public static native int nb3ChangeDynamicsInfoSetRollingFriction(long commandHandle, int bodyUniqueId, int linkIndex, double friction);

    public static int b3ChangeDynamicsInfoSetRollingFriction(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkIndex, double friction) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetRollingFriction(commandHandle, bodyUniqueId, linkIndex, friction);
    }

    // --- [ b3ChangeDynamicsInfoSetRestitution ] ---

    public static native int nb3ChangeDynamicsInfoSetRestitution(long commandHandle, int bodyUniqueId, int linkIndex, double restitution);

    public static int b3ChangeDynamicsInfoSetRestitution(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkIndex, double restitution) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetRestitution(commandHandle, bodyUniqueId, linkIndex, restitution);
    }

    // --- [ b3ChangeDynamicsInfoSetLinearDamping ] ---

    public static native int nb3ChangeDynamicsInfoSetLinearDamping(long commandHandle, int bodyUniqueId, double linearDamping);

    public static int b3ChangeDynamicsInfoSetLinearDamping(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, double linearDamping) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetLinearDamping(commandHandle, bodyUniqueId, linearDamping);
    }

    // --- [ b3ChangeDynamicsInfoSetAngularDamping ] ---

    public static native int nb3ChangeDynamicsInfoSetAngularDamping(long commandHandle, int bodyUniqueId, double angularDamping);

    public static int b3ChangeDynamicsInfoSetAngularDamping(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, double angularDamping) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetAngularDamping(commandHandle, bodyUniqueId, angularDamping);
    }

    // --- [ b3ChangeDynamicsInfoSetContactStiffnessAndDamping ] ---

    public static native int nb3ChangeDynamicsInfoSetContactStiffnessAndDamping(long commandHandle, int bodyUniqueId, int linkIndex, double contactStiffness, double contactDamping);

    public static int b3ChangeDynamicsInfoSetContactStiffnessAndDamping(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkIndex, double contactStiffness, double contactDamping) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetContactStiffnessAndDamping(commandHandle, bodyUniqueId, linkIndex, contactStiffness, contactDamping);
    }

    // --- [ b3ChangeDynamicsInfoSetFrictionAnchor ] ---

    public static native int nb3ChangeDynamicsInfoSetFrictionAnchor(long commandHandle, int bodyUniqueId, int linkIndex, int frictionAnchor);

    public static int b3ChangeDynamicsInfoSetFrictionAnchor(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkIndex, int frictionAnchor) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetFrictionAnchor(commandHandle, bodyUniqueId, linkIndex, frictionAnchor);
    }

    // --- [ b3ChangeDynamicsInfoSetCcdSweptSphereRadius ] ---

    public static native int nb3ChangeDynamicsInfoSetCcdSweptSphereRadius(long commandHandle, int bodyUniqueId, int linkIndex, double ccdSweptSphereRadius);

    public static int b3ChangeDynamicsInfoSetCcdSweptSphereRadius(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkIndex, double ccdSweptSphereRadius) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetCcdSweptSphereRadius(commandHandle, bodyUniqueId, linkIndex, ccdSweptSphereRadius);
    }

    // --- [ b3ChangeDynamicsInfoSetContactProcessingThreshold ] ---

    public static native int nb3ChangeDynamicsInfoSetContactProcessingThreshold(long commandHandle, int bodyUniqueId, int linkIndex, double contactProcessingThreshold);

    public static int b3ChangeDynamicsInfoSetContactProcessingThreshold(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkIndex, double contactProcessingThreshold) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetContactProcessingThreshold(commandHandle, bodyUniqueId, linkIndex, contactProcessingThreshold);
    }

    // --- [ b3ChangeDynamicsInfoSetActivationState ] ---

    public static native int nb3ChangeDynamicsInfoSetActivationState(long commandHandle, int bodyUniqueId, int activationState);

    public static int b3ChangeDynamicsInfoSetActivationState(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int activationState) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3ChangeDynamicsInfoSetActivationState(commandHandle, bodyUniqueId, activationState);
    }

    // --- [ b3InitCreateUserConstraintCommand ] ---

    public static native long nb3InitCreateUserConstraintCommand(long physClient, int parentBodyUniqueId, int parentJointIndex, int childBodyUniqueId, int childJointIndex, long info);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitCreateUserConstraintCommand(@NativeType("b3PhysicsClientHandle") long physClient, int parentBodyUniqueId, int parentJointIndex, int childBodyUniqueId, int childJointIndex, @NativeType("struct b3JointInfo *") B3JointInfo info) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitCreateUserConstraintCommand(physClient, parentBodyUniqueId, parentJointIndex, childBodyUniqueId, childJointIndex, info.address());
    }

    // --- [ b3InitCreateUserConstraintCommand2 ] ---

    public static native long nb3InitCreateUserConstraintCommand2(long commandHandle, int parentBodyUniqueId, int parentJointIndex, int childBodyUniqueId, int childJointIndex, long info);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitCreateUserConstraintCommand2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int parentBodyUniqueId, int parentJointIndex, int childBodyUniqueId, int childJointIndex, @NativeType("struct b3JointInfo *") B3JointInfo info) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitCreateUserConstraintCommand2(commandHandle, parentBodyUniqueId, parentJointIndex, childBodyUniqueId, childJointIndex, info.address());
    }

    // --- [ b3GetStatusUserConstraintUniqueId ] ---

    public static native int nb3GetStatusUserConstraintUniqueId(long statusHandle);

    public static int b3GetStatusUserConstraintUniqueId(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusUserConstraintUniqueId(statusHandle);
    }

    // --- [ b3InitChangeUserConstraintCommand ] ---

    public static native long nb3InitChangeUserConstraintCommand(long physClient, int userConstraintUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitChangeUserConstraintCommand(@NativeType("b3PhysicsClientHandle") long physClient, int userConstraintUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitChangeUserConstraintCommand(physClient, userConstraintUniqueId);
    }

    // --- [ b3InitChangeUserConstraintSetPivotInB ] ---

    public static native int nb3InitChangeUserConstraintSetPivotInB(long commandHandle, long jointChildPivot);

    public static int b3InitChangeUserConstraintSetPivotInB(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer jointChildPivot) {
        if (CHECKS) {
            check(commandHandle);
            check(jointChildPivot, 3);
        }
        return nb3InitChangeUserConstraintSetPivotInB(commandHandle, memAddress(jointChildPivot));
    }

    // --- [ b3InitChangeUserConstraintSetFrameInB ] ---

    public static native int nb3InitChangeUserConstraintSetFrameInB(long commandHandle, long jointChildFrameOrn);

    public static int b3InitChangeUserConstraintSetFrameInB(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer jointChildFrameOrn) {
        if (CHECKS) {
            check(commandHandle);
            check(jointChildFrameOrn, 4);
        }
        return nb3InitChangeUserConstraintSetFrameInB(commandHandle, memAddress(jointChildFrameOrn));
    }

    // --- [ b3InitChangeUserConstraintSetMaxForce ] ---

    public static native int nb3InitChangeUserConstraintSetMaxForce(long commandHandle, double maxAppliedForce);

    public static int b3InitChangeUserConstraintSetMaxForce(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double maxAppliedForce) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitChangeUserConstraintSetMaxForce(commandHandle, maxAppliedForce);
    }

    // --- [ b3InitChangeUserConstraintSetGearRatio ] ---

    public static native int nb3InitChangeUserConstraintSetGearRatio(long commandHandle, double gearRatio);

    public static int b3InitChangeUserConstraintSetGearRatio(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double gearRatio) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitChangeUserConstraintSetGearRatio(commandHandle, gearRatio);
    }

    // --- [ b3InitChangeUserConstraintSetGearAuxLink ] ---

    public static native int nb3InitChangeUserConstraintSetGearAuxLink(long commandHandle, int gearAuxLink);

    public static int b3InitChangeUserConstraintSetGearAuxLink(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int gearAuxLink) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitChangeUserConstraintSetGearAuxLink(commandHandle, gearAuxLink);
    }

    // --- [ b3InitChangeUserConstraintSetRelativePositionTarget ] ---

    public static native int nb3InitChangeUserConstraintSetRelativePositionTarget(long commandHandle, double relativePositionTarget);

    public static int b3InitChangeUserConstraintSetRelativePositionTarget(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double relativePositionTarget) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitChangeUserConstraintSetRelativePositionTarget(commandHandle, relativePositionTarget);
    }

    // --- [ b3InitChangeUserConstraintSetERP ] ---

    public static native int nb3InitChangeUserConstraintSetERP(long commandHandle, double erp);

    public static int b3InitChangeUserConstraintSetERP(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double erp) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitChangeUserConstraintSetERP(commandHandle, erp);
    }

    // --- [ b3InitRemoveUserConstraintCommand ] ---

    public static native long nb3InitRemoveUserConstraintCommand(long physClient, int userConstraintUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRemoveUserConstraintCommand(@NativeType("b3PhysicsClientHandle") long physClient, int userConstraintUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitRemoveUserConstraintCommand(physClient, userConstraintUniqueId);
    }

    // --- [ b3GetNumUserConstraints ] ---

    public static native int nb3GetNumUserConstraints(long physClient);

    public static int b3GetNumUserConstraints(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetNumUserConstraints(physClient);
    }

    // --- [ b3InitGetUserConstraintStateCommand ] ---

    public static native long nb3InitGetUserConstraintStateCommand(long physClient, int raintUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitGetUserConstraintStateCommand(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("int const") int raintUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitGetUserConstraintStateCommand(physClient, raintUniqueId);
    }

    // --- [ b3GetStatusUserConstraintState ] ---

    public static native int nb3GetStatusUserConstraintState(long statusHandle, long constraintState);

    public static int b3GetStatusUserConstraintState(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, @NativeType("struct b3UserConstraintState *") B3UserConstraintState constraintState) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusUserConstraintState(statusHandle, constraintState.address());
    }

    // --- [ b3GetUserConstraintInfo ] ---

    public static native int nb3GetUserConstraintInfo(long physClient, int raintUniqueId, long info);

    public static int b3GetUserConstraintInfo(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("int const") int raintUniqueId, @NativeType("struct b3UserConstraint *") B3UserConstraint info) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetUserConstraintInfo(physClient, raintUniqueId, info.address());
    }

    // --- [ b3GetUserConstraintId ] ---

    public static native int nb3GetUserConstraintId(long physClient, int serialIndex);

    public static int b3GetUserConstraintId(@NativeType("b3PhysicsClientHandle") long physClient, int serialIndex) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetUserConstraintId(physClient, serialIndex);
    }

    // --- [ b3InitRequestDebugLinesCommand ] ---

    public static native long nb3InitRequestDebugLinesCommand(long physClient, int debugMode);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRequestDebugLinesCommand(@NativeType("b3PhysicsClientHandle") long physClient, int debugMode) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitRequestDebugLinesCommand(physClient, debugMode);
    }

    // --- [ b3GetDebugLines ] ---

    public static native void nb3GetDebugLines(long physClient, long lines);

    public static void b3GetDebugLines(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("struct b3DebugLines *") B3DebugLines lines) {
        if (CHECKS) {
            check(physClient);
        }
        nb3GetDebugLines(physClient, lines.address());
    }

    // --- [ b3InitConfigureOpenGLVisualizer ] ---

    public static native long nb3InitConfigureOpenGLVisualizer(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitConfigureOpenGLVisualizer(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitConfigureOpenGLVisualizer(physClient);
    }

    // --- [ b3InitConfigureOpenGLVisualizer2 ] ---

    public static native long nb3InitConfigureOpenGLVisualizer2(long commandHandle);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitConfigureOpenGLVisualizer2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitConfigureOpenGLVisualizer2(commandHandle);
    }

    // --- [ b3ConfigureOpenGLVisualizerSetVisualizationFlags ] ---

    public static native void nb3ConfigureOpenGLVisualizerSetVisualizationFlags(long commandHandle, int flag, int enabled);

    public static void b3ConfigureOpenGLVisualizerSetVisualizationFlags(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int flag, @NativeType("int") boolean enabled) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3ConfigureOpenGLVisualizerSetVisualizationFlags(commandHandle, flag, enabled ? 1 : 0);
    }

    // --- [ b3ConfigureOpenGLVisualizerSetViewMatrix ] ---

    public static native void nb3ConfigureOpenGLVisualizerSetViewMatrix(long commandHandle, float cameraDistance, float cameraPitch, float cameraYaw, long cameraTargetPosition);

    public static void b3ConfigureOpenGLVisualizerSetViewMatrix(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, float cameraDistance, float cameraPitch, float cameraYaw, @NativeType("float const *") FloatBuffer cameraTargetPosition) {
        if (CHECKS) {
            check(commandHandle);
            check(cameraTargetPosition, 3);
        }
        nb3ConfigureOpenGLVisualizerSetViewMatrix(commandHandle, cameraDistance, cameraPitch, cameraYaw, memAddress(cameraTargetPosition));
    }

    // --- [ b3InitRequestOpenGLVisualizerCameraCommand ] ---

    public static native long nb3InitRequestOpenGLVisualizerCameraCommand(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRequestOpenGLVisualizerCameraCommand(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitRequestOpenGLVisualizerCameraCommand(physClient);
    }

    // --- [ b3GetStatusOpenGLVisualizerCamera ] ---

    public static native int nb3GetStatusOpenGLVisualizerCamera(long statusHandle, long camera);

    public static int b3GetStatusOpenGLVisualizerCamera(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, @NativeType("struct b3OpenGLVisualizerCameraInfo *") B3OpenGLVisualizerCameraInfo camera) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusOpenGLVisualizerCamera(statusHandle, camera.address());
    }

    // --- [ b3InitUserDebugDrawAddLine3D ] ---

    public static native long nb3InitUserDebugDrawAddLine3D(long physClient, long fromXYZ, long toXYZ, long colorRGB, double lineWidth, double lifeTime);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitUserDebugDrawAddLine3D(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("double const *") DoubleBuffer fromXYZ, @NativeType("double const *") DoubleBuffer toXYZ, @NativeType("double const *") DoubleBuffer colorRGB, double lineWidth, double lifeTime) {
        if (CHECKS) {
            check(physClient);
            check(fromXYZ, 3);
            check(toXYZ, 3);
            check(colorRGB, 3);
        }
        return nb3InitUserDebugDrawAddLine3D(physClient, memAddress(fromXYZ), memAddress(toXYZ), memAddress(colorRGB), lineWidth, lifeTime);
    }

    // --- [ b3InitUserDebugDrawAddText3D ] ---

    public static native long nb3InitUserDebugDrawAddText3D(long physClient, long txt, long positionXYZ, long colorRGB, double textSize, double lifeTime);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitUserDebugDrawAddText3D(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer txt, @NativeType("double const *") DoubleBuffer positionXYZ, @NativeType("double const *") DoubleBuffer colorRGB, double textSize, double lifeTime) {
        if (CHECKS) {
            check(physClient);
            checkNT1(txt);
            check(positionXYZ, 3);
            check(colorRGB, 3);
        }
        return nb3InitUserDebugDrawAddText3D(physClient, memAddress(txt), memAddress(positionXYZ), memAddress(colorRGB), textSize, lifeTime);
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitUserDebugDrawAddText3D(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence txt, @NativeType("double const *") DoubleBuffer positionXYZ, @NativeType("double const *") DoubleBuffer colorRGB, double textSize, double lifeTime) {
        if (CHECKS) {
            check(physClient);
            check(positionXYZ, 3);
            check(colorRGB, 3);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(txt, true);
            long txtEncoded = stack.getPointerAddress();
            return nb3InitUserDebugDrawAddText3D(physClient, txtEncoded, memAddress(positionXYZ), memAddress(colorRGB), textSize, lifeTime);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3UserDebugTextSetOptionFlags ] ---

    public static native void nb3UserDebugTextSetOptionFlags(long commandHandle, int optionFlags);

    public static void b3UserDebugTextSetOptionFlags(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int optionFlags) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3UserDebugTextSetOptionFlags(commandHandle, optionFlags);
    }

    // --- [ b3UserDebugTextSetOrientation ] ---

    public static native void nb3UserDebugTextSetOrientation(long commandHandle, long orientation);

    public static void b3UserDebugTextSetOrientation(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer orientation) {
        if (CHECKS) {
            check(commandHandle);
            check(orientation, 4);
        }
        nb3UserDebugTextSetOrientation(commandHandle, memAddress(orientation));
    }

    // --- [ b3UserDebugItemSetReplaceItemUniqueId ] ---

    public static native void nb3UserDebugItemSetReplaceItemUniqueId(long commandHandle, int replaceItem);

    public static void b3UserDebugItemSetReplaceItemUniqueId(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int replaceItem) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3UserDebugItemSetReplaceItemUniqueId(commandHandle, replaceItem);
    }

    // --- [ b3UserDebugItemSetParentObject ] ---

    public static native void nb3UserDebugItemSetParentObject(long commandHandle, int objectUniqueId, int linkIndex);

    public static void b3UserDebugItemSetParentObject(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int objectUniqueId, int linkIndex) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3UserDebugItemSetParentObject(commandHandle, objectUniqueId, linkIndex);
    }

    // --- [ b3InitUserDebugAddParameter ] ---

    public static native long nb3InitUserDebugAddParameter(long physClient, long txt, double rangeMin, double rangeMax, double startValue);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitUserDebugAddParameter(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer txt, double rangeMin, double rangeMax, double startValue) {
        if (CHECKS) {
            check(physClient);
            checkNT1(txt);
        }
        return nb3InitUserDebugAddParameter(physClient, memAddress(txt), rangeMin, rangeMax, startValue);
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitUserDebugAddParameter(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence txt, double rangeMin, double rangeMax, double startValue) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(txt, true);
            long txtEncoded = stack.getPointerAddress();
            return nb3InitUserDebugAddParameter(physClient, txtEncoded, rangeMin, rangeMax, startValue);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3InitUserDebugReadParameter ] ---

    public static native long nb3InitUserDebugReadParameter(long physClient, int debugItemUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitUserDebugReadParameter(@NativeType("b3PhysicsClientHandle") long physClient, int debugItemUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitUserDebugReadParameter(physClient, debugItemUniqueId);
    }

    // --- [ b3GetStatusDebugParameterValue ] ---

    public static native int nb3GetStatusDebugParameterValue(long statusHandle, long paramValue);

    public static int b3GetStatusDebugParameterValue(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, @NativeType("double *") DoubleBuffer paramValue) {
        if (CHECKS) {
            check(statusHandle);
            check(paramValue, 1);
        }
        return nb3GetStatusDebugParameterValue(statusHandle, memAddress(paramValue));
    }

    // --- [ b3InitUserDebugDrawRemove ] ---

    public static native long nb3InitUserDebugDrawRemove(long physClient, int debugItemUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitUserDebugDrawRemove(@NativeType("b3PhysicsClientHandle") long physClient, int debugItemUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitUserDebugDrawRemove(physClient, debugItemUniqueId);
    }

    // --- [ b3InitUserDebugDrawRemoveAll ] ---

    public static native long nb3InitUserDebugDrawRemoveAll(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitUserDebugDrawRemoveAll(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitUserDebugDrawRemoveAll(physClient);
    }

    // --- [ b3InitDebugDrawingCommand ] ---

    public static native long nb3InitDebugDrawingCommand(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitDebugDrawingCommand(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitDebugDrawingCommand(physClient);
    }

    // --- [ b3SetDebugObjectColor ] ---

    public static native void nb3SetDebugObjectColor(long commandHandle, int objectUniqueId, int linkIndex, long objectColorRGB);

    public static void b3SetDebugObjectColor(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int objectUniqueId, int linkIndex, @NativeType("double const *") DoubleBuffer objectColorRGB) {
        if (CHECKS) {
            check(commandHandle);
            check(objectColorRGB, 3);
        }
        nb3SetDebugObjectColor(commandHandle, objectUniqueId, linkIndex, memAddress(objectColorRGB));
    }

    // --- [ b3RemoveDebugObjectColor ] ---

    public static native void nb3RemoveDebugObjectColor(long commandHandle, int objectUniqueId, int linkIndex);

    public static void b3RemoveDebugObjectColor(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int objectUniqueId, int linkIndex) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3RemoveDebugObjectColor(commandHandle, objectUniqueId, linkIndex);
    }

    // --- [ b3GetDebugItemUniqueId ] ---

    public static native int nb3GetDebugItemUniqueId(long statusHandle);

    public static int b3GetDebugItemUniqueId(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetDebugItemUniqueId(statusHandle);
    }

    // --- [ b3InitRequestCameraImage ] ---

    public static native long nb3InitRequestCameraImage(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRequestCameraImage(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitRequestCameraImage(physClient);
    }

    // --- [ b3InitRequestCameraImage2 ] ---

    public static native long nb3InitRequestCameraImage2(long commandHandle);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRequestCameraImage2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitRequestCameraImage2(commandHandle);
    }

    // --- [ b3RequestCameraImageSetCameraMatrices ] ---

    public static native void nb3RequestCameraImageSetCameraMatrices(long commandHandle, long viewMatrix, long projectionMatrix);

    public static void b3RequestCameraImageSetCameraMatrices(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("float *") FloatBuffer viewMatrix, @NativeType("float *") FloatBuffer projectionMatrix) {
        if (CHECKS) {
            check(commandHandle);
            check(viewMatrix, 16);
            check(projectionMatrix, 16);
        }
        nb3RequestCameraImageSetCameraMatrices(commandHandle, memAddress(viewMatrix), memAddress(projectionMatrix));
    }

    // --- [ b3RequestCameraImageSetPixelResolution ] ---

    public static native void nb3RequestCameraImageSetPixelResolution(long commandHandle, int width, int height);

    public static void b3RequestCameraImageSetPixelResolution(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int width, int height) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3RequestCameraImageSetPixelResolution(commandHandle, width, height);
    }

    // --- [ b3RequestCameraImageSetLightDirection ] ---

    public static native void nb3RequestCameraImageSetLightDirection(long commandHandle, long lightDirection);

    public static void b3RequestCameraImageSetLightDirection(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("float const *") FloatBuffer lightDirection) {
        if (CHECKS) {
            check(commandHandle);
            check(lightDirection, 3);
        }
        nb3RequestCameraImageSetLightDirection(commandHandle, memAddress(lightDirection));
    }

    // --- [ b3RequestCameraImageSetLightColor ] ---

    public static native void nb3RequestCameraImageSetLightColor(long commandHandle, long lightColor);

    public static void b3RequestCameraImageSetLightColor(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("float const *") FloatBuffer lightColor) {
        if (CHECKS) {
            check(commandHandle);
            check(lightColor, 3);
        }
        nb3RequestCameraImageSetLightColor(commandHandle, memAddress(lightColor));
    }

    // --- [ b3RequestCameraImageSetLightDistance ] ---

    public static native void nb3RequestCameraImageSetLightDistance(long commandHandle, float lightDistance);

    public static void b3RequestCameraImageSetLightDistance(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, float lightDistance) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3RequestCameraImageSetLightDistance(commandHandle, lightDistance);
    }

    // --- [ b3RequestCameraImageSetLightAmbientCoeff ] ---

    public static native void nb3RequestCameraImageSetLightAmbientCoeff(long commandHandle, float lightAmbientCoeff);

    public static void b3RequestCameraImageSetLightAmbientCoeff(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, float lightAmbientCoeff) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3RequestCameraImageSetLightAmbientCoeff(commandHandle, lightAmbientCoeff);
    }

    // --- [ b3RequestCameraImageSetLightDiffuseCoeff ] ---

    public static native void nb3RequestCameraImageSetLightDiffuseCoeff(long commandHandle, float lightDiffuseCoeff);

    public static void b3RequestCameraImageSetLightDiffuseCoeff(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, float lightDiffuseCoeff) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3RequestCameraImageSetLightDiffuseCoeff(commandHandle, lightDiffuseCoeff);
    }

    // --- [ b3RequestCameraImageSetLightSpecularCoeff ] ---

    public static native void nb3RequestCameraImageSetLightSpecularCoeff(long commandHandle, float lightSpecularCoeff);

    public static void b3RequestCameraImageSetLightSpecularCoeff(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, float lightSpecularCoeff) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3RequestCameraImageSetLightSpecularCoeff(commandHandle, lightSpecularCoeff);
    }

    // --- [ b3RequestCameraImageSetShadow ] ---

    public static native void nb3RequestCameraImageSetShadow(long commandHandle, int hasShadow);

    public static void b3RequestCameraImageSetShadow(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int hasShadow) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3RequestCameraImageSetShadow(commandHandle, hasShadow);
    }

    // --- [ b3RequestCameraImageSelectRenderer ] ---

    public static native void nb3RequestCameraImageSelectRenderer(long commandHandle, int renderer);

    public static void b3RequestCameraImageSelectRenderer(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int renderer) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3RequestCameraImageSelectRenderer(commandHandle, renderer);
    }

    // --- [ b3RequestCameraImageSetFlags ] ---

    public static native void nb3RequestCameraImageSetFlags(long commandHandle, int flags);

    public static void b3RequestCameraImageSetFlags(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int flags) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3RequestCameraImageSetFlags(commandHandle, flags);
    }

    // --- [ b3GetCameraImageData ] ---

    public static native void nb3GetCameraImageData(long physClient, long imageData);

    public static void b3GetCameraImageData(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("struct b3CameraImageData *") B3CameraImageData imageData) {
        if (CHECKS) {
            check(physClient);
        }
        nb3GetCameraImageData(physClient, imageData.address());
    }

    // --- [ b3RequestCameraImageSetProjectiveTextureMatrices ] ---

    public static native void nb3RequestCameraImageSetProjectiveTextureMatrices(long commandHandle, long viewMatrix, long projectionMatrix);

    public static void b3RequestCameraImageSetProjectiveTextureMatrices(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("float *") FloatBuffer viewMatrix, @NativeType("float *") FloatBuffer projectionMatrix) {
        if (CHECKS) {
            check(commandHandle);
            check(viewMatrix, 16);
            check(projectionMatrix, 16);
        }
        nb3RequestCameraImageSetProjectiveTextureMatrices(commandHandle, memAddress(viewMatrix), memAddress(projectionMatrix));
    }

    // --- [ b3ComputeViewMatrixFromPositions ] ---

    public static native void nb3ComputeViewMatrixFromPositions(long cameraPosition, long cameraTargetPosition, long cameraUp, long viewMatrix);

    public static void b3ComputeViewMatrixFromPositions(@NativeType("float const *") FloatBuffer cameraPosition, @NativeType("float const *") FloatBuffer cameraTargetPosition, @NativeType("float const *") FloatBuffer cameraUp, @NativeType("float *") FloatBuffer viewMatrix) {
        if (CHECKS) {
            check(cameraPosition, 3);
            check(cameraTargetPosition, 3);
            check(cameraUp, 3);
            check(viewMatrix, 16);
        }
        nb3ComputeViewMatrixFromPositions(memAddress(cameraPosition), memAddress(cameraTargetPosition), memAddress(cameraUp), memAddress(viewMatrix));
    }

    // --- [ b3ComputeViewMatrixFromYawPitchRoll ] ---

    public static native void nb3ComputeViewMatrixFromYawPitchRoll(long cameraTargetPosition, float distance, float yaw, float pitch, float roll, int upAxis, long viewMatrix);

    public static void b3ComputeViewMatrixFromYawPitchRoll(@NativeType("float const *") FloatBuffer cameraTargetPosition, float distance, float yaw, float pitch, float roll, int upAxis, @NativeType("float *") FloatBuffer viewMatrix) {
        if (CHECKS) {
            check(cameraTargetPosition, 3);
            check(viewMatrix, 16);
        }
        nb3ComputeViewMatrixFromYawPitchRoll(memAddress(cameraTargetPosition), distance, yaw, pitch, roll, upAxis, memAddress(viewMatrix));
    }

    // --- [ b3ComputePositionFromViewMatrix ] ---

    public static native void nb3ComputePositionFromViewMatrix(long viewMatrix, long cameraPosition, long cameraTargetPosition, long cameraUp);

    public static void b3ComputePositionFromViewMatrix(@NativeType("float const *") FloatBuffer viewMatrix, @NativeType("float *") FloatBuffer cameraPosition, @NativeType("float *") FloatBuffer cameraTargetPosition, @NativeType("float *") FloatBuffer cameraUp) {
        if (CHECKS) {
            check(viewMatrix, 16);
            check(cameraPosition, 3);
            check(cameraTargetPosition, 3);
            check(cameraUp, 3);
        }
        nb3ComputePositionFromViewMatrix(memAddress(viewMatrix), memAddress(cameraPosition), memAddress(cameraTargetPosition), memAddress(cameraUp));
    }

    // --- [ b3ComputeProjectionMatrix ] ---

    public static native void nb3ComputeProjectionMatrix(float left, float right, float bottom, float top, float nearVal, float farVal, long projectionMatrix);

    public static void b3ComputeProjectionMatrix(float left, float right, float bottom, float top, float nearVal, float farVal, @NativeType("float *") FloatBuffer projectionMatrix) {
        if (CHECKS) {
            check(projectionMatrix, 16);
        }
        nb3ComputeProjectionMatrix(left, right, bottom, top, nearVal, farVal, memAddress(projectionMatrix));
    }

    // --- [ b3ComputeProjectionMatrixFOV ] ---

    public static native void nb3ComputeProjectionMatrixFOV(float fov, float aspect, float nearVal, float farVal, long projectionMatrix);

    public static void b3ComputeProjectionMatrixFOV(float fov, float aspect, float nearVal, float farVal, @NativeType("float *") FloatBuffer projectionMatrix) {
        if (CHECKS) {
            check(projectionMatrix, 16);
        }
        nb3ComputeProjectionMatrixFOV(fov, aspect, nearVal, farVal, memAddress(projectionMatrix));
    }

    // --- [ b3InitRequestContactPointInformation ] ---

    public static native long nb3InitRequestContactPointInformation(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRequestContactPointInformation(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitRequestContactPointInformation(physClient);
    }

    // --- [ b3SetContactFilterBodyA ] ---

    public static native void nb3SetContactFilterBodyA(long commandHandle, int bodyUniqueIdA);

    public static void b3SetContactFilterBodyA(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueIdA) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetContactFilterBodyA(commandHandle, bodyUniqueIdA);
    }

    // --- [ b3SetContactFilterBodyB ] ---

    public static native void nb3SetContactFilterBodyB(long commandHandle, int bodyUniqueIdB);

    public static void b3SetContactFilterBodyB(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueIdB) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetContactFilterBodyB(commandHandle, bodyUniqueIdB);
    }

    // --- [ b3SetContactFilterLinkA ] ---

    public static native void nb3SetContactFilterLinkA(long commandHandle, int linkIndexA);

    public static void b3SetContactFilterLinkA(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int linkIndexA) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetContactFilterLinkA(commandHandle, linkIndexA);
    }

    // --- [ b3SetContactFilterLinkB ] ---

    public static native void nb3SetContactFilterLinkB(long commandHandle, int linkIndexB);

    public static void b3SetContactFilterLinkB(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int linkIndexB) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetContactFilterLinkB(commandHandle, linkIndexB);
    }

    // --- [ b3GetContactPointInformation ] ---

    public static native void nb3GetContactPointInformation(long physClient, long contactPointData);

    public static void b3GetContactPointInformation(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("struct b3ContactInformation *") B3ContactInformation contactPointData) {
        if (CHECKS) {
            check(physClient);
        }
        nb3GetContactPointInformation(physClient, contactPointData.address());
    }

    // --- [ b3InitClosestDistanceQuery ] ---

    public static native long nb3InitClosestDistanceQuery(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitClosestDistanceQuery(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitClosestDistanceQuery(physClient);
    }

    // --- [ b3SetClosestDistanceFilterBodyA ] ---

    public static native void nb3SetClosestDistanceFilterBodyA(long commandHandle, int bodyUniqueIdA);

    public static void b3SetClosestDistanceFilterBodyA(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueIdA) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetClosestDistanceFilterBodyA(commandHandle, bodyUniqueIdA);
    }

    // --- [ b3SetClosestDistanceFilterLinkA ] ---

    public static native void nb3SetClosestDistanceFilterLinkA(long commandHandle, int linkIndexA);

    public static void b3SetClosestDistanceFilterLinkA(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int linkIndexA) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetClosestDistanceFilterLinkA(commandHandle, linkIndexA);
    }

    // --- [ b3SetClosestDistanceFilterBodyB ] ---

    public static native void nb3SetClosestDistanceFilterBodyB(long commandHandle, int bodyUniqueIdB);

    public static void b3SetClosestDistanceFilterBodyB(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueIdB) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetClosestDistanceFilterBodyB(commandHandle, bodyUniqueIdB);
    }

    // --- [ b3SetClosestDistanceFilterLinkB ] ---

    public static native void nb3SetClosestDistanceFilterLinkB(long commandHandle, int linkIndexB);

    public static void b3SetClosestDistanceFilterLinkB(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int linkIndexB) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetClosestDistanceFilterLinkB(commandHandle, linkIndexB);
    }

    // --- [ b3SetClosestDistanceThreshold ] ---

    public static native void nb3SetClosestDistanceThreshold(long commandHandle, double distance);

    public static void b3SetClosestDistanceThreshold(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double distance) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetClosestDistanceThreshold(commandHandle, distance);
    }

    // --- [ b3SetClosestDistanceFilterCollisionShapeA ] ---

    public static native void nb3SetClosestDistanceFilterCollisionShapeA(long commandHandle, int collisionShapeA);

    public static void b3SetClosestDistanceFilterCollisionShapeA(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int collisionShapeA) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetClosestDistanceFilterCollisionShapeA(commandHandle, collisionShapeA);
    }

    // --- [ b3SetClosestDistanceFilterCollisionShapeB ] ---

    public static native void nb3SetClosestDistanceFilterCollisionShapeB(long commandHandle, int collisionShapeB);

    public static void b3SetClosestDistanceFilterCollisionShapeB(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int collisionShapeB) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetClosestDistanceFilterCollisionShapeB(commandHandle, collisionShapeB);
    }

    // --- [ b3SetClosestDistanceFilterCollisionShapePositionA ] ---

    public static native void nb3SetClosestDistanceFilterCollisionShapePositionA(long commandHandle, long collisionShapePositionA);

    public static void b3SetClosestDistanceFilterCollisionShapePositionA(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer collisionShapePositionA) {
        if (CHECKS) {
            check(commandHandle);
            check(collisionShapePositionA, 3);
        }
        nb3SetClosestDistanceFilterCollisionShapePositionA(commandHandle, memAddress(collisionShapePositionA));
    }

    // --- [ b3SetClosestDistanceFilterCollisionShapePositionB ] ---

    public static native void nb3SetClosestDistanceFilterCollisionShapePositionB(long commandHandle, long collisionShapePositionB);

    public static void b3SetClosestDistanceFilterCollisionShapePositionB(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer collisionShapePositionB) {
        if (CHECKS) {
            check(commandHandle);
            check(collisionShapePositionB, 3);
        }
        nb3SetClosestDistanceFilterCollisionShapePositionB(commandHandle, memAddress(collisionShapePositionB));
    }

    // --- [ b3SetClosestDistanceFilterCollisionShapeOrientationA ] ---

    public static native void nb3SetClosestDistanceFilterCollisionShapeOrientationA(long commandHandle, long collisionShapeOrientationA);

    public static void b3SetClosestDistanceFilterCollisionShapeOrientationA(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer collisionShapeOrientationA) {
        if (CHECKS) {
            check(commandHandle);
            check(collisionShapeOrientationA, 4);
        }
        nb3SetClosestDistanceFilterCollisionShapeOrientationA(commandHandle, memAddress(collisionShapeOrientationA));
    }

    // --- [ b3SetClosestDistanceFilterCollisionShapeOrientationB ] ---

    public static native void nb3SetClosestDistanceFilterCollisionShapeOrientationB(long commandHandle, long collisionShapeOrientationB);

    public static void b3SetClosestDistanceFilterCollisionShapeOrientationB(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer collisionShapeOrientationB) {
        if (CHECKS) {
            check(commandHandle);
            check(collisionShapeOrientationB, 4);
        }
        nb3SetClosestDistanceFilterCollisionShapeOrientationB(commandHandle, memAddress(collisionShapeOrientationB));
    }

    // --- [ b3GetClosestPointInformation ] ---

    public static native void nb3GetClosestPointInformation(long physClient, long contactPointInfo);

    public static void b3GetClosestPointInformation(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("struct b3ContactInformation *") B3ContactInformation contactPointInfo) {
        if (CHECKS) {
            check(physClient);
        }
        nb3GetClosestPointInformation(physClient, contactPointInfo.address());
    }

    // --- [ b3InitAABBOverlapQuery ] ---

    public static native long nb3InitAABBOverlapQuery(long physClient, long aabbMin, long aabbMax);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitAABBOverlapQuery(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("double const *") DoubleBuffer aabbMin, @NativeType("double const *") DoubleBuffer aabbMax) {
        if (CHECKS) {
            check(physClient);
            check(aabbMin, 3);
            check(aabbMax, 3);
        }
        return nb3InitAABBOverlapQuery(physClient, memAddress(aabbMin), memAddress(aabbMax));
    }

    // --- [ b3GetAABBOverlapResults ] ---

    public static native void nb3GetAABBOverlapResults(long physClient, long data);

    public static void b3GetAABBOverlapResults(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("struct b3AABBOverlapData *") B3AABBOverlapData data) {
        if (CHECKS) {
            check(physClient);
        }
        nb3GetAABBOverlapResults(physClient, data.address());
    }

    // --- [ b3InitRequestVisualShapeInformation ] ---

    public static native long nb3InitRequestVisualShapeInformation(long physClient, int bodyUniqueIdA);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRequestVisualShapeInformation(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueIdA) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitRequestVisualShapeInformation(physClient, bodyUniqueIdA);
    }

    // --- [ b3GetVisualShapeInformation ] ---

    public static native void nb3GetVisualShapeInformation(long physClient, long visualShapeInfo);

    public static void b3GetVisualShapeInformation(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("struct b3VisualShapeInformation *") B3VisualShapeInformation visualShapeInfo) {
        if (CHECKS) {
            check(physClient);
        }
        nb3GetVisualShapeInformation(physClient, visualShapeInfo.address());
    }

    // --- [ b3InitRequestCollisionShapeInformation ] ---

    public static native long nb3InitRequestCollisionShapeInformation(long physClient, int bodyUniqueId, int linkIndex);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRequestCollisionShapeInformation(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, int linkIndex) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitRequestCollisionShapeInformation(physClient, bodyUniqueId, linkIndex);
    }

    // --- [ b3GetCollisionShapeInformation ] ---

    public static native void nb3GetCollisionShapeInformation(long physClient, long collisionShapeInfo);

    public static void b3GetCollisionShapeInformation(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("struct b3CollisionShapeInformation *") B3CollisionShapeInformation collisionShapeInfo) {
        if (CHECKS) {
            check(physClient);
        }
        nb3GetCollisionShapeInformation(physClient, collisionShapeInfo.address());
    }

    // --- [ b3InitLoadTexture ] ---

    public static native long nb3InitLoadTexture(long physClient, long filename);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitLoadTexture(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer filename) {
        if (CHECKS) {
            check(physClient);
            checkNT1(filename);
        }
        return nb3InitLoadTexture(physClient, memAddress(filename));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitLoadTexture(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence filename) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nb3InitLoadTexture(physClient, filenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3GetStatusTextureUniqueId ] ---

    public static native int nb3GetStatusTextureUniqueId(long statusHandle);

    public static int b3GetStatusTextureUniqueId(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusTextureUniqueId(statusHandle);
    }

    // --- [ b3CreateChangeTextureCommandInit ] ---

    public static native long nb3CreateChangeTextureCommandInit(long physClient, int textureUniqueId, int width, int height, long rgbPixels);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CreateChangeTextureCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, int textureUniqueId, int width, int height, @NativeType("char const *") ByteBuffer rgbPixels) {
        if (CHECKS) {
            check(physClient);
            check(rgbPixels, 3 * width * height);
        }
        return nb3CreateChangeTextureCommandInit(physClient, textureUniqueId, width, height, memAddress(rgbPixels));
    }

    // --- [ b3InitUpdateVisualShape ] ---

    public static native long nb3InitUpdateVisualShape(long physClient, int bodyUniqueId, int jointIndex, int shapeIndex, int textureUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitUpdateVisualShape(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, int jointIndex, int shapeIndex, int textureUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitUpdateVisualShape(physClient, bodyUniqueId, jointIndex, shapeIndex, textureUniqueId);
    }

    // --- [ b3UpdateVisualShapeRGBAColor ] ---

    public static native void nb3UpdateVisualShapeRGBAColor(long commandHandle, long rgbaColor);

    public static void b3UpdateVisualShapeRGBAColor(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer rgbaColor) {
        if (CHECKS) {
            check(commandHandle);
            check(rgbaColor, 4);
        }
        nb3UpdateVisualShapeRGBAColor(commandHandle, memAddress(rgbaColor));
    }

    // --- [ b3UpdateVisualShapeSpecularColor ] ---

    public static native void nb3UpdateVisualShapeSpecularColor(long commandHandle, long specularColor);

    public static void b3UpdateVisualShapeSpecularColor(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer specularColor) {
        if (CHECKS) {
            check(commandHandle);
            check(specularColor, 3);
        }
        nb3UpdateVisualShapeSpecularColor(commandHandle, memAddress(specularColor));
    }

    // --- [ b3InitPhysicsParamCommand ] ---

    public static native long nb3InitPhysicsParamCommand(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitPhysicsParamCommand(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitPhysicsParamCommand(physClient);
    }

    // --- [ b3InitPhysicsParamCommand2 ] ---

    public static native long nb3InitPhysicsParamCommand2(long commandHandle);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitPhysicsParamCommand2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitPhysicsParamCommand2(commandHandle);
    }

    // --- [ b3PhysicsParamSetGravity ] ---

    public static native int nb3PhysicsParamSetGravity(long commandHandle, double gravx, double gravy, double gravz);

    public static int b3PhysicsParamSetGravity(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double gravx, double gravy, double gravz) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetGravity(commandHandle, gravx, gravy, gravz);
    }

    // --- [ b3PhysicsParamSetTimeStep ] ---

    public static native int nb3PhysicsParamSetTimeStep(long commandHandle, double timeStep);

    public static int b3PhysicsParamSetTimeStep(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double timeStep) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetTimeStep(commandHandle, timeStep);
    }

    // --- [ b3PhysicsParamSetDefaultContactERP ] ---

    public static native int nb3PhysicsParamSetDefaultContactERP(long commandHandle, double defaultContactERP);

    public static int b3PhysicsParamSetDefaultContactERP(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double defaultContactERP) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetDefaultContactERP(commandHandle, defaultContactERP);
    }

    // --- [ b3PhysicsParamSetDefaultNonContactERP ] ---

    public static native int nb3PhysicsParamSetDefaultNonContactERP(long commandHandle, double defaultNonContactERP);

    public static int b3PhysicsParamSetDefaultNonContactERP(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double defaultNonContactERP) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetDefaultNonContactERP(commandHandle, defaultNonContactERP);
    }

    // --- [ b3PhysicsParamSetDefaultFrictionERP ] ---

    public static native int nb3PhysicsParamSetDefaultFrictionERP(long commandHandle, double frictionERP);

    public static int b3PhysicsParamSetDefaultFrictionERP(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double frictionERP) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetDefaultFrictionERP(commandHandle, frictionERP);
    }

    // --- [ b3PhysicsParamSetDefaultGlobalCFM ] ---

    public static native int nb3PhysicsParamSetDefaultGlobalCFM(long commandHandle, double defaultGlobalCFM);

    public static int b3PhysicsParamSetDefaultGlobalCFM(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double defaultGlobalCFM) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetDefaultGlobalCFM(commandHandle, defaultGlobalCFM);
    }

    // --- [ b3PhysicsParamSetDefaultFrictionCFM ] ---

    public static native int nb3PhysicsParamSetDefaultFrictionCFM(long commandHandle, double frictionCFM);

    public static int b3PhysicsParamSetDefaultFrictionCFM(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double frictionCFM) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetDefaultFrictionCFM(commandHandle, frictionCFM);
    }

    // --- [ b3PhysicsParamSetNumSubSteps ] ---

    public static native int nb3PhysicsParamSetNumSubSteps(long commandHandle, int numSubSteps);

    public static int b3PhysicsParamSetNumSubSteps(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int numSubSteps) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetNumSubSteps(commandHandle, numSubSteps);
    }

    // --- [ b3PhysicsParamSetRealTimeSimulation ] ---

    public static native int nb3PhysicsParamSetRealTimeSimulation(long commandHandle, int enableRealTimeSimulation);

    public static int b3PhysicsParamSetRealTimeSimulation(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("int") boolean enableRealTimeSimulation) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetRealTimeSimulation(commandHandle, enableRealTimeSimulation ? 1 : 0);
    }

    // --- [ b3PhysicsParamSetNumSolverIterations ] ---

    public static native int nb3PhysicsParamSetNumSolverIterations(long commandHandle, int numSolverIterations);

    public static int b3PhysicsParamSetNumSolverIterations(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int numSolverIterations) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetNumSolverIterations(commandHandle, numSolverIterations);
    }

    // --- [ b3PhysicsParamSetCollisionFilterMode ] ---

    public static native int nb3PhysicsParamSetCollisionFilterMode(long commandHandle, int filterMode);

    public static int b3PhysicsParamSetCollisionFilterMode(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int filterMode) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetCollisionFilterMode(commandHandle, filterMode);
    }

    // --- [ b3PhysicsParamSetUseSplitImpulse ] ---

    public static native int nb3PhysicsParamSetUseSplitImpulse(long commandHandle, int useSplitImpulse);

    public static int b3PhysicsParamSetUseSplitImpulse(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int useSplitImpulse) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetUseSplitImpulse(commandHandle, useSplitImpulse);
    }

    // --- [ b3PhysicsParamSetSplitImpulsePenetrationThreshold ] ---

    public static native int nb3PhysicsParamSetSplitImpulsePenetrationThreshold(long commandHandle, double splitImpulsePenetrationThreshold);

    public static int b3PhysicsParamSetSplitImpulsePenetrationThreshold(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double splitImpulsePenetrationThreshold) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetSplitImpulsePenetrationThreshold(commandHandle, splitImpulsePenetrationThreshold);
    }

    // --- [ b3PhysicsParamSetContactBreakingThreshold ] ---

    public static native int nb3PhysicsParamSetContactBreakingThreshold(long commandHandle, double contactBreakingThreshold);

    public static int b3PhysicsParamSetContactBreakingThreshold(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double contactBreakingThreshold) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetContactBreakingThreshold(commandHandle, contactBreakingThreshold);
    }

    // --- [ b3PhysicsParamSetMaxNumCommandsPer1ms ] ---

    public static native int nb3PhysicsParamSetMaxNumCommandsPer1ms(long commandHandle, int maxNumCmdPer1ms);

    public static int b3PhysicsParamSetMaxNumCommandsPer1ms(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int maxNumCmdPer1ms) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetMaxNumCommandsPer1ms(commandHandle, maxNumCmdPer1ms);
    }

    // --- [ b3PhysicsParamSetEnableFileCaching ] ---

    public static native int nb3PhysicsParamSetEnableFileCaching(long commandHandle, int enableFileCaching);

    public static int b3PhysicsParamSetEnableFileCaching(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("int") boolean enableFileCaching) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetEnableFileCaching(commandHandle, enableFileCaching ? 1 : 0);
    }

    // --- [ b3PhysicsParamSetRestitutionVelocityThreshold ] ---

    public static native int nb3PhysicsParamSetRestitutionVelocityThreshold(long commandHandle, double restitutionVelocityThreshold);

    public static int b3PhysicsParamSetRestitutionVelocityThreshold(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double restitutionVelocityThreshold) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetRestitutionVelocityThreshold(commandHandle, restitutionVelocityThreshold);
    }

    // --- [ b3PhysicsParamSetEnableConeFriction ] ---

    public static native int nb3PhysicsParamSetEnableConeFriction(long commandHandle, int enableConeFriction);

    public static int b3PhysicsParamSetEnableConeFriction(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("int") boolean enableConeFriction) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetEnableConeFriction(commandHandle, enableConeFriction ? 1 : 0);
    }

    // --- [ b3PhysicsParameterSetDeterministicOverlappingPairs ] ---

    public static native int nb3PhysicsParameterSetDeterministicOverlappingPairs(long commandHandle, int deterministicOverlappingPairs);

    public static int b3PhysicsParameterSetDeterministicOverlappingPairs(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int deterministicOverlappingPairs) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParameterSetDeterministicOverlappingPairs(commandHandle, deterministicOverlappingPairs);
    }

    // --- [ b3PhysicsParameterSetAllowedCcdPenetration ] ---

    public static native int nb3PhysicsParameterSetAllowedCcdPenetration(long commandHandle, double allowedCcdPenetration);

    public static int b3PhysicsParameterSetAllowedCcdPenetration(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double allowedCcdPenetration) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParameterSetAllowedCcdPenetration(commandHandle, allowedCcdPenetration);
    }

    // --- [ b3PhysicsParameterSetJointFeedbackMode ] ---

    public static native int nb3PhysicsParameterSetJointFeedbackMode(long commandHandle, int jointFeedbackMode);

    public static int b3PhysicsParameterSetJointFeedbackMode(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int jointFeedbackMode) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParameterSetJointFeedbackMode(commandHandle, jointFeedbackMode);
    }

    // --- [ b3PhysicsParamSetSolverResidualThreshold ] ---

    public static native int nb3PhysicsParamSetSolverResidualThreshold(long commandHandle, double solverResidualThreshold);

    public static int b3PhysicsParamSetSolverResidualThreshold(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double solverResidualThreshold) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetSolverResidualThreshold(commandHandle, solverResidualThreshold);
    }

    // --- [ b3PhysicsParamSetContactSlop ] ---

    public static native int nb3PhysicsParamSetContactSlop(long commandHandle, double contactSlop);

    public static int b3PhysicsParamSetContactSlop(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double contactSlop) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetContactSlop(commandHandle, contactSlop);
    }

    // --- [ b3PhysicsParameterSetEnableSAT ] ---

    public static native int nb3PhysicsParameterSetEnableSAT(long commandHandle, int enableSAT);

    public static int b3PhysicsParameterSetEnableSAT(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("int") boolean enableSAT) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParameterSetEnableSAT(commandHandle, enableSAT ? 1 : 0);
    }

    // --- [ b3PhysicsParameterSetConstraintSolverType ] ---

    public static native int nb3PhysicsParameterSetConstraintSolverType(long commandHandle, int raintSolverType);

    public static int b3PhysicsParameterSetConstraintSolverType(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("int const") int raintSolverType) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParameterSetConstraintSolverType(commandHandle, raintSolverType);
    }

    // --- [ b3PhysicsParameterSetMinimumSolverIslandSize ] ---

    public static native int nb3PhysicsParameterSetMinimumSolverIslandSize(long commandHandle, int minimumSolverIslandSize);

    public static int b3PhysicsParameterSetMinimumSolverIslandSize(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int minimumSolverIslandSize) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParameterSetMinimumSolverIslandSize(commandHandle, minimumSolverIslandSize);
    }

    // --- [ b3InitRequestPhysicsParamCommand ] ---

    public static native long nb3InitRequestPhysicsParamCommand(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRequestPhysicsParamCommand(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitRequestPhysicsParamCommand(physClient);
    }

    // --- [ b3GetStatusPhysicsSimulationParameters ] ---

    public static native int nb3GetStatusPhysicsSimulationParameters(long statusHandle, long params);

    public static int b3GetStatusPhysicsSimulationParameters(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, @NativeType("struct b3PhysicsSimulationParameters *") B3PhysicsSimulationParameters params) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusPhysicsSimulationParameters(statusHandle, params.address());
    }

    // --- [ b3PhysicsParamSetInternalSimFlags ] ---

    public static native int nb3PhysicsParamSetInternalSimFlags(long commandHandle, int flags);

    public static int b3PhysicsParamSetInternalSimFlags(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int flags) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3PhysicsParamSetInternalSimFlags(commandHandle, flags);
    }

    // --- [ b3InitStepSimulationCommand ] ---

    public static native long nb3InitStepSimulationCommand(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitStepSimulationCommand(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitStepSimulationCommand(physClient);
    }

    // --- [ b3InitStepSimulationCommand2 ] ---

    public static native long nb3InitStepSimulationCommand2(long commandHandle);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitStepSimulationCommand2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitStepSimulationCommand2(commandHandle);
    }

    // --- [ b3InitResetSimulationCommand ] ---

    public static native long nb3InitResetSimulationCommand(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitResetSimulationCommand(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitResetSimulationCommand(physClient);
    }

    // --- [ b3InitResetSimulationCommand2 ] ---

    public static native long nb3InitResetSimulationCommand2(long commandHandle);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitResetSimulationCommand2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3InitResetSimulationCommand2(commandHandle);
    }

    // --- [ b3LoadUrdfCommandInit ] ---

    public static native long nb3LoadUrdfCommandInit(long physClient, long urdfFileName);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadUrdfCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer urdfFileName) {
        if (CHECKS) {
            check(physClient);
            checkNT1(urdfFileName);
        }
        return nb3LoadUrdfCommandInit(physClient, memAddress(urdfFileName));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadUrdfCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence urdfFileName) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(urdfFileName, true);
            long urdfFileNameEncoded = stack.getPointerAddress();
            return nb3LoadUrdfCommandInit(physClient, urdfFileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3LoadUrdfCommandInit2 ] ---

    public static native long nb3LoadUrdfCommandInit2(long commandHandle, long urdfFileName);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadUrdfCommandInit2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") ByteBuffer urdfFileName) {
        if (CHECKS) {
            check(commandHandle);
            checkNT1(urdfFileName);
        }
        return nb3LoadUrdfCommandInit2(commandHandle, memAddress(urdfFileName));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadUrdfCommandInit2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") CharSequence urdfFileName) {
        if (CHECKS) {
            check(commandHandle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(urdfFileName, true);
            long urdfFileNameEncoded = stack.getPointerAddress();
            return nb3LoadUrdfCommandInit2(commandHandle, urdfFileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3LoadUrdfCommandSetStartPosition ] ---

    public static native int nb3LoadUrdfCommandSetStartPosition(long commandHandle, double startPosX, double startPosY, double startPosZ);

    public static int b3LoadUrdfCommandSetStartPosition(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double startPosX, double startPosY, double startPosZ) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadUrdfCommandSetStartPosition(commandHandle, startPosX, startPosY, startPosZ);
    }

    // --- [ b3LoadUrdfCommandSetStartOrientation ] ---

    public static native int nb3LoadUrdfCommandSetStartOrientation(long commandHandle, double startOrnX, double startOrnY, double startOrnZ, double startOrnW);

    public static int b3LoadUrdfCommandSetStartOrientation(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double startOrnX, double startOrnY, double startOrnZ, double startOrnW) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadUrdfCommandSetStartOrientation(commandHandle, startOrnX, startOrnY, startOrnZ, startOrnW);
    }

    // --- [ b3LoadUrdfCommandSetUseMultiBody ] ---

    public static native int nb3LoadUrdfCommandSetUseMultiBody(long commandHandle, int useMultiBody);

    public static int b3LoadUrdfCommandSetUseMultiBody(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int useMultiBody) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadUrdfCommandSetUseMultiBody(commandHandle, useMultiBody);
    }

    // --- [ b3LoadUrdfCommandSetUseFixedBase ] ---

    public static native int nb3LoadUrdfCommandSetUseFixedBase(long commandHandle, int useFixedBase);

    public static int b3LoadUrdfCommandSetUseFixedBase(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int useFixedBase) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadUrdfCommandSetUseFixedBase(commandHandle, useFixedBase);
    }

    // --- [ b3LoadUrdfCommandSetFlags ] ---

    public static native int nb3LoadUrdfCommandSetFlags(long commandHandle, int flags);

    public static int b3LoadUrdfCommandSetFlags(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int flags) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadUrdfCommandSetFlags(commandHandle, flags);
    }

    // --- [ b3LoadUrdfCommandSetGlobalScaling ] ---

    public static native int nb3LoadUrdfCommandSetGlobalScaling(long commandHandle, double globalScaling);

    public static int b3LoadUrdfCommandSetGlobalScaling(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double globalScaling) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadUrdfCommandSetGlobalScaling(commandHandle, globalScaling);
    }

    // --- [ b3SaveStateCommandInit ] ---

    public static native long nb3SaveStateCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3SaveStateCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3SaveStateCommandInit(physClient);
    }

    // --- [ b3GetStatusGetStateId ] ---

    public static native int nb3GetStatusGetStateId(long statusHandle);

    public static int b3GetStatusGetStateId(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusGetStateId(statusHandle);
    }

    // --- [ b3LoadStateCommandInit ] ---

    public static native long nb3LoadStateCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadStateCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3LoadStateCommandInit(physClient);
    }

    // --- [ b3LoadStateSetStateId ] ---

    public static native int nb3LoadStateSetStateId(long commandHandle, int stateId);

    public static int b3LoadStateSetStateId(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int stateId) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadStateSetStateId(commandHandle, stateId);
    }

    // --- [ b3LoadStateSetFileName ] ---

    public static native int nb3LoadStateSetFileName(long commandHandle, long fileName);

    public static int b3LoadStateSetFileName(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") ByteBuffer fileName) {
        if (CHECKS) {
            check(commandHandle);
            checkNT1(fileName);
        }
        return nb3LoadStateSetFileName(commandHandle, memAddress(fileName));
    }

    public static int b3LoadStateSetFileName(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") CharSequence fileName) {
        if (CHECKS) {
            check(commandHandle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nb3LoadStateSetFileName(commandHandle, fileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3LoadBulletCommandInit ] ---

    public static native long nb3LoadBulletCommandInit(long physClient, long fileName);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadBulletCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer fileName) {
        if (CHECKS) {
            check(physClient);
            checkNT1(fileName);
        }
        return nb3LoadBulletCommandInit(physClient, memAddress(fileName));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadBulletCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence fileName) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nb3LoadBulletCommandInit(physClient, fileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3SaveBulletCommandInit ] ---

    public static native long nb3SaveBulletCommandInit(long physClient, long fileName);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3SaveBulletCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer fileName) {
        if (CHECKS) {
            check(physClient);
            checkNT1(fileName);
        }
        return nb3SaveBulletCommandInit(physClient, memAddress(fileName));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3SaveBulletCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence fileName) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nb3SaveBulletCommandInit(physClient, fileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3LoadMJCFCommandInit ] ---

    public static native long nb3LoadMJCFCommandInit(long physClient, long fileName);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadMJCFCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer fileName) {
        if (CHECKS) {
            check(physClient);
            checkNT1(fileName);
        }
        return nb3LoadMJCFCommandInit(physClient, memAddress(fileName));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadMJCFCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence fileName) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nb3LoadMJCFCommandInit(physClient, fileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3LoadMJCFCommandInit2 ] ---

    public static native long nb3LoadMJCFCommandInit2(long commandHandle, long fileName);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadMJCFCommandInit2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") ByteBuffer fileName) {
        if (CHECKS) {
            check(commandHandle);
            checkNT1(fileName);
        }
        return nb3LoadMJCFCommandInit2(commandHandle, memAddress(fileName));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadMJCFCommandInit2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") CharSequence fileName) {
        if (CHECKS) {
            check(commandHandle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nb3LoadMJCFCommandInit2(commandHandle, fileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3LoadMJCFCommandSetFlags ] ---

    public static native void nb3LoadMJCFCommandSetFlags(long commandHandle, int flags);

    public static void b3LoadMJCFCommandSetFlags(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int flags) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3LoadMJCFCommandSetFlags(commandHandle, flags);
    }

    // --- [ b3CalculateInverseDynamicsCommandInit ] ---

    public static native long nb3CalculateInverseDynamicsCommandInit(long physClient, int bodyUniqueId, long jointPositionsQ, long jointVelocitiesQdot, long jointAccelerations);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CalculateInverseDynamicsCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, @NativeType("double const *") DoubleBuffer jointPositionsQ, @NativeType("double const *") DoubleBuffer jointVelocitiesQdot, @NativeType("double const *") DoubleBuffer jointAccelerations) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CalculateInverseDynamicsCommandInit(physClient, bodyUniqueId, memAddress(jointPositionsQ), memAddress(jointVelocitiesQdot), memAddress(jointAccelerations));
    }

    // --- [ b3GetStatusInverseDynamicsJointForces ] ---

    public static native int nb3GetStatusInverseDynamicsJointForces(long statusHandle, long bodyUniqueId, long dofCount, long jointForces);

    public static int b3GetStatusInverseDynamicsJointForces(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, @Nullable @NativeType("int *") IntBuffer bodyUniqueId, @Nullable @NativeType("int *") IntBuffer dofCount, @Nullable @NativeType("double *") DoubleBuffer jointForces) {
        if (CHECKS) {
            check(statusHandle);
            checkSafe(bodyUniqueId, 1);
            checkSafe(dofCount, 1);
        }
        return nb3GetStatusInverseDynamicsJointForces(statusHandle, memAddressSafe(bodyUniqueId), memAddressSafe(dofCount), memAddressSafe(jointForces));
    }

    // --- [ b3CalculateJacobianCommandInit ] ---

    public static native long nb3CalculateJacobianCommandInit(long physClient, int bodyUniqueId, int linkIndex, long localPosition, long jointPositionsQ, long jointVelocitiesQdot, long jointAccelerations);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CalculateJacobianCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, int linkIndex, @NativeType("double const *") DoubleBuffer localPosition, @NativeType("double const *") DoubleBuffer jointPositionsQ, @NativeType("double const *") DoubleBuffer jointVelocitiesQdot, @NativeType("double const *") DoubleBuffer jointAccelerations) {
        if (CHECKS) {
            check(physClient);
            check(localPosition, 3);
        }
        return nb3CalculateJacobianCommandInit(physClient, bodyUniqueId, linkIndex, memAddress(localPosition), memAddress(jointPositionsQ), memAddress(jointVelocitiesQdot), memAddress(jointAccelerations));
    }

    // --- [ b3GetStatusJacobian ] ---

    public static native int nb3GetStatusJacobian(long statusHandle, long dofCount, long linearJacobian, long angularJacobian);

    public static int b3GetStatusJacobian(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, @Nullable @NativeType("int *") IntBuffer dofCount, @NativeType("double *") DoubleBuffer linearJacobian, @NativeType("double *") DoubleBuffer angularJacobian) {
        if (CHECKS) {
            check(statusHandle);
            checkSafe(dofCount, 1);
        }
        return nb3GetStatusJacobian(statusHandle, memAddressSafe(dofCount), memAddress(linearJacobian), memAddress(angularJacobian));
    }

    // --- [ b3CalculateMassMatrixCommandInit ] ---

    public static native long nb3CalculateMassMatrixCommandInit(long physClient, int bodyUniqueId, long jointPositionsQ);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CalculateMassMatrixCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, @NativeType("double const *") DoubleBuffer jointPositionsQ) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CalculateMassMatrixCommandInit(physClient, bodyUniqueId, memAddress(jointPositionsQ));
    }

    // --- [ b3GetStatusMassMatrix ] ---

    public static native int nb3GetStatusMassMatrix(long physClient, long statusHandle, long dofCount, long massMatrix);

    public static int b3GetStatusMassMatrix(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryStatusHandle") long statusHandle, @Nullable @NativeType("int *") IntBuffer dofCount, @Nullable @NativeType("double *") DoubleBuffer massMatrix) {
        if (CHECKS) {
            check(physClient);
            check(statusHandle);
            checkSafe(dofCount, 1);
        }
        return nb3GetStatusMassMatrix(physClient, statusHandle, memAddressSafe(dofCount), memAddressSafe(massMatrix));
    }

    // --- [ b3CalculateInverseKinematicsCommandInit ] ---

    public static native long nb3CalculateInverseKinematicsCommandInit(long physClient, int bodyUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CalculateInverseKinematicsCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CalculateInverseKinematicsCommandInit(physClient, bodyUniqueId);
    }

    // --- [ b3CalculateInverseKinematicsAddTargetPurePosition ] ---

    public static native void nb3CalculateInverseKinematicsAddTargetPurePosition(long commandHandle, int endEffectorLinkIndex, long targetPosition);

    public static void b3CalculateInverseKinematicsAddTargetPurePosition(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int endEffectorLinkIndex, @NativeType("double const *") DoubleBuffer targetPosition) {
        if (CHECKS) {
            check(commandHandle);
            check(targetPosition, 3);
        }
        nb3CalculateInverseKinematicsAddTargetPurePosition(commandHandle, endEffectorLinkIndex, memAddress(targetPosition));
    }

    // --- [ b3CalculateInverseKinematicsAddTargetPositionWithOrientation ] ---

    public static native void nb3CalculateInverseKinematicsAddTargetPositionWithOrientation(long commandHandle, int endEffectorLinkIndex, long targetPosition, long targetOrientation);

    public static void b3CalculateInverseKinematicsAddTargetPositionWithOrientation(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int endEffectorLinkIndex, @NativeType("double const *") DoubleBuffer targetPosition, @NativeType("double const *") DoubleBuffer targetOrientation) {
        if (CHECKS) {
            check(commandHandle);
            check(targetPosition, 3);
            check(targetOrientation, 4);
        }
        nb3CalculateInverseKinematicsAddTargetPositionWithOrientation(commandHandle, endEffectorLinkIndex, memAddress(targetPosition), memAddress(targetOrientation));
    }

    // --- [ b3CalculateInverseKinematicsPosWithNullSpaceVel ] ---

    public static native void nb3CalculateInverseKinematicsPosWithNullSpaceVel(long commandHandle, int numDof, int endEffectorLinkIndex, long targetPosition, long lowerLimit, long upperLimit, long jointRange, long restPose);

    public static void b3CalculateInverseKinematicsPosWithNullSpaceVel(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int endEffectorLinkIndex, @NativeType("double const *") DoubleBuffer targetPosition, @NativeType("double const *") DoubleBuffer lowerLimit, @NativeType("double const *") DoubleBuffer upperLimit, @NativeType("double const *") DoubleBuffer jointRange, @NativeType("double const *") DoubleBuffer restPose) {
        if (CHECKS) {
            check(commandHandle);
            check(upperLimit, lowerLimit.remaining());
            check(jointRange, lowerLimit.remaining());
            check(restPose, lowerLimit.remaining());
            check(targetPosition, 3);
        }
        nb3CalculateInverseKinematicsPosWithNullSpaceVel(commandHandle, lowerLimit.remaining(), endEffectorLinkIndex, memAddress(targetPosition), memAddress(lowerLimit), memAddress(upperLimit), memAddress(jointRange), memAddress(restPose));
    }

    // --- [ b3CalculateInverseKinematicsPosOrnWithNullSpaceVel ] ---

    public static native void nb3CalculateInverseKinematicsPosOrnWithNullSpaceVel(long commandHandle, int numDof, int endEffectorLinkIndex, long targetPosition, long targetOrientation, long lowerLimit, long upperLimit, long jointRange, long restPose);

    public static void b3CalculateInverseKinematicsPosOrnWithNullSpaceVel(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int endEffectorLinkIndex, @NativeType("double const *") DoubleBuffer targetPosition, @NativeType("double const *") DoubleBuffer targetOrientation, @NativeType("double const *") DoubleBuffer lowerLimit, @NativeType("double const *") DoubleBuffer upperLimit, @NativeType("double const *") DoubleBuffer jointRange, @NativeType("double const *") DoubleBuffer restPose) {
        if (CHECKS) {
            check(commandHandle);
            check(upperLimit, lowerLimit.remaining());
            check(jointRange, lowerLimit.remaining());
            check(restPose, lowerLimit.remaining());
            check(targetPosition, 3);
            check(targetOrientation, 4);
        }
        nb3CalculateInverseKinematicsPosOrnWithNullSpaceVel(commandHandle, lowerLimit.remaining(), endEffectorLinkIndex, memAddress(targetPosition), memAddress(targetOrientation), memAddress(lowerLimit), memAddress(upperLimit), memAddress(jointRange), memAddress(restPose));
    }

    // --- [ b3CalculateInverseKinematicsSetJointDamping ] ---

    public static native void nb3CalculateInverseKinematicsSetJointDamping(long commandHandle, int numDof, long jointDampingCoeff);

    public static void b3CalculateInverseKinematicsSetJointDamping(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer jointDampingCoeff) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CalculateInverseKinematicsSetJointDamping(commandHandle, jointDampingCoeff.remaining(), memAddress(jointDampingCoeff));
    }

    // --- [ b3CalculateInverseKinematicsSelectSolver ] ---

    public static native void nb3CalculateInverseKinematicsSelectSolver(long commandHandle, int solver);

    public static void b3CalculateInverseKinematicsSelectSolver(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int solver) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CalculateInverseKinematicsSelectSolver(commandHandle, solver);
    }

    // --- [ b3GetStatusInverseKinematicsJointPositions ] ---

    public static native int nb3GetStatusInverseKinematicsJointPositions(long statusHandle, long bodyUniqueId, long dofCount, long jointPositions);

    public static int b3GetStatusInverseKinematicsJointPositions(@NativeType("b3SharedMemoryStatusHandle") long statusHandle, @Nullable @NativeType("int *") IntBuffer bodyUniqueId, @Nullable @NativeType("int *") IntBuffer dofCount, @Nullable @NativeType("double *") DoubleBuffer jointPositions) {
        if (CHECKS) {
            check(statusHandle);
            checkSafe(bodyUniqueId, 1);
            checkSafe(dofCount, 1);
        }
        return nb3GetStatusInverseKinematicsJointPositions(statusHandle, memAddressSafe(bodyUniqueId), memAddressSafe(dofCount), memAddressSafe(jointPositions));
    }

    // --- [ b3CalculateInverseKinematicsSetCurrentPositions ] ---

    public static native void nb3CalculateInverseKinematicsSetCurrentPositions(long commandHandle, int numDof, long currentJointPositions);

    public static void b3CalculateInverseKinematicsSetCurrentPositions(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer currentJointPositions) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CalculateInverseKinematicsSetCurrentPositions(commandHandle, currentJointPositions.remaining(), memAddress(currentJointPositions));
    }

    // --- [ b3CalculateInverseKinematicsSetMaxNumIterations ] ---

    public static native void nb3CalculateInverseKinematicsSetMaxNumIterations(long commandHandle, int maxNumIterations);

    public static void b3CalculateInverseKinematicsSetMaxNumIterations(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int maxNumIterations) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CalculateInverseKinematicsSetMaxNumIterations(commandHandle, maxNumIterations);
    }

    // --- [ b3CalculateInverseKinematicsSetResidualThreshold ] ---

    public static native void nb3CalculateInverseKinematicsSetResidualThreshold(long commandHandle, double residualThreshold);

    public static void b3CalculateInverseKinematicsSetResidualThreshold(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double residualThreshold) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CalculateInverseKinematicsSetResidualThreshold(commandHandle, residualThreshold);
    }

    // --- [ b3CollisionFilterCommandInit ] ---

    public static native long nb3CollisionFilterCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CollisionFilterCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CollisionFilterCommandInit(physClient);
    }

    // --- [ b3SetCollisionFilterPair ] ---

    public static native void nb3SetCollisionFilterPair(long commandHandle, int bodyUniqueIdA, int bodyUniqueIdB, int linkIndexA, int linkIndexB, int enableCollision);

    public static void b3SetCollisionFilterPair(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueIdA, int bodyUniqueIdB, int linkIndexA, int linkIndexB, @NativeType("int") boolean enableCollision) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetCollisionFilterPair(commandHandle, bodyUniqueIdA, bodyUniqueIdB, linkIndexA, linkIndexB, enableCollision ? 1 : 0);
    }

    // --- [ b3SetCollisionFilterGroupMask ] ---

    public static native void nb3SetCollisionFilterGroupMask(long commandHandle, int bodyUniqueIdA, int linkIndexA, int collisionFilterGroup, int collisionFilterMask);

    public static void b3SetCollisionFilterGroupMask(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueIdA, int linkIndexA, int collisionFilterGroup, int collisionFilterMask) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetCollisionFilterGroupMask(commandHandle, bodyUniqueIdA, linkIndexA, collisionFilterGroup, collisionFilterMask);
    }

    // --- [ b3LoadSdfCommandInit ] ---

    public static native long nb3LoadSdfCommandInit(long physClient, long sdfFileName);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadSdfCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer sdfFileName) {
        if (CHECKS) {
            check(physClient);
            checkNT1(sdfFileName);
        }
        return nb3LoadSdfCommandInit(physClient, memAddress(sdfFileName));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadSdfCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence sdfFileName) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(sdfFileName, true);
            long sdfFileNameEncoded = stack.getPointerAddress();
            return nb3LoadSdfCommandInit(physClient, sdfFileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3LoadSdfCommandInit2 ] ---

    public static native long nb3LoadSdfCommandInit2(long commandHandle, long sdfFileName);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadSdfCommandInit2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") ByteBuffer sdfFileName) {
        if (CHECKS) {
            check(commandHandle);
            checkNT1(sdfFileName);
        }
        return nb3LoadSdfCommandInit2(commandHandle, memAddress(sdfFileName));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadSdfCommandInit2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") CharSequence sdfFileName) {
        if (CHECKS) {
            check(commandHandle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(sdfFileName, true);
            long sdfFileNameEncoded = stack.getPointerAddress();
            return nb3LoadSdfCommandInit2(commandHandle, sdfFileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3LoadSdfCommandSetUseMultiBody ] ---

    public static native int nb3LoadSdfCommandSetUseMultiBody(long commandHandle, int useMultiBody);

    public static int b3LoadSdfCommandSetUseMultiBody(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int useMultiBody) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadSdfCommandSetUseMultiBody(commandHandle, useMultiBody);
    }

    // --- [ b3LoadSdfCommandSetUseGlobalScaling ] ---

    public static native int nb3LoadSdfCommandSetUseGlobalScaling(long commandHandle, double globalScaling);

    public static int b3LoadSdfCommandSetUseGlobalScaling(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double globalScaling) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadSdfCommandSetUseGlobalScaling(commandHandle, globalScaling);
    }

    // --- [ b3SaveWorldCommandInit ] ---

    public static native long nb3SaveWorldCommandInit(long physClient, long sdfFileName);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3SaveWorldCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer sdfFileName) {
        if (CHECKS) {
            check(physClient);
            checkNT1(sdfFileName);
        }
        return nb3SaveWorldCommandInit(physClient, memAddress(sdfFileName));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3SaveWorldCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence sdfFileName) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(sdfFileName, true);
            long sdfFileNameEncoded = stack.getPointerAddress();
            return nb3SaveWorldCommandInit(physClient, sdfFileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3JointControlCommandInit ] ---

    public static native long nb3JointControlCommandInit(long physClient, int controlMode);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3JointControlCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, int controlMode) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3JointControlCommandInit(physClient, controlMode);
    }

    // --- [ b3JointControlCommandInit2 ] ---

    public static native long nb3JointControlCommandInit2(long physClient, int bodyUniqueId, int controlMode);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3JointControlCommandInit2(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId, int controlMode) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3JointControlCommandInit2(physClient, bodyUniqueId, controlMode);
    }

    // --- [ b3JointControlCommandInit2Internal ] ---

    public static native long nb3JointControlCommandInit2Internal(long commandHandle, int bodyUniqueId, int controlMode);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3JointControlCommandInit2Internal(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int controlMode) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3JointControlCommandInit2Internal(commandHandle, bodyUniqueId, controlMode);
    }

    // --- [ b3JointControlSetDesiredPosition ] ---

    public static native int nb3JointControlSetDesiredPosition(long commandHandle, int qIndex, double value);

    public static int b3JointControlSetDesiredPosition(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int qIndex, double value) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3JointControlSetDesiredPosition(commandHandle, qIndex, value);
    }

    // --- [ b3JointControlSetKp ] ---

    public static native int nb3JointControlSetKp(long commandHandle, int dofIndex, double value);

    public static int b3JointControlSetKp(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int dofIndex, double value) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3JointControlSetKp(commandHandle, dofIndex, value);
    }

    // --- [ b3JointControlSetKd ] ---

    public static native int nb3JointControlSetKd(long commandHandle, int dofIndex, double value);

    public static int b3JointControlSetKd(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int dofIndex, double value) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3JointControlSetKd(commandHandle, dofIndex, value);
    }

    // --- [ b3JointControlSetMaximumVelocity ] ---

    public static native int nb3JointControlSetMaximumVelocity(long commandHandle, int dofIndex, double maximumVelocity);

    public static int b3JointControlSetMaximumVelocity(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int dofIndex, double maximumVelocity) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3JointControlSetMaximumVelocity(commandHandle, dofIndex, maximumVelocity);
    }

    // --- [ b3JointControlSetDesiredVelocity ] ---

    public static native int nb3JointControlSetDesiredVelocity(long commandHandle, int dofIndex, double value);

    public static int b3JointControlSetDesiredVelocity(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int dofIndex, double value) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3JointControlSetDesiredVelocity(commandHandle, dofIndex, value);
    }

    // --- [ b3JointControlSetMaximumForce ] ---

    public static native int nb3JointControlSetMaximumForce(long commandHandle, int dofIndex, double value);

    public static int b3JointControlSetMaximumForce(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int dofIndex, double value) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3JointControlSetMaximumForce(commandHandle, dofIndex, value);
    }

    // --- [ b3JointControlSetDesiredForceTorque ] ---

    public static native int nb3JointControlSetDesiredForceTorque(long commandHandle, int dofIndex, double value);

    public static int b3JointControlSetDesiredForceTorque(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int dofIndex, double value) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3JointControlSetDesiredForceTorque(commandHandle, dofIndex, value);
    }

    // --- [ b3CreateCollisionShapeCommandInit ] ---

    public static native long nb3CreateCollisionShapeCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CreateCollisionShapeCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CreateCollisionShapeCommandInit(physClient);
    }

    // --- [ b3CreateCollisionShapeAddSphere ] ---

    public static native int nb3CreateCollisionShapeAddSphere(long commandHandle, double radius);

    public static int b3CreateCollisionShapeAddSphere(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double radius) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateCollisionShapeAddSphere(commandHandle, radius);
    }

    // --- [ b3CreateCollisionShapeAddBox ] ---

    public static native int nb3CreateCollisionShapeAddBox(long commandHandle, long halfExtents);

    public static int b3CreateCollisionShapeAddBox(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer halfExtents) {
        if (CHECKS) {
            check(commandHandle);
            check(halfExtents, 3);
        }
        return nb3CreateCollisionShapeAddBox(commandHandle, memAddress(halfExtents));
    }

    // --- [ b3CreateCollisionShapeAddCapsule ] ---

    public static native int nb3CreateCollisionShapeAddCapsule(long commandHandle, double radius, double height);

    public static int b3CreateCollisionShapeAddCapsule(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double radius, double height) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateCollisionShapeAddCapsule(commandHandle, radius, height);
    }

    // --- [ b3CreateCollisionShapeAddCylinder ] ---

    public static native int nb3CreateCollisionShapeAddCylinder(long commandHandle, double radius, double height);

    public static int b3CreateCollisionShapeAddCylinder(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double radius, double height) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateCollisionShapeAddCylinder(commandHandle, radius, height);
    }

    // --- [ b3CreateCollisionShapeAddPlane ] ---

    public static native int nb3CreateCollisionShapeAddPlane(long commandHandle, long planeNormal, double planeConstant);

    public static int b3CreateCollisionShapeAddPlane(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer planeNormal, double planeConstant) {
        if (CHECKS) {
            check(commandHandle);
            check(planeNormal, 3);
        }
        return nb3CreateCollisionShapeAddPlane(commandHandle, memAddress(planeNormal), planeConstant);
    }

    // --- [ b3CreateCollisionShapeAddMesh ] ---

    public static native int nb3CreateCollisionShapeAddMesh(long commandHandle, long fileName, long meshScale);

    public static int b3CreateCollisionShapeAddMesh(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") ByteBuffer fileName, @NativeType("double const *") DoubleBuffer meshScale) {
        if (CHECKS) {
            check(commandHandle);
            checkNT1(fileName);
            check(meshScale, 3);
        }
        return nb3CreateCollisionShapeAddMesh(commandHandle, memAddress(fileName), memAddress(meshScale));
    }

    public static int b3CreateCollisionShapeAddMesh(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") CharSequence fileName, @NativeType("double const *") DoubleBuffer meshScale) {
        if (CHECKS) {
            check(commandHandle);
            check(meshScale, 3);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nb3CreateCollisionShapeAddMesh(commandHandle, fileNameEncoded, memAddress(meshScale));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3CreateCollisionSetFlag ] ---

    public static native void nb3CreateCollisionSetFlag(long commandHandle, int shapeIndex, int flags);

    public static void b3CreateCollisionSetFlag(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int shapeIndex, int flags) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CreateCollisionSetFlag(commandHandle, shapeIndex, flags);
    }

    // --- [ b3CreateCollisionShapeSetChildTransform ] ---

    public static native void nb3CreateCollisionShapeSetChildTransform(long commandHandle, int shapeIndex, long childPosition, long childOrientation);

    public static void b3CreateCollisionShapeSetChildTransform(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int shapeIndex, @NativeType("double const *") DoubleBuffer childPosition, @NativeType("double const *") DoubleBuffer childOrientation) {
        if (CHECKS) {
            check(commandHandle);
            check(childPosition, 3);
            check(childOrientation, 4);
        }
        nb3CreateCollisionShapeSetChildTransform(commandHandle, shapeIndex, memAddress(childPosition), memAddress(childOrientation));
    }

    // --- [ b3GetStatusCollisionShapeUniqueId ] ---

    public static native int nb3GetStatusCollisionShapeUniqueId(long statusHandle);

    public static int b3GetStatusCollisionShapeUniqueId(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusCollisionShapeUniqueId(statusHandle);
    }

    // --- [ b3InitRemoveCollisionShapeCommand ] ---

    public static native long nb3InitRemoveCollisionShapeCommand(long physClient, int collisionShapeId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3InitRemoveCollisionShapeCommand(@NativeType("b3PhysicsClientHandle") long physClient, int collisionShapeId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3InitRemoveCollisionShapeCommand(physClient, collisionShapeId);
    }

    // --- [ b3CreateVisualShapeCommandInit ] ---

    public static native long nb3CreateVisualShapeCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CreateVisualShapeCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CreateVisualShapeCommandInit(physClient);
    }

    // --- [ b3CreateVisualShapeAddSphere ] ---

    public static native int nb3CreateVisualShapeAddSphere(long commandHandle, double radius);

    public static int b3CreateVisualShapeAddSphere(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double radius) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateVisualShapeAddSphere(commandHandle, radius);
    }

    // --- [ b3CreateVisualShapeAddBox ] ---

    public static native int nb3CreateVisualShapeAddBox(long commandHandle, long halfExtents);

    public static int b3CreateVisualShapeAddBox(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer halfExtents) {
        if (CHECKS) {
            check(commandHandle);
            check(halfExtents, 3);
        }
        return nb3CreateVisualShapeAddBox(commandHandle, memAddress(halfExtents));
    }

    // --- [ b3CreateVisualShapeAddCapsule ] ---

    public static native int nb3CreateVisualShapeAddCapsule(long commandHandle, double radius, double height);

    public static int b3CreateVisualShapeAddCapsule(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double radius, double height) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateVisualShapeAddCapsule(commandHandle, radius, height);
    }

    // --- [ b3CreateVisualShapeAddCylinder ] ---

    public static native int nb3CreateVisualShapeAddCylinder(long commandHandle, double radius, double height);

    public static int b3CreateVisualShapeAddCylinder(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double radius, double height) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateVisualShapeAddCylinder(commandHandle, radius, height);
    }

    // --- [ b3CreateVisualShapeAddPlane ] ---

    public static native int nb3CreateVisualShapeAddPlane(long commandHandle, long planeNormal, double planeConstant);

    public static int b3CreateVisualShapeAddPlane(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer planeNormal, double planeConstant) {
        if (CHECKS) {
            check(commandHandle);
            check(planeNormal, 3);
        }
        return nb3CreateVisualShapeAddPlane(commandHandle, memAddress(planeNormal), planeConstant);
    }

    // --- [ b3CreateVisualShapeAddMesh ] ---

    public static native int nb3CreateVisualShapeAddMesh(long commandHandle, long fileName, long meshScale);

    public static int b3CreateVisualShapeAddMesh(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") ByteBuffer fileName, @NativeType("double const *") DoubleBuffer meshScale) {
        if (CHECKS) {
            check(commandHandle);
            checkNT1(fileName);
            check(meshScale, 3);
        }
        return nb3CreateVisualShapeAddMesh(commandHandle, memAddress(fileName), memAddress(meshScale));
    }

    public static int b3CreateVisualShapeAddMesh(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("char const *") CharSequence fileName, @NativeType("double const *") DoubleBuffer meshScale) {
        if (CHECKS) {
            check(commandHandle);
            check(meshScale, 3);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nb3CreateVisualShapeAddMesh(commandHandle, fileNameEncoded, memAddress(meshScale));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3CreateVisualSetFlag ] ---

    public static native void nb3CreateVisualSetFlag(long commandHandle, int shapeIndex, int flags);

    public static void b3CreateVisualSetFlag(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int shapeIndex, int flags) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CreateVisualSetFlag(commandHandle, shapeIndex, flags);
    }

    // --- [ b3CreateVisualShapeSetChildTransform ] ---

    public static native void nb3CreateVisualShapeSetChildTransform(long commandHandle, int shapeIndex, long childPosition, long childOrientation);

    public static void b3CreateVisualShapeSetChildTransform(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int shapeIndex, @NativeType("double const *") DoubleBuffer childPosition, @NativeType("double const *") DoubleBuffer childOrientation) {
        if (CHECKS) {
            check(commandHandle);
            check(childPosition, 3);
            check(childOrientation, 4);
        }
        nb3CreateVisualShapeSetChildTransform(commandHandle, shapeIndex, memAddress(childPosition), memAddress(childOrientation));
    }

    // --- [ b3CreateVisualShapeSetSpecularColor ] ---

    public static native void nb3CreateVisualShapeSetSpecularColor(long commandHandle, int shapeIndex, long specularColor);

    public static void b3CreateVisualShapeSetSpecularColor(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int shapeIndex, @NativeType("double const *") DoubleBuffer specularColor) {
        if (CHECKS) {
            check(commandHandle);
            check(specularColor, 3);
        }
        nb3CreateVisualShapeSetSpecularColor(commandHandle, shapeIndex, memAddress(specularColor));
    }

    // --- [ b3CreateVisualShapeSetRGBAColor ] ---

    public static native void nb3CreateVisualShapeSetRGBAColor(long commandHandle, int shapeIndex, long rgbaColor);

    public static void b3CreateVisualShapeSetRGBAColor(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int shapeIndex, @NativeType("double const *") DoubleBuffer rgbaColor) {
        if (CHECKS) {
            check(commandHandle);
            check(rgbaColor, 4);
        }
        nb3CreateVisualShapeSetRGBAColor(commandHandle, shapeIndex, memAddress(rgbaColor));
    }

    // --- [ b3GetStatusVisualShapeUniqueId ] ---

    public static native int nb3GetStatusVisualShapeUniqueId(long statusHandle);

    public static int b3GetStatusVisualShapeUniqueId(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusVisualShapeUniqueId(statusHandle);
    }

    // --- [ b3CreateMultiBodyCommandInit ] ---

    public static native long nb3CreateMultiBodyCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CreateMultiBodyCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CreateMultiBodyCommandInit(physClient);
    }

    // --- [ b3CreateMultiBodyBase ] ---

    public static native int nb3CreateMultiBodyBase(long commandHandle, double mass, int collisionShapeUnique, int visualShapeUniqueId, long basePosition, long baseOrientation, long baseInertialFramePosition, long baseInertialFrameOrientation);

    public static int b3CreateMultiBodyBase(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double mass, int collisionShapeUnique, int visualShapeUniqueId, @NativeType("double const *") DoubleBuffer basePosition, @NativeType("double const *") DoubleBuffer baseOrientation, @NativeType("double const *") DoubleBuffer baseInertialFramePosition, @NativeType("double const *") DoubleBuffer baseInertialFrameOrientation) {
        if (CHECKS) {
            check(commandHandle);
            check(basePosition, 3);
            check(baseOrientation, 4);
            check(baseInertialFramePosition, 3);
            check(baseInertialFrameOrientation, 4);
        }
        return nb3CreateMultiBodyBase(commandHandle, mass, collisionShapeUnique, visualShapeUniqueId, memAddress(basePosition), memAddress(baseOrientation), memAddress(baseInertialFramePosition), memAddress(baseInertialFrameOrientation));
    }

    // --- [ b3CreateMultiBodyLink ] ---

    public static native int nb3CreateMultiBodyLink(long commandHandle, double linkMass, double linkCollisionShapeIndex, double linkVisualShapeIndex, long linkPosition, long linkOrientation, long linkInertialFramePosition, long linkInertialFrameOrientation, int linkParentIndex, int linkJointType, long linkJointAxis);

    public static int b3CreateMultiBodyLink(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double linkMass, double linkCollisionShapeIndex, double linkVisualShapeIndex, @NativeType("double const *") DoubleBuffer linkPosition, @NativeType("double const *") DoubleBuffer linkOrientation, @NativeType("double const *") DoubleBuffer linkInertialFramePosition, @NativeType("double const *") DoubleBuffer linkInertialFrameOrientation, int linkParentIndex, int linkJointType, @NativeType("double const *") DoubleBuffer linkJointAxis) {
        if (CHECKS) {
            check(commandHandle);
            check(linkPosition, 3);
            check(linkOrientation, 4);
            check(linkInertialFramePosition, 3);
            check(linkInertialFrameOrientation, 4);
            check(linkJointAxis, 3);
        }
        return nb3CreateMultiBodyLink(commandHandle, linkMass, linkCollisionShapeIndex, linkVisualShapeIndex, memAddress(linkPosition), memAddress(linkOrientation), memAddress(linkInertialFramePosition), memAddress(linkInertialFrameOrientation), linkParentIndex, linkJointType, memAddress(linkJointAxis));
    }

    // --- [ b3CreateMultiBodyUseMaximalCoordinates ] ---

    public static native void nb3CreateMultiBodyUseMaximalCoordinates(long commandHandle);

    public static void b3CreateMultiBodyUseMaximalCoordinates(@NativeType("b3SharedMemoryCommandHandle") long commandHandle) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CreateMultiBodyUseMaximalCoordinates(commandHandle);
    }

    // --- [ b3CreateMultiBodySetFlags ] ---

    public static native void nb3CreateMultiBodySetFlags(long commandHandle, int flags);

    public static void b3CreateMultiBodySetFlags(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int flags) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3CreateMultiBodySetFlags(commandHandle, flags);
    }

    // --- [ b3CreateBoxShapeCommandInit ] ---

    public static native long nb3CreateBoxShapeCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CreateBoxShapeCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CreateBoxShapeCommandInit(physClient);
    }

    // --- [ b3CreateBoxCommandSetStartPosition ] ---

    public static native int nb3CreateBoxCommandSetStartPosition(long commandHandle, double startPosX, double startPosY, double startPosZ);

    public static int b3CreateBoxCommandSetStartPosition(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double startPosX, double startPosY, double startPosZ) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateBoxCommandSetStartPosition(commandHandle, startPosX, startPosY, startPosZ);
    }

    // --- [ b3CreateBoxCommandSetStartOrientation ] ---

    public static native int nb3CreateBoxCommandSetStartOrientation(long commandHandle, double startOrnX, double startOrnY, double startOrnZ, double startOrnW);

    public static int b3CreateBoxCommandSetStartOrientation(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double startOrnX, double startOrnY, double startOrnZ, double startOrnW) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateBoxCommandSetStartOrientation(commandHandle, startOrnX, startOrnY, startOrnZ, startOrnW);
    }

    // --- [ b3CreateBoxCommandSetHalfExtents ] ---

    public static native int nb3CreateBoxCommandSetHalfExtents(long commandHandle, double halfExtentsX, double halfExtentsY, double halfExtentsZ);

    public static int b3CreateBoxCommandSetHalfExtents(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double halfExtentsX, double halfExtentsY, double halfExtentsZ) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateBoxCommandSetHalfExtents(commandHandle, halfExtentsX, halfExtentsY, halfExtentsZ);
    }

    // --- [ b3CreateBoxCommandSetMass ] ---

    public static native int nb3CreateBoxCommandSetMass(long commandHandle, double mass);

    public static int b3CreateBoxCommandSetMass(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double mass) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateBoxCommandSetMass(commandHandle, mass);
    }

    // --- [ b3CreateBoxCommandSetCollisionShapeType ] ---

    public static native int nb3CreateBoxCommandSetCollisionShapeType(long commandHandle, int collisionShapeType);

    public static int b3CreateBoxCommandSetCollisionShapeType(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int collisionShapeType) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateBoxCommandSetCollisionShapeType(commandHandle, collisionShapeType);
    }

    // --- [ b3CreateBoxCommandSetColorRGBA ] ---

    public static native int nb3CreateBoxCommandSetColorRGBA(long commandHandle, double red, double green, double blue, double alpha);

    public static int b3CreateBoxCommandSetColorRGBA(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double red, double green, double blue, double alpha) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateBoxCommandSetColorRGBA(commandHandle, red, green, blue, alpha);
    }

    // --- [ b3CreatePoseCommandInit ] ---

    public static native long nb3CreatePoseCommandInit(long physClient, int bodyUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CreatePoseCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CreatePoseCommandInit(physClient, bodyUniqueId);
    }

    // --- [ b3CreatePoseCommandInit2 ] ---

    public static native long nb3CreatePoseCommandInit2(long commandHandle, int bodyUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CreatePoseCommandInit2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreatePoseCommandInit2(commandHandle, bodyUniqueId);
    }

    // --- [ b3CreatePoseCommandSetBasePosition ] ---

    public static native int nb3CreatePoseCommandSetBasePosition(long commandHandle, double startPosX, double startPosY, double startPosZ);

    public static int b3CreatePoseCommandSetBasePosition(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double startPosX, double startPosY, double startPosZ) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreatePoseCommandSetBasePosition(commandHandle, startPosX, startPosY, startPosZ);
    }

    // --- [ b3CreatePoseCommandSetBaseOrientation ] ---

    public static native int nb3CreatePoseCommandSetBaseOrientation(long commandHandle, double startOrnX, double startOrnY, double startOrnZ, double startOrnW);

    public static int b3CreatePoseCommandSetBaseOrientation(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double startOrnX, double startOrnY, double startOrnZ, double startOrnW) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreatePoseCommandSetBaseOrientation(commandHandle, startOrnX, startOrnY, startOrnZ, startOrnW);
    }

    // --- [ b3CreatePoseCommandSetBaseLinearVelocity ] ---

    public static native int nb3CreatePoseCommandSetBaseLinearVelocity(long commandHandle, long linVel);

    public static int b3CreatePoseCommandSetBaseLinearVelocity(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer linVel) {
        if (CHECKS) {
            check(commandHandle);
            check(linVel, 3);
        }
        return nb3CreatePoseCommandSetBaseLinearVelocity(commandHandle, memAddress(linVel));
    }

    // --- [ b3CreatePoseCommandSetBaseAngularVelocity ] ---

    public static native int nb3CreatePoseCommandSetBaseAngularVelocity(long commandHandle, long angVel);

    public static int b3CreatePoseCommandSetBaseAngularVelocity(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer angVel) {
        if (CHECKS) {
            check(commandHandle);
            check(angVel, 3);
        }
        return nb3CreatePoseCommandSetBaseAngularVelocity(commandHandle, memAddress(angVel));
    }

    // --- [ b3CreatePoseCommandSetJointPositions ] ---

    public static native int nb3CreatePoseCommandSetJointPositions(long commandHandle, int numJointPositions, long jointPositions);

    public static int b3CreatePoseCommandSetJointPositions(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer jointPositions) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreatePoseCommandSetJointPositions(commandHandle, jointPositions.remaining(), memAddress(jointPositions));
    }

    // --- [ b3CreatePoseCommandSetJointPosition ] ---

    public static native int nb3CreatePoseCommandSetJointPosition(long physClient, long commandHandle, int jointIndex, double jointPosition);

    public static int b3CreatePoseCommandSetJointPosition(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryCommandHandle") long commandHandle, int jointIndex, double jointPosition) {
        if (CHECKS) {
            check(physClient);
            check(commandHandle);
        }
        return nb3CreatePoseCommandSetJointPosition(physClient, commandHandle, jointIndex, jointPosition);
    }

    // --- [ b3CreatePoseCommandSetJointPositionMultiDof ] ---

    public static native int nb3CreatePoseCommandSetJointPositionMultiDof(long physClient, long commandHandle, int jointIndex, long jointPosition, int posSize);

    public static int b3CreatePoseCommandSetJointPositionMultiDof(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryCommandHandle") long commandHandle, int jointIndex, @NativeType("double const *") DoubleBuffer jointPosition) {
        if (CHECKS) {
            check(physClient);
            check(commandHandle);
        }
        return nb3CreatePoseCommandSetJointPositionMultiDof(physClient, commandHandle, jointIndex, memAddress(jointPosition), jointPosition.remaining());
    }

    // --- [ b3CreatePoseCommandSetQ ] ---

    public static native int nb3CreatePoseCommandSetQ(long commandHandle, int numJointPositions, long q, long hasQ);

    public static int b3CreatePoseCommandSetQ(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer q, @NativeType("int const *") IntBuffer hasQ) {
        if (CHECKS) {
            check(commandHandle);
            check(hasQ, q.remaining());
        }
        return nb3CreatePoseCommandSetQ(commandHandle, q.remaining(), memAddress(q), memAddress(hasQ));
    }

    // --- [ b3CreatePoseCommandSetQdots ] ---

    public static native int nb3CreatePoseCommandSetQdots(long commandHandle, int numJointVelocities, long qDots, long hasQdots);

    public static int b3CreatePoseCommandSetQdots(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer qDots, @NativeType("int const *") IntBuffer hasQdots) {
        if (CHECKS) {
            check(commandHandle);
            check(hasQdots, qDots.remaining());
        }
        return nb3CreatePoseCommandSetQdots(commandHandle, qDots.remaining(), memAddress(qDots), memAddress(hasQdots));
    }

    // --- [ b3CreatePoseCommandSetJointVelocities ] ---

    public static native int nb3CreatePoseCommandSetJointVelocities(long physClient, long commandHandle, int numJointVelocities, long jointVelocities);

    public static int b3CreatePoseCommandSetJointVelocities(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer jointVelocities) {
        if (CHECKS) {
            check(physClient);
            check(commandHandle);
        }
        return nb3CreatePoseCommandSetJointVelocities(physClient, commandHandle, jointVelocities.remaining(), memAddress(jointVelocities));
    }

    // --- [ b3CreatePoseCommandSetJointVelocity ] ---

    public static native int nb3CreatePoseCommandSetJointVelocity(long physClient, long commandHandle, int jointIndex, double jointVelocity);

    public static int b3CreatePoseCommandSetJointVelocity(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryCommandHandle") long commandHandle, int jointIndex, double jointVelocity) {
        if (CHECKS) {
            check(physClient);
            check(commandHandle);
        }
        return nb3CreatePoseCommandSetJointVelocity(physClient, commandHandle, jointIndex, jointVelocity);
    }

    // --- [ b3CreatePoseCommandSetJointVelocityMultiDof ] ---

    public static native int nb3CreatePoseCommandSetJointVelocityMultiDof(long physClient, long commandHandle, int jointIndex, long jointVelocity, int velSize);

    public static int b3CreatePoseCommandSetJointVelocityMultiDof(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryCommandHandle") long commandHandle, int jointIndex, @NativeType("double const *") DoubleBuffer jointVelocity) {
        if (CHECKS) {
            check(physClient);
            check(commandHandle);
        }
        return nb3CreatePoseCommandSetJointVelocityMultiDof(physClient, commandHandle, jointIndex, memAddress(jointVelocity), jointVelocity.remaining());
    }

    // --- [ b3CreateSensorCommandInit ] ---

    public static native long nb3CreateSensorCommandInit(long physClient, int bodyUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CreateSensorCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CreateSensorCommandInit(physClient, bodyUniqueId);
    }

    // --- [ b3CreateSensorEnable6DofJointForceTorqueSensor ] ---

    public static native int nb3CreateSensorEnable6DofJointForceTorqueSensor(long commandHandle, int jointIndex, int enable);

    public static int b3CreateSensorEnable6DofJointForceTorqueSensor(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int jointIndex, @NativeType("int") boolean enable) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateSensorEnable6DofJointForceTorqueSensor(commandHandle, jointIndex, enable ? 1 : 0);
    }

    // --- [ b3CreateSensorEnableIMUForLink ] ---

    public static native int nb3CreateSensorEnableIMUForLink(long commandHandle, int linkIndex, int enable);

    public static int b3CreateSensorEnableIMUForLink(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int linkIndex, @NativeType("int") boolean enable) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3CreateSensorEnableIMUForLink(commandHandle, linkIndex, enable ? 1 : 0);
    }

    // --- [ b3RequestActualStateCommandInit ] ---

    public static native long nb3RequestActualStateCommandInit(long physClient, int bodyUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3RequestActualStateCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, int bodyUniqueId) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3RequestActualStateCommandInit(physClient, bodyUniqueId);
    }

    // --- [ b3RequestActualStateCommandInit2 ] ---

    public static native long nb3RequestActualStateCommandInit2(long commandHandle, int bodyUniqueId);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3RequestActualStateCommandInit2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3RequestActualStateCommandInit2(commandHandle, bodyUniqueId);
    }

    // --- [ b3RequestActualStateCommandComputeLinkVelocity ] ---

    public static native int nb3RequestActualStateCommandComputeLinkVelocity(long commandHandle, int computeLinkVelocity);

    public static int b3RequestActualStateCommandComputeLinkVelocity(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int computeLinkVelocity) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3RequestActualStateCommandComputeLinkVelocity(commandHandle, computeLinkVelocity);
    }

    // --- [ b3RequestActualStateCommandComputeForwardKinematics ] ---

    public static native int nb3RequestActualStateCommandComputeForwardKinematics(long commandHandle, int computeForwardKinematics);

    public static int b3RequestActualStateCommandComputeForwardKinematics(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int computeForwardKinematics) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3RequestActualStateCommandComputeForwardKinematics(commandHandle, computeForwardKinematics);
    }

    // --- [ b3GetJointState ] ---

    public static native int nb3GetJointState(long physClient, long statusHandle, int jointIndex, long state);

    public static int b3GetJointState(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryStatusHandle") long statusHandle, int jointIndex, @NativeType("struct b3JointSensorState *") B3JointSensorState state) {
        if (CHECKS) {
            check(physClient);
            check(statusHandle);
        }
        return nb3GetJointState(physClient, statusHandle, jointIndex, state.address());
    }

    // --- [ b3GetJointStateMultiDof ] ---

    public static native int nb3GetJointStateMultiDof(long physClient, long statusHandle, int jointIndex, long state);

    public static int b3GetJointStateMultiDof(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryStatusHandle") long statusHandle, int jointIndex, @NativeType("struct b3JointSensorState2 *") B3JointSensorState2 state) {
        if (CHECKS) {
            check(physClient);
            check(statusHandle);
        }
        return nb3GetJointStateMultiDof(physClient, statusHandle, jointIndex, state.address());
    }

    // --- [ b3GetLinkState ] ---

    public static native int nb3GetLinkState(long physClient, long statusHandle, int linkIndex, long state);

    public static int b3GetLinkState(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryStatusHandle") long statusHandle, int linkIndex, @NativeType("struct b3LinkState *") B3LinkState state) {
        if (CHECKS) {
            check(physClient);
            check(statusHandle);
        }
        return nb3GetLinkState(physClient, statusHandle, linkIndex, state.address());
    }

    // --- [ b3PickBody ] ---

    public static native long nb3PickBody(long physClient, double rayFromWorldX, double rayFromWorldY, double rayFromWorldZ, double rayToWorldX, double rayToWorldY, double rayToWorldZ);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3PickBody(@NativeType("b3PhysicsClientHandle") long physClient, double rayFromWorldX, double rayFromWorldY, double rayFromWorldZ, double rayToWorldX, double rayToWorldY, double rayToWorldZ) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3PickBody(physClient, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
    }

    // --- [ b3MovePickedBody ] ---

    public static native long nb3MovePickedBody(long physClient, double rayFromWorldX, double rayFromWorldY, double rayFromWorldZ, double rayToWorldX, double rayToWorldY, double rayToWorldZ);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3MovePickedBody(@NativeType("b3PhysicsClientHandle") long physClient, double rayFromWorldX, double rayFromWorldY, double rayFromWorldZ, double rayToWorldX, double rayToWorldY, double rayToWorldZ) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3MovePickedBody(physClient, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
    }

    // --- [ b3RemovePickingConstraint ] ---

    public static native long nb3RemovePickingConstraint(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3RemovePickingConstraint(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3RemovePickingConstraint(physClient);
    }

    // --- [ b3CreateRaycastCommandInit ] ---

    public static native long nb3CreateRaycastCommandInit(long physClient, double rayFromWorldX, double rayFromWorldY, double rayFromWorldZ, double rayToWorldX, double rayToWorldY, double rayToWorldZ);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CreateRaycastCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, double rayFromWorldX, double rayFromWorldY, double rayFromWorldZ, double rayToWorldX, double rayToWorldY, double rayToWorldZ) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CreateRaycastCommandInit(physClient, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
    }

    // --- [ b3CreateRaycastBatchCommandInit ] ---

    public static native long nb3CreateRaycastBatchCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3CreateRaycastBatchCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3CreateRaycastBatchCommandInit(physClient);
    }

    // --- [ b3RaycastBatchSetNumThreads ] ---

    public static native void nb3RaycastBatchSetNumThreads(long commandHandle, int numThreads);

    public static void b3RaycastBatchSetNumThreads(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int numThreads) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3RaycastBatchSetNumThreads(commandHandle, numThreads);
    }

    // --- [ b3RaycastBatchAddRay ] ---

    public static native void nb3RaycastBatchAddRay(long commandHandle, long rayFromWorld, long rayToWorld);

    public static void b3RaycastBatchAddRay(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer rayFromWorld, @NativeType("double const *") DoubleBuffer rayToWorld) {
        if (CHECKS) {
            check(commandHandle);
            check(rayFromWorld, 3);
            check(rayToWorld, 3);
        }
        nb3RaycastBatchAddRay(commandHandle, memAddress(rayFromWorld), memAddress(rayToWorld));
    }

    // --- [ b3RaycastBatchAddRays ] ---

    public static native void nb3RaycastBatchAddRays(long physClient, long commandHandle, long rayFromWorld, long rayToWorld, int numRays);

    public static void b3RaycastBatchAddRays(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer rayFromWorld, @NativeType("double const *") DoubleBuffer rayToWorld) {
        if (CHECKS) {
            check(physClient);
            check(commandHandle);
            check(rayToWorld, rayFromWorld.remaining());
        }
        nb3RaycastBatchAddRays(physClient, commandHandle, memAddress(rayFromWorld), memAddress(rayToWorld), rayFromWorld.remaining() / 3);
    }

    // --- [ b3RaycastBatchSetParentObject ] ---

    public static native void nb3RaycastBatchSetParentObject(long commandHandle, int parentObjectUniqueId, int parentLinkIndex);

    public static void b3RaycastBatchSetParentObject(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int parentObjectUniqueId, int parentLinkIndex) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3RaycastBatchSetParentObject(commandHandle, parentObjectUniqueId, parentLinkIndex);
    }

    // --- [ b3GetRaycastInformation ] ---

    public static native void nb3GetRaycastInformation(long physClient, long raycastInfo);

    public static void b3GetRaycastInformation(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("struct b3RaycastInformation *") B3RaycastInformation raycastInfo) {
        if (CHECKS) {
            check(physClient);
        }
        nb3GetRaycastInformation(physClient, raycastInfo.address());
    }

    // --- [ b3ApplyExternalForceCommandInit ] ---

    public static native long nb3ApplyExternalForceCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3ApplyExternalForceCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3ApplyExternalForceCommandInit(physClient);
    }

    // --- [ b3ApplyExternalForce ] ---

    public static native void nb3ApplyExternalForce(long commandHandle, int bodyUniqueId, int linkId, long force, long position, int flag);

    public static void b3ApplyExternalForce(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkId, @NativeType("double const *") DoubleBuffer force, @NativeType("double const *") DoubleBuffer position, int flag) {
        if (CHECKS) {
            check(commandHandle);
            check(force, 3);
            check(position, 3);
        }
        nb3ApplyExternalForce(commandHandle, bodyUniqueId, linkId, memAddress(force), memAddress(position), flag);
    }

    // --- [ b3ApplyExternalTorque ] ---

    public static native void nb3ApplyExternalTorque(long commandHandle, int bodyUniqueId, int linkId, long torque, int flag);

    public static void b3ApplyExternalTorque(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyUniqueId, int linkId, @NativeType("double const *") DoubleBuffer torque, int flag) {
        if (CHECKS) {
            check(commandHandle);
            check(torque, 3);
        }
        nb3ApplyExternalTorque(commandHandle, bodyUniqueId, linkId, memAddress(torque), flag);
    }

    // --- [ b3LoadSoftBodyCommandInit ] ---

    public static native long nb3LoadSoftBodyCommandInit(long physClient, long fileName);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadSoftBodyCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer fileName) {
        if (CHECKS) {
            check(physClient);
            checkNT1(fileName);
        }
        return nb3LoadSoftBodyCommandInit(physClient, memAddress(fileName));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3LoadSoftBodyCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence fileName) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nb3LoadSoftBodyCommandInit(physClient, fileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3LoadSoftBodySetScale ] ---

    public static native int nb3LoadSoftBodySetScale(long commandHandle, double scale);

    public static int b3LoadSoftBodySetScale(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double scale) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadSoftBodySetScale(commandHandle, scale);
    }

    // --- [ b3LoadSoftBodySetMass ] ---

    public static native int nb3LoadSoftBodySetMass(long commandHandle, double mass);

    public static int b3LoadSoftBodySetMass(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double mass) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadSoftBodySetMass(commandHandle, mass);
    }

    // --- [ b3LoadSoftBodySetCollisionMargin ] ---

    public static native int nb3LoadSoftBodySetCollisionMargin(long commandHandle, double collisionMargin);

    public static int b3LoadSoftBodySetCollisionMargin(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, double collisionMargin) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3LoadSoftBodySetCollisionMargin(commandHandle, collisionMargin);
    }

    // --- [ b3RequestVREventsCommandInit ] ---

    public static native long nb3RequestVREventsCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3RequestVREventsCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3RequestVREventsCommandInit(physClient);
    }

    // --- [ b3VREventsSetDeviceTypeFilter ] ---

    public static native void nb3VREventsSetDeviceTypeFilter(long commandHandle, int deviceTypeFilter);

    public static void b3VREventsSetDeviceTypeFilter(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int deviceTypeFilter) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3VREventsSetDeviceTypeFilter(commandHandle, deviceTypeFilter);
    }

    // --- [ b3GetVREventsData ] ---

    public static native void nb3GetVREventsData(long physClient, long vrEventsData);

    public static void b3GetVREventsData(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("struct b3VREventsData *") B3VREventsData vrEventsData) {
        if (CHECKS) {
            check(physClient);
        }
        nb3GetVREventsData(physClient, vrEventsData.address());
    }

    // --- [ b3SetVRCameraStateCommandInit ] ---

    public static native long nb3SetVRCameraStateCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3SetVRCameraStateCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3SetVRCameraStateCommandInit(physClient);
    }

    // --- [ b3SetVRCameraRootPosition ] ---

    public static native int nb3SetVRCameraRootPosition(long commandHandle, long rootPos);

    public static int b3SetVRCameraRootPosition(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer rootPos) {
        if (CHECKS) {
            check(commandHandle);
            check(rootPos, 3);
        }
        return nb3SetVRCameraRootPosition(commandHandle, memAddress(rootPos));
    }

    // --- [ b3SetVRCameraRootOrientation ] ---

    public static native int nb3SetVRCameraRootOrientation(long commandHandle, long rootOrn);

    public static int b3SetVRCameraRootOrientation(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, @NativeType("double const *") DoubleBuffer rootOrn) {
        if (CHECKS) {
            check(commandHandle);
            check(rootOrn, 4);
        }
        return nb3SetVRCameraRootOrientation(commandHandle, memAddress(rootOrn));
    }

    // --- [ b3SetVRCameraTrackingObject ] ---

    public static native int nb3SetVRCameraTrackingObject(long commandHandle, int objectUniqueId);

    public static int b3SetVRCameraTrackingObject(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int objectUniqueId) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3SetVRCameraTrackingObject(commandHandle, objectUniqueId);
    }

    // --- [ b3SetVRCameraTrackingObjectFlag ] ---

    public static native int nb3SetVRCameraTrackingObjectFlag(long commandHandle, int flag);

    public static int b3SetVRCameraTrackingObjectFlag(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int flag) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3SetVRCameraTrackingObjectFlag(commandHandle, flag);
    }

    // --- [ b3RequestKeyboardEventsCommandInit ] ---

    public static native long nb3RequestKeyboardEventsCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3RequestKeyboardEventsCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3RequestKeyboardEventsCommandInit(physClient);
    }

    // --- [ b3RequestKeyboardEventsCommandInit2 ] ---

    public static native long nb3RequestKeyboardEventsCommandInit2(long commandHandle);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3RequestKeyboardEventsCommandInit2(@NativeType("b3SharedMemoryCommandHandle") long commandHandle) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3RequestKeyboardEventsCommandInit2(commandHandle);
    }

    // --- [ b3GetKeyboardEventsData ] ---

    public static native void nb3GetKeyboardEventsData(long physClient, long keyboardEventsData);

    public static void b3GetKeyboardEventsData(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("struct b3KeyboardEventsData *") B3KeyboardEventsData keyboardEventsData) {
        if (CHECKS) {
            check(physClient);
        }
        nb3GetKeyboardEventsData(physClient, keyboardEventsData.address());
    }

    // --- [ b3RequestMouseEventsCommandInit ] ---

    public static native long nb3RequestMouseEventsCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3RequestMouseEventsCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3RequestMouseEventsCommandInit(physClient);
    }

    // --- [ b3GetMouseEventsData ] ---

    public static native void nb3GetMouseEventsData(long physClient, long mouseEventsData);

    public static void b3GetMouseEventsData(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("struct b3MouseEventsData *") B3MouseEventsData mouseEventsData) {
        if (CHECKS) {
            check(physClient);
        }
        nb3GetMouseEventsData(physClient, mouseEventsData.address());
    }

    // --- [ b3StateLoggingCommandInit ] ---

    public static native long nb3StateLoggingCommandInit(long physClient);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3StateLoggingCommandInit(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3StateLoggingCommandInit(physClient);
    }

    // --- [ b3StateLoggingStart ] ---

    public static native int nb3StateLoggingStart(long commandHandle, int loggingType, long fileName);

    public static int b3StateLoggingStart(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int loggingType, @NativeType("char const *") ByteBuffer fileName) {
        if (CHECKS) {
            check(commandHandle);
            checkNT1(fileName);
        }
        return nb3StateLoggingStart(commandHandle, loggingType, memAddress(fileName));
    }

    public static int b3StateLoggingStart(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int loggingType, @NativeType("char const *") CharSequence fileName) {
        if (CHECKS) {
            check(commandHandle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nb3StateLoggingStart(commandHandle, loggingType, fileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3StateLoggingAddLoggingObjectUniqueId ] ---

    public static native int nb3StateLoggingAddLoggingObjectUniqueId(long commandHandle, int objectUniqueId);

    public static int b3StateLoggingAddLoggingObjectUniqueId(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int objectUniqueId) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3StateLoggingAddLoggingObjectUniqueId(commandHandle, objectUniqueId);
    }

    // --- [ b3StateLoggingSetMaxLogDof ] ---

    public static native int nb3StateLoggingSetMaxLogDof(long commandHandle, int maxLogDof);

    public static int b3StateLoggingSetMaxLogDof(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int maxLogDof) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3StateLoggingSetMaxLogDof(commandHandle, maxLogDof);
    }

    // --- [ b3StateLoggingSetLinkIndexA ] ---

    public static native int nb3StateLoggingSetLinkIndexA(long commandHandle, int linkIndexA);

    public static int b3StateLoggingSetLinkIndexA(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int linkIndexA) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3StateLoggingSetLinkIndexA(commandHandle, linkIndexA);
    }

    // --- [ b3StateLoggingSetLinkIndexB ] ---

    public static native int nb3StateLoggingSetLinkIndexB(long commandHandle, int linkIndexB);

    public static int b3StateLoggingSetLinkIndexB(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int linkIndexB) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3StateLoggingSetLinkIndexB(commandHandle, linkIndexB);
    }

    // --- [ b3StateLoggingSetBodyAUniqueId ] ---

    public static native int nb3StateLoggingSetBodyAUniqueId(long commandHandle, int bodyAUniqueId);

    public static int b3StateLoggingSetBodyAUniqueId(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyAUniqueId) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3StateLoggingSetBodyAUniqueId(commandHandle, bodyAUniqueId);
    }

    // --- [ b3StateLoggingSetBodyBUniqueId ] ---

    public static native int nb3StateLoggingSetBodyBUniqueId(long commandHandle, int bodyBUniqueId);

    public static int b3StateLoggingSetBodyBUniqueId(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int bodyBUniqueId) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3StateLoggingSetBodyBUniqueId(commandHandle, bodyBUniqueId);
    }

    // --- [ b3StateLoggingSetDeviceTypeFilter ] ---

    public static native int nb3StateLoggingSetDeviceTypeFilter(long commandHandle, int deviceTypeFilter);

    public static int b3StateLoggingSetDeviceTypeFilter(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int deviceTypeFilter) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3StateLoggingSetDeviceTypeFilter(commandHandle, deviceTypeFilter);
    }

    // --- [ b3StateLoggingSetLogFlags ] ---

    public static native int nb3StateLoggingSetLogFlags(long commandHandle, int logFlags);

    public static int b3StateLoggingSetLogFlags(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int logFlags) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3StateLoggingSetLogFlags(commandHandle, logFlags);
    }

    // --- [ b3GetStatusLoggingUniqueId ] ---

    public static native int nb3GetStatusLoggingUniqueId(long statusHandle);

    public static int b3GetStatusLoggingUniqueId(@NativeType("b3SharedMemoryStatusHandle") long statusHandle) {
        if (CHECKS) {
            check(statusHandle);
        }
        return nb3GetStatusLoggingUniqueId(statusHandle);
    }

    // --- [ b3StateLoggingStop ] ---

    public static native int nb3StateLoggingStop(long commandHandle, int loggingUid);

    public static int b3StateLoggingStop(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int loggingUid) {
        if (CHECKS) {
            check(commandHandle);
        }
        return nb3StateLoggingStop(commandHandle, loggingUid);
    }

    // --- [ b3ProfileTimingCommandInit ] ---

    public static native long nb3ProfileTimingCommandInit(long physClient, long name);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3ProfileTimingCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(physClient);
            checkNT1(name);
        }
        return nb3ProfileTimingCommandInit(physClient, memAddress(name));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3ProfileTimingCommandInit(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nb3ProfileTimingCommandInit(physClient, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3SetProfileTimingDuractionInMicroSeconds ] ---

    public static native void nb3SetProfileTimingDuractionInMicroSeconds(long commandHandle, int duration);

    public static void b3SetProfileTimingDuractionInMicroSeconds(@NativeType("b3SharedMemoryCommandHandle") long commandHandle, int duration) {
        if (CHECKS) {
            check(commandHandle);
        }
        nb3SetProfileTimingDuractionInMicroSeconds(commandHandle, duration);
    }

    // --- [ b3PushProfileTiming ] ---

    public static native void nb3PushProfileTiming(long physClient, long timingName);

    public static void b3PushProfileTiming(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer timingName) {
        if (CHECKS) {
            check(physClient);
            checkNT1(timingName);
        }
        nb3PushProfileTiming(physClient, memAddress(timingName));
    }

    public static void b3PushProfileTiming(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence timingName) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(timingName, true);
            long timingNameEncoded = stack.getPointerAddress();
            nb3PushProfileTiming(physClient, timingNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3PopProfileTiming ] ---

    public static native void nb3PopProfileTiming(long physClient);

    public static void b3PopProfileTiming(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        nb3PopProfileTiming(physClient);
    }

    // --- [ b3SetTimeOut ] ---

    public static native void nb3SetTimeOut(long physClient, double timeOutInSeconds);

    public static void b3SetTimeOut(@NativeType("b3PhysicsClientHandle") long physClient, double timeOutInSeconds) {
        if (CHECKS) {
            check(physClient);
        }
        nb3SetTimeOut(physClient, timeOutInSeconds);
    }

    // --- [ b3GetTimeOut ] ---

    public static native double nb3GetTimeOut(long physClient);

    public static double b3GetTimeOut(@NativeType("b3PhysicsClientHandle") long physClient) {
        if (CHECKS) {
            check(physClient);
        }
        return nb3GetTimeOut(physClient);
    }

    // --- [ b3SetAdditionalSearchPath ] ---

    public static native long nb3SetAdditionalSearchPath(long physClient, long path);

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3SetAdditionalSearchPath(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            check(physClient);
            checkNT1(path);
        }
        return nb3SetAdditionalSearchPath(physClient, memAddress(path));
    }

    @NativeType("b3SharedMemoryCommandHandle")
    public static long b3SetAdditionalSearchPath(@NativeType("b3PhysicsClientHandle") long physClient, @NativeType("char const *") CharSequence path) {
        if (CHECKS) {
            check(physClient);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nb3SetAdditionalSearchPath(physClient, pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ b3MultiplyTransforms ] ---

    public static native void nb3MultiplyTransforms(long posA, long ornA, long posB, long ornB, long outPos, long outOrn);

    public static void b3MultiplyTransforms(@NativeType("double const *") DoubleBuffer posA, @NativeType("double const *") DoubleBuffer ornA, @NativeType("double const *") DoubleBuffer posB, @NativeType("double const *") DoubleBuffer ornB, @NativeType("double *") DoubleBuffer outPos, @NativeType("double *") DoubleBuffer outOrn) {
        if (CHECKS) {
            check(posA, 3);
            check(ornA, 4);
            check(posB, 3);
            check(ornB, 4);
            check(outPos, 3);
            check(outOrn, 4);
        }
        nb3MultiplyTransforms(memAddress(posA), memAddress(ornA), memAddress(posB), memAddress(ornB), memAddress(outPos), memAddress(outOrn));
    }

    // --- [ b3InvertTransform ] ---

    public static native void nb3InvertTransform(long pos, long orn, long outPos, long outOrn);

    public static void b3InvertTransform(@NativeType("double const *") DoubleBuffer pos, @NativeType("double const *") DoubleBuffer orn, @NativeType("double *") DoubleBuffer outPos, @NativeType("double *") DoubleBuffer outOrn) {
        if (CHECKS) {
            check(pos, 3);
            check(orn, 4);
            check(outPos, 3);
            check(outOrn, 4);
        }
        nb3InvertTransform(memAddress(pos), memAddress(orn), memAddress(outPos), memAddress(outOrn));
    }

}