/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

#define BT_ENABLE_ENET
#define BT_ENABLE_CLSOCKET
#include "PhysicsClientC_API.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_b3ConnectPhysicsDirect(void) {
    return (jlong)(intptr_t)b3ConnectPhysicsDirect();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_b3ConnectPhysicsDirect(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_b3ConnectPhysicsDirect();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_b3ConnectSharedMemory(jint key) {
    return (jlong)(intptr_t)b3ConnectSharedMemory(key);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_b3ConnectSharedMemory(JNIEnv *__env, jclass clazz, jint key) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_b3ConnectSharedMemory(key);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ConnectPhysicsTCP(jlong hostNameAddress, jint port) {
    char const *hostName = (char const *)(intptr_t)hostNameAddress;
    return (jlong)(intptr_t)b3ConnectPhysicsTCP(hostName, port);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ConnectPhysicsTCP(JNIEnv *__env, jclass clazz, jlong hostNameAddress, jint port) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ConnectPhysicsTCP(hostNameAddress, port);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ConnectPhysicsUDP(jlong hostNameAddress, jint port) {
    char const *hostName = (char const *)(intptr_t)hostNameAddress;
    return (jlong)(intptr_t)b3ConnectPhysicsUDP(hostName, port);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ConnectPhysicsUDP(JNIEnv *__env, jclass clazz, jlong hostNameAddress, jint port) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ConnectPhysicsUDP(hostNameAddress, port);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3DisconnectSharedMemory(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3DisconnectSharedMemory(physClient);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3DisconnectSharedMemory(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3DisconnectSharedMemory(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CanSubmitCommand(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jint)b3CanSubmitCommand(physClient);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CanSubmitCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CanSubmitCommand(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SubmitClientCommandAndWaitStatus(jlong physClientAddress, jlong commandHandleAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3SubmitClientCommandAndWaitStatus(physClient, commandHandle);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SubmitClientCommandAndWaitStatus(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SubmitClientCommandAndWaitStatus(physClientAddress, commandHandleAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SubmitClientCommand(jlong physClientAddress, jlong commandHandleAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3SubmitClientCommand(physClient, commandHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SubmitClientCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SubmitClientCommand(physClientAddress, commandHandleAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ProcessServerStatus(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3ProcessServerStatus(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ProcessServerStatus(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ProcessServerStatus(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusType(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetStatusType(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusType(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusType(statusHandleAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCustomCommand(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3CreateCustomCommand(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCustomCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCustomCommand(physClientAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandLoadPlugin(jlong commandHandleAddress, jlong pluginPathAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *pluginPath = (char const *)(intptr_t)pluginPathAddress;
    b3CustomCommandLoadPlugin(commandHandle, pluginPath);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandLoadPlugin(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong pluginPathAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandLoadPlugin(commandHandleAddress, pluginPathAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandLoadPluginSetPostFix(jlong commandHandleAddress, jlong postFixAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *postFix = (char const *)(intptr_t)postFixAddress;
    b3CustomCommandLoadPluginSetPostFix(commandHandle, postFix);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandLoadPluginSetPostFix(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong postFixAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandLoadPluginSetPostFix(commandHandleAddress, postFixAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPluginUniqueId(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetStatusPluginUniqueId(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPluginUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPluginUniqueId(statusHandleAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPluginCommandResult(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetStatusPluginCommandResult(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPluginCommandResult(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPluginCommandResult(statusHandleAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandUnloadPlugin(jlong commandHandleAddress, jint pluginUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3CustomCommandUnloadPlugin(commandHandle, pluginUniqueId);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandUnloadPlugin(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint pluginUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandUnloadPlugin(commandHandleAddress, pluginUniqueId);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecutePluginCommand(jlong commandHandleAddress, jint pluginUniqueId, jlong textArgumentsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *textArguments = (char const *)(intptr_t)textArgumentsAddress;
    b3CustomCommandExecutePluginCommand(commandHandle, pluginUniqueId, textArguments);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecutePluginCommand(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint pluginUniqueId, jlong textArgumentsAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecutePluginCommand(commandHandleAddress, pluginUniqueId, textArgumentsAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecuteAddIntArgument(jlong commandHandleAddress, jint intVal) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3CustomCommandExecuteAddIntArgument(commandHandle, intVal);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecuteAddIntArgument(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint intVal) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecuteAddIntArgument(commandHandleAddress, intVal);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecuteAddFloatArgument(jlong commandHandleAddress, jfloat floatVal) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3CustomCommandExecuteAddFloatArgument(commandHandle, floatVal);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecuteAddFloatArgument(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat floatVal) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecuteAddFloatArgument(commandHandleAddress, floatVal);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusBodyIndices(jlong statusHandleAddress, jlong bodyIndicesOutAddress, jint bodyIndicesCapacity) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *bodyIndicesOut = (int *)(intptr_t)bodyIndicesOutAddress;
    return (jint)b3GetStatusBodyIndices(statusHandle, bodyIndicesOut, bodyIndicesCapacity);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusBodyIndices(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong bodyIndicesOutAddress, jint bodyIndicesCapacity) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusBodyIndices(statusHandleAddress, bodyIndicesOutAddress, bodyIndicesCapacity);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusBodyIndex(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetStatusBodyIndex(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusBodyIndex(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusBodyIndex(statusHandleAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3GetStatusActualState)(jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong numDegreeOfFreedomQAddress, jlong numDegreeOfFreedomUAddress, jlong rootLocalInertialFrameAddress, jlong actualStateQAddress, jlong actualStateQdotAddress, jlong jointReactionForcesAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *bodyUniqueId = (int *)(intptr_t)bodyUniqueIdAddress;
    int *numDegreeOfFreedomQ = (int *)(intptr_t)numDegreeOfFreedomQAddress;
    int *numDegreeOfFreedomU = (int *)(intptr_t)numDegreeOfFreedomUAddress;
    double const **rootLocalInertialFrame = (double const **)(intptr_t)rootLocalInertialFrameAddress;
    double const **actualStateQ = (double const **)(intptr_t)actualStateQAddress;
    double const **actualStateQdot = (double const **)(intptr_t)actualStateQdotAddress;
    double const **jointReactionForces = (double const **)(intptr_t)jointReactionForcesAddress;
    return (jint)b3GetStatusActualState(statusHandle, bodyUniqueId, numDegreeOfFreedomQ, numDegreeOfFreedomU, rootLocalInertialFrame, actualStateQ, actualStateQdot, jointReactionForces);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusActualState(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong numDegreeOfFreedomQAddress, jlong numDegreeOfFreedomUAddress, jlong rootLocalInertialFrameAddress, jlong actualStateQAddress, jlong actualStateQdotAddress, jlong jointReactionForcesAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3GetStatusActualState)(statusHandleAddress, bodyUniqueIdAddress, numDegreeOfFreedomQAddress, numDegreeOfFreedomUAddress, rootLocalInertialFrameAddress, actualStateQAddress, actualStateQdotAddress, jointReactionForcesAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3GetStatusActualState2)(jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong numLinksAddress, jlong numDegreeOfFreedomQAddress, jlong numDegreeOfFreedomUAddress, jlong rootLocalInertialFrameAddress, jlong actualStateQAddress, jlong actualStateQdotAddress, jlong jointReactionForcesAddress, jlong linkLocalInertialFramesAddress, jlong jointMotorForcesAddress, jlong linkStatesAddress, jlong linkWorldVelocitiesAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *bodyUniqueId = (int *)(intptr_t)bodyUniqueIdAddress;
    int *numLinks = (int *)(intptr_t)numLinksAddress;
    int *numDegreeOfFreedomQ = (int *)(intptr_t)numDegreeOfFreedomQAddress;
    int *numDegreeOfFreedomU = (int *)(intptr_t)numDegreeOfFreedomUAddress;
    double const **rootLocalInertialFrame = (double const **)(intptr_t)rootLocalInertialFrameAddress;
    double const **actualStateQ = (double const **)(intptr_t)actualStateQAddress;
    double const **actualStateQdot = (double const **)(intptr_t)actualStateQdotAddress;
    double const **jointReactionForces = (double const **)(intptr_t)jointReactionForcesAddress;
    double const **linkLocalInertialFrames = (double const **)(intptr_t)linkLocalInertialFramesAddress;
    double const **jointMotorForces = (double const **)(intptr_t)jointMotorForcesAddress;
    double const **linkStates = (double const **)(intptr_t)linkStatesAddress;
    double const **linkWorldVelocities = (double const **)(intptr_t)linkWorldVelocitiesAddress;
    return (jint)b3GetStatusActualState2(statusHandle, bodyUniqueId, numLinks, numDegreeOfFreedomQ, numDegreeOfFreedomU, rootLocalInertialFrame, actualStateQ, actualStateQdot, jointReactionForces, linkLocalInertialFrames, jointMotorForces, linkStates, linkWorldVelocities);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusActualState2(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong numLinksAddress, jlong numDegreeOfFreedomQAddress, jlong numDegreeOfFreedomUAddress, jlong rootLocalInertialFrameAddress, jlong actualStateQAddress, jlong actualStateQdotAddress, jlong jointReactionForcesAddress, jlong linkLocalInertialFramesAddress, jlong jointMotorForcesAddress, jlong linkStatesAddress, jlong linkWorldVelocitiesAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3GetStatusActualState2)(statusHandleAddress, bodyUniqueIdAddress, numLinksAddress, numDegreeOfFreedomQAddress, numDegreeOfFreedomUAddress, rootLocalInertialFrameAddress, actualStateQAddress, actualStateQdotAddress, jointReactionForcesAddress, linkLocalInertialFramesAddress, jointMotorForcesAddress, linkStatesAddress, linkWorldVelocitiesAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCollisionInfoCommandInit(jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3RequestCollisionInfoCommandInit(physClient, bodyUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCollisionInfoCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCollisionInfoCommandInit(physClientAddress, bodyUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusAABB(jlong statusHandleAddress, jint linkIndex, jlong aabbMinAddress, jlong aabbMaxAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    double *aabbMin = (double *)(intptr_t)aabbMinAddress;
    double *aabbMax = (double *)(intptr_t)aabbMaxAddress;
    return (jint)b3GetStatusAABB(statusHandle, linkIndex, aabbMin, aabbMax);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusAABB(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jint linkIndex, jlong aabbMinAddress, jlong aabbMaxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusAABB(statusHandleAddress, linkIndex, aabbMinAddress, aabbMaxAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitSyncBodyInfoCommand(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitSyncBodyInfoCommand(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitSyncBodyInfoCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitSyncBodyInfoCommand(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveBodyCommand(jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitRemoveBodyCommand(physClient, bodyUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveBodyCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveBodyCommand(physClientAddress, bodyUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetNumBodies(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jint)b3GetNumBodies(physClient);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetNumBodies(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetNumBodies(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetBodyUniqueId(jlong physClientAddress, jint serialIndex) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jint)b3GetBodyUniqueId(physClient, serialIndex);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetBodyUniqueId(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint serialIndex) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetBodyUniqueId(physClientAddress, serialIndex);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetBodyInfo(jlong physClientAddress, jint bodyUniqueId, jlong infoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3BodyInfo *info = (struct b3BodyInfo *)(intptr_t)infoAddress;
    return (jint)b3GetBodyInfo(physClient, bodyUniqueId, info);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetBodyInfo(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jlong infoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetBodyInfo(physClientAddress, bodyUniqueId, infoAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetNumJoints(jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jint)b3GetNumJoints(physClient, bodyUniqueId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetNumJoints(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetNumJoints(physClientAddress, bodyUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ComputeDofCount(jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jint)b3ComputeDofCount(physClient, bodyUniqueId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputeDofCount(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ComputeDofCount(physClientAddress, bodyUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetJointInfo(jlong physClientAddress, jint bodyUniqueId, jint jointIndex, jlong infoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3JointInfo *info = (struct b3JointInfo *)(intptr_t)infoAddress;
    return (jint)b3GetJointInfo(physClient, bodyUniqueId, jointIndex, info);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetJointInfo(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint jointIndex, jlong infoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetJointInfo(physClientAddress, bodyUniqueId, jointIndex, infoAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitSyncUserDataCommand(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitSyncUserDataCommand(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitSyncUserDataCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitSyncUserDataCommand(physClientAddress);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3InitAddUserDataCommand)(jlong physClientAddress, jint bodyUniqueId, jint linkIndex, jint visualShapeIndex, jlong keyAddress, jint valueType, jint valueLength, jlong valueDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *key = (char const *)(intptr_t)keyAddress;
    void const *valueData = (void const *)(intptr_t)valueDataAddress;
    return (jlong)(intptr_t)b3InitAddUserDataCommand(physClient, bodyUniqueId, linkIndex, visualShapeIndex, key, (enum UserDataValueType)valueType, valueLength, valueData);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitAddUserDataCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint linkIndex, jint visualShapeIndex, jlong keyAddress, jint valueType, jint valueLength, jlong valueDataAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3InitAddUserDataCommand)(physClientAddress, bodyUniqueId, linkIndex, visualShapeIndex, keyAddress, valueType, valueLength, valueDataAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveUserDataCommand(jlong physClientAddress, jint userDataId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitRemoveUserDataCommand(physClient, userDataId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveUserDataCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint userDataId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveUserDataCommand(physClientAddress, userDataId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetUserData(jlong physClientAddress, jint userDataId, jlong valueOutAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3UserDataValue *valueOut = (struct b3UserDataValue *)(intptr_t)valueOutAddress;
    return (jint)b3GetUserData(physClient, userDataId, valueOut);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint userDataId, jlong valueOutAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetUserData(physClientAddress, userDataId, valueOutAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetUserDataId(jlong physClientAddress, jint bodyUniqueId, jint linkIndex, jint visualShapeIndex, jlong keyAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *key = (char const *)(intptr_t)keyAddress;
    return (jint)b3GetUserDataId(physClient, bodyUniqueId, linkIndex, visualShapeIndex, key);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserDataId(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint linkIndex, jint visualShapeIndex, jlong keyAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetUserDataId(physClientAddress, bodyUniqueId, linkIndex, visualShapeIndex, keyAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetUserDataIdFromStatus(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetUserDataIdFromStatus(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserDataIdFromStatus(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetUserDataIdFromStatus(statusHandleAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetNumUserData(jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jint)b3GetNumUserData(physClient, bodyUniqueId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetNumUserData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetNumUserData(physClientAddress, bodyUniqueId);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3GetUserDataInfo)(jlong physClientAddress, jint bodyUniqueId, jint userDataIndex, jlong keyOutAddress, jlong userDataIdOutAddress, jlong linkIndexOutAddress, jlong visualShapeIndexOutAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const **keyOut = (char const **)(intptr_t)keyOutAddress;
    int *userDataIdOut = (int *)(intptr_t)userDataIdOutAddress;
    int *linkIndexOut = (int *)(intptr_t)linkIndexOutAddress;
    int *visualShapeIndexOut = (int *)(intptr_t)visualShapeIndexOutAddress;
    b3GetUserDataInfo(physClient, bodyUniqueId, userDataIndex, keyOut, userDataIdOut, linkIndexOut, visualShapeIndexOut);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserDataInfo(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint userDataIndex, jlong keyOutAddress, jlong userDataIdOutAddress, jlong linkIndexOutAddress, jlong visualShapeIndexOutAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3GetUserDataInfo)(physClientAddress, bodyUniqueId, userDataIndex, keyOutAddress, userDataIdOutAddress, linkIndexOutAddress, visualShapeIndexOutAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfoCommandInit(jlong physClientAddress, jint bodyUniqueId, jint linkIndex) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3GetDynamicsInfoCommandInit(physClient, bodyUniqueId, linkIndex);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfoCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint linkIndex) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfoCommandInit(physClientAddress, bodyUniqueId, linkIndex);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfoCommandInit2(jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3GetDynamicsInfoCommandInit2(commandHandle, bodyUniqueId, linkIndex);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfoCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfoCommandInit2(commandHandleAddress, bodyUniqueId, linkIndex);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfo(jlong statusHandleAddress, jlong infoAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3DynamicsInfo *info = (struct b3DynamicsInfo *)(intptr_t)infoAddress;
    return (jint)b3GetDynamicsInfo(statusHandle, info);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfo(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong infoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfo(statusHandleAddress, infoAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeDynamicsInfo(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitChangeDynamicsInfo(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeDynamicsInfo(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeDynamicsInfo(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeDynamicsInfo2(jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3InitChangeDynamicsInfo2(commandHandle);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeDynamicsInfo2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeDynamicsInfo2(commandHandleAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetMass(jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble mass) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetMass(commandHandle, bodyUniqueId, linkIndex, mass);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetMass(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble mass) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetMass(commandHandleAddress, bodyUniqueId, linkIndex, mass);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLocalInertiaDiagonal(jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jlong localInertiaDiagonalAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *localInertiaDiagonal = (double const *)(intptr_t)localInertiaDiagonalAddress;
    return (jint)b3ChangeDynamicsInfoSetLocalInertiaDiagonal(commandHandle, bodyUniqueId, linkIndex, localInertiaDiagonal);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLocalInertiaDiagonal(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jlong localInertiaDiagonalAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLocalInertiaDiagonal(commandHandleAddress, bodyUniqueId, linkIndex, localInertiaDiagonalAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLateralFriction(jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble lateralFriction) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetLateralFriction(commandHandle, bodyUniqueId, linkIndex, lateralFriction);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLateralFriction(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble lateralFriction) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLateralFriction(commandHandleAddress, bodyUniqueId, linkIndex, lateralFriction);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetSpinningFriction(jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble friction) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetSpinningFriction(commandHandle, bodyUniqueId, linkIndex, friction);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetSpinningFriction(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble friction) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetSpinningFriction(commandHandleAddress, bodyUniqueId, linkIndex, friction);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetRollingFriction(jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble friction) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetRollingFriction(commandHandle, bodyUniqueId, linkIndex, friction);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetRollingFriction(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble friction) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetRollingFriction(commandHandleAddress, bodyUniqueId, linkIndex, friction);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetRestitution(jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble restitution) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetRestitution(commandHandle, bodyUniqueId, linkIndex, restitution);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetRestitution(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble restitution) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetRestitution(commandHandleAddress, bodyUniqueId, linkIndex, restitution);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLinearDamping(jlong commandHandleAddress, jint bodyUniqueId, jdouble linearDamping) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetLinearDamping(commandHandle, bodyUniqueId, linearDamping);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLinearDamping(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jdouble linearDamping) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLinearDamping(commandHandleAddress, bodyUniqueId, linearDamping);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetAngularDamping(jlong commandHandleAddress, jint bodyUniqueId, jdouble angularDamping) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetAngularDamping(commandHandle, bodyUniqueId, angularDamping);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetAngularDamping(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jdouble angularDamping) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetAngularDamping(commandHandleAddress, bodyUniqueId, angularDamping);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetContactStiffnessAndDamping(jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble contactStiffness, jdouble contactDamping) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetContactStiffnessAndDamping(commandHandle, bodyUniqueId, linkIndex, contactStiffness, contactDamping);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetContactStiffnessAndDamping(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble contactStiffness, jdouble contactDamping) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetContactStiffnessAndDamping(commandHandleAddress, bodyUniqueId, linkIndex, contactStiffness, contactDamping);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetFrictionAnchor(jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jint frictionAnchor) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetFrictionAnchor(commandHandle, bodyUniqueId, linkIndex, frictionAnchor);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetFrictionAnchor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jint frictionAnchor) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetFrictionAnchor(commandHandleAddress, bodyUniqueId, linkIndex, frictionAnchor);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetCcdSweptSphereRadius(jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble ccdSweptSphereRadius) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetCcdSweptSphereRadius(commandHandle, bodyUniqueId, linkIndex, ccdSweptSphereRadius);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetCcdSweptSphereRadius(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble ccdSweptSphereRadius) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetCcdSweptSphereRadius(commandHandleAddress, bodyUniqueId, linkIndex, ccdSweptSphereRadius);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetContactProcessingThreshold(jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble contactProcessingThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetContactProcessingThreshold(commandHandle, bodyUniqueId, linkIndex, contactProcessingThreshold);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetContactProcessingThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble contactProcessingThreshold) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetContactProcessingThreshold(commandHandleAddress, bodyUniqueId, linkIndex, contactProcessingThreshold);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetActivationState(jlong commandHandleAddress, jint bodyUniqueId, jint activationState) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3ChangeDynamicsInfoSetActivationState(commandHandle, bodyUniqueId, activationState);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetActivationState(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint activationState) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetActivationState(commandHandleAddress, bodyUniqueId, activationState);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3InitCreateUserConstraintCommand)(jlong physClientAddress, jint parentBodyUniqueId, jint parentJointIndex, jint childBodyUniqueId, jint childJointIndex, jlong infoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3JointInfo *info = (struct b3JointInfo *)(intptr_t)infoAddress;
    return (jlong)(intptr_t)b3InitCreateUserConstraintCommand(physClient, parentBodyUniqueId, parentJointIndex, childBodyUniqueId, childJointIndex, info);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitCreateUserConstraintCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint parentBodyUniqueId, jint parentJointIndex, jint childBodyUniqueId, jint childJointIndex, jlong infoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3InitCreateUserConstraintCommand)(physClientAddress, parentBodyUniqueId, parentJointIndex, childBodyUniqueId, childJointIndex, infoAddress);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3InitCreateUserConstraintCommand2)(jlong commandHandleAddress, jint parentBodyUniqueId, jint parentJointIndex, jint childBodyUniqueId, jint childJointIndex, jlong infoAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    struct b3JointInfo *info = (struct b3JointInfo *)(intptr_t)infoAddress;
    return (jlong)(intptr_t)b3InitCreateUserConstraintCommand2(commandHandle, parentBodyUniqueId, parentJointIndex, childBodyUniqueId, childJointIndex, info);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitCreateUserConstraintCommand2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint parentBodyUniqueId, jint parentJointIndex, jint childBodyUniqueId, jint childJointIndex, jlong infoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3InitCreateUserConstraintCommand2)(commandHandleAddress, parentBodyUniqueId, parentJointIndex, childBodyUniqueId, childJointIndex, infoAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusUserConstraintUniqueId(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetStatusUserConstraintUniqueId(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusUserConstraintUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusUserConstraintUniqueId(statusHandleAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintCommand(jlong physClientAddress, jint userConstraintUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitChangeUserConstraintCommand(physClient, userConstraintUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint userConstraintUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintCommand(physClientAddress, userConstraintUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetPivotInB(jlong commandHandleAddress, jlong jointChildPivotAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointChildPivot = (double const *)(intptr_t)jointChildPivotAddress;
    return (jint)b3InitChangeUserConstraintSetPivotInB(commandHandle, jointChildPivot);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetPivotInB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong jointChildPivotAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetPivotInB(commandHandleAddress, jointChildPivotAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetFrameInB(jlong commandHandleAddress, jlong jointChildFrameOrnAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointChildFrameOrn = (double const *)(intptr_t)jointChildFrameOrnAddress;
    return (jint)b3InitChangeUserConstraintSetFrameInB(commandHandle, jointChildFrameOrn);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetFrameInB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong jointChildFrameOrnAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetFrameInB(commandHandleAddress, jointChildFrameOrnAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetMaxForce(jlong commandHandleAddress, jdouble maxAppliedForce) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3InitChangeUserConstraintSetMaxForce(commandHandle, maxAppliedForce);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetMaxForce(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble maxAppliedForce) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetMaxForce(commandHandleAddress, maxAppliedForce);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetGearRatio(jlong commandHandleAddress, jdouble gearRatio) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3InitChangeUserConstraintSetGearRatio(commandHandle, gearRatio);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetGearRatio(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble gearRatio) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetGearRatio(commandHandleAddress, gearRatio);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetGearAuxLink(jlong commandHandleAddress, jint gearAuxLink) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3InitChangeUserConstraintSetGearAuxLink(commandHandle, gearAuxLink);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetGearAuxLink(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint gearAuxLink) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetGearAuxLink(commandHandleAddress, gearAuxLink);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetRelativePositionTarget(jlong commandHandleAddress, jdouble relativePositionTarget) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3InitChangeUserConstraintSetRelativePositionTarget(commandHandle, relativePositionTarget);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetRelativePositionTarget(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble relativePositionTarget) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetRelativePositionTarget(commandHandleAddress, relativePositionTarget);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetERP(jlong commandHandleAddress, jdouble erp) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3InitChangeUserConstraintSetERP(commandHandle, erp);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetERP(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble erp) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetERP(commandHandleAddress, erp);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveUserConstraintCommand(jlong physClientAddress, jint userConstraintUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitRemoveUserConstraintCommand(physClient, userConstraintUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveUserConstraintCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint userConstraintUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveUserConstraintCommand(physClientAddress, userConstraintUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetNumUserConstraints(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jint)b3GetNumUserConstraints(physClient);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetNumUserConstraints(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetNumUserConstraints(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitGetUserConstraintStateCommand(jlong physClientAddress, jint raintUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitGetUserConstraintStateCommand(physClient, (int const)raintUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitGetUserConstraintStateCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint raintUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitGetUserConstraintStateCommand(physClientAddress, raintUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusUserConstraintState(jlong statusHandleAddress, jlong constraintStateAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3UserConstraintState *constraintState = (struct b3UserConstraintState *)(intptr_t)constraintStateAddress;
    return (jint)b3GetStatusUserConstraintState(statusHandle, constraintState);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusUserConstraintState(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong constraintStateAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusUserConstraintState(statusHandleAddress, constraintStateAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetUserConstraintInfo(jlong physClientAddress, jint raintUniqueId, jlong infoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3UserConstraint *info = (struct b3UserConstraint *)(intptr_t)infoAddress;
    return (jint)b3GetUserConstraintInfo(physClient, (int const)raintUniqueId, info);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserConstraintInfo(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint raintUniqueId, jlong infoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetUserConstraintInfo(physClientAddress, raintUniqueId, infoAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetUserConstraintId(jlong physClientAddress, jint serialIndex) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jint)b3GetUserConstraintId(physClient, serialIndex);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserConstraintId(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint serialIndex) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetUserConstraintId(physClientAddress, serialIndex);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestDebugLinesCommand(jlong physClientAddress, jint debugMode) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitRequestDebugLinesCommand(physClient, debugMode);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestDebugLinesCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint debugMode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestDebugLinesCommand(physClientAddress, debugMode);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetDebugLines(jlong physClientAddress, jlong linesAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3DebugLines *lines = (struct b3DebugLines *)(intptr_t)linesAddress;
    b3GetDebugLines(physClient, lines);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetDebugLines(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong linesAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetDebugLines(physClientAddress, linesAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitConfigureOpenGLVisualizer(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitConfigureOpenGLVisualizer(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitConfigureOpenGLVisualizer(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitConfigureOpenGLVisualizer(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitConfigureOpenGLVisualizer2(jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3InitConfigureOpenGLVisualizer2(commandHandle);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitConfigureOpenGLVisualizer2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitConfigureOpenGLVisualizer2(commandHandleAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ConfigureOpenGLVisualizerSetVisualizationFlags(jlong commandHandleAddress, jint flag, jint enabled) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3ConfigureOpenGLVisualizerSetVisualizationFlags(commandHandle, flag, enabled);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ConfigureOpenGLVisualizerSetVisualizationFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flag, jint enabled) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ConfigureOpenGLVisualizerSetVisualizationFlags(commandHandleAddress, flag, enabled);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ConfigureOpenGLVisualizerSetViewMatrix(jlong commandHandleAddress, jfloat cameraDistance, jfloat cameraPitch, jfloat cameraYaw, jlong cameraTargetPositionAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    float const *cameraTargetPosition = (float const *)(intptr_t)cameraTargetPositionAddress;
    b3ConfigureOpenGLVisualizerSetViewMatrix(commandHandle, cameraDistance, cameraPitch, cameraYaw, cameraTargetPosition);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ConfigureOpenGLVisualizerSetViewMatrix(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat cameraDistance, jfloat cameraPitch, jfloat cameraYaw, jlong cameraTargetPositionAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ConfigureOpenGLVisualizerSetViewMatrix(commandHandleAddress, cameraDistance, cameraPitch, cameraYaw, cameraTargetPositionAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestOpenGLVisualizerCameraCommand(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitRequestOpenGLVisualizerCameraCommand(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestOpenGLVisualizerCameraCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestOpenGLVisualizerCameraCommand(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusOpenGLVisualizerCamera(jlong statusHandleAddress, jlong cameraAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3OpenGLVisualizerCameraInfo *camera = (struct b3OpenGLVisualizerCameraInfo *)(intptr_t)cameraAddress;
    return (jint)b3GetStatusOpenGLVisualizerCamera(statusHandle, camera);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusOpenGLVisualizerCamera(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong cameraAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusOpenGLVisualizerCamera(statusHandleAddress, cameraAddress);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawAddLine3D)(jlong physClientAddress, jlong fromXYZAddress, jlong toXYZAddress, jlong colorRGBAddress, jdouble lineWidth, jdouble lifeTime) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    double const *fromXYZ = (double const *)(intptr_t)fromXYZAddress;
    double const *toXYZ = (double const *)(intptr_t)toXYZAddress;
    double const *colorRGB = (double const *)(intptr_t)colorRGBAddress;
    return (jlong)(intptr_t)b3InitUserDebugDrawAddLine3D(physClient, fromXYZ, toXYZ, colorRGB, lineWidth, lifeTime);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawAddLine3D(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong fromXYZAddress, jlong toXYZAddress, jlong colorRGBAddress, jdouble lineWidth, jdouble lifeTime) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawAddLine3D)(physClientAddress, fromXYZAddress, toXYZAddress, colorRGBAddress, lineWidth, lifeTime);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawAddText3D)(jlong physClientAddress, jlong txtAddress, jlong positionXYZAddress, jlong colorRGBAddress, jdouble textSize, jdouble lifeTime) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *txt = (char const *)(intptr_t)txtAddress;
    double const *positionXYZ = (double const *)(intptr_t)positionXYZAddress;
    double const *colorRGB = (double const *)(intptr_t)colorRGBAddress;
    return (jlong)(intptr_t)b3InitUserDebugDrawAddText3D(physClient, txt, positionXYZ, colorRGB, textSize, lifeTime);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawAddText3D(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong txtAddress, jlong positionXYZAddress, jlong colorRGBAddress, jdouble textSize, jdouble lifeTime) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawAddText3D)(physClientAddress, txtAddress, positionXYZAddress, colorRGBAddress, textSize, lifeTime);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UserDebugTextSetOptionFlags(jlong commandHandleAddress, jint optionFlags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3UserDebugTextSetOptionFlags(commandHandle, optionFlags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UserDebugTextSetOptionFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint optionFlags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UserDebugTextSetOptionFlags(commandHandleAddress, optionFlags);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UserDebugTextSetOrientation(jlong commandHandleAddress, jlong orientationAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *orientation = (double const *)(intptr_t)orientationAddress;
    b3UserDebugTextSetOrientation(commandHandle, orientation);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UserDebugTextSetOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong orientationAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UserDebugTextSetOrientation(commandHandleAddress, orientationAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UserDebugItemSetReplaceItemUniqueId(jlong commandHandleAddress, jint replaceItem) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3UserDebugItemSetReplaceItemUniqueId(commandHandle, replaceItem);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UserDebugItemSetReplaceItemUniqueId(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint replaceItem) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UserDebugItemSetReplaceItemUniqueId(commandHandleAddress, replaceItem);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UserDebugItemSetParentObject(jlong commandHandleAddress, jint objectUniqueId, jint linkIndex) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3UserDebugItemSetParentObject(commandHandle, objectUniqueId, linkIndex);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UserDebugItemSetParentObject(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint objectUniqueId, jint linkIndex) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UserDebugItemSetParentObject(commandHandleAddress, objectUniqueId, linkIndex);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugAddParameter(jlong physClientAddress, jlong txtAddress, jdouble rangeMin, jdouble rangeMax, jdouble startValue) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *txt = (char const *)(intptr_t)txtAddress;
    return (jlong)(intptr_t)b3InitUserDebugAddParameter(physClient, txt, rangeMin, rangeMax, startValue);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugAddParameter(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong txtAddress, jdouble rangeMin, jdouble rangeMax, jdouble startValue) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugAddParameter(physClientAddress, txtAddress, rangeMin, rangeMax, startValue);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugReadParameter(jlong physClientAddress, jint debugItemUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitUserDebugReadParameter(physClient, debugItemUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugReadParameter(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint debugItemUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugReadParameter(physClientAddress, debugItemUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusDebugParameterValue(jlong statusHandleAddress, jlong paramValueAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    double *paramValue = (double *)(intptr_t)paramValueAddress;
    return (jint)b3GetStatusDebugParameterValue(statusHandle, paramValue);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusDebugParameterValue(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong paramValueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusDebugParameterValue(statusHandleAddress, paramValueAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawRemove(jlong physClientAddress, jint debugItemUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitUserDebugDrawRemove(physClient, debugItemUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawRemove(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint debugItemUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawRemove(physClientAddress, debugItemUniqueId);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawRemoveAll(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitUserDebugDrawRemoveAll(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawRemoveAll(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawRemoveAll(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitDebugDrawingCommand(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitDebugDrawingCommand(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitDebugDrawingCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitDebugDrawingCommand(physClientAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetDebugObjectColor(jlong commandHandleAddress, jint objectUniqueId, jint linkIndex, jlong objectColorRGBAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *objectColorRGB = (double const *)(intptr_t)objectColorRGBAddress;
    b3SetDebugObjectColor(commandHandle, objectUniqueId, linkIndex, objectColorRGB);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetDebugObjectColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint objectUniqueId, jint linkIndex, jlong objectColorRGBAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetDebugObjectColor(commandHandleAddress, objectUniqueId, linkIndex, objectColorRGBAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RemoveDebugObjectColor(jlong commandHandleAddress, jint objectUniqueId, jint linkIndex) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3RemoveDebugObjectColor(commandHandle, objectUniqueId, linkIndex);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RemoveDebugObjectColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint objectUniqueId, jint linkIndex) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RemoveDebugObjectColor(commandHandleAddress, objectUniqueId, linkIndex);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetDebugItemUniqueId(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetDebugItemUniqueId(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetDebugItemUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetDebugItemUniqueId(statusHandleAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCameraImage(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitRequestCameraImage(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCameraImage(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCameraImage(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCameraImage2(jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3InitRequestCameraImage2(commandHandle);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCameraImage2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCameraImage2(commandHandleAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetCameraMatrices(jlong commandHandleAddress, jlong viewMatrixAddress, jlong projectionMatrixAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    float *viewMatrix = (float *)(intptr_t)viewMatrixAddress;
    float *projectionMatrix = (float *)(intptr_t)projectionMatrixAddress;
    b3RequestCameraImageSetCameraMatrices(commandHandle, viewMatrix, projectionMatrix);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetCameraMatrices(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong viewMatrixAddress, jlong projectionMatrixAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetCameraMatrices(commandHandleAddress, viewMatrixAddress, projectionMatrixAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetPixelResolution(jlong commandHandleAddress, jint width, jint height) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3RequestCameraImageSetPixelResolution(commandHandle, width, height);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetPixelResolution(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint width, jint height) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetPixelResolution(commandHandleAddress, width, height);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDirection(jlong commandHandleAddress, jlong lightDirectionAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    float const *lightDirection = (float const *)(intptr_t)lightDirectionAddress;
    b3RequestCameraImageSetLightDirection(commandHandle, lightDirection);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDirection(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong lightDirectionAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDirection(commandHandleAddress, lightDirectionAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightColor(jlong commandHandleAddress, jlong lightColorAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    float const *lightColor = (float const *)(intptr_t)lightColorAddress;
    b3RequestCameraImageSetLightColor(commandHandle, lightColor);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong lightColorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightColor(commandHandleAddress, lightColorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDistance(jlong commandHandleAddress, jfloat lightDistance) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3RequestCameraImageSetLightDistance(commandHandle, lightDistance);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDistance(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat lightDistance) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDistance(commandHandleAddress, lightDistance);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightAmbientCoeff(jlong commandHandleAddress, jfloat lightAmbientCoeff) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3RequestCameraImageSetLightAmbientCoeff(commandHandle, lightAmbientCoeff);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightAmbientCoeff(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat lightAmbientCoeff) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightAmbientCoeff(commandHandleAddress, lightAmbientCoeff);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDiffuseCoeff(jlong commandHandleAddress, jfloat lightDiffuseCoeff) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3RequestCameraImageSetLightDiffuseCoeff(commandHandle, lightDiffuseCoeff);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDiffuseCoeff(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat lightDiffuseCoeff) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDiffuseCoeff(commandHandleAddress, lightDiffuseCoeff);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightSpecularCoeff(jlong commandHandleAddress, jfloat lightSpecularCoeff) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3RequestCameraImageSetLightSpecularCoeff(commandHandle, lightSpecularCoeff);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightSpecularCoeff(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat lightSpecularCoeff) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightSpecularCoeff(commandHandleAddress, lightSpecularCoeff);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetShadow(jlong commandHandleAddress, jint hasShadow) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3RequestCameraImageSetShadow(commandHandle, hasShadow);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetShadow(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint hasShadow) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetShadow(commandHandleAddress, hasShadow);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSelectRenderer(jlong commandHandleAddress, jint renderer) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3RequestCameraImageSelectRenderer(commandHandle, renderer);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSelectRenderer(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint renderer) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSelectRenderer(commandHandleAddress, renderer);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetFlags(jlong commandHandleAddress, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3RequestCameraImageSetFlags(commandHandle, flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetFlags(commandHandleAddress, flags);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetCameraImageData(jlong physClientAddress, jlong imageDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3CameraImageData *imageData = (struct b3CameraImageData *)(intptr_t)imageDataAddress;
    b3GetCameraImageData(physClient, imageData);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetCameraImageData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong imageDataAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetCameraImageData(physClientAddress, imageDataAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetProjectiveTextureMatrices(jlong commandHandleAddress, jlong viewMatrixAddress, jlong projectionMatrixAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    float *viewMatrix = (float *)(intptr_t)viewMatrixAddress;
    float *projectionMatrix = (float *)(intptr_t)projectionMatrixAddress;
    b3RequestCameraImageSetProjectiveTextureMatrices(commandHandle, viewMatrix, projectionMatrix);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetProjectiveTextureMatrices(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong viewMatrixAddress, jlong projectionMatrixAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetProjectiveTextureMatrices(commandHandleAddress, viewMatrixAddress, projectionMatrixAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ComputeViewMatrixFromPositions(jlong cameraPositionAddress, jlong cameraTargetPositionAddress, jlong cameraUpAddress, jlong viewMatrixAddress) {
    float const *cameraPosition = (float const *)(intptr_t)cameraPositionAddress;
    float const *cameraTargetPosition = (float const *)(intptr_t)cameraTargetPositionAddress;
    float const *cameraUp = (float const *)(intptr_t)cameraUpAddress;
    float *viewMatrix = (float *)(intptr_t)viewMatrixAddress;
    b3ComputeViewMatrixFromPositions(cameraPosition, cameraTargetPosition, cameraUp, viewMatrix);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputeViewMatrixFromPositions(JNIEnv *__env, jclass clazz, jlong cameraPositionAddress, jlong cameraTargetPositionAddress, jlong cameraUpAddress, jlong viewMatrixAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ComputeViewMatrixFromPositions(cameraPositionAddress, cameraTargetPositionAddress, cameraUpAddress, viewMatrixAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3ComputeViewMatrixFromYawPitchRoll)(jlong cameraTargetPositionAddress, jfloat distance, jfloat yaw, jfloat pitch, jfloat roll, jint upAxis, jlong viewMatrixAddress) {
    float const *cameraTargetPosition = (float const *)(intptr_t)cameraTargetPositionAddress;
    float *viewMatrix = (float *)(intptr_t)viewMatrixAddress;
    b3ComputeViewMatrixFromYawPitchRoll(cameraTargetPosition, distance, yaw, pitch, roll, upAxis, viewMatrix);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputeViewMatrixFromYawPitchRoll(JNIEnv *__env, jclass clazz, jlong cameraTargetPositionAddress, jfloat distance, jfloat yaw, jfloat pitch, jfloat roll, jint upAxis, jlong viewMatrixAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3ComputeViewMatrixFromYawPitchRoll)(cameraTargetPositionAddress, distance, yaw, pitch, roll, upAxis, viewMatrixAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ComputePositionFromViewMatrix(jlong viewMatrixAddress, jlong cameraPositionAddress, jlong cameraTargetPositionAddress, jlong cameraUpAddress) {
    float const *viewMatrix = (float const *)(intptr_t)viewMatrixAddress;
    float *cameraPosition = (float *)(intptr_t)cameraPositionAddress;
    float *cameraTargetPosition = (float *)(intptr_t)cameraTargetPositionAddress;
    float *cameraUp = (float *)(intptr_t)cameraUpAddress;
    b3ComputePositionFromViewMatrix(viewMatrix, cameraPosition, cameraTargetPosition, cameraUp);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputePositionFromViewMatrix(JNIEnv *__env, jclass clazz, jlong viewMatrixAddress, jlong cameraPositionAddress, jlong cameraTargetPositionAddress, jlong cameraUpAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ComputePositionFromViewMatrix(viewMatrixAddress, cameraPositionAddress, cameraTargetPositionAddress, cameraUpAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ComputeProjectionMatrix(jfloat left, jfloat right, jfloat bottom, jfloat top, jfloat nearVal, jfloat farVal, jlong projectionMatrixAddress) {
    float *projectionMatrix = (float *)(intptr_t)projectionMatrixAddress;
    b3ComputeProjectionMatrix(left, right, bottom, top, nearVal, farVal, projectionMatrix);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputeProjectionMatrix(JNIEnv *__env, jclass clazz, jfloat left, jfloat right, jfloat bottom, jfloat top, jfloat nearVal, jfloat farVal, jlong projectionMatrixAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ComputeProjectionMatrix(left, right, bottom, top, nearVal, farVal, projectionMatrixAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ComputeProjectionMatrixFOV(jfloat fov, jfloat aspect, jfloat nearVal, jfloat farVal, jlong projectionMatrixAddress) {
    float *projectionMatrix = (float *)(intptr_t)projectionMatrixAddress;
    b3ComputeProjectionMatrixFOV(fov, aspect, nearVal, farVal, projectionMatrix);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputeProjectionMatrixFOV(JNIEnv *__env, jclass clazz, jfloat fov, jfloat aspect, jfloat nearVal, jfloat farVal, jlong projectionMatrixAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ComputeProjectionMatrixFOV(fov, aspect, nearVal, farVal, projectionMatrixAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestContactPointInformation(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitRequestContactPointInformation(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestContactPointInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestContactPointInformation(physClientAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterBodyA(jlong commandHandleAddress, jint bodyUniqueIdA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetContactFilterBodyA(commandHandle, bodyUniqueIdA);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterBodyA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdA) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterBodyA(commandHandleAddress, bodyUniqueIdA);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterBodyB(jlong commandHandleAddress, jint bodyUniqueIdB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetContactFilterBodyB(commandHandle, bodyUniqueIdB);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterBodyB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdB) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterBodyB(commandHandleAddress, bodyUniqueIdB);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterLinkA(jlong commandHandleAddress, jint linkIndexA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetContactFilterLinkA(commandHandle, linkIndexA);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterLinkA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexA) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterLinkA(commandHandleAddress, linkIndexA);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterLinkB(jlong commandHandleAddress, jint linkIndexB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetContactFilterLinkB(commandHandle, linkIndexB);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterLinkB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexB) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterLinkB(commandHandleAddress, linkIndexB);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetContactPointInformation(jlong physClientAddress, jlong contactPointDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3ContactInformation *contactPointData = (struct b3ContactInformation *)(intptr_t)contactPointDataAddress;
    b3GetContactPointInformation(physClient, contactPointData);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetContactPointInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong contactPointDataAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetContactPointInformation(physClientAddress, contactPointDataAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitClosestDistanceQuery(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitClosestDistanceQuery(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitClosestDistanceQuery(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitClosestDistanceQuery(physClientAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterBodyA(jlong commandHandleAddress, jint bodyUniqueIdA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetClosestDistanceFilterBodyA(commandHandle, bodyUniqueIdA);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterBodyA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdA) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterBodyA(commandHandleAddress, bodyUniqueIdA);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterLinkA(jlong commandHandleAddress, jint linkIndexA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetClosestDistanceFilterLinkA(commandHandle, linkIndexA);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterLinkA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexA) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterLinkA(commandHandleAddress, linkIndexA);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterBodyB(jlong commandHandleAddress, jint bodyUniqueIdB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetClosestDistanceFilterBodyB(commandHandle, bodyUniqueIdB);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterBodyB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdB) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterBodyB(commandHandleAddress, bodyUniqueIdB);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterLinkB(jlong commandHandleAddress, jint linkIndexB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetClosestDistanceFilterLinkB(commandHandle, linkIndexB);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterLinkB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexB) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterLinkB(commandHandleAddress, linkIndexB);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceThreshold(jlong commandHandleAddress, jdouble distance) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetClosestDistanceThreshold(commandHandle, distance);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble distance) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceThreshold(commandHandleAddress, distance);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeA(jlong commandHandleAddress, jint collisionShapeA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetClosestDistanceFilterCollisionShapeA(commandHandle, collisionShapeA);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint collisionShapeA) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeA(commandHandleAddress, collisionShapeA);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeB(jlong commandHandleAddress, jint collisionShapeB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetClosestDistanceFilterCollisionShapeB(commandHandle, collisionShapeB);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint collisionShapeB) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeB(commandHandleAddress, collisionShapeB);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapePositionA(jlong commandHandleAddress, jlong collisionShapePositionAAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *collisionShapePositionA = (double const *)(intptr_t)collisionShapePositionAAddress;
    b3SetClosestDistanceFilterCollisionShapePositionA(commandHandle, collisionShapePositionA);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapePositionA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong collisionShapePositionAAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapePositionA(commandHandleAddress, collisionShapePositionAAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapePositionB(jlong commandHandleAddress, jlong collisionShapePositionBAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *collisionShapePositionB = (double const *)(intptr_t)collisionShapePositionBAddress;
    b3SetClosestDistanceFilterCollisionShapePositionB(commandHandle, collisionShapePositionB);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapePositionB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong collisionShapePositionBAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapePositionB(commandHandleAddress, collisionShapePositionBAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeOrientationA(jlong commandHandleAddress, jlong collisionShapeOrientationAAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *collisionShapeOrientationA = (double const *)(intptr_t)collisionShapeOrientationAAddress;
    b3SetClosestDistanceFilterCollisionShapeOrientationA(commandHandle, collisionShapeOrientationA);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeOrientationA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong collisionShapeOrientationAAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeOrientationA(commandHandleAddress, collisionShapeOrientationAAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeOrientationB(jlong commandHandleAddress, jlong collisionShapeOrientationBAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *collisionShapeOrientationB = (double const *)(intptr_t)collisionShapeOrientationBAddress;
    b3SetClosestDistanceFilterCollisionShapeOrientationB(commandHandle, collisionShapeOrientationB);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeOrientationB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong collisionShapeOrientationBAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeOrientationB(commandHandleAddress, collisionShapeOrientationBAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetClosestPointInformation(jlong physClientAddress, jlong contactPointInfoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3ContactInformation *contactPointInfo = (struct b3ContactInformation *)(intptr_t)contactPointInfoAddress;
    b3GetClosestPointInformation(physClient, contactPointInfo);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetClosestPointInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong contactPointInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetClosestPointInformation(physClientAddress, contactPointInfoAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitAABBOverlapQuery(jlong physClientAddress, jlong aabbMinAddress, jlong aabbMaxAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    double const *aabbMin = (double const *)(intptr_t)aabbMinAddress;
    double const *aabbMax = (double const *)(intptr_t)aabbMaxAddress;
    return (jlong)(intptr_t)b3InitAABBOverlapQuery(physClient, aabbMin, aabbMax);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitAABBOverlapQuery(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong aabbMinAddress, jlong aabbMaxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitAABBOverlapQuery(physClientAddress, aabbMinAddress, aabbMaxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetAABBOverlapResults(jlong physClientAddress, jlong dataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3AABBOverlapData *data = (struct b3AABBOverlapData *)(intptr_t)dataAddress;
    b3GetAABBOverlapResults(physClient, data);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetAABBOverlapResults(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong dataAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetAABBOverlapResults(physClientAddress, dataAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestVisualShapeInformation(jlong physClientAddress, jint bodyUniqueIdA) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitRequestVisualShapeInformation(physClient, bodyUniqueIdA);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestVisualShapeInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueIdA) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestVisualShapeInformation(physClientAddress, bodyUniqueIdA);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetVisualShapeInformation(jlong physClientAddress, jlong visualShapeInfoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3VisualShapeInformation *visualShapeInfo = (struct b3VisualShapeInformation *)(intptr_t)visualShapeInfoAddress;
    b3GetVisualShapeInformation(physClient, visualShapeInfo);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetVisualShapeInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong visualShapeInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetVisualShapeInformation(physClientAddress, visualShapeInfoAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCollisionShapeInformation(jlong physClientAddress, jint bodyUniqueId, jint linkIndex) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitRequestCollisionShapeInformation(physClient, bodyUniqueId, linkIndex);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCollisionShapeInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint linkIndex) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCollisionShapeInformation(physClientAddress, bodyUniqueId, linkIndex);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetCollisionShapeInformation(jlong physClientAddress, jlong collisionShapeInfoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3CollisionShapeInformation *collisionShapeInfo = (struct b3CollisionShapeInformation *)(intptr_t)collisionShapeInfoAddress;
    b3GetCollisionShapeInformation(physClient, collisionShapeInfo);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetCollisionShapeInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong collisionShapeInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetCollisionShapeInformation(physClientAddress, collisionShapeInfoAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitLoadTexture(jlong physClientAddress, jlong filenameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    return (jlong)(intptr_t)b3InitLoadTexture(physClient, filename);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitLoadTexture(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong filenameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitLoadTexture(physClientAddress, filenameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusTextureUniqueId(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetStatusTextureUniqueId(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusTextureUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusTextureUniqueId(statusHandleAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateChangeTextureCommandInit(jlong physClientAddress, jint textureUniqueId, jint width, jint height, jlong rgbPixelsAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *rgbPixels = (char const *)(intptr_t)rgbPixelsAddress;
    return (jlong)(intptr_t)b3CreateChangeTextureCommandInit(physClient, textureUniqueId, width, height, rgbPixels);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateChangeTextureCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint textureUniqueId, jint width, jint height, jlong rgbPixelsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateChangeTextureCommandInit(physClientAddress, textureUniqueId, width, height, rgbPixelsAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitUpdateVisualShape(jlong physClientAddress, jint bodyUniqueId, jint jointIndex, jint shapeIndex, jint textureUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitUpdateVisualShape(physClient, bodyUniqueId, jointIndex, shapeIndex, textureUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUpdateVisualShape(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint jointIndex, jint shapeIndex, jint textureUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitUpdateVisualShape(physClientAddress, bodyUniqueId, jointIndex, shapeIndex, textureUniqueId);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UpdateVisualShapeRGBAColor(jlong commandHandleAddress, jlong rgbaColorAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rgbaColor = (double const *)(intptr_t)rgbaColorAddress;
    b3UpdateVisualShapeRGBAColor(commandHandle, rgbaColor);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UpdateVisualShapeRGBAColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong rgbaColorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UpdateVisualShapeRGBAColor(commandHandleAddress, rgbaColorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UpdateVisualShapeSpecularColor(jlong commandHandleAddress, jlong specularColorAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *specularColor = (double const *)(intptr_t)specularColorAddress;
    b3UpdateVisualShapeSpecularColor(commandHandle, specularColor);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UpdateVisualShapeSpecularColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong specularColorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3UpdateVisualShapeSpecularColor(commandHandleAddress, specularColorAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitPhysicsParamCommand(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitPhysicsParamCommand(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitPhysicsParamCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitPhysicsParamCommand(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitPhysicsParamCommand2(jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3InitPhysicsParamCommand2(commandHandle);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitPhysicsParamCommand2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitPhysicsParamCommand2(commandHandleAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetGravity(jlong commandHandleAddress, jdouble gravx, jdouble gravy, jdouble gravz) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetGravity(commandHandle, gravx, gravy, gravz);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetGravity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble gravx, jdouble gravy, jdouble gravz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetGravity(commandHandleAddress, gravx, gravy, gravz);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetTimeStep(jlong commandHandleAddress, jdouble timeStep) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetTimeStep(commandHandle, timeStep);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetTimeStep(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble timeStep) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetTimeStep(commandHandleAddress, timeStep);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultContactERP(jlong commandHandleAddress, jdouble defaultContactERP) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetDefaultContactERP(commandHandle, defaultContactERP);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultContactERP(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble defaultContactERP) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultContactERP(commandHandleAddress, defaultContactERP);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultNonContactERP(jlong commandHandleAddress, jdouble defaultNonContactERP) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetDefaultNonContactERP(commandHandle, defaultNonContactERP);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultNonContactERP(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble defaultNonContactERP) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultNonContactERP(commandHandleAddress, defaultNonContactERP);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultFrictionERP(jlong commandHandleAddress, jdouble frictionERP) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetDefaultFrictionERP(commandHandle, frictionERP);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultFrictionERP(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble frictionERP) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultFrictionERP(commandHandleAddress, frictionERP);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultGlobalCFM(jlong commandHandleAddress, jdouble defaultGlobalCFM) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetDefaultGlobalCFM(commandHandle, defaultGlobalCFM);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultGlobalCFM(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble defaultGlobalCFM) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultGlobalCFM(commandHandleAddress, defaultGlobalCFM);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultFrictionCFM(jlong commandHandleAddress, jdouble frictionCFM) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetDefaultFrictionCFM(commandHandle, frictionCFM);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultFrictionCFM(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble frictionCFM) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultFrictionCFM(commandHandleAddress, frictionCFM);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetNumSubSteps(jlong commandHandleAddress, jint numSubSteps) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetNumSubSteps(commandHandle, numSubSteps);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetNumSubSteps(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numSubSteps) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetNumSubSteps(commandHandleAddress, numSubSteps);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetRealTimeSimulation(jlong commandHandleAddress, jint enableRealTimeSimulation) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetRealTimeSimulation(commandHandle, enableRealTimeSimulation);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetRealTimeSimulation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint enableRealTimeSimulation) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetRealTimeSimulation(commandHandleAddress, enableRealTimeSimulation);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetNumSolverIterations(jlong commandHandleAddress, jint numSolverIterations) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetNumSolverIterations(commandHandle, numSolverIterations);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetNumSolverIterations(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numSolverIterations) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetNumSolverIterations(commandHandleAddress, numSolverIterations);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetCollisionFilterMode(jlong commandHandleAddress, jint filterMode) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetCollisionFilterMode(commandHandle, filterMode);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetCollisionFilterMode(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint filterMode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetCollisionFilterMode(commandHandleAddress, filterMode);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetUseSplitImpulse(jlong commandHandleAddress, jint useSplitImpulse) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetUseSplitImpulse(commandHandle, useSplitImpulse);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetUseSplitImpulse(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint useSplitImpulse) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetUseSplitImpulse(commandHandleAddress, useSplitImpulse);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetSplitImpulsePenetrationThreshold(jlong commandHandleAddress, jdouble splitImpulsePenetrationThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetSplitImpulsePenetrationThreshold(commandHandle, splitImpulsePenetrationThreshold);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetSplitImpulsePenetrationThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble splitImpulsePenetrationThreshold) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetSplitImpulsePenetrationThreshold(commandHandleAddress, splitImpulsePenetrationThreshold);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetContactBreakingThreshold(jlong commandHandleAddress, jdouble contactBreakingThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetContactBreakingThreshold(commandHandle, contactBreakingThreshold);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetContactBreakingThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble contactBreakingThreshold) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetContactBreakingThreshold(commandHandleAddress, contactBreakingThreshold);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetMaxNumCommandsPer1ms(jlong commandHandleAddress, jint maxNumCmdPer1ms) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetMaxNumCommandsPer1ms(commandHandle, maxNumCmdPer1ms);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetMaxNumCommandsPer1ms(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint maxNumCmdPer1ms) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetMaxNumCommandsPer1ms(commandHandleAddress, maxNumCmdPer1ms);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetEnableFileCaching(jlong commandHandleAddress, jint enableFileCaching) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetEnableFileCaching(commandHandle, enableFileCaching);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetEnableFileCaching(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint enableFileCaching) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetEnableFileCaching(commandHandleAddress, enableFileCaching);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetRestitutionVelocityThreshold(jlong commandHandleAddress, jdouble restitutionVelocityThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetRestitutionVelocityThreshold(commandHandle, restitutionVelocityThreshold);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetRestitutionVelocityThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble restitutionVelocityThreshold) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetRestitutionVelocityThreshold(commandHandleAddress, restitutionVelocityThreshold);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetEnableConeFriction(jlong commandHandleAddress, jint enableConeFriction) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetEnableConeFriction(commandHandle, enableConeFriction);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetEnableConeFriction(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint enableConeFriction) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetEnableConeFriction(commandHandleAddress, enableConeFriction);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetDeterministicOverlappingPairs(jlong commandHandleAddress, jint deterministicOverlappingPairs) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParameterSetDeterministicOverlappingPairs(commandHandle, deterministicOverlappingPairs);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetDeterministicOverlappingPairs(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint deterministicOverlappingPairs) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetDeterministicOverlappingPairs(commandHandleAddress, deterministicOverlappingPairs);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetAllowedCcdPenetration(jlong commandHandleAddress, jdouble allowedCcdPenetration) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParameterSetAllowedCcdPenetration(commandHandle, allowedCcdPenetration);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetAllowedCcdPenetration(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble allowedCcdPenetration) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetAllowedCcdPenetration(commandHandleAddress, allowedCcdPenetration);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetJointFeedbackMode(jlong commandHandleAddress, jint jointFeedbackMode) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParameterSetJointFeedbackMode(commandHandle, jointFeedbackMode);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetJointFeedbackMode(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint jointFeedbackMode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetJointFeedbackMode(commandHandleAddress, jointFeedbackMode);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetSolverResidualThreshold(jlong commandHandleAddress, jdouble solverResidualThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetSolverResidualThreshold(commandHandle, solverResidualThreshold);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetSolverResidualThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble solverResidualThreshold) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetSolverResidualThreshold(commandHandleAddress, solverResidualThreshold);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetContactSlop(jlong commandHandleAddress, jdouble contactSlop) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetContactSlop(commandHandle, contactSlop);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetContactSlop(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble contactSlop) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetContactSlop(commandHandleAddress, contactSlop);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetEnableSAT(jlong commandHandleAddress, jint enableSAT) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParameterSetEnableSAT(commandHandle, enableSAT);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetEnableSAT(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint enableSAT) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetEnableSAT(commandHandleAddress, enableSAT);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetConstraintSolverType(jlong commandHandleAddress, jint raintSolverType) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParameterSetConstraintSolverType(commandHandle, (int const)raintSolverType);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetConstraintSolverType(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint raintSolverType) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetConstraintSolverType(commandHandleAddress, raintSolverType);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetMinimumSolverIslandSize(jlong commandHandleAddress, jint minimumSolverIslandSize) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParameterSetMinimumSolverIslandSize(commandHandle, minimumSolverIslandSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetMinimumSolverIslandSize(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint minimumSolverIslandSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetMinimumSolverIslandSize(commandHandleAddress, minimumSolverIslandSize);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestPhysicsParamCommand(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitRequestPhysicsParamCommand(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestPhysicsParamCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRequestPhysicsParamCommand(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPhysicsSimulationParameters(jlong statusHandleAddress, jlong paramsAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3PhysicsSimulationParameters *params = (struct b3PhysicsSimulationParameters *)(intptr_t)paramsAddress;
    return (jint)b3GetStatusPhysicsSimulationParameters(statusHandle, params);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPhysicsSimulationParameters(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong paramsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPhysicsSimulationParameters(statusHandleAddress, paramsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetInternalSimFlags(jlong commandHandleAddress, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3PhysicsParamSetInternalSimFlags(commandHandle, flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetInternalSimFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetInternalSimFlags(commandHandleAddress, flags);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitStepSimulationCommand(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitStepSimulationCommand(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitStepSimulationCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitStepSimulationCommand(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitStepSimulationCommand2(jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3InitStepSimulationCommand2(commandHandle);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitStepSimulationCommand2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitStepSimulationCommand2(commandHandleAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitResetSimulationCommand(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitResetSimulationCommand(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitResetSimulationCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitResetSimulationCommand(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitResetSimulationCommand2(jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3InitResetSimulationCommand2(commandHandle);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitResetSimulationCommand2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitResetSimulationCommand2(commandHandleAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandInit(jlong physClientAddress, jlong urdfFileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *urdfFileName = (char const *)(intptr_t)urdfFileNameAddress;
    return (jlong)(intptr_t)b3LoadUrdfCommandInit(physClient, urdfFileName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong urdfFileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandInit(physClientAddress, urdfFileNameAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandInit2(jlong commandHandleAddress, jlong urdfFileNameAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *urdfFileName = (char const *)(intptr_t)urdfFileNameAddress;
    return (jlong)(intptr_t)b3LoadUrdfCommandInit2(commandHandle, urdfFileName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong urdfFileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandInit2(commandHandleAddress, urdfFileNameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetStartPosition(jlong commandHandleAddress, jdouble startPosX, jdouble startPosY, jdouble startPosZ) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadUrdfCommandSetStartPosition(commandHandle, startPosX, startPosY, startPosZ);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetStartPosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startPosX, jdouble startPosY, jdouble startPosZ) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetStartPosition(commandHandleAddress, startPosX, startPosY, startPosZ);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetStartOrientation(jlong commandHandleAddress, jdouble startOrnX, jdouble startOrnY, jdouble startOrnZ, jdouble startOrnW) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadUrdfCommandSetStartOrientation(commandHandle, startOrnX, startOrnY, startOrnZ, startOrnW);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetStartOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startOrnX, jdouble startOrnY, jdouble startOrnZ, jdouble startOrnW) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetStartOrientation(commandHandleAddress, startOrnX, startOrnY, startOrnZ, startOrnW);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetUseMultiBody(jlong commandHandleAddress, jint useMultiBody) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadUrdfCommandSetUseMultiBody(commandHandle, useMultiBody);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetUseMultiBody(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint useMultiBody) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetUseMultiBody(commandHandleAddress, useMultiBody);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetUseFixedBase(jlong commandHandleAddress, jint useFixedBase) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadUrdfCommandSetUseFixedBase(commandHandle, useFixedBase);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetUseFixedBase(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint useFixedBase) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetUseFixedBase(commandHandleAddress, useFixedBase);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetFlags(jlong commandHandleAddress, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadUrdfCommandSetFlags(commandHandle, flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetFlags(commandHandleAddress, flags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetGlobalScaling(jlong commandHandleAddress, jdouble globalScaling) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadUrdfCommandSetGlobalScaling(commandHandle, globalScaling);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetGlobalScaling(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble globalScaling) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetGlobalScaling(commandHandleAddress, globalScaling);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SaveStateCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3SaveStateCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SaveStateCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SaveStateCommandInit(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusGetStateId(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetStatusGetStateId(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusGetStateId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusGetStateId(statusHandleAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadStateCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3LoadStateCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadStateCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadStateCommandInit(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadStateSetStateId(jlong commandHandleAddress, jint stateId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadStateSetStateId(commandHandle, stateId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadStateSetStateId(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint stateId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadStateSetStateId(commandHandleAddress, stateId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadStateSetFileName(jlong commandHandleAddress, jlong fileNameAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    return (jint)b3LoadStateSetFileName(commandHandle, fileName);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadStateSetFileName(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong fileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadStateSetFileName(commandHandleAddress, fileNameAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadBulletCommandInit(jlong physClientAddress, jlong fileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    return (jlong)(intptr_t)b3LoadBulletCommandInit(physClient, fileName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadBulletCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong fileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadBulletCommandInit(physClientAddress, fileNameAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SaveBulletCommandInit(jlong physClientAddress, jlong fileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    return (jlong)(intptr_t)b3SaveBulletCommandInit(physClient, fileName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SaveBulletCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong fileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SaveBulletCommandInit(physClientAddress, fileNameAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandInit(jlong physClientAddress, jlong fileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    return (jlong)(intptr_t)b3LoadMJCFCommandInit(physClient, fileName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong fileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandInit(physClientAddress, fileNameAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandInit2(jlong commandHandleAddress, jlong fileNameAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    return (jlong)(intptr_t)b3LoadMJCFCommandInit2(commandHandle, fileName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong fileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandInit2(commandHandleAddress, fileNameAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandSetFlags(jlong commandHandleAddress, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3LoadMJCFCommandSetFlags(commandHandle, flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandSetFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandSetFlags(commandHandleAddress, flags);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseDynamicsCommandInit(jlong physClientAddress, jint bodyUniqueId, jlong jointPositionsQAddress, jlong jointVelocitiesQdotAddress, jlong jointAccelerationsAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    double const *jointPositionsQ = (double const *)(intptr_t)jointPositionsQAddress;
    double const *jointVelocitiesQdot = (double const *)(intptr_t)jointVelocitiesQdotAddress;
    double const *jointAccelerations = (double const *)(intptr_t)jointAccelerationsAddress;
    return (jlong)(intptr_t)b3CalculateInverseDynamicsCommandInit(physClient, bodyUniqueId, jointPositionsQ, jointVelocitiesQdot, jointAccelerations);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseDynamicsCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jlong jointPositionsQAddress, jlong jointVelocitiesQdotAddress, jlong jointAccelerationsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseDynamicsCommandInit(physClientAddress, bodyUniqueId, jointPositionsQAddress, jointVelocitiesQdotAddress, jointAccelerationsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusInverseDynamicsJointForces(jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong dofCountAddress, jlong jointForcesAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *bodyUniqueId = (int *)(intptr_t)bodyUniqueIdAddress;
    int *dofCount = (int *)(intptr_t)dofCountAddress;
    double *jointForces = (double *)(intptr_t)jointForcesAddress;
    return (jint)b3GetStatusInverseDynamicsJointForces(statusHandle, bodyUniqueId, dofCount, jointForces);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusInverseDynamicsJointForces(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong dofCountAddress, jlong jointForcesAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusInverseDynamicsJointForces(statusHandleAddress, bodyUniqueIdAddress, dofCountAddress, jointForcesAddress);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CalculateJacobianCommandInit)(jlong physClientAddress, jint bodyUniqueId, jint linkIndex, jlong localPositionAddress, jlong jointPositionsQAddress, jlong jointVelocitiesQdotAddress, jlong jointAccelerationsAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    double const *localPosition = (double const *)(intptr_t)localPositionAddress;
    double const *jointPositionsQ = (double const *)(intptr_t)jointPositionsQAddress;
    double const *jointVelocitiesQdot = (double const *)(intptr_t)jointVelocitiesQdotAddress;
    double const *jointAccelerations = (double const *)(intptr_t)jointAccelerationsAddress;
    return (jlong)(intptr_t)b3CalculateJacobianCommandInit(physClient, bodyUniqueId, linkIndex, localPosition, jointPositionsQ, jointVelocitiesQdot, jointAccelerations);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateJacobianCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint linkIndex, jlong localPositionAddress, jlong jointPositionsQAddress, jlong jointVelocitiesQdotAddress, jlong jointAccelerationsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CalculateJacobianCommandInit)(physClientAddress, bodyUniqueId, linkIndex, localPositionAddress, jointPositionsQAddress, jointVelocitiesQdotAddress, jointAccelerationsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusJacobian(jlong statusHandleAddress, jlong dofCountAddress, jlong linearJacobianAddress, jlong angularJacobianAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *dofCount = (int *)(intptr_t)dofCountAddress;
    double *linearJacobian = (double *)(intptr_t)linearJacobianAddress;
    double *angularJacobian = (double *)(intptr_t)angularJacobianAddress;
    return (jint)b3GetStatusJacobian(statusHandle, dofCount, linearJacobian, angularJacobian);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusJacobian(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong dofCountAddress, jlong linearJacobianAddress, jlong angularJacobianAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusJacobian(statusHandleAddress, dofCountAddress, linearJacobianAddress, angularJacobianAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateMassMatrixCommandInit(jlong physClientAddress, jint bodyUniqueId, jlong jointPositionsQAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    double const *jointPositionsQ = (double const *)(intptr_t)jointPositionsQAddress;
    return (jlong)(intptr_t)b3CalculateMassMatrixCommandInit(physClient, bodyUniqueId, jointPositionsQ);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateMassMatrixCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jlong jointPositionsQAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateMassMatrixCommandInit(physClientAddress, bodyUniqueId, jointPositionsQAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusMassMatrix(jlong physClientAddress, jlong statusHandleAddress, jlong dofCountAddress, jlong massMatrixAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *dofCount = (int *)(intptr_t)dofCountAddress;
    double *massMatrix = (double *)(intptr_t)massMatrixAddress;
    return (jint)b3GetStatusMassMatrix(physClient, statusHandle, dofCount, massMatrix);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusMassMatrix(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong statusHandleAddress, jlong dofCountAddress, jlong massMatrixAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusMassMatrix(physClientAddress, statusHandleAddress, dofCountAddress, massMatrixAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsCommandInit(jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3CalculateInverseKinematicsCommandInit(physClient, bodyUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsCommandInit(physClientAddress, bodyUniqueId);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsAddTargetPurePosition(jlong commandHandleAddress, jint endEffectorLinkIndex, jlong targetPositionAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *targetPosition = (double const *)(intptr_t)targetPositionAddress;
    b3CalculateInverseKinematicsAddTargetPurePosition(commandHandle, endEffectorLinkIndex, targetPosition);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsAddTargetPurePosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint endEffectorLinkIndex, jlong targetPositionAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsAddTargetPurePosition(commandHandleAddress, endEffectorLinkIndex, targetPositionAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsAddTargetPositionWithOrientation(jlong commandHandleAddress, jint endEffectorLinkIndex, jlong targetPositionAddress, jlong targetOrientationAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *targetPosition = (double const *)(intptr_t)targetPositionAddress;
    double const *targetOrientation = (double const *)(intptr_t)targetOrientationAddress;
    b3CalculateInverseKinematicsAddTargetPositionWithOrientation(commandHandle, endEffectorLinkIndex, targetPosition, targetOrientation);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsAddTargetPositionWithOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint endEffectorLinkIndex, jlong targetPositionAddress, jlong targetOrientationAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsAddTargetPositionWithOrientation(commandHandleAddress, endEffectorLinkIndex, targetPositionAddress, targetOrientationAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsPosWithNullSpaceVel)(jlong commandHandleAddress, jint numDof, jint endEffectorLinkIndex, jlong targetPositionAddress, jlong lowerLimitAddress, jlong upperLimitAddress, jlong jointRangeAddress, jlong restPoseAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *targetPosition = (double const *)(intptr_t)targetPositionAddress;
    double const *lowerLimit = (double const *)(intptr_t)lowerLimitAddress;
    double const *upperLimit = (double const *)(intptr_t)upperLimitAddress;
    double const *jointRange = (double const *)(intptr_t)jointRangeAddress;
    double const *restPose = (double const *)(intptr_t)restPoseAddress;
    b3CalculateInverseKinematicsPosWithNullSpaceVel(commandHandle, numDof, endEffectorLinkIndex, targetPosition, lowerLimit, upperLimit, jointRange, restPose);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsPosWithNullSpaceVel(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numDof, jint endEffectorLinkIndex, jlong targetPositionAddress, jlong lowerLimitAddress, jlong upperLimitAddress, jlong jointRangeAddress, jlong restPoseAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsPosWithNullSpaceVel)(commandHandleAddress, numDof, endEffectorLinkIndex, targetPositionAddress, lowerLimitAddress, upperLimitAddress, jointRangeAddress, restPoseAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsPosOrnWithNullSpaceVel)(jlong commandHandleAddress, jint numDof, jint endEffectorLinkIndex, jlong targetPositionAddress, jlong targetOrientationAddress, jlong lowerLimitAddress, jlong upperLimitAddress, jlong jointRangeAddress, jlong restPoseAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *targetPosition = (double const *)(intptr_t)targetPositionAddress;
    double const *targetOrientation = (double const *)(intptr_t)targetOrientationAddress;
    double const *lowerLimit = (double const *)(intptr_t)lowerLimitAddress;
    double const *upperLimit = (double const *)(intptr_t)upperLimitAddress;
    double const *jointRange = (double const *)(intptr_t)jointRangeAddress;
    double const *restPose = (double const *)(intptr_t)restPoseAddress;
    b3CalculateInverseKinematicsPosOrnWithNullSpaceVel(commandHandle, numDof, endEffectorLinkIndex, targetPosition, targetOrientation, lowerLimit, upperLimit, jointRange, restPose);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsPosOrnWithNullSpaceVel(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numDof, jint endEffectorLinkIndex, jlong targetPositionAddress, jlong targetOrientationAddress, jlong lowerLimitAddress, jlong upperLimitAddress, jlong jointRangeAddress, jlong restPoseAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsPosOrnWithNullSpaceVel)(commandHandleAddress, numDof, endEffectorLinkIndex, targetPositionAddress, targetOrientationAddress, lowerLimitAddress, upperLimitAddress, jointRangeAddress, restPoseAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetJointDamping(jlong commandHandleAddress, jint numDof, jlong jointDampingCoeffAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointDampingCoeff = (double const *)(intptr_t)jointDampingCoeffAddress;
    b3CalculateInverseKinematicsSetJointDamping(commandHandle, numDof, jointDampingCoeff);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetJointDamping(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numDof, jlong jointDampingCoeffAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetJointDamping(commandHandleAddress, numDof, jointDampingCoeffAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSelectSolver(jlong commandHandleAddress, jint solver) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3CalculateInverseKinematicsSelectSolver(commandHandle, solver);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSelectSolver(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint solver) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSelectSolver(commandHandleAddress, solver);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusInverseKinematicsJointPositions(jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong dofCountAddress, jlong jointPositionsAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *bodyUniqueId = (int *)(intptr_t)bodyUniqueIdAddress;
    int *dofCount = (int *)(intptr_t)dofCountAddress;
    double *jointPositions = (double *)(intptr_t)jointPositionsAddress;
    return (jint)b3GetStatusInverseKinematicsJointPositions(statusHandle, bodyUniqueId, dofCount, jointPositions);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusInverseKinematicsJointPositions(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong dofCountAddress, jlong jointPositionsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusInverseKinematicsJointPositions(statusHandleAddress, bodyUniqueIdAddress, dofCountAddress, jointPositionsAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetCurrentPositions(jlong commandHandleAddress, jint numDof, jlong currentJointPositionsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *currentJointPositions = (double const *)(intptr_t)currentJointPositionsAddress;
    b3CalculateInverseKinematicsSetCurrentPositions(commandHandle, numDof, currentJointPositions);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetCurrentPositions(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numDof, jlong currentJointPositionsAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetCurrentPositions(commandHandleAddress, numDof, currentJointPositionsAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetMaxNumIterations(jlong commandHandleAddress, jint maxNumIterations) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3CalculateInverseKinematicsSetMaxNumIterations(commandHandle, maxNumIterations);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetMaxNumIterations(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint maxNumIterations) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetMaxNumIterations(commandHandleAddress, maxNumIterations);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetResidualThreshold(jlong commandHandleAddress, jdouble residualThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3CalculateInverseKinematicsSetResidualThreshold(commandHandle, residualThreshold);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetResidualThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble residualThreshold) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetResidualThreshold(commandHandleAddress, residualThreshold);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CollisionFilterCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3CollisionFilterCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CollisionFilterCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CollisionFilterCommandInit(physClientAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3SetCollisionFilterPair)(jlong commandHandleAddress, jint bodyUniqueIdA, jint bodyUniqueIdB, jint linkIndexA, jint linkIndexB, jint enableCollision) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetCollisionFilterPair(commandHandle, bodyUniqueIdA, bodyUniqueIdB, linkIndexA, linkIndexB, enableCollision);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetCollisionFilterPair(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdA, jint bodyUniqueIdB, jint linkIndexA, jint linkIndexB, jint enableCollision) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3SetCollisionFilterPair)(commandHandleAddress, bodyUniqueIdA, bodyUniqueIdB, linkIndexA, linkIndexB, enableCollision);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetCollisionFilterGroupMask(jlong commandHandleAddress, jint bodyUniqueIdA, jint linkIndexA, jint collisionFilterGroup, jint collisionFilterMask) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetCollisionFilterGroupMask(commandHandle, bodyUniqueIdA, linkIndexA, collisionFilterGroup, collisionFilterMask);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetCollisionFilterGroupMask(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdA, jint linkIndexA, jint collisionFilterGroup, jint collisionFilterMask) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetCollisionFilterGroupMask(commandHandleAddress, bodyUniqueIdA, linkIndexA, collisionFilterGroup, collisionFilterMask);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandInit(jlong physClientAddress, jlong sdfFileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *sdfFileName = (char const *)(intptr_t)sdfFileNameAddress;
    return (jlong)(intptr_t)b3LoadSdfCommandInit(physClient, sdfFileName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong sdfFileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandInit(physClientAddress, sdfFileNameAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandInit2(jlong commandHandleAddress, jlong sdfFileNameAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *sdfFileName = (char const *)(intptr_t)sdfFileNameAddress;
    return (jlong)(intptr_t)b3LoadSdfCommandInit2(commandHandle, sdfFileName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong sdfFileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandInit2(commandHandleAddress, sdfFileNameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandSetUseMultiBody(jlong commandHandleAddress, jint useMultiBody) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadSdfCommandSetUseMultiBody(commandHandle, useMultiBody);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandSetUseMultiBody(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint useMultiBody) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandSetUseMultiBody(commandHandleAddress, useMultiBody);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandSetUseGlobalScaling(jlong commandHandleAddress, jdouble globalScaling) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadSdfCommandSetUseGlobalScaling(commandHandle, globalScaling);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandSetUseGlobalScaling(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble globalScaling) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandSetUseGlobalScaling(commandHandleAddress, globalScaling);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SaveWorldCommandInit(jlong physClientAddress, jlong sdfFileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *sdfFileName = (char const *)(intptr_t)sdfFileNameAddress;
    return (jlong)(intptr_t)b3SaveWorldCommandInit(physClient, sdfFileName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SaveWorldCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong sdfFileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SaveWorldCommandInit(physClientAddress, sdfFileNameAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit(jlong physClientAddress, jint controlMode) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3JointControlCommandInit(physClient, controlMode);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint controlMode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit(physClientAddress, controlMode);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit2(jlong physClientAddress, jint bodyUniqueId, jint controlMode) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3JointControlCommandInit2(physClient, bodyUniqueId, controlMode);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit2(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint controlMode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit2(physClientAddress, bodyUniqueId, controlMode);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit2Internal(jlong commandHandleAddress, jint bodyUniqueId, jint controlMode) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3JointControlCommandInit2Internal(commandHandle, bodyUniqueId, controlMode);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit2Internal(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint controlMode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit2Internal(commandHandleAddress, bodyUniqueId, controlMode);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredPosition(jlong commandHandleAddress, jint qIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3JointControlSetDesiredPosition(commandHandle, qIndex, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredPosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint qIndex, jdouble value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredPosition(commandHandleAddress, qIndex, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetKp(jlong commandHandleAddress, jint dofIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3JointControlSetKp(commandHandle, dofIndex, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetKp(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetKp(commandHandleAddress, dofIndex, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetKd(jlong commandHandleAddress, jint dofIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3JointControlSetKd(commandHandle, dofIndex, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetKd(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetKd(commandHandleAddress, dofIndex, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetMaximumVelocity(jlong commandHandleAddress, jint dofIndex, jdouble maximumVelocity) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3JointControlSetMaximumVelocity(commandHandle, dofIndex, maximumVelocity);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetMaximumVelocity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble maximumVelocity) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetMaximumVelocity(commandHandleAddress, dofIndex, maximumVelocity);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredVelocity(jlong commandHandleAddress, jint dofIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3JointControlSetDesiredVelocity(commandHandle, dofIndex, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredVelocity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredVelocity(commandHandleAddress, dofIndex, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetMaximumForce(jlong commandHandleAddress, jint dofIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3JointControlSetMaximumForce(commandHandle, dofIndex, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetMaximumForce(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetMaximumForce(commandHandleAddress, dofIndex, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredForceTorque(jlong commandHandleAddress, jint dofIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3JointControlSetDesiredForceTorque(commandHandle, dofIndex, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredForceTorque(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredForceTorque(commandHandleAddress, dofIndex, value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3CreateCollisionShapeCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeCommandInit(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddSphere(jlong commandHandleAddress, jdouble radius) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateCollisionShapeAddSphere(commandHandle, radius);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddSphere(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddSphere(commandHandleAddress, radius);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddBox(jlong commandHandleAddress, jlong halfExtentsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *halfExtents = (double const *)(intptr_t)halfExtentsAddress;
    return (jint)b3CreateCollisionShapeAddBox(commandHandle, halfExtents);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddBox(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong halfExtentsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddBox(commandHandleAddress, halfExtentsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddCapsule(jlong commandHandleAddress, jdouble radius, jdouble height) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateCollisionShapeAddCapsule(commandHandle, radius, height);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddCapsule(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius, jdouble height) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddCapsule(commandHandleAddress, radius, height);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddCylinder(jlong commandHandleAddress, jdouble radius, jdouble height) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateCollisionShapeAddCylinder(commandHandle, radius, height);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddCylinder(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius, jdouble height) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddCylinder(commandHandleAddress, radius, height);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddPlane(jlong commandHandleAddress, jlong planeNormalAddress, jdouble planeConstant) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *planeNormal = (double const *)(intptr_t)planeNormalAddress;
    return (jint)b3CreateCollisionShapeAddPlane(commandHandle, planeNormal, planeConstant);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddPlane(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong planeNormalAddress, jdouble planeConstant) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddPlane(commandHandleAddress, planeNormalAddress, planeConstant);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddMesh(jlong commandHandleAddress, jlong fileNameAddress, jlong meshScaleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    double const *meshScale = (double const *)(intptr_t)meshScaleAddress;
    return (jint)b3CreateCollisionShapeAddMesh(commandHandle, fileName, meshScale);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddMesh(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong fileNameAddress, jlong meshScaleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddMesh(commandHandleAddress, fileNameAddress, meshScaleAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionSetFlag(jlong commandHandleAddress, jint shapeIndex, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3CreateCollisionSetFlag(commandHandle, shapeIndex, flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionSetFlag(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionSetFlag(commandHandleAddress, shapeIndex, flags);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeSetChildTransform(jlong commandHandleAddress, jint shapeIndex, jlong childPositionAddress, jlong childOrientationAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *childPosition = (double const *)(intptr_t)childPositionAddress;
    double const *childOrientation = (double const *)(intptr_t)childOrientationAddress;
    b3CreateCollisionShapeSetChildTransform(commandHandle, shapeIndex, childPosition, childOrientation);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeSetChildTransform(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jlong childPositionAddress, jlong childOrientationAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeSetChildTransform(commandHandleAddress, shapeIndex, childPositionAddress, childOrientationAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusCollisionShapeUniqueId(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetStatusCollisionShapeUniqueId(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusCollisionShapeUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusCollisionShapeUniqueId(statusHandleAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveCollisionShapeCommand(jlong physClientAddress, jint collisionShapeId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3InitRemoveCollisionShapeCommand(physClient, collisionShapeId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveCollisionShapeCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint collisionShapeId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveCollisionShapeCommand(physClientAddress, collisionShapeId);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3CreateVisualShapeCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeCommandInit(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddSphere(jlong commandHandleAddress, jdouble radius) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateVisualShapeAddSphere(commandHandle, radius);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddSphere(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddSphere(commandHandleAddress, radius);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddBox(jlong commandHandleAddress, jlong halfExtentsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *halfExtents = (double const *)(intptr_t)halfExtentsAddress;
    return (jint)b3CreateVisualShapeAddBox(commandHandle, halfExtents);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddBox(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong halfExtentsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddBox(commandHandleAddress, halfExtentsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddCapsule(jlong commandHandleAddress, jdouble radius, jdouble height) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateVisualShapeAddCapsule(commandHandle, radius, height);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddCapsule(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius, jdouble height) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddCapsule(commandHandleAddress, radius, height);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddCylinder(jlong commandHandleAddress, jdouble radius, jdouble height) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateVisualShapeAddCylinder(commandHandle, radius, height);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddCylinder(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius, jdouble height) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddCylinder(commandHandleAddress, radius, height);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddPlane(jlong commandHandleAddress, jlong planeNormalAddress, jdouble planeConstant) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *planeNormal = (double const *)(intptr_t)planeNormalAddress;
    return (jint)b3CreateVisualShapeAddPlane(commandHandle, planeNormal, planeConstant);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddPlane(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong planeNormalAddress, jdouble planeConstant) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddPlane(commandHandleAddress, planeNormalAddress, planeConstant);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddMesh(jlong commandHandleAddress, jlong fileNameAddress, jlong meshScaleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    double const *meshScale = (double const *)(intptr_t)meshScaleAddress;
    return (jint)b3CreateVisualShapeAddMesh(commandHandle, fileName, meshScale);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddMesh(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong fileNameAddress, jlong meshScaleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddMesh(commandHandleAddress, fileNameAddress, meshScaleAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualSetFlag(jlong commandHandleAddress, jint shapeIndex, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3CreateVisualSetFlag(commandHandle, shapeIndex, flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualSetFlag(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualSetFlag(commandHandleAddress, shapeIndex, flags);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetChildTransform(jlong commandHandleAddress, jint shapeIndex, jlong childPositionAddress, jlong childOrientationAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *childPosition = (double const *)(intptr_t)childPositionAddress;
    double const *childOrientation = (double const *)(intptr_t)childOrientationAddress;
    b3CreateVisualShapeSetChildTransform(commandHandle, shapeIndex, childPosition, childOrientation);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetChildTransform(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jlong childPositionAddress, jlong childOrientationAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetChildTransform(commandHandleAddress, shapeIndex, childPositionAddress, childOrientationAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetSpecularColor(jlong commandHandleAddress, jint shapeIndex, jlong specularColorAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *specularColor = (double const *)(intptr_t)specularColorAddress;
    b3CreateVisualShapeSetSpecularColor(commandHandle, shapeIndex, specularColor);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetSpecularColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jlong specularColorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetSpecularColor(commandHandleAddress, shapeIndex, specularColorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetRGBAColor(jlong commandHandleAddress, jint shapeIndex, jlong rgbaColorAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rgbaColor = (double const *)(intptr_t)rgbaColorAddress;
    b3CreateVisualShapeSetRGBAColor(commandHandle, shapeIndex, rgbaColor);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetRGBAColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jlong rgbaColorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetRGBAColor(commandHandleAddress, shapeIndex, rgbaColorAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusVisualShapeUniqueId(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetStatusVisualShapeUniqueId(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusVisualShapeUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusVisualShapeUniqueId(statusHandleAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3CreateMultiBodyCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyCommandInit(physClientAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyBase)(jlong commandHandleAddress, jdouble mass, jint collisionShapeUnique, jint visualShapeUniqueId, jlong basePositionAddress, jlong baseOrientationAddress, jlong baseInertialFramePositionAddress, jlong baseInertialFrameOrientationAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *basePosition = (double const *)(intptr_t)basePositionAddress;
    double const *baseOrientation = (double const *)(intptr_t)baseOrientationAddress;
    double const *baseInertialFramePosition = (double const *)(intptr_t)baseInertialFramePositionAddress;
    double const *baseInertialFrameOrientation = (double const *)(intptr_t)baseInertialFrameOrientationAddress;
    return (jint)b3CreateMultiBodyBase(commandHandle, mass, collisionShapeUnique, visualShapeUniqueId, basePosition, baseOrientation, baseInertialFramePosition, baseInertialFrameOrientation);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyBase(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble mass, jint collisionShapeUnique, jint visualShapeUniqueId, jlong basePositionAddress, jlong baseOrientationAddress, jlong baseInertialFramePositionAddress, jlong baseInertialFrameOrientationAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyBase)(commandHandleAddress, mass, collisionShapeUnique, visualShapeUniqueId, basePositionAddress, baseOrientationAddress, baseInertialFramePositionAddress, baseInertialFrameOrientationAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyLink)(jlong commandHandleAddress, jdouble linkMass, jdouble linkCollisionShapeIndex, jdouble linkVisualShapeIndex, jlong linkPositionAddress, jlong linkOrientationAddress, jlong linkInertialFramePositionAddress, jlong linkInertialFrameOrientationAddress, jint linkParentIndex, jint linkJointType, jlong linkJointAxisAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *linkPosition = (double const *)(intptr_t)linkPositionAddress;
    double const *linkOrientation = (double const *)(intptr_t)linkOrientationAddress;
    double const *linkInertialFramePosition = (double const *)(intptr_t)linkInertialFramePositionAddress;
    double const *linkInertialFrameOrientation = (double const *)(intptr_t)linkInertialFrameOrientationAddress;
    double const *linkJointAxis = (double const *)(intptr_t)linkJointAxisAddress;
    return (jint)b3CreateMultiBodyLink(commandHandle, linkMass, linkCollisionShapeIndex, linkVisualShapeIndex, linkPosition, linkOrientation, linkInertialFramePosition, linkInertialFrameOrientation, linkParentIndex, linkJointType, linkJointAxis);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyLink(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble linkMass, jdouble linkCollisionShapeIndex, jdouble linkVisualShapeIndex, jlong linkPositionAddress, jlong linkOrientationAddress, jlong linkInertialFramePositionAddress, jlong linkInertialFrameOrientationAddress, jint linkParentIndex, jint linkJointType, jlong linkJointAxisAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyLink)(commandHandleAddress, linkMass, linkCollisionShapeIndex, linkVisualShapeIndex, linkPositionAddress, linkOrientationAddress, linkInertialFramePositionAddress, linkInertialFrameOrientationAddress, linkParentIndex, linkJointType, linkJointAxisAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyUseMaximalCoordinates(jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3CreateMultiBodyUseMaximalCoordinates(commandHandle);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyUseMaximalCoordinates(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyUseMaximalCoordinates(commandHandleAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodySetFlags(jlong commandHandleAddress, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3CreateMultiBodySetFlags(commandHandle, flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodySetFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodySetFlags(commandHandleAddress, flags);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxShapeCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3CreateBoxShapeCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxShapeCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxShapeCommandInit(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetStartPosition(jlong commandHandleAddress, jdouble startPosX, jdouble startPosY, jdouble startPosZ) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateBoxCommandSetStartPosition(commandHandle, startPosX, startPosY, startPosZ);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetStartPosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startPosX, jdouble startPosY, jdouble startPosZ) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetStartPosition(commandHandleAddress, startPosX, startPosY, startPosZ);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetStartOrientation(jlong commandHandleAddress, jdouble startOrnX, jdouble startOrnY, jdouble startOrnZ, jdouble startOrnW) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateBoxCommandSetStartOrientation(commandHandle, startOrnX, startOrnY, startOrnZ, startOrnW);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetStartOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startOrnX, jdouble startOrnY, jdouble startOrnZ, jdouble startOrnW) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetStartOrientation(commandHandleAddress, startOrnX, startOrnY, startOrnZ, startOrnW);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetHalfExtents(jlong commandHandleAddress, jdouble halfExtentsX, jdouble halfExtentsY, jdouble halfExtentsZ) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateBoxCommandSetHalfExtents(commandHandle, halfExtentsX, halfExtentsY, halfExtentsZ);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetHalfExtents(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble halfExtentsX, jdouble halfExtentsY, jdouble halfExtentsZ) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetHalfExtents(commandHandleAddress, halfExtentsX, halfExtentsY, halfExtentsZ);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetMass(jlong commandHandleAddress, jdouble mass) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateBoxCommandSetMass(commandHandle, mass);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetMass(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble mass) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetMass(commandHandleAddress, mass);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetCollisionShapeType(jlong commandHandleAddress, jint collisionShapeType) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateBoxCommandSetCollisionShapeType(commandHandle, collisionShapeType);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetCollisionShapeType(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint collisionShapeType) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetCollisionShapeType(commandHandleAddress, collisionShapeType);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetColorRGBA(jlong commandHandleAddress, jdouble red, jdouble green, jdouble blue, jdouble alpha) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateBoxCommandSetColorRGBA(commandHandle, red, green, blue, alpha);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetColorRGBA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble red, jdouble green, jdouble blue, jdouble alpha) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetColorRGBA(commandHandleAddress, red, green, blue, alpha);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandInit(jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3CreatePoseCommandInit(physClient, bodyUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandInit(physClientAddress, bodyUniqueId);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandInit2(jlong commandHandleAddress, jint bodyUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3CreatePoseCommandInit2(commandHandle, bodyUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandInit2(commandHandleAddress, bodyUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBasePosition(jlong commandHandleAddress, jdouble startPosX, jdouble startPosY, jdouble startPosZ) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreatePoseCommandSetBasePosition(commandHandle, startPosX, startPosY, startPosZ);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBasePosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startPosX, jdouble startPosY, jdouble startPosZ) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBasePosition(commandHandleAddress, startPosX, startPosY, startPosZ);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseOrientation(jlong commandHandleAddress, jdouble startOrnX, jdouble startOrnY, jdouble startOrnZ, jdouble startOrnW) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreatePoseCommandSetBaseOrientation(commandHandle, startOrnX, startOrnY, startOrnZ, startOrnW);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startOrnX, jdouble startOrnY, jdouble startOrnZ, jdouble startOrnW) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseOrientation(commandHandleAddress, startOrnX, startOrnY, startOrnZ, startOrnW);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseLinearVelocity(jlong commandHandleAddress, jlong linVelAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *linVel = (double const *)(intptr_t)linVelAddress;
    return (jint)b3CreatePoseCommandSetBaseLinearVelocity(commandHandle, linVel);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseLinearVelocity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong linVelAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseLinearVelocity(commandHandleAddress, linVelAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseAngularVelocity(jlong commandHandleAddress, jlong angVelAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *angVel = (double const *)(intptr_t)angVelAddress;
    return (jint)b3CreatePoseCommandSetBaseAngularVelocity(commandHandle, angVel);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseAngularVelocity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong angVelAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseAngularVelocity(commandHandleAddress, angVelAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPositions(jlong commandHandleAddress, jint numJointPositions, jlong jointPositionsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointPositions = (double const *)(intptr_t)jointPositionsAddress;
    return (jint)b3CreatePoseCommandSetJointPositions(commandHandle, numJointPositions, jointPositions);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPositions(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numJointPositions, jlong jointPositionsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPositions(commandHandleAddress, numJointPositions, jointPositionsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPosition(jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jdouble jointPosition) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreatePoseCommandSetJointPosition(physClient, commandHandle, jointIndex, jointPosition);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPosition(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jdouble jointPosition) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPosition(physClientAddress, commandHandleAddress, jointIndex, jointPosition);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPositionMultiDof(jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jlong jointPositionAddress, jint posSize) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointPosition = (double const *)(intptr_t)jointPositionAddress;
    return (jint)b3CreatePoseCommandSetJointPositionMultiDof(physClient, commandHandle, jointIndex, jointPosition, posSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPositionMultiDof(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jlong jointPositionAddress, jint posSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPositionMultiDof(physClientAddress, commandHandleAddress, jointIndex, jointPositionAddress, posSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetQ(jlong commandHandleAddress, jint numJointPositions, jlong qAddress, jlong hasQAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *q = (double const *)(intptr_t)qAddress;
    int const *hasQ = (int const *)(intptr_t)hasQAddress;
    return (jint)b3CreatePoseCommandSetQ(commandHandle, numJointPositions, q, hasQ);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetQ(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numJointPositions, jlong qAddress, jlong hasQAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetQ(commandHandleAddress, numJointPositions, qAddress, hasQAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetQdots(jlong commandHandleAddress, jint numJointVelocities, jlong qDotsAddress, jlong hasQdotsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *qDots = (double const *)(intptr_t)qDotsAddress;
    int const *hasQdots = (int const *)(intptr_t)hasQdotsAddress;
    return (jint)b3CreatePoseCommandSetQdots(commandHandle, numJointVelocities, qDots, hasQdots);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetQdots(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numJointVelocities, jlong qDotsAddress, jlong hasQdotsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetQdots(commandHandleAddress, numJointVelocities, qDotsAddress, hasQdotsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocities(jlong physClientAddress, jlong commandHandleAddress, jint numJointVelocities, jlong jointVelocitiesAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointVelocities = (double const *)(intptr_t)jointVelocitiesAddress;
    return (jint)b3CreatePoseCommandSetJointVelocities(physClient, commandHandle, numJointVelocities, jointVelocities);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocities(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jint numJointVelocities, jlong jointVelocitiesAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocities(physClientAddress, commandHandleAddress, numJointVelocities, jointVelocitiesAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocity(jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jdouble jointVelocity) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreatePoseCommandSetJointVelocity(physClient, commandHandle, jointIndex, jointVelocity);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocity(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jdouble jointVelocity) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocity(physClientAddress, commandHandleAddress, jointIndex, jointVelocity);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocityMultiDof(jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jlong jointVelocityAddress, jint velSize) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointVelocity = (double const *)(intptr_t)jointVelocityAddress;
    return (jint)b3CreatePoseCommandSetJointVelocityMultiDof(physClient, commandHandle, jointIndex, jointVelocity, velSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocityMultiDof(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jlong jointVelocityAddress, jint velSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocityMultiDof(physClientAddress, commandHandleAddress, jointIndex, jointVelocityAddress, velSize);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorCommandInit(jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3CreateSensorCommandInit(physClient, bodyUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorCommandInit(physClientAddress, bodyUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorEnable6DofJointForceTorqueSensor(jlong commandHandleAddress, jint jointIndex, jint enable) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateSensorEnable6DofJointForceTorqueSensor(commandHandle, jointIndex, enable);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorEnable6DofJointForceTorqueSensor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint jointIndex, jint enable) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorEnable6DofJointForceTorqueSensor(commandHandleAddress, jointIndex, enable);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorEnableIMUForLink(jlong commandHandleAddress, jint linkIndex, jint enable) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3CreateSensorEnableIMUForLink(commandHandle, linkIndex, enable);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorEnableIMUForLink(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndex, jint enable) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorEnableIMUForLink(commandHandleAddress, linkIndex, enable);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandInit(jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3RequestActualStateCommandInit(physClient, bodyUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandInit(physClientAddress, bodyUniqueId);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandInit2(jlong commandHandleAddress, jint bodyUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3RequestActualStateCommandInit2(commandHandle, bodyUniqueId);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandInit2(commandHandleAddress, bodyUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandComputeLinkVelocity(jlong commandHandleAddress, jint computeLinkVelocity) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3RequestActualStateCommandComputeLinkVelocity(commandHandle, computeLinkVelocity);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandComputeLinkVelocity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint computeLinkVelocity) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandComputeLinkVelocity(commandHandleAddress, computeLinkVelocity);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandComputeForwardKinematics(jlong commandHandleAddress, jint computeForwardKinematics) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3RequestActualStateCommandComputeForwardKinematics(commandHandle, computeForwardKinematics);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandComputeForwardKinematics(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint computeForwardKinematics) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandComputeForwardKinematics(commandHandleAddress, computeForwardKinematics);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetJointState(jlong physClientAddress, jlong statusHandleAddress, jint jointIndex, jlong stateAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3JointSensorState *state = (struct b3JointSensorState *)(intptr_t)stateAddress;
    return (jint)b3GetJointState(physClient, statusHandle, jointIndex, state);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetJointState(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong statusHandleAddress, jint jointIndex, jlong stateAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetJointState(physClientAddress, statusHandleAddress, jointIndex, stateAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetJointStateMultiDof(jlong physClientAddress, jlong statusHandleAddress, jint jointIndex, jlong stateAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3JointSensorState2 *state = (struct b3JointSensorState2 *)(intptr_t)stateAddress;
    return (jint)b3GetJointStateMultiDof(physClient, statusHandle, jointIndex, state);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetJointStateMultiDof(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong statusHandleAddress, jint jointIndex, jlong stateAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetJointStateMultiDof(physClientAddress, statusHandleAddress, jointIndex, stateAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetLinkState(jlong physClientAddress, jlong statusHandleAddress, jint linkIndex, jlong stateAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3LinkState *state = (struct b3LinkState *)(intptr_t)stateAddress;
    return (jint)b3GetLinkState(physClient, statusHandle, linkIndex, state);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetLinkState(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong statusHandleAddress, jint linkIndex, jlong stateAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetLinkState(physClientAddress, statusHandleAddress, linkIndex, stateAddress);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3PickBody)(jlong physClientAddress, jdouble rayFromWorldX, jdouble rayFromWorldY, jdouble rayFromWorldZ, jdouble rayToWorldX, jdouble rayToWorldY, jdouble rayToWorldZ) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3PickBody(physClient, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PickBody(JNIEnv *__env, jclass clazz, jlong physClientAddress, jdouble rayFromWorldX, jdouble rayFromWorldY, jdouble rayFromWorldZ, jdouble rayToWorldX, jdouble rayToWorldY, jdouble rayToWorldZ) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3PickBody)(physClientAddress, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3MovePickedBody)(jlong physClientAddress, jdouble rayFromWorldX, jdouble rayFromWorldY, jdouble rayFromWorldZ, jdouble rayToWorldX, jdouble rayToWorldY, jdouble rayToWorldZ) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3MovePickedBody(physClient, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3MovePickedBody(JNIEnv *__env, jclass clazz, jlong physClientAddress, jdouble rayFromWorldX, jdouble rayFromWorldY, jdouble rayFromWorldZ, jdouble rayToWorldX, jdouble rayToWorldY, jdouble rayToWorldZ) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3MovePickedBody)(physClientAddress, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RemovePickingConstraint(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3RemovePickingConstraint(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RemovePickingConstraint(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RemovePickingConstraint(physClientAddress);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CreateRaycastCommandInit)(jlong physClientAddress, jdouble rayFromWorldX, jdouble rayFromWorldY, jdouble rayFromWorldZ, jdouble rayToWorldX, jdouble rayToWorldY, jdouble rayToWorldZ) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3CreateRaycastCommandInit(physClient, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateRaycastCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jdouble rayFromWorldX, jdouble rayFromWorldY, jdouble rayFromWorldZ, jdouble rayToWorldX, jdouble rayToWorldY, jdouble rayToWorldZ) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3CreateRaycastCommandInit)(physClientAddress, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateRaycastBatchCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3CreateRaycastBatchCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateRaycastBatchCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3CreateRaycastBatchCommandInit(physClientAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchSetNumThreads(jlong commandHandleAddress, jint numThreads) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3RaycastBatchSetNumThreads(commandHandle, numThreads);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchSetNumThreads(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numThreads) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchSetNumThreads(commandHandleAddress, numThreads);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchAddRay(jlong commandHandleAddress, jlong rayFromWorldAddress, jlong rayToWorldAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rayFromWorld = (double const *)(intptr_t)rayFromWorldAddress;
    double const *rayToWorld = (double const *)(intptr_t)rayToWorldAddress;
    b3RaycastBatchAddRay(commandHandle, rayFromWorld, rayToWorld);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchAddRay(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong rayFromWorldAddress, jlong rayToWorldAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchAddRay(commandHandleAddress, rayFromWorldAddress, rayToWorldAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchAddRays(jlong physClientAddress, jlong commandHandleAddress, jlong rayFromWorldAddress, jlong rayToWorldAddress, jint numRays) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rayFromWorld = (double const *)(intptr_t)rayFromWorldAddress;
    double const *rayToWorld = (double const *)(intptr_t)rayToWorldAddress;
    b3RaycastBatchAddRays(physClient, commandHandle, rayFromWorld, rayToWorld, numRays);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchAddRays(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jlong rayFromWorldAddress, jlong rayToWorldAddress, jint numRays) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchAddRays(physClientAddress, commandHandleAddress, rayFromWorldAddress, rayToWorldAddress, numRays);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchSetParentObject(jlong commandHandleAddress, jint parentObjectUniqueId, jint parentLinkIndex) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3RaycastBatchSetParentObject(commandHandle, parentObjectUniqueId, parentLinkIndex);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchSetParentObject(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint parentObjectUniqueId, jint parentLinkIndex) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchSetParentObject(commandHandleAddress, parentObjectUniqueId, parentLinkIndex);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetRaycastInformation(jlong physClientAddress, jlong raycastInfoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3RaycastInformation *raycastInfo = (struct b3RaycastInformation *)(intptr_t)raycastInfoAddress;
    b3GetRaycastInformation(physClient, raycastInfo);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetRaycastInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong raycastInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetRaycastInformation(physClientAddress, raycastInfoAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalForceCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3ApplyExternalForceCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalForceCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalForceCommandInit(physClientAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalForce)(jlong commandHandleAddress, jint bodyUniqueId, jint linkId, jlong forceAddress, jlong positionAddress, jint flag) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *force = (double const *)(intptr_t)forceAddress;
    double const *position = (double const *)(intptr_t)positionAddress;
    b3ApplyExternalForce(commandHandle, bodyUniqueId, linkId, force, position, flag);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalForce(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkId, jlong forceAddress, jlong positionAddress, jint flag) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalForce)(commandHandleAddress, bodyUniqueId, linkId, forceAddress, positionAddress, flag);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalTorque(jlong commandHandleAddress, jint bodyUniqueId, jint linkId, jlong torqueAddress, jint flag) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *torque = (double const *)(intptr_t)torqueAddress;
    b3ApplyExternalTorque(commandHandle, bodyUniqueId, linkId, torque, flag);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalTorque(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkId, jlong torqueAddress, jint flag) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalTorque(commandHandleAddress, bodyUniqueId, linkId, torqueAddress, flag);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodyCommandInit(jlong physClientAddress, jlong fileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    return (jlong)(intptr_t)b3LoadSoftBodyCommandInit(physClient, fileName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodyCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong fileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodyCommandInit(physClientAddress, fileNameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetScale(jlong commandHandleAddress, jdouble scale) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadSoftBodySetScale(commandHandle, scale);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetScale(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble scale) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetScale(commandHandleAddress, scale);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetMass(jlong commandHandleAddress, jdouble mass) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadSoftBodySetMass(commandHandle, mass);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetMass(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble mass) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetMass(commandHandleAddress, mass);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetCollisionMargin(jlong commandHandleAddress, jdouble collisionMargin) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3LoadSoftBodySetCollisionMargin(commandHandle, collisionMargin);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetCollisionMargin(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble collisionMargin) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetCollisionMargin(commandHandleAddress, collisionMargin);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestVREventsCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3RequestVREventsCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestVREventsCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestVREventsCommandInit(physClientAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3VREventsSetDeviceTypeFilter(jlong commandHandleAddress, jint deviceTypeFilter) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3VREventsSetDeviceTypeFilter(commandHandle, deviceTypeFilter);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3VREventsSetDeviceTypeFilter(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint deviceTypeFilter) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3VREventsSetDeviceTypeFilter(commandHandleAddress, deviceTypeFilter);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetVREventsData(jlong physClientAddress, jlong vrEventsDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3VREventsData *vrEventsData = (struct b3VREventsData *)(intptr_t)vrEventsDataAddress;
    b3GetVREventsData(physClient, vrEventsData);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetVREventsData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong vrEventsDataAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetVREventsData(physClientAddress, vrEventsDataAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraStateCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3SetVRCameraStateCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraStateCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraStateCommandInit(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraRootPosition(jlong commandHandleAddress, jlong rootPosAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rootPos = (double const *)(intptr_t)rootPosAddress;
    return (jint)b3SetVRCameraRootPosition(commandHandle, rootPos);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraRootPosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong rootPosAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraRootPosition(commandHandleAddress, rootPosAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraRootOrientation(jlong commandHandleAddress, jlong rootOrnAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rootOrn = (double const *)(intptr_t)rootOrnAddress;
    return (jint)b3SetVRCameraRootOrientation(commandHandle, rootOrn);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraRootOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong rootOrnAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraRootOrientation(commandHandleAddress, rootOrnAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraTrackingObject(jlong commandHandleAddress, jint objectUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3SetVRCameraTrackingObject(commandHandle, objectUniqueId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraTrackingObject(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint objectUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraTrackingObject(commandHandleAddress, objectUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraTrackingObjectFlag(jlong commandHandleAddress, jint flag) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3SetVRCameraTrackingObjectFlag(commandHandle, flag);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraTrackingObjectFlag(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flag) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraTrackingObjectFlag(commandHandleAddress, flag);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestKeyboardEventsCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3RequestKeyboardEventsCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestKeyboardEventsCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestKeyboardEventsCommandInit(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestKeyboardEventsCommandInit2(jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jlong)(intptr_t)b3RequestKeyboardEventsCommandInit2(commandHandle);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestKeyboardEventsCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestKeyboardEventsCommandInit2(commandHandleAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetKeyboardEventsData(jlong physClientAddress, jlong keyboardEventsDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3KeyboardEventsData *keyboardEventsData = (struct b3KeyboardEventsData *)(intptr_t)keyboardEventsDataAddress;
    b3GetKeyboardEventsData(physClient, keyboardEventsData);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetKeyboardEventsData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong keyboardEventsDataAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetKeyboardEventsData(physClientAddress, keyboardEventsDataAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestMouseEventsCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3RequestMouseEventsCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestMouseEventsCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3RequestMouseEventsCommandInit(physClientAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetMouseEventsData(jlong physClientAddress, jlong mouseEventsDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3MouseEventsData *mouseEventsData = (struct b3MouseEventsData *)(intptr_t)mouseEventsDataAddress;
    b3GetMouseEventsData(physClient, mouseEventsData);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetMouseEventsData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong mouseEventsDataAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetMouseEventsData(physClientAddress, mouseEventsDataAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingCommandInit(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jlong)(intptr_t)b3StateLoggingCommandInit(physClient);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingCommandInit(physClientAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingStart(jlong commandHandleAddress, jint loggingType, jlong fileNameAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    return (jint)b3StateLoggingStart(commandHandle, loggingType, fileName);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingStart(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint loggingType, jlong fileNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingStart(commandHandleAddress, loggingType, fileNameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingAddLoggingObjectUniqueId(jlong commandHandleAddress, jint objectUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3StateLoggingAddLoggingObjectUniqueId(commandHandle, objectUniqueId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingAddLoggingObjectUniqueId(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint objectUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingAddLoggingObjectUniqueId(commandHandleAddress, objectUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetMaxLogDof(jlong commandHandleAddress, jint maxLogDof) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3StateLoggingSetMaxLogDof(commandHandle, maxLogDof);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetMaxLogDof(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint maxLogDof) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetMaxLogDof(commandHandleAddress, maxLogDof);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLinkIndexA(jlong commandHandleAddress, jint linkIndexA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3StateLoggingSetLinkIndexA(commandHandle, linkIndexA);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLinkIndexA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexA) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLinkIndexA(commandHandleAddress, linkIndexA);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLinkIndexB(jlong commandHandleAddress, jint linkIndexB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3StateLoggingSetLinkIndexB(commandHandle, linkIndexB);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLinkIndexB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexB) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLinkIndexB(commandHandleAddress, linkIndexB);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetBodyAUniqueId(jlong commandHandleAddress, jint bodyAUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3StateLoggingSetBodyAUniqueId(commandHandle, bodyAUniqueId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetBodyAUniqueId(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyAUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetBodyAUniqueId(commandHandleAddress, bodyAUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetBodyBUniqueId(jlong commandHandleAddress, jint bodyBUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3StateLoggingSetBodyBUniqueId(commandHandle, bodyBUniqueId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetBodyBUniqueId(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyBUniqueId) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetBodyBUniqueId(commandHandleAddress, bodyBUniqueId);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetDeviceTypeFilter(jlong commandHandleAddress, jint deviceTypeFilter) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3StateLoggingSetDeviceTypeFilter(commandHandle, deviceTypeFilter);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetDeviceTypeFilter(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint deviceTypeFilter) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetDeviceTypeFilter(commandHandleAddress, deviceTypeFilter);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLogFlags(jlong commandHandleAddress, jint logFlags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3StateLoggingSetLogFlags(commandHandle, logFlags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLogFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint logFlags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLogFlags(commandHandleAddress, logFlags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusLoggingUniqueId(jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    return (jint)b3GetStatusLoggingUniqueId(statusHandle);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusLoggingUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetStatusLoggingUniqueId(statusHandleAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingStop(jlong commandHandleAddress, jint loggingUid) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    return (jint)b3StateLoggingStop(commandHandle, loggingUid);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingStop(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint loggingUid) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingStop(commandHandleAddress, loggingUid);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ProfileTimingCommandInit(jlong physClientAddress, jlong nameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    return (jlong)(intptr_t)b3ProfileTimingCommandInit(physClient, name);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ProfileTimingCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3ProfileTimingCommandInit(physClientAddress, nameAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetProfileTimingDuractionInMicroSeconds(jlong commandHandleAddress, jint duration) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    b3SetProfileTimingDuractionInMicroSeconds(commandHandle, duration);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetProfileTimingDuractionInMicroSeconds(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint duration) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetProfileTimingDuractionInMicroSeconds(commandHandleAddress, duration);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PushProfileTiming(jlong physClientAddress, jlong timingNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *timingName = (char const *)(intptr_t)timingNameAddress;
    b3PushProfileTiming(physClient, timingName);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PushProfileTiming(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong timingNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PushProfileTiming(physClientAddress, timingNameAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PopProfileTiming(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3PopProfileTiming(physClient);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PopProfileTiming(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3PopProfileTiming(physClientAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetTimeOut(jlong physClientAddress, jdouble timeOutInSeconds) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SetTimeOut(physClient, timeOutInSeconds);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetTimeOut(JNIEnv *__env, jclass clazz, jlong physClientAddress, jdouble timeOutInSeconds) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetTimeOut(physClientAddress, timeOutInSeconds);
}

JNIEXPORT jdouble JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetTimeOut(jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    return (jdouble)b3GetTimeOut(physClient);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetTimeOut(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3GetTimeOut(physClientAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetAdditionalSearchPath(jlong physClientAddress, jlong pathAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *path = (char const *)(intptr_t)pathAddress;
    return (jlong)(intptr_t)b3SetAdditionalSearchPath(physClient, path);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetAdditionalSearchPath(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong pathAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3SetAdditionalSearchPath(physClientAddress, pathAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3MultiplyTransforms)(jlong posAAddress, jlong ornAAddress, jlong posBAddress, jlong ornBAddress, jlong outPosAddress, jlong outOrnAddress) {
    double const *posA = (double const *)(intptr_t)posAAddress;
    double const *ornA = (double const *)(intptr_t)ornAAddress;
    double const *posB = (double const *)(intptr_t)posBAddress;
    double const *ornB = (double const *)(intptr_t)ornBAddress;
    double *outPos = (double *)(intptr_t)outPosAddress;
    double *outOrn = (double *)(intptr_t)outOrnAddress;
    b3MultiplyTransforms(posA, ornA, posB, ornB, outPos, outOrn);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3MultiplyTransforms(JNIEnv *__env, jclass clazz, jlong posAAddress, jlong ornAAddress, jlong posBAddress, jlong ornBAddress, jlong outPosAddress, jlong outOrnAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_bullet_PhysicsClient_nb3MultiplyTransforms)(posAAddress, ornAAddress, posBAddress, ornBAddress, outPosAddress, outOrnAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InvertTransform(jlong posAddress, jlong ornAddress, jlong outPosAddress, jlong outOrnAddress) {
    double const *pos = (double const *)(intptr_t)posAddress;
    double const *orn = (double const *)(intptr_t)ornAddress;
    double *outPos = (double *)(intptr_t)outPosAddress;
    double *outOrn = (double *)(intptr_t)outOrnAddress;
    b3InvertTransform(pos, orn, outPos, outOrn);
}
JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InvertTransform(JNIEnv *__env, jclass clazz, jlong posAddress, jlong ornAddress, jlong outPosAddress, jlong outOrnAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_bullet_PhysicsClient_nb3InvertTransform(posAddress, ornAddress, outPosAddress, outOrnAddress);
}

EXTERN_C_EXIT
