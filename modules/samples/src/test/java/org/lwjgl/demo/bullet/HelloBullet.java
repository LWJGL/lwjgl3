/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.bullet;

import org.lwjgl.bullet.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.nio.file.*;

import static org.lwjgl.bullet.PhysicsClient.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.testng.Assert.*;

/** Ported from Bullet Physics SDK: {@code test/SharedMemory/test.c}. */
public final class HelloBullet {

    private HelloBullet() {
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Please specify the Bullet Physics SDK root directory.");
        }
        if (!Files.isDirectory(Paths.get(args[0], "data", "kuka_iiwa"))) {
            throw new IllegalArgumentException("Invalid Bullet Physics SDK root directory specified.");
        }

        long client = b3ConnectPhysicsDirect();
        if (client == NULL) {
            throw new IllegalStateException();
        }

        testSharedMemory(client, args[0]);
    }

    private static void testSharedMemory(long sm, String sdkRoot) {
        String urdfFileName = Paths.get(sdkRoot, "data", "r2d2.urdf").toAbsolutePath().toString();
        String sdfFileName  = Paths.get(sdkRoot, "data", "kuka_iiwa", "model.sdf").toAbsolutePath().toString();

        if (b3CanSubmitCommand(sm)) {
            {
                long command = b3InitPhysicsParamCommand(sm);
                b3PhysicsParamSetGravity(command, (double)0, (double)0, -9.8);
                b3PhysicsParamSetTimeStep(command, 1.0 / 60.0);
                long statusHandle = b3SubmitClientCommandAndWaitStatus(sm, command);
                assertEquals(b3GetStatusType(statusHandle), CMD_CLIENT_COMMAND_COMPLETED);
            }

            try (MemoryStack stack = stackPush()) {
                IntBuffer bodyIndicesOut = stack.mallocInt(MAX_SDF_BODIES);

                long command      = b3LoadSdfCommandInit(sm, sdfFileName);
                long statusHandle = b3SubmitClientCommandAndWaitStatus(sm, command);
                assertEquals(b3GetStatusType(statusHandle), CMD_SDF_LOADING_COMPLETED);

                int numBodies = b3GetStatusBodyIndices(statusHandle, bodyIndicesOut);
                assertEquals(numBodies, 1);
                int bodyUniqueId = bodyIndicesOut.get(0);
                {
                    {
                        command = b3InitRequestVisualShapeInformation(sm, bodyUniqueId);
                        statusHandle = b3SubmitClientCommandAndWaitStatus(sm, command);
                        if (b3GetStatusType(statusHandle) == CMD_VISUAL_SHAPE_INFO_COMPLETED) {
                            B3VisualShapeInformation vi = B3VisualShapeInformation.mallocStack(stack);
                            b3GetVisualShapeInformation(sm, vi);
                        }
                    }
                }

                int numJoints = b3GetNumJoints(sm, bodyUniqueId);
                assertEquals(numJoints, 7);

                {
                    command = b3CreatePoseCommandInit(sm, bodyUniqueId);
                    for (int jointIndex = 0; jointIndex < numJoints; jointIndex++) {
                        b3CreatePoseCommandSetJointPosition(sm, command, jointIndex, 0.0);
                    }

                    statusHandle = b3SubmitClientCommandAndWaitStatus(sm, command);

                    assertEquals(b3GetStatusType(statusHandle), CMD_CLIENT_COMMAND_COMPLETED);
                }
            }

            int bodyIndex;
            {
                long command = b3LoadUrdfCommandInit(sm, urdfFileName);

                //setting the initial position, orientation and other arguments are optional
                b3LoadUrdfCommandSetStartPosition(command, 2.0, 0.0, 1.0);
                long statusHandle = b3SubmitClientCommandAndWaitStatus(sm, command);
                assertEquals(b3GetStatusType(statusHandle), CMD_URDF_LOADING_COMPLETED);
                bodyIndex = b3GetStatusBodyIndex(statusHandle);
            }

            int sensorJointIndexLeft  = -1;
            int sensorJointIndexRight = -1;
            if (bodyIndex >= 0) {
                int numJoints = b3GetNumJoints(sm, bodyIndex);

                int imuLinkIndex = -1;
                for (int i = 0; i < numJoints; i++) {
                    try (MemoryStack stack = stackPush()) {
                        B3JointInfo jointInfo = B3JointInfo.mallocStack(stack);

                        b3GetJointInfo(sm, bodyIndex, i, jointInfo);

                        //	printf("jointInfo[%d].m_jointName=%s\n",i,jointInfo.m_jointName);
                        //pick the IMU link index based on torso name
                        if (jointInfo.m_linkNameString().contains("base_link")) {
                            imuLinkIndex = i;
                        }

                        //pick the joint index based on joint name
                        if (jointInfo.m_jointNameString().contains("base_to_left_leg")) {
                            sensorJointIndexLeft = i;
                        }
                        if (jointInfo.m_jointNameString().contains("base_to_right_leg")) {
                            sensorJointIndexRight = i;
                        }
                    }
                }

                if ((sensorJointIndexLeft >= 0) || (sensorJointIndexRight >= 0)) {
                    long command = b3CreateSensorCommandInit(sm, bodyIndex);
                    if (imuLinkIndex >= 0) {
                        b3CreateSensorEnableIMUForLink(command, imuLinkIndex, true);
                    }

                    if (sensorJointIndexLeft >= 0) {
                        b3CreateSensorEnable6DofJointForceTorqueSensor(command, sensorJointIndexLeft, true);
                    }
                    if (sensorJointIndexRight >= 0) {
                        b3CreateSensorEnable6DofJointForceTorqueSensor(command, sensorJointIndexRight, true);
                    }
                    long statusHandle = b3SubmitClientCommandAndWaitStatus(sm, command);
                    assertEquals(b3GetStatusType(statusHandle), CMD_CLIENT_COMMAND_COMPLETED);
                }
            }

            {
                long command = b3CreateBoxShapeCommandInit(sm);
                b3CreateBoxCommandSetStartPosition(command, 0, 0, -1);
                b3CreateBoxCommandSetStartOrientation(command, 0, 0, 0, 1);
                b3CreateBoxCommandSetHalfExtents(command, 10, 10, 1);
                long statusHandle = b3SubmitClientCommandAndWaitStatus(sm, command);
                assertEquals(b3GetStatusType(statusHandle), CMD_RIGID_BODY_CREATION_COMPLETED);
            }

            {
                long command      = b3RequestActualStateCommandInit(sm, bodyIndex);
                long statusHandle = b3SubmitClientCommandAndWaitStatus(sm, command);
                int  statusType   = b3GetStatusType(statusHandle);
                assertEquals(statusType, CMD_ACTUAL_STATE_UPDATE_COMPLETED);

                if (statusType == CMD_ACTUAL_STATE_UPDATE_COMPLETED) {
                    try (MemoryStack stack = stackPush()) {
                        IntBuffer posVarCount = stack.mallocInt(1);
                        IntBuffer dofCount    = stack.mallocInt(1);

                        b3GetStatusActualState(statusHandle,
                            null, posVarCount, dofCount,
                            null, null, null, null);
                        assertEquals(posVarCount.get(0), 15);
                        assertEquals(dofCount.get(0), 14);
                    }
                }
            }

            ///perform some simulation steps for testing
            for (int i = 0; i < 1000; i++) {
                if (b3CanSubmitCommand(sm)) {
                    long statusHandle = b3SubmitClientCommandAndWaitStatus(sm, b3InitStepSimulationCommand(sm));
                    assertEquals(b3GetStatusType(statusHandle), CMD_STEP_FORWARD_SIMULATION_COMPLETED);
                } else {
                    break;
                }
            }

            {
                long command = b3InitRequestCameraImage(sm);
                b3RequestCameraImageSetPixelResolution(command, 1024, 1024);
                b3RequestCameraImageSelectRenderer(command, ER_BULLET_HARDWARE_OPENGL);
                b3SubmitClientCommandAndWaitStatus(sm, command);
            }

            if (b3CanSubmitCommand(sm)) {
                long state = b3SubmitClientCommandAndWaitStatus(sm, b3RequestActualStateCommandInit(sm, bodyIndex));

                if (sensorJointIndexLeft >= 0) {
                    try (MemoryStack stack = stackPush()) {
                        B3JointSensorState sensorState = B3JointSensorState.mallocStack(stack);
                        b3GetJointState(sm, state, sensorJointIndexLeft, sensorState);

                        System.out.format("Sensor for joint [%d] = %f,%f,%f\n", sensorJointIndexLeft,
                            sensorState.m_jointForceTorque(0),
                            sensorState.m_jointForceTorque(1),
                            sensorState.m_jointForceTorque(2));
                    }
                }

                if (sensorJointIndexRight >= 0) {
                    try (MemoryStack stack = stackPush()) {
                        B3JointSensorState sensorState = B3JointSensorState.mallocStack(stack);
                        b3GetJointState(sm, state, sensorJointIndexRight, sensorState);

                        System.out.format("Sensor for joint [%d] = %f,%f,%f\n", sensorJointIndexRight,
                            sensorState.m_jointForceTorque(0),
                            sensorState.m_jointForceTorque(1),
                            sensorState.m_jointForceTorque(2));
                    }
                }

                {
                    long statusHandle = b3SubmitClientCommandAndWaitStatus(sm, b3InitResetSimulationCommand(sm));
                    assertEquals(b3GetStatusType(statusHandle), CMD_RESET_SIMULATION_COMPLETED);
                }
            }
        } else {
            System.err.println("Cannot submit commands.");
        }

        b3DisconnectSharedMemory(sm);
    }

}
