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

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_b3ConnectPhysicsDirect(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3ConnectPhysicsDirect();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_b3ConnectSharedMemory(JNIEnv *__env, jclass clazz, jint key) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3ConnectSharedMemory(key);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ConnectPhysicsTCP(JNIEnv *__env, jclass clazz, jlong hostNameAddress, jint port) {
    char const *hostName = (char const *)(intptr_t)hostNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3ConnectPhysicsTCP(hostName, port);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ConnectPhysicsUDP(JNIEnv *__env, jclass clazz, jlong hostNameAddress, jint port) {
    char const *hostName = (char const *)(intptr_t)hostNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3ConnectPhysicsUDP(hostName, port);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3DisconnectSharedMemory(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    b3DisconnectSharedMemory(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CanSubmitCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CanSubmitCommand(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SubmitClientCommandAndWaitStatus(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3SubmitClientCommandAndWaitStatus(physClient, commandHandle);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SubmitClientCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3SubmitClientCommand(physClient, commandHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ProcessServerStatus(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3ProcessServerStatus(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusType(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusType(statusHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCustomCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CreateCustomCommand(physClient);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandLoadPlugin(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong pluginPathAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *pluginPath = (char const *)(intptr_t)pluginPathAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CustomCommandLoadPlugin(commandHandle, pluginPath);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandLoadPluginSetPostFix(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong postFixAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *postFix = (char const *)(intptr_t)postFixAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CustomCommandLoadPluginSetPostFix(commandHandle, postFix);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPluginUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusPluginUniqueId(statusHandle);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPluginCommandResult(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusPluginCommandResult(statusHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandUnloadPlugin(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint pluginUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CustomCommandUnloadPlugin(commandHandle, pluginUniqueId);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecutePluginCommand(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint pluginUniqueId, jlong textArgumentsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *textArguments = (char const *)(intptr_t)textArgumentsAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CustomCommandExecutePluginCommand(commandHandle, pluginUniqueId, textArguments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecuteAddIntArgument(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint intVal) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CustomCommandExecuteAddIntArgument(commandHandle, intVal);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CustomCommandExecuteAddFloatArgument(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat floatVal) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CustomCommandExecuteAddFloatArgument(commandHandle, floatVal);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusBodyIndices(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong bodyIndicesOutAddress, jint bodyIndicesCapacity) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *bodyIndicesOut = (int *)(intptr_t)bodyIndicesOutAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusBodyIndices(statusHandle, bodyIndicesOut, bodyIndicesCapacity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusBodyIndex(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusBodyIndex(statusHandle);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusActualState(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong numDegreeOfFreedomQAddress, jlong numDegreeOfFreedomUAddress, jlong rootLocalInertialFrameAddress, jlong actualStateQAddress, jlong actualStateQdotAddress, jlong jointReactionForcesAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *bodyUniqueId = (int *)(intptr_t)bodyUniqueIdAddress;
    int *numDegreeOfFreedomQ = (int *)(intptr_t)numDegreeOfFreedomQAddress;
    int *numDegreeOfFreedomU = (int *)(intptr_t)numDegreeOfFreedomUAddress;
    double const **rootLocalInertialFrame = (double const **)(intptr_t)rootLocalInertialFrameAddress;
    double const **actualStateQ = (double const **)(intptr_t)actualStateQAddress;
    double const **actualStateQdot = (double const **)(intptr_t)actualStateQdotAddress;
    double const **jointReactionForces = (double const **)(intptr_t)jointReactionForcesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusActualState(statusHandle, bodyUniqueId, numDegreeOfFreedomQ, numDegreeOfFreedomU, rootLocalInertialFrame, actualStateQ, actualStateQdot, jointReactionForces);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusActualState2(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong numLinksAddress, jlong numDegreeOfFreedomQAddress, jlong numDegreeOfFreedomUAddress, jlong rootLocalInertialFrameAddress, jlong actualStateQAddress, jlong actualStateQdotAddress, jlong jointReactionForcesAddress, jlong linkLocalInertialFramesAddress, jlong jointMotorForcesAddress, jlong linkStatesAddress, jlong linkWorldVelocitiesAddress) {
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
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusActualState2(statusHandle, bodyUniqueId, numLinks, numDegreeOfFreedomQ, numDegreeOfFreedomU, rootLocalInertialFrame, actualStateQ, actualStateQdot, jointReactionForces, linkLocalInertialFrames, jointMotorForces, linkStates, linkWorldVelocities);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCollisionInfoCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3RequestCollisionInfoCommandInit(physClient, bodyUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusAABB(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jint linkIndex, jlong aabbMinAddress, jlong aabbMaxAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    double *aabbMin = (double *)(intptr_t)aabbMinAddress;
    double *aabbMax = (double *)(intptr_t)aabbMaxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusAABB(statusHandle, linkIndex, aabbMin, aabbMax);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitSyncBodyInfoCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitSyncBodyInfoCommand(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveBodyCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRemoveBodyCommand(physClient, bodyUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetNumBodies(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetNumBodies(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetBodyUniqueId(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint serialIndex) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetBodyUniqueId(physClient, serialIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetBodyInfo(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jlong infoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3BodyInfo *info = (struct b3BodyInfo *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetBodyInfo(physClient, bodyUniqueId, info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetNumJoints(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetNumJoints(physClient, bodyUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputeDofCount(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ComputeDofCount(physClient, bodyUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetJointInfo(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint jointIndex, jlong infoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3JointInfo *info = (struct b3JointInfo *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetJointInfo(physClient, bodyUniqueId, jointIndex, info);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitSyncUserDataCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitSyncUserDataCommand(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitAddUserDataCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint linkIndex, jint visualShapeIndex, jlong keyAddress, jint valueType, jint valueLength, jlong valueDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *key = (char const *)(intptr_t)keyAddress;
    void const *valueData = (void const *)(intptr_t)valueDataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitAddUserDataCommand(physClient, bodyUniqueId, linkIndex, visualShapeIndex, key, (enum UserDataValueType)valueType, valueLength, valueData);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveUserDataCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint userDataId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRemoveUserDataCommand(physClient, userDataId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint userDataId, jlong valueOutAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3UserDataValue *valueOut = (struct b3UserDataValue *)(intptr_t)valueOutAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetUserData(physClient, userDataId, valueOut);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserDataId(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint linkIndex, jint visualShapeIndex, jlong keyAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *key = (char const *)(intptr_t)keyAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetUserDataId(physClient, bodyUniqueId, linkIndex, visualShapeIndex, key);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserDataIdFromStatus(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetUserDataIdFromStatus(statusHandle);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetNumUserData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetNumUserData(physClient, bodyUniqueId);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserDataInfo(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint userDataIndex, jlong keyOutAddress, jlong userDataIdOutAddress, jlong linkIndexOutAddress, jlong visualShapeIndexOutAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const **keyOut = (char const **)(intptr_t)keyOutAddress;
    int *userDataIdOut = (int *)(intptr_t)userDataIdOutAddress;
    int *linkIndexOut = (int *)(intptr_t)linkIndexOutAddress;
    int *visualShapeIndexOut = (int *)(intptr_t)visualShapeIndexOutAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetUserDataInfo(physClient, bodyUniqueId, userDataIndex, keyOut, userDataIdOut, linkIndexOut, visualShapeIndexOut);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfoCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint linkIndex) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3GetDynamicsInfoCommandInit(physClient, bodyUniqueId, linkIndex);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfoCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3GetDynamicsInfoCommandInit2(commandHandle, bodyUniqueId, linkIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetDynamicsInfo(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong infoAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3DynamicsInfo *info = (struct b3DynamicsInfo *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetDynamicsInfo(statusHandle, info);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeDynamicsInfo(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitChangeDynamicsInfo(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeDynamicsInfo2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitChangeDynamicsInfo2(commandHandle);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetMass(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble mass) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetMass(commandHandle, bodyUniqueId, linkIndex, mass);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLocalInertiaDiagonal(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jlong localInertiaDiagonalAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *localInertiaDiagonal = (double const *)(intptr_t)localInertiaDiagonalAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetLocalInertiaDiagonal(commandHandle, bodyUniqueId, linkIndex, localInertiaDiagonal);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLateralFriction(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble lateralFriction) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetLateralFriction(commandHandle, bodyUniqueId, linkIndex, lateralFriction);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetSpinningFriction(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble friction) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetSpinningFriction(commandHandle, bodyUniqueId, linkIndex, friction);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetRollingFriction(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble friction) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetRollingFriction(commandHandle, bodyUniqueId, linkIndex, friction);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetRestitution(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble restitution) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetRestitution(commandHandle, bodyUniqueId, linkIndex, restitution);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetLinearDamping(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jdouble linearDamping) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetLinearDamping(commandHandle, bodyUniqueId, linearDamping);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetAngularDamping(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jdouble angularDamping) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetAngularDamping(commandHandle, bodyUniqueId, angularDamping);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetContactStiffnessAndDamping(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble contactStiffness, jdouble contactDamping) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetContactStiffnessAndDamping(commandHandle, bodyUniqueId, linkIndex, contactStiffness, contactDamping);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetFrictionAnchor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jint frictionAnchor) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetFrictionAnchor(commandHandle, bodyUniqueId, linkIndex, frictionAnchor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetCcdSweptSphereRadius(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble ccdSweptSphereRadius) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetCcdSweptSphereRadius(commandHandle, bodyUniqueId, linkIndex, ccdSweptSphereRadius);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetContactProcessingThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkIndex, jdouble contactProcessingThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetContactProcessingThreshold(commandHandle, bodyUniqueId, linkIndex, contactProcessingThreshold);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ChangeDynamicsInfoSetActivationState(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint activationState) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3ChangeDynamicsInfoSetActivationState(commandHandle, bodyUniqueId, activationState);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitCreateUserConstraintCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint parentBodyUniqueId, jint parentJointIndex, jint childBodyUniqueId, jint childJointIndex, jlong infoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3JointInfo *info = (struct b3JointInfo *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitCreateUserConstraintCommand(physClient, parentBodyUniqueId, parentJointIndex, childBodyUniqueId, childJointIndex, info);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitCreateUserConstraintCommand2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint parentBodyUniqueId, jint parentJointIndex, jint childBodyUniqueId, jint childJointIndex, jlong infoAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    struct b3JointInfo *info = (struct b3JointInfo *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitCreateUserConstraintCommand2(commandHandle, parentBodyUniqueId, parentJointIndex, childBodyUniqueId, childJointIndex, info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusUserConstraintUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusUserConstraintUniqueId(statusHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint userConstraintUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitChangeUserConstraintCommand(physClient, userConstraintUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetPivotInB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong jointChildPivotAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointChildPivot = (double const *)(intptr_t)jointChildPivotAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3InitChangeUserConstraintSetPivotInB(commandHandle, jointChildPivot);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetFrameInB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong jointChildFrameOrnAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointChildFrameOrn = (double const *)(intptr_t)jointChildFrameOrnAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3InitChangeUserConstraintSetFrameInB(commandHandle, jointChildFrameOrn);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetMaxForce(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble maxAppliedForce) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3InitChangeUserConstraintSetMaxForce(commandHandle, maxAppliedForce);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetGearRatio(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble gearRatio) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3InitChangeUserConstraintSetGearRatio(commandHandle, gearRatio);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetGearAuxLink(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint gearAuxLink) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3InitChangeUserConstraintSetGearAuxLink(commandHandle, gearAuxLink);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetRelativePositionTarget(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble relativePositionTarget) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3InitChangeUserConstraintSetRelativePositionTarget(commandHandle, relativePositionTarget);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitChangeUserConstraintSetERP(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble erp) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3InitChangeUserConstraintSetERP(commandHandle, erp);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveUserConstraintCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint userConstraintUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRemoveUserConstraintCommand(physClient, userConstraintUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetNumUserConstraints(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetNumUserConstraints(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitGetUserConstraintStateCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint raintUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitGetUserConstraintStateCommand(physClient, (int const)raintUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusUserConstraintState(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong constraintStateAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3UserConstraintState *constraintState = (struct b3UserConstraintState *)(intptr_t)constraintStateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusUserConstraintState(statusHandle, constraintState);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserConstraintInfo(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint raintUniqueId, jlong infoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3UserConstraint *info = (struct b3UserConstraint *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetUserConstraintInfo(physClient, (int const)raintUniqueId, info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetUserConstraintId(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint serialIndex) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetUserConstraintId(physClient, serialIndex);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestDebugLinesCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint debugMode) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRequestDebugLinesCommand(physClient, debugMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetDebugLines(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong linesAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3DebugLines *lines = (struct b3DebugLines *)(intptr_t)linesAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetDebugLines(physClient, lines);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitConfigureOpenGLVisualizer(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitConfigureOpenGLVisualizer(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitConfigureOpenGLVisualizer2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitConfigureOpenGLVisualizer2(commandHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ConfigureOpenGLVisualizerSetVisualizationFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flag, jint enabled) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3ConfigureOpenGLVisualizerSetVisualizationFlags(commandHandle, flag, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ConfigureOpenGLVisualizerSetViewMatrix(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat cameraDistance, jfloat cameraPitch, jfloat cameraYaw, jlong cameraTargetPositionAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    float const *cameraTargetPosition = (float const *)(intptr_t)cameraTargetPositionAddress;
    UNUSED_PARAMS(__env, clazz)
    b3ConfigureOpenGLVisualizerSetViewMatrix(commandHandle, cameraDistance, cameraPitch, cameraYaw, cameraTargetPosition);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestOpenGLVisualizerCameraCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRequestOpenGLVisualizerCameraCommand(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusOpenGLVisualizerCamera(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong cameraAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3OpenGLVisualizerCameraInfo *camera = (struct b3OpenGLVisualizerCameraInfo *)(intptr_t)cameraAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusOpenGLVisualizerCamera(statusHandle, camera);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawAddLine3D(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong fromXYZAddress, jlong toXYZAddress, jlong colorRGBAddress, jdouble lineWidth, jdouble lifeTime) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    double const *fromXYZ = (double const *)(intptr_t)fromXYZAddress;
    double const *toXYZ = (double const *)(intptr_t)toXYZAddress;
    double const *colorRGB = (double const *)(intptr_t)colorRGBAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitUserDebugDrawAddLine3D(physClient, fromXYZ, toXYZ, colorRGB, lineWidth, lifeTime);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawAddText3D(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong txtAddress, jlong positionXYZAddress, jlong colorRGBAddress, jdouble textSize, jdouble lifeTime) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *txt = (char const *)(intptr_t)txtAddress;
    double const *positionXYZ = (double const *)(intptr_t)positionXYZAddress;
    double const *colorRGB = (double const *)(intptr_t)colorRGBAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitUserDebugDrawAddText3D(physClient, txt, positionXYZ, colorRGB, textSize, lifeTime);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UserDebugTextSetOptionFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint optionFlags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3UserDebugTextSetOptionFlags(commandHandle, optionFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UserDebugTextSetOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong orientationAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *orientation = (double const *)(intptr_t)orientationAddress;
    UNUSED_PARAMS(__env, clazz)
    b3UserDebugTextSetOrientation(commandHandle, orientation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UserDebugItemSetReplaceItemUniqueId(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint replaceItem) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3UserDebugItemSetReplaceItemUniqueId(commandHandle, replaceItem);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UserDebugItemSetParentObject(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint objectUniqueId, jint linkIndex) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3UserDebugItemSetParentObject(commandHandle, objectUniqueId, linkIndex);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugAddParameter(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong txtAddress, jdouble rangeMin, jdouble rangeMax, jdouble startValue) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *txt = (char const *)(intptr_t)txtAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitUserDebugAddParameter(physClient, txt, rangeMin, rangeMax, startValue);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugReadParameter(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint debugItemUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitUserDebugReadParameter(physClient, debugItemUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusDebugParameterValue(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong paramValueAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    double *paramValue = (double *)(intptr_t)paramValueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusDebugParameterValue(statusHandle, paramValue);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawRemove(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint debugItemUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitUserDebugDrawRemove(physClient, debugItemUniqueId);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUserDebugDrawRemoveAll(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitUserDebugDrawRemoveAll(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitDebugDrawingCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitDebugDrawingCommand(physClient);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetDebugObjectColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint objectUniqueId, jint linkIndex, jlong objectColorRGBAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *objectColorRGB = (double const *)(intptr_t)objectColorRGBAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetDebugObjectColor(commandHandle, objectUniqueId, linkIndex, objectColorRGB);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RemoveDebugObjectColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint objectUniqueId, jint linkIndex) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RemoveDebugObjectColor(commandHandle, objectUniqueId, linkIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetDebugItemUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetDebugItemUniqueId(statusHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCameraImage(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRequestCameraImage(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCameraImage2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRequestCameraImage2(commandHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetCameraMatrices(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong viewMatrixAddress, jlong projectionMatrixAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    float *viewMatrix = (float *)(intptr_t)viewMatrixAddress;
    float *projectionMatrix = (float *)(intptr_t)projectionMatrixAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSetCameraMatrices(commandHandle, viewMatrix, projectionMatrix);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetPixelResolution(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint width, jint height) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSetPixelResolution(commandHandle, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDirection(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong lightDirectionAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    float const *lightDirection = (float const *)(intptr_t)lightDirectionAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSetLightDirection(commandHandle, lightDirection);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong lightColorAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    float const *lightColor = (float const *)(intptr_t)lightColorAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSetLightColor(commandHandle, lightColor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDistance(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat lightDistance) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSetLightDistance(commandHandle, lightDistance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightAmbientCoeff(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat lightAmbientCoeff) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSetLightAmbientCoeff(commandHandle, lightAmbientCoeff);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightDiffuseCoeff(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat lightDiffuseCoeff) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSetLightDiffuseCoeff(commandHandle, lightDiffuseCoeff);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetLightSpecularCoeff(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jfloat lightSpecularCoeff) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSetLightSpecularCoeff(commandHandle, lightSpecularCoeff);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetShadow(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint hasShadow) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSetShadow(commandHandle, hasShadow);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSelectRenderer(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint renderer) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSelectRenderer(commandHandle, renderer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSetFlags(commandHandle, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetCameraImageData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong imageDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3CameraImageData *imageData = (struct b3CameraImageData *)(intptr_t)imageDataAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetCameraImageData(physClient, imageData);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestCameraImageSetProjectiveTextureMatrices(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong viewMatrixAddress, jlong projectionMatrixAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    float *viewMatrix = (float *)(intptr_t)viewMatrixAddress;
    float *projectionMatrix = (float *)(intptr_t)projectionMatrixAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RequestCameraImageSetProjectiveTextureMatrices(commandHandle, viewMatrix, projectionMatrix);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputeViewMatrixFromPositions(JNIEnv *__env, jclass clazz, jlong cameraPositionAddress, jlong cameraTargetPositionAddress, jlong cameraUpAddress, jlong viewMatrixAddress) {
    float const *cameraPosition = (float const *)(intptr_t)cameraPositionAddress;
    float const *cameraTargetPosition = (float const *)(intptr_t)cameraTargetPositionAddress;
    float const *cameraUp = (float const *)(intptr_t)cameraUpAddress;
    float *viewMatrix = (float *)(intptr_t)viewMatrixAddress;
    UNUSED_PARAMS(__env, clazz)
    b3ComputeViewMatrixFromPositions(cameraPosition, cameraTargetPosition, cameraUp, viewMatrix);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputeViewMatrixFromYawPitchRoll(JNIEnv *__env, jclass clazz, jlong cameraTargetPositionAddress, jfloat distance, jfloat yaw, jfloat pitch, jfloat roll, jint upAxis, jlong viewMatrixAddress) {
    float const *cameraTargetPosition = (float const *)(intptr_t)cameraTargetPositionAddress;
    float *viewMatrix = (float *)(intptr_t)viewMatrixAddress;
    UNUSED_PARAMS(__env, clazz)
    b3ComputeViewMatrixFromYawPitchRoll(cameraTargetPosition, distance, yaw, pitch, roll, upAxis, viewMatrix);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputePositionFromViewMatrix(JNIEnv *__env, jclass clazz, jlong viewMatrixAddress, jlong cameraPositionAddress, jlong cameraTargetPositionAddress, jlong cameraUpAddress) {
    float const *viewMatrix = (float const *)(intptr_t)viewMatrixAddress;
    float *cameraPosition = (float *)(intptr_t)cameraPositionAddress;
    float *cameraTargetPosition = (float *)(intptr_t)cameraTargetPositionAddress;
    float *cameraUp = (float *)(intptr_t)cameraUpAddress;
    UNUSED_PARAMS(__env, clazz)
    b3ComputePositionFromViewMatrix(viewMatrix, cameraPosition, cameraTargetPosition, cameraUp);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputeProjectionMatrix(JNIEnv *__env, jclass clazz, jfloat left, jfloat right, jfloat bottom, jfloat top, jfloat nearVal, jfloat farVal, jlong projectionMatrixAddress) {
    float *projectionMatrix = (float *)(intptr_t)projectionMatrixAddress;
    UNUSED_PARAMS(__env, clazz)
    b3ComputeProjectionMatrix(left, right, bottom, top, nearVal, farVal, projectionMatrix);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ComputeProjectionMatrixFOV(JNIEnv *__env, jclass clazz, jfloat fov, jfloat aspect, jfloat nearVal, jfloat farVal, jlong projectionMatrixAddress) {
    float *projectionMatrix = (float *)(intptr_t)projectionMatrixAddress;
    UNUSED_PARAMS(__env, clazz)
    b3ComputeProjectionMatrixFOV(fov, aspect, nearVal, farVal, projectionMatrix);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestContactPointInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRequestContactPointInformation(physClient);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterBodyA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetContactFilterBodyA(commandHandle, bodyUniqueIdA);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterBodyB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetContactFilterBodyB(commandHandle, bodyUniqueIdB);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterLinkA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetContactFilterLinkA(commandHandle, linkIndexA);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetContactFilterLinkB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetContactFilterLinkB(commandHandle, linkIndexB);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetContactPointInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong contactPointDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3ContactInformation *contactPointData = (struct b3ContactInformation *)(intptr_t)contactPointDataAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetContactPointInformation(physClient, contactPointData);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitClosestDistanceQuery(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitClosestDistanceQuery(physClient);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterBodyA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetClosestDistanceFilterBodyA(commandHandle, bodyUniqueIdA);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterLinkA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetClosestDistanceFilterLinkA(commandHandle, linkIndexA);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterBodyB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetClosestDistanceFilterBodyB(commandHandle, bodyUniqueIdB);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterLinkB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetClosestDistanceFilterLinkB(commandHandle, linkIndexB);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble distance) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetClosestDistanceThreshold(commandHandle, distance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint collisionShapeA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetClosestDistanceFilterCollisionShapeA(commandHandle, collisionShapeA);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint collisionShapeB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetClosestDistanceFilterCollisionShapeB(commandHandle, collisionShapeB);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapePositionA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong collisionShapePositionAAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *collisionShapePositionA = (double const *)(intptr_t)collisionShapePositionAAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetClosestDistanceFilterCollisionShapePositionA(commandHandle, collisionShapePositionA);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapePositionB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong collisionShapePositionBAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *collisionShapePositionB = (double const *)(intptr_t)collisionShapePositionBAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetClosestDistanceFilterCollisionShapePositionB(commandHandle, collisionShapePositionB);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeOrientationA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong collisionShapeOrientationAAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *collisionShapeOrientationA = (double const *)(intptr_t)collisionShapeOrientationAAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetClosestDistanceFilterCollisionShapeOrientationA(commandHandle, collisionShapeOrientationA);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetClosestDistanceFilterCollisionShapeOrientationB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong collisionShapeOrientationBAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *collisionShapeOrientationB = (double const *)(intptr_t)collisionShapeOrientationBAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetClosestDistanceFilterCollisionShapeOrientationB(commandHandle, collisionShapeOrientationB);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetClosestPointInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong contactPointInfoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3ContactInformation *contactPointInfo = (struct b3ContactInformation *)(intptr_t)contactPointInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetClosestPointInformation(physClient, contactPointInfo);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitAABBOverlapQuery(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong aabbMinAddress, jlong aabbMaxAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    double const *aabbMin = (double const *)(intptr_t)aabbMinAddress;
    double const *aabbMax = (double const *)(intptr_t)aabbMaxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitAABBOverlapQuery(physClient, aabbMin, aabbMax);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetAABBOverlapResults(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong dataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3AABBOverlapData *data = (struct b3AABBOverlapData *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetAABBOverlapResults(physClient, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestVisualShapeInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueIdA) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRequestVisualShapeInformation(physClient, bodyUniqueIdA);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetVisualShapeInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong visualShapeInfoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3VisualShapeInformation *visualShapeInfo = (struct b3VisualShapeInformation *)(intptr_t)visualShapeInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetVisualShapeInformation(physClient, visualShapeInfo);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestCollisionShapeInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint linkIndex) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRequestCollisionShapeInformation(physClient, bodyUniqueId, linkIndex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetCollisionShapeInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong collisionShapeInfoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3CollisionShapeInformation *collisionShapeInfo = (struct b3CollisionShapeInformation *)(intptr_t)collisionShapeInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetCollisionShapeInformation(physClient, collisionShapeInfo);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitLoadTexture(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong filenameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitLoadTexture(physClient, filename);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusTextureUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusTextureUniqueId(statusHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateChangeTextureCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint textureUniqueId, jint width, jint height, jlong rgbPixelsAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *rgbPixels = (char const *)(intptr_t)rgbPixelsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CreateChangeTextureCommandInit(physClient, textureUniqueId, width, height, rgbPixels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitUpdateVisualShape(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint jointIndex, jint shapeIndex, jint textureUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitUpdateVisualShape(physClient, bodyUniqueId, jointIndex, shapeIndex, textureUniqueId);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UpdateVisualShapeRGBAColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong rgbaColorAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rgbaColor = (double const *)(intptr_t)rgbaColorAddress;
    UNUSED_PARAMS(__env, clazz)
    b3UpdateVisualShapeRGBAColor(commandHandle, rgbaColor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3UpdateVisualShapeSpecularColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong specularColorAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *specularColor = (double const *)(intptr_t)specularColorAddress;
    UNUSED_PARAMS(__env, clazz)
    b3UpdateVisualShapeSpecularColor(commandHandle, specularColor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitPhysicsParamCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitPhysicsParamCommand(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitPhysicsParamCommand2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitPhysicsParamCommand2(commandHandle);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetGravity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble gravx, jdouble gravy, jdouble gravz) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetGravity(commandHandle, gravx, gravy, gravz);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetTimeStep(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble timeStep) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetTimeStep(commandHandle, timeStep);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultContactERP(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble defaultContactERP) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetDefaultContactERP(commandHandle, defaultContactERP);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultNonContactERP(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble defaultNonContactERP) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetDefaultNonContactERP(commandHandle, defaultNonContactERP);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultFrictionERP(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble frictionERP) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetDefaultFrictionERP(commandHandle, frictionERP);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultGlobalCFM(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble defaultGlobalCFM) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetDefaultGlobalCFM(commandHandle, defaultGlobalCFM);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetDefaultFrictionCFM(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble frictionCFM) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetDefaultFrictionCFM(commandHandle, frictionCFM);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetNumSubSteps(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numSubSteps) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetNumSubSteps(commandHandle, numSubSteps);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetRealTimeSimulation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint enableRealTimeSimulation) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetRealTimeSimulation(commandHandle, enableRealTimeSimulation);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetNumSolverIterations(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numSolverIterations) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetNumSolverIterations(commandHandle, numSolverIterations);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetCollisionFilterMode(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint filterMode) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetCollisionFilterMode(commandHandle, filterMode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetUseSplitImpulse(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint useSplitImpulse) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetUseSplitImpulse(commandHandle, useSplitImpulse);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetSplitImpulsePenetrationThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble splitImpulsePenetrationThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetSplitImpulsePenetrationThreshold(commandHandle, splitImpulsePenetrationThreshold);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetContactBreakingThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble contactBreakingThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetContactBreakingThreshold(commandHandle, contactBreakingThreshold);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetMaxNumCommandsPer1ms(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint maxNumCmdPer1ms) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetMaxNumCommandsPer1ms(commandHandle, maxNumCmdPer1ms);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetEnableFileCaching(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint enableFileCaching) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetEnableFileCaching(commandHandle, enableFileCaching);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetRestitutionVelocityThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble restitutionVelocityThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetRestitutionVelocityThreshold(commandHandle, restitutionVelocityThreshold);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetEnableConeFriction(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint enableConeFriction) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetEnableConeFriction(commandHandle, enableConeFriction);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetDeterministicOverlappingPairs(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint deterministicOverlappingPairs) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParameterSetDeterministicOverlappingPairs(commandHandle, deterministicOverlappingPairs);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetAllowedCcdPenetration(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble allowedCcdPenetration) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParameterSetAllowedCcdPenetration(commandHandle, allowedCcdPenetration);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetJointFeedbackMode(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint jointFeedbackMode) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParameterSetJointFeedbackMode(commandHandle, jointFeedbackMode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetSolverResidualThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble solverResidualThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetSolverResidualThreshold(commandHandle, solverResidualThreshold);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetContactSlop(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble contactSlop) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetContactSlop(commandHandle, contactSlop);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetEnableSAT(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint enableSAT) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParameterSetEnableSAT(commandHandle, enableSAT);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetConstraintSolverType(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint raintSolverType) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParameterSetConstraintSolverType(commandHandle, (int const)raintSolverType);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParameterSetMinimumSolverIslandSize(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint minimumSolverIslandSize) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParameterSetMinimumSolverIslandSize(commandHandle, minimumSolverIslandSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRequestPhysicsParamCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRequestPhysicsParamCommand(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusPhysicsSimulationParameters(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong paramsAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3PhysicsSimulationParameters *params = (struct b3PhysicsSimulationParameters *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusPhysicsSimulationParameters(statusHandle, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PhysicsParamSetInternalSimFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3PhysicsParamSetInternalSimFlags(commandHandle, flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitStepSimulationCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitStepSimulationCommand(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitStepSimulationCommand2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitStepSimulationCommand2(commandHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitResetSimulationCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitResetSimulationCommand(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitResetSimulationCommand2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitResetSimulationCommand2(commandHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong urdfFileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *urdfFileName = (char const *)(intptr_t)urdfFileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3LoadUrdfCommandInit(physClient, urdfFileName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong urdfFileNameAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *urdfFileName = (char const *)(intptr_t)urdfFileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3LoadUrdfCommandInit2(commandHandle, urdfFileName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetStartPosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startPosX, jdouble startPosY, jdouble startPosZ) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadUrdfCommandSetStartPosition(commandHandle, startPosX, startPosY, startPosZ);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetStartOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startOrnX, jdouble startOrnY, jdouble startOrnZ, jdouble startOrnW) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadUrdfCommandSetStartOrientation(commandHandle, startOrnX, startOrnY, startOrnZ, startOrnW);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetUseMultiBody(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint useMultiBody) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadUrdfCommandSetUseMultiBody(commandHandle, useMultiBody);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetUseFixedBase(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint useFixedBase) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadUrdfCommandSetUseFixedBase(commandHandle, useFixedBase);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadUrdfCommandSetFlags(commandHandle, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadUrdfCommandSetGlobalScaling(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble globalScaling) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadUrdfCommandSetGlobalScaling(commandHandle, globalScaling);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SaveStateCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3SaveStateCommandInit(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusGetStateId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusGetStateId(statusHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadStateCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3LoadStateCommandInit(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadStateSetStateId(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint stateId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadStateSetStateId(commandHandle, stateId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadStateSetFileName(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong fileNameAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadStateSetFileName(commandHandle, fileName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadBulletCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong fileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3LoadBulletCommandInit(physClient, fileName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SaveBulletCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong fileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3SaveBulletCommandInit(physClient, fileName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong fileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3LoadMJCFCommandInit(physClient, fileName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong fileNameAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3LoadMJCFCommandInit2(commandHandle, fileName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadMJCFCommandSetFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3LoadMJCFCommandSetFlags(commandHandle, flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseDynamicsCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jlong jointPositionsQAddress, jlong jointVelocitiesQdotAddress, jlong jointAccelerationsAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    double const *jointPositionsQ = (double const *)(intptr_t)jointPositionsQAddress;
    double const *jointVelocitiesQdot = (double const *)(intptr_t)jointVelocitiesQdotAddress;
    double const *jointAccelerations = (double const *)(intptr_t)jointAccelerationsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CalculateInverseDynamicsCommandInit(physClient, bodyUniqueId, jointPositionsQ, jointVelocitiesQdot, jointAccelerations);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusInverseDynamicsJointForces(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong dofCountAddress, jlong jointForcesAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *bodyUniqueId = (int *)(intptr_t)bodyUniqueIdAddress;
    int *dofCount = (int *)(intptr_t)dofCountAddress;
    double *jointForces = (double *)(intptr_t)jointForcesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusInverseDynamicsJointForces(statusHandle, bodyUniqueId, dofCount, jointForces);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateJacobianCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint linkIndex, jlong localPositionAddress, jlong jointPositionsQAddress, jlong jointVelocitiesQdotAddress, jlong jointAccelerationsAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    double const *localPosition = (double const *)(intptr_t)localPositionAddress;
    double const *jointPositionsQ = (double const *)(intptr_t)jointPositionsQAddress;
    double const *jointVelocitiesQdot = (double const *)(intptr_t)jointVelocitiesQdotAddress;
    double const *jointAccelerations = (double const *)(intptr_t)jointAccelerationsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CalculateJacobianCommandInit(physClient, bodyUniqueId, linkIndex, localPosition, jointPositionsQ, jointVelocitiesQdot, jointAccelerations);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusJacobian(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong dofCountAddress, jlong linearJacobianAddress, jlong angularJacobianAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *dofCount = (int *)(intptr_t)dofCountAddress;
    double *linearJacobian = (double *)(intptr_t)linearJacobianAddress;
    double *angularJacobian = (double *)(intptr_t)angularJacobianAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusJacobian(statusHandle, dofCount, linearJacobian, angularJacobian);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateMassMatrixCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jlong jointPositionsQAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    double const *jointPositionsQ = (double const *)(intptr_t)jointPositionsQAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CalculateMassMatrixCommandInit(physClient, bodyUniqueId, jointPositionsQ);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusMassMatrix(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong statusHandleAddress, jlong dofCountAddress, jlong massMatrixAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *dofCount = (int *)(intptr_t)dofCountAddress;
    double *massMatrix = (double *)(intptr_t)massMatrixAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusMassMatrix(physClient, statusHandle, dofCount, massMatrix);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CalculateInverseKinematicsCommandInit(physClient, bodyUniqueId);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsAddTargetPurePosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint endEffectorLinkIndex, jlong targetPositionAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *targetPosition = (double const *)(intptr_t)targetPositionAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CalculateInverseKinematicsAddTargetPurePosition(commandHandle, endEffectorLinkIndex, targetPosition);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsAddTargetPositionWithOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint endEffectorLinkIndex, jlong targetPositionAddress, jlong targetOrientationAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *targetPosition = (double const *)(intptr_t)targetPositionAddress;
    double const *targetOrientation = (double const *)(intptr_t)targetOrientationAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CalculateInverseKinematicsAddTargetPositionWithOrientation(commandHandle, endEffectorLinkIndex, targetPosition, targetOrientation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsPosWithNullSpaceVel(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numDof, jint endEffectorLinkIndex, jlong targetPositionAddress, jlong lowerLimitAddress, jlong upperLimitAddress, jlong jointRangeAddress, jlong restPoseAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *targetPosition = (double const *)(intptr_t)targetPositionAddress;
    double const *lowerLimit = (double const *)(intptr_t)lowerLimitAddress;
    double const *upperLimit = (double const *)(intptr_t)upperLimitAddress;
    double const *jointRange = (double const *)(intptr_t)jointRangeAddress;
    double const *restPose = (double const *)(intptr_t)restPoseAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CalculateInverseKinematicsPosWithNullSpaceVel(commandHandle, numDof, endEffectorLinkIndex, targetPosition, lowerLimit, upperLimit, jointRange, restPose);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsPosOrnWithNullSpaceVel(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numDof, jint endEffectorLinkIndex, jlong targetPositionAddress, jlong targetOrientationAddress, jlong lowerLimitAddress, jlong upperLimitAddress, jlong jointRangeAddress, jlong restPoseAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *targetPosition = (double const *)(intptr_t)targetPositionAddress;
    double const *targetOrientation = (double const *)(intptr_t)targetOrientationAddress;
    double const *lowerLimit = (double const *)(intptr_t)lowerLimitAddress;
    double const *upperLimit = (double const *)(intptr_t)upperLimitAddress;
    double const *jointRange = (double const *)(intptr_t)jointRangeAddress;
    double const *restPose = (double const *)(intptr_t)restPoseAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CalculateInverseKinematicsPosOrnWithNullSpaceVel(commandHandle, numDof, endEffectorLinkIndex, targetPosition, targetOrientation, lowerLimit, upperLimit, jointRange, restPose);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetJointDamping(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numDof, jlong jointDampingCoeffAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointDampingCoeff = (double const *)(intptr_t)jointDampingCoeffAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CalculateInverseKinematicsSetJointDamping(commandHandle, numDof, jointDampingCoeff);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSelectSolver(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint solver) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CalculateInverseKinematicsSelectSolver(commandHandle, solver);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusInverseKinematicsJointPositions(JNIEnv *__env, jclass clazz, jlong statusHandleAddress, jlong bodyUniqueIdAddress, jlong dofCountAddress, jlong jointPositionsAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    int *bodyUniqueId = (int *)(intptr_t)bodyUniqueIdAddress;
    int *dofCount = (int *)(intptr_t)dofCountAddress;
    double *jointPositions = (double *)(intptr_t)jointPositionsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusInverseKinematicsJointPositions(statusHandle, bodyUniqueId, dofCount, jointPositions);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetCurrentPositions(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numDof, jlong currentJointPositionsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *currentJointPositions = (double const *)(intptr_t)currentJointPositionsAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CalculateInverseKinematicsSetCurrentPositions(commandHandle, numDof, currentJointPositions);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetMaxNumIterations(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint maxNumIterations) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CalculateInverseKinematicsSetMaxNumIterations(commandHandle, maxNumIterations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CalculateInverseKinematicsSetResidualThreshold(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble residualThreshold) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CalculateInverseKinematicsSetResidualThreshold(commandHandle, residualThreshold);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CollisionFilterCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CollisionFilterCommandInit(physClient);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetCollisionFilterPair(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdA, jint bodyUniqueIdB, jint linkIndexA, jint linkIndexB, jint enableCollision) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetCollisionFilterPair(commandHandle, bodyUniqueIdA, bodyUniqueIdB, linkIndexA, linkIndexB, enableCollision);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetCollisionFilterGroupMask(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueIdA, jint linkIndexA, jint collisionFilterGroup, jint collisionFilterMask) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetCollisionFilterGroupMask(commandHandle, bodyUniqueIdA, linkIndexA, collisionFilterGroup, collisionFilterMask);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong sdfFileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *sdfFileName = (char const *)(intptr_t)sdfFileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3LoadSdfCommandInit(physClient, sdfFileName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong sdfFileNameAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *sdfFileName = (char const *)(intptr_t)sdfFileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3LoadSdfCommandInit2(commandHandle, sdfFileName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandSetUseMultiBody(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint useMultiBody) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadSdfCommandSetUseMultiBody(commandHandle, useMultiBody);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSdfCommandSetUseGlobalScaling(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble globalScaling) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadSdfCommandSetUseGlobalScaling(commandHandle, globalScaling);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SaveWorldCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong sdfFileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *sdfFileName = (char const *)(intptr_t)sdfFileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3SaveWorldCommandInit(physClient, sdfFileName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint controlMode) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3JointControlCommandInit(physClient, controlMode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit2(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId, jint controlMode) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3JointControlCommandInit2(physClient, bodyUniqueId, controlMode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlCommandInit2Internal(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint controlMode) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3JointControlCommandInit2Internal(commandHandle, bodyUniqueId, controlMode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredPosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint qIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3JointControlSetDesiredPosition(commandHandle, qIndex, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetKp(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3JointControlSetKp(commandHandle, dofIndex, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetKd(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3JointControlSetKd(commandHandle, dofIndex, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetMaximumVelocity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble maximumVelocity) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3JointControlSetMaximumVelocity(commandHandle, dofIndex, maximumVelocity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredVelocity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3JointControlSetDesiredVelocity(commandHandle, dofIndex, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetMaximumForce(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3JointControlSetMaximumForce(commandHandle, dofIndex, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3JointControlSetDesiredForceTorque(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint dofIndex, jdouble value) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3JointControlSetDesiredForceTorque(commandHandle, dofIndex, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CreateCollisionShapeCommandInit(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddSphere(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateCollisionShapeAddSphere(commandHandle, radius);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddBox(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong halfExtentsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *halfExtents = (double const *)(intptr_t)halfExtentsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateCollisionShapeAddBox(commandHandle, halfExtents);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddCapsule(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius, jdouble height) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateCollisionShapeAddCapsule(commandHandle, radius, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddCylinder(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius, jdouble height) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateCollisionShapeAddCylinder(commandHandle, radius, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddPlane(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong planeNormalAddress, jdouble planeConstant) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *planeNormal = (double const *)(intptr_t)planeNormalAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateCollisionShapeAddPlane(commandHandle, planeNormal, planeConstant);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeAddMesh(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong fileNameAddress, jlong meshScaleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    double const *meshScale = (double const *)(intptr_t)meshScaleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateCollisionShapeAddMesh(commandHandle, fileName, meshScale);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionSetFlag(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CreateCollisionSetFlag(commandHandle, shapeIndex, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateCollisionShapeSetChildTransform(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jlong childPositionAddress, jlong childOrientationAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *childPosition = (double const *)(intptr_t)childPositionAddress;
    double const *childOrientation = (double const *)(intptr_t)childOrientationAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CreateCollisionShapeSetChildTransform(commandHandle, shapeIndex, childPosition, childOrientation);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusCollisionShapeUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusCollisionShapeUniqueId(statusHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InitRemoveCollisionShapeCommand(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint collisionShapeId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3InitRemoveCollisionShapeCommand(physClient, collisionShapeId);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CreateVisualShapeCommandInit(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddSphere(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateVisualShapeAddSphere(commandHandle, radius);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddBox(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong halfExtentsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *halfExtents = (double const *)(intptr_t)halfExtentsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateVisualShapeAddBox(commandHandle, halfExtents);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddCapsule(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius, jdouble height) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateVisualShapeAddCapsule(commandHandle, radius, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddCylinder(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble radius, jdouble height) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateVisualShapeAddCylinder(commandHandle, radius, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddPlane(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong planeNormalAddress, jdouble planeConstant) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *planeNormal = (double const *)(intptr_t)planeNormalAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateVisualShapeAddPlane(commandHandle, planeNormal, planeConstant);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeAddMesh(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong fileNameAddress, jlong meshScaleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    double const *meshScale = (double const *)(intptr_t)meshScaleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateVisualShapeAddMesh(commandHandle, fileName, meshScale);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualSetFlag(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CreateVisualSetFlag(commandHandle, shapeIndex, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetChildTransform(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jlong childPositionAddress, jlong childOrientationAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *childPosition = (double const *)(intptr_t)childPositionAddress;
    double const *childOrientation = (double const *)(intptr_t)childOrientationAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CreateVisualShapeSetChildTransform(commandHandle, shapeIndex, childPosition, childOrientation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetSpecularColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jlong specularColorAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *specularColor = (double const *)(intptr_t)specularColorAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CreateVisualShapeSetSpecularColor(commandHandle, shapeIndex, specularColor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateVisualShapeSetRGBAColor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint shapeIndex, jlong rgbaColorAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rgbaColor = (double const *)(intptr_t)rgbaColorAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CreateVisualShapeSetRGBAColor(commandHandle, shapeIndex, rgbaColor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusVisualShapeUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusVisualShapeUniqueId(statusHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CreateMultiBodyCommandInit(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyBase(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble mass, jint collisionShapeUnique, jint visualShapeUniqueId, jlong basePositionAddress, jlong baseOrientationAddress, jlong baseInertialFramePositionAddress, jlong baseInertialFrameOrientationAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *basePosition = (double const *)(intptr_t)basePositionAddress;
    double const *baseOrientation = (double const *)(intptr_t)baseOrientationAddress;
    double const *baseInertialFramePosition = (double const *)(intptr_t)baseInertialFramePositionAddress;
    double const *baseInertialFrameOrientation = (double const *)(intptr_t)baseInertialFrameOrientationAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateMultiBodyBase(commandHandle, mass, collisionShapeUnique, visualShapeUniqueId, basePosition, baseOrientation, baseInertialFramePosition, baseInertialFrameOrientation);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyLink(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble linkMass, jdouble linkCollisionShapeIndex, jdouble linkVisualShapeIndex, jlong linkPositionAddress, jlong linkOrientationAddress, jlong linkInertialFramePositionAddress, jlong linkInertialFrameOrientationAddress, jint linkParentIndex, jint linkJointType, jlong linkJointAxisAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *linkPosition = (double const *)(intptr_t)linkPositionAddress;
    double const *linkOrientation = (double const *)(intptr_t)linkOrientationAddress;
    double const *linkInertialFramePosition = (double const *)(intptr_t)linkInertialFramePositionAddress;
    double const *linkInertialFrameOrientation = (double const *)(intptr_t)linkInertialFrameOrientationAddress;
    double const *linkJointAxis = (double const *)(intptr_t)linkJointAxisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateMultiBodyLink(commandHandle, linkMass, linkCollisionShapeIndex, linkVisualShapeIndex, linkPosition, linkOrientation, linkInertialFramePosition, linkInertialFrameOrientation, linkParentIndex, linkJointType, linkJointAxis);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodyUseMaximalCoordinates(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CreateMultiBodyUseMaximalCoordinates(commandHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateMultiBodySetFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3CreateMultiBodySetFlags(commandHandle, flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxShapeCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CreateBoxShapeCommandInit(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetStartPosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startPosX, jdouble startPosY, jdouble startPosZ) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateBoxCommandSetStartPosition(commandHandle, startPosX, startPosY, startPosZ);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetStartOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startOrnX, jdouble startOrnY, jdouble startOrnZ, jdouble startOrnW) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateBoxCommandSetStartOrientation(commandHandle, startOrnX, startOrnY, startOrnZ, startOrnW);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetHalfExtents(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble halfExtentsX, jdouble halfExtentsY, jdouble halfExtentsZ) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateBoxCommandSetHalfExtents(commandHandle, halfExtentsX, halfExtentsY, halfExtentsZ);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetMass(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble mass) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateBoxCommandSetMass(commandHandle, mass);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetCollisionShapeType(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint collisionShapeType) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateBoxCommandSetCollisionShapeType(commandHandle, collisionShapeType);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateBoxCommandSetColorRGBA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble red, jdouble green, jdouble blue, jdouble alpha) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateBoxCommandSetColorRGBA(commandHandle, red, green, blue, alpha);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CreatePoseCommandInit(physClient, bodyUniqueId);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CreatePoseCommandInit2(commandHandle, bodyUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBasePosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startPosX, jdouble startPosY, jdouble startPosZ) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetBasePosition(commandHandle, startPosX, startPosY, startPosZ);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble startOrnX, jdouble startOrnY, jdouble startOrnZ, jdouble startOrnW) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetBaseOrientation(commandHandle, startOrnX, startOrnY, startOrnZ, startOrnW);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseLinearVelocity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong linVelAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *linVel = (double const *)(intptr_t)linVelAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetBaseLinearVelocity(commandHandle, linVel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetBaseAngularVelocity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong angVelAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *angVel = (double const *)(intptr_t)angVelAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetBaseAngularVelocity(commandHandle, angVel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPositions(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numJointPositions, jlong jointPositionsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointPositions = (double const *)(intptr_t)jointPositionsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetJointPositions(commandHandle, numJointPositions, jointPositions);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPosition(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jdouble jointPosition) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetJointPosition(physClient, commandHandle, jointIndex, jointPosition);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointPositionMultiDof(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jlong jointPositionAddress, jint posSize) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointPosition = (double const *)(intptr_t)jointPositionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetJointPositionMultiDof(physClient, commandHandle, jointIndex, jointPosition, posSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetQ(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numJointPositions, jlong qAddress, jlong hasQAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *q = (double const *)(intptr_t)qAddress;
    int const *hasQ = (int const *)(intptr_t)hasQAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetQ(commandHandle, numJointPositions, q, hasQ);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetQdots(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numJointVelocities, jlong qDotsAddress, jlong hasQdotsAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *qDots = (double const *)(intptr_t)qDotsAddress;
    int const *hasQdots = (int const *)(intptr_t)hasQdotsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetQdots(commandHandle, numJointVelocities, qDots, hasQdots);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocities(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jint numJointVelocities, jlong jointVelocitiesAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointVelocities = (double const *)(intptr_t)jointVelocitiesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetJointVelocities(physClient, commandHandle, numJointVelocities, jointVelocities);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocity(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jdouble jointVelocity) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetJointVelocity(physClient, commandHandle, jointIndex, jointVelocity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreatePoseCommandSetJointVelocityMultiDof(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jint jointIndex, jlong jointVelocityAddress, jint velSize) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *jointVelocity = (double const *)(intptr_t)jointVelocityAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreatePoseCommandSetJointVelocityMultiDof(physClient, commandHandle, jointIndex, jointVelocity, velSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CreateSensorCommandInit(physClient, bodyUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorEnable6DofJointForceTorqueSensor(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint jointIndex, jint enable) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateSensorEnable6DofJointForceTorqueSensor(commandHandle, jointIndex, enable);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateSensorEnableIMUForLink(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndex, jint enable) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3CreateSensorEnableIMUForLink(commandHandle, linkIndex, enable);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jint bodyUniqueId) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3RequestActualStateCommandInit(physClient, bodyUniqueId);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3RequestActualStateCommandInit2(commandHandle, bodyUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandComputeLinkVelocity(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint computeLinkVelocity) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3RequestActualStateCommandComputeLinkVelocity(commandHandle, computeLinkVelocity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestActualStateCommandComputeForwardKinematics(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint computeForwardKinematics) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3RequestActualStateCommandComputeForwardKinematics(commandHandle, computeForwardKinematics);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetJointState(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong statusHandleAddress, jint jointIndex, jlong stateAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3JointSensorState *state = (struct b3JointSensorState *)(intptr_t)stateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetJointState(physClient, statusHandle, jointIndex, state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetJointStateMultiDof(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong statusHandleAddress, jint jointIndex, jlong stateAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3JointSensorState2 *state = (struct b3JointSensorState2 *)(intptr_t)stateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetJointStateMultiDof(physClient, statusHandle, jointIndex, state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetLinkState(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong statusHandleAddress, jint linkIndex, jlong stateAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    struct b3LinkState *state = (struct b3LinkState *)(intptr_t)stateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetLinkState(physClient, statusHandle, linkIndex, state);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PickBody(JNIEnv *__env, jclass clazz, jlong physClientAddress, jdouble rayFromWorldX, jdouble rayFromWorldY, jdouble rayFromWorldZ, jdouble rayToWorldX, jdouble rayToWorldY, jdouble rayToWorldZ) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3PickBody(physClient, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3MovePickedBody(JNIEnv *__env, jclass clazz, jlong physClientAddress, jdouble rayFromWorldX, jdouble rayFromWorldY, jdouble rayFromWorldZ, jdouble rayToWorldX, jdouble rayToWorldY, jdouble rayToWorldZ) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3MovePickedBody(physClient, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RemovePickingConstraint(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3RemovePickingConstraint(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateRaycastCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jdouble rayFromWorldX, jdouble rayFromWorldY, jdouble rayFromWorldZ, jdouble rayToWorldX, jdouble rayToWorldY, jdouble rayToWorldZ) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CreateRaycastCommandInit(physClient, rayFromWorldX, rayFromWorldY, rayFromWorldZ, rayToWorldX, rayToWorldY, rayToWorldZ);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3CreateRaycastBatchCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3CreateRaycastBatchCommandInit(physClient);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchSetNumThreads(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint numThreads) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RaycastBatchSetNumThreads(commandHandle, numThreads);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchAddRay(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong rayFromWorldAddress, jlong rayToWorldAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rayFromWorld = (double const *)(intptr_t)rayFromWorldAddress;
    double const *rayToWorld = (double const *)(intptr_t)rayToWorldAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RaycastBatchAddRay(commandHandle, rayFromWorld, rayToWorld);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchAddRays(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong commandHandleAddress, jlong rayFromWorldAddress, jlong rayToWorldAddress, jint numRays) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rayFromWorld = (double const *)(intptr_t)rayFromWorldAddress;
    double const *rayToWorld = (double const *)(intptr_t)rayToWorldAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RaycastBatchAddRays(physClient, commandHandle, rayFromWorld, rayToWorld, numRays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RaycastBatchSetParentObject(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint parentObjectUniqueId, jint parentLinkIndex) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3RaycastBatchSetParentObject(commandHandle, parentObjectUniqueId, parentLinkIndex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetRaycastInformation(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong raycastInfoAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3RaycastInformation *raycastInfo = (struct b3RaycastInformation *)(intptr_t)raycastInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetRaycastInformation(physClient, raycastInfo);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalForceCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3ApplyExternalForceCommandInit(physClient);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalForce(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkId, jlong forceAddress, jlong positionAddress, jint flag) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *force = (double const *)(intptr_t)forceAddress;
    double const *position = (double const *)(intptr_t)positionAddress;
    UNUSED_PARAMS(__env, clazz)
    b3ApplyExternalForce(commandHandle, bodyUniqueId, linkId, force, position, flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ApplyExternalTorque(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyUniqueId, jint linkId, jlong torqueAddress, jint flag) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *torque = (double const *)(intptr_t)torqueAddress;
    UNUSED_PARAMS(__env, clazz)
    b3ApplyExternalTorque(commandHandle, bodyUniqueId, linkId, torque, flag);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodyCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong fileNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3LoadSoftBodyCommandInit(physClient, fileName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetScale(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble scale) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadSoftBodySetScale(commandHandle, scale);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetMass(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble mass) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadSoftBodySetMass(commandHandle, mass);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3LoadSoftBodySetCollisionMargin(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jdouble collisionMargin) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3LoadSoftBodySetCollisionMargin(commandHandle, collisionMargin);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestVREventsCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3RequestVREventsCommandInit(physClient);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3VREventsSetDeviceTypeFilter(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint deviceTypeFilter) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3VREventsSetDeviceTypeFilter(commandHandle, deviceTypeFilter);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetVREventsData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong vrEventsDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3VREventsData *vrEventsData = (struct b3VREventsData *)(intptr_t)vrEventsDataAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetVREventsData(physClient, vrEventsData);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraStateCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3SetVRCameraStateCommandInit(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraRootPosition(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong rootPosAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rootPos = (double const *)(intptr_t)rootPosAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3SetVRCameraRootPosition(commandHandle, rootPos);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraRootOrientation(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jlong rootOrnAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    double const *rootOrn = (double const *)(intptr_t)rootOrnAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3SetVRCameraRootOrientation(commandHandle, rootOrn);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraTrackingObject(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint objectUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3SetVRCameraTrackingObject(commandHandle, objectUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetVRCameraTrackingObjectFlag(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint flag) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3SetVRCameraTrackingObjectFlag(commandHandle, flag);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestKeyboardEventsCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3RequestKeyboardEventsCommandInit(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestKeyboardEventsCommandInit2(JNIEnv *__env, jclass clazz, jlong commandHandleAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3RequestKeyboardEventsCommandInit2(commandHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetKeyboardEventsData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong keyboardEventsDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3KeyboardEventsData *keyboardEventsData = (struct b3KeyboardEventsData *)(intptr_t)keyboardEventsDataAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetKeyboardEventsData(physClient, keyboardEventsData);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3RequestMouseEventsCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3RequestMouseEventsCommandInit(physClient);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetMouseEventsData(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong mouseEventsDataAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    struct b3MouseEventsData *mouseEventsData = (struct b3MouseEventsData *)(intptr_t)mouseEventsDataAddress;
    UNUSED_PARAMS(__env, clazz)
    b3GetMouseEventsData(physClient, mouseEventsData);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3StateLoggingCommandInit(physClient);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingStart(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint loggingType, jlong fileNameAddress) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    char const *fileName = (char const *)(intptr_t)fileNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3StateLoggingStart(commandHandle, loggingType, fileName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingAddLoggingObjectUniqueId(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint objectUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3StateLoggingAddLoggingObjectUniqueId(commandHandle, objectUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetMaxLogDof(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint maxLogDof) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3StateLoggingSetMaxLogDof(commandHandle, maxLogDof);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLinkIndexA(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexA) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3StateLoggingSetLinkIndexA(commandHandle, linkIndexA);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLinkIndexB(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint linkIndexB) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3StateLoggingSetLinkIndexB(commandHandle, linkIndexB);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetBodyAUniqueId(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyAUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3StateLoggingSetBodyAUniqueId(commandHandle, bodyAUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetBodyBUniqueId(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint bodyBUniqueId) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3StateLoggingSetBodyBUniqueId(commandHandle, bodyBUniqueId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetDeviceTypeFilter(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint deviceTypeFilter) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3StateLoggingSetDeviceTypeFilter(commandHandle, deviceTypeFilter);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingSetLogFlags(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint logFlags) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3StateLoggingSetLogFlags(commandHandle, logFlags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetStatusLoggingUniqueId(JNIEnv *__env, jclass clazz, jlong statusHandleAddress) {
    b3SharedMemoryStatusHandle statusHandle = (b3SharedMemoryStatusHandle)(intptr_t)statusHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3GetStatusLoggingUniqueId(statusHandle);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3StateLoggingStop(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint loggingUid) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)b3StateLoggingStop(commandHandle, loggingUid);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3ProfileTimingCommandInit(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong nameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3ProfileTimingCommandInit(physClient, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetProfileTimingDuractionInMicroSeconds(JNIEnv *__env, jclass clazz, jlong commandHandleAddress, jint duration) {
    b3SharedMemoryCommandHandle commandHandle = (b3SharedMemoryCommandHandle)(intptr_t)commandHandleAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetProfileTimingDuractionInMicroSeconds(commandHandle, duration);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PushProfileTiming(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong timingNameAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *timingName = (char const *)(intptr_t)timingNameAddress;
    UNUSED_PARAMS(__env, clazz)
    b3PushProfileTiming(physClient, timingName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3PopProfileTiming(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    b3PopProfileTiming(physClient);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetTimeOut(JNIEnv *__env, jclass clazz, jlong physClientAddress, jdouble timeOutInSeconds) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    b3SetTimeOut(physClient, timeOutInSeconds);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3GetTimeOut(JNIEnv *__env, jclass clazz, jlong physClientAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jdouble)b3GetTimeOut(physClient);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3SetAdditionalSearchPath(JNIEnv *__env, jclass clazz, jlong physClientAddress, jlong pathAddress) {
    b3PhysicsClientHandle physClient = (b3PhysicsClientHandle)(intptr_t)physClientAddress;
    char const *path = (char const *)(intptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)b3SetAdditionalSearchPath(physClient, path);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3MultiplyTransforms(JNIEnv *__env, jclass clazz, jlong posAAddress, jlong ornAAddress, jlong posBAddress, jlong ornBAddress, jlong outPosAddress, jlong outOrnAddress) {
    double const *posA = (double const *)(intptr_t)posAAddress;
    double const *ornA = (double const *)(intptr_t)ornAAddress;
    double const *posB = (double const *)(intptr_t)posBAddress;
    double const *ornB = (double const *)(intptr_t)ornBAddress;
    double *outPos = (double *)(intptr_t)outPosAddress;
    double *outOrn = (double *)(intptr_t)outOrnAddress;
    UNUSED_PARAMS(__env, clazz)
    b3MultiplyTransforms(posA, ornA, posB, ornB, outPos, outOrn);
}

JNIEXPORT void JNICALL Java_org_lwjgl_bullet_PhysicsClient_nb3InvertTransform(JNIEnv *__env, jclass clazz, jlong posAddress, jlong ornAddress, jlong outPosAddress, jlong outOrnAddress) {
    double const *pos = (double const *)(intptr_t)posAddress;
    double const *orn = (double const *)(intptr_t)ornAddress;
    double *outPos = (double *)(intptr_t)outPosAddress;
    double *outOrn = (double *)(intptr_t)outOrnAddress;
    UNUSED_PARAMS(__env, clazz)
    b3InvertTransform(pos, orn, outPos, outOrn);
}

EXTERN_C_EXIT
