/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet

import org.lwjgl.generator.*

val b3PhysicsClientHandle = "b3PhysicsClientHandle".handle
val b3SharedMemoryStatusHandle = "b3SharedMemoryStatusHandle".handle
val b3SharedMemoryCommandHandle = "b3SharedMemoryCommandHandle".handle

val UserDataValueType = "enum UserDataValueType".enumType

val b3BodyInfo = struct(Module.BULLET, "B3BodyInfo", nativeName = "struct b3BodyInfo") {
    charASCII("m_baseName", "")[1024]
    charASCII("m_bodyName", "for {@code btRigidBody}, it does not have a base, but can still have a body name from {@code urdf}")[1024]
}

val b3JointInfo = struct(Module.BULLET, "B3JointInfo", nativeName = "struct b3JointInfo") {
    charASCII("m_linkName", "")[1024]
    charASCII("m_jointName", "")[1024]
    int("m_jointType", "")
    int("m_qIndex", "")
    int("m_uIndex", "")
    int("m_jointIndex", "")
    int("m_flags", "")
    double("m_jointDamping", "")
    double("m_jointFriction", "")
    double("m_jointLowerLimit", "")
    double("m_jointUpperLimit", "")
    double("m_jointMaxForce", "")
    double("m_jointMaxVelocity", "")
    double("m_parentFrame", "position and orientation (quaternion)")[7]
    double("m_childFrame", "position and orientation (quaternion)")[7]
    double("m_jointAxis", "joint axis in parent local frame")[3]
    int("m_parentIndex", "")
    int("m_qSize", "")
	int("m_uSize", "")
}

val b3UserDataValue = struct(Module.BULLET, "B3UserDataValue", nativeName = "struct b3UserDataValue") {
    int("m_type", "")
    AutoSize("m_data1")..int("m_length", "")
    char.p("m_data1", "")
}

val b3DynamicsInfo = struct(Module.BULLET, "B3DynamicsInfo", nativeName = "struct b3DynamicsInfo") {
    double("m_mass", "")
    double("m_localInertialDiagonal", "")[3]
    double("m_localInertialFrame", "")[7]
    double("m_lateralFrictionCoeff", "")

    double("m_rollingFrictionCoeff", "")
    double("m_spinningFrictionCoeff", "")
    double("m_restitution", "")
    double("m_contactStiffness", "")
    double("m_contactDamping", "")
    int("m_activationState", "")
    double("m_angularDamping", "")
    double("m_linearDamping", "")
    double("m_ccdSweptSphereRadius", "")
    double("m_contactProcessingThreshold", "")
    int("m_frictionAnchor", "")
}

val b3UserConstraintState = struct(Module.BULLET, "B3UserConstraintState", nativeName = "struct b3UserConstraintState") {
    double("m_appliedConstraintForces", "")[6]
    int("m_numDofs", "")
}

val b3UserConstraint = struct(Module.BULLET, "B3UserConstraint", nativeName = "struct b3UserConstraint") {
    int("m_parentBodyIndex", "")
    int("m_parentJointIndex", "")
    int("m_childBodyIndex", "")
    int("m_childJointIndex", "")
    double("m_parentFrame", "")[7]
    double("m_childFrame", "")[7]
    double("m_jointAxis", "")[3]
    int("m_jointType", "")
    double("m_maxAppliedForce", "")
    int("m_userConstraintUniqueId", "")
    double("m_gearRatio", "")
    int("m_gearAuxLink", "")
    double("m_relativePositionTarget", "")
    double("m_erp", "")
}

val b3DebugLines = struct(Module.BULLET, "B3DebugLines", nativeName = "struct b3DebugLines") {
    AutoSize(3, "m_linesFrom", "m_linesTo", "m_linesColor")..int("m_numDebugLines", "")
    float.const.p("m_linesFrom", "")   //float x,y,z times 'm_numDebugLines'.
    float.const.p("m_linesTo", "")     //float x,y,z times 'm_numDebugLines'.
    float.const.p("m_linesColor", "")  //float red,green,blue times 'm_numDebugLines'.
}

val b3OpenGLVisualizerCameraInfo = struct(Module.BULLET, "B3OpenGLVisualizerCameraInfo", nativeName = "struct b3OpenGLVisualizerCameraInfo") {
    int("m_width", "")
    int("m_height", "")
    float("m_viewMatrix", "")[16]
    float("m_projectionMatrix", "")[16]

    float("m_camUp", "")[3]
    float("m_camForward", "")[3]

    float("m_horizontal", "")[3]
    float("m_vertical", "")[3]

    float("m_yaw", "")
    float("m_pitch", "")
    float("m_dist", "")
    float("m_target", "")[3]
}

val b3CameraImageData = struct(Module.BULLET, "B3CameraImageData", nativeName = "struct b3CameraImageData") {
    int("m_pixelWidth", "")
    int("m_pixelHeight", "")
    unsigned_char.const.p("m_rgbColorData", "")  //3*m_pixelWidth*m_pixelHeight bytes
    float.const.p("m_depthValues", "")           //m_pixelWidth*m_pixelHeight floats
    int.const.p("m_segmentationMaskValues", "")  //m_pixelWidth*m_pixelHeight ints
}

val b3ContactPointData = struct(Module.BULLET, "B3ContactPointData", nativeName = "struct b3ContactPointData") {
    //todo: expose some contact flags, such as telling which fields below are valid
    int("m_contactFlags", "")
    int("m_bodyUniqueIdA", "")
    int("m_bodyUniqueIdB", "")
    int("m_linkIndexA", "")
    int("m_linkIndexB", "")
    double("m_positionOnAInWS", "")[3]       //contact point location on object A, in world space coordinates
    double("m_positionOnBInWS", "")[3]       //contact point location on object A, in world space coordinates
    double("m_contactNormalOnBInWS", "")[3]  //the separating contact normal, pointing from object B towards object A
    double("m_contactDistance", "")          //negative number is penetration, positive is distance.

    double("m_normalForce", "")

    double("m_linearFrictionForce1", "")
    double("m_linearFrictionForce2", "")
    double("m_linearFrictionDirection1", "")[3]
    double("m_linearFrictionDirection2", "")[3]
}
val b3ContactInformation = struct(Module.BULLET, "B3ContactInformation", nativeName = "struct b3ContactInformation") {
    AutoSize("m_contactPointData")..int("m_numContactPoints", "")
    b3ContactPointData.p("m_contactPointData", "")
}

val b3OverlappingObject = struct(Module.BULLET, "B3OverlappingObject", nativeName = "struct b3OverlappingObject") {
    int("m_objectUniqueId", "")
    int("m_linkIndex", "")
}
val b3AABBOverlapData = struct(Module.BULLET, "B3AABBOverlapData", nativeName = "struct b3AABBOverlapData") {
    AutoSize("m_overlappingObjects")..int("m_numOverlappingObjects", "")
    b3OverlappingObject.p("m_overlappingObjects", "")
}

val b3VisualShapeData = struct(Module.BULLET, "B3VisualShapeData", nativeName = "struct b3VisualShapeData") {
    javaImport("static org.lwjgl.bullet.PhysicsClient.*")

    int("m_objectUniqueId", "")
    int("m_linkIndex", "")
    int("m_visualGeometryType", "")  //box primitive, sphere primitive, triangle mesh
    double("m_dimensions", "")[3]    //meaning depends on("m_visualGeometryType", "")
    charASCII("m_meshAssetFileName", "")["VISUAL_SHAPE_MAX_PATH_LEN"]
    double("m_localVisualFrame", "")[7]  //pos[3], orn[4]
    //todo: add more data if necessary (material color etc, although material can be in asset file .obj file)
    double("m_rgbaColor", "")[4]
    int("m_tinyRendererTextureId", "")
    int("m_textureUniqueId", "")
    int("m_openglTextureId", "")
}
val b3VisualShapeInformation = struct(Module.BULLET, "B3VisualShapeInformation", nativeName = "struct b3VisualShapeInformation") {
    AutoSize("m_visualShapeData")..int("m_numVisualShapes", "")
    b3VisualShapeData.p("m_visualShapeData", "")
}

val b3CollisionShapeData = struct(Module.BULLET, "B3CollisionShapeData", nativeName = "struct b3CollisionShapeData") {
    javaImport("static org.lwjgl.bullet.PhysicsClient.*")

    int("m_objectUniqueId", "")
    int("m_linkIndex", "")
    int("m_collisionGeometryType", "")      //GEOM_BOX, GEOM_SPHERE etc
    double("m_dimensions", "")[3]           //meaning depends on m_visualGeometryType GEOM_BOX: extents, GEOM_SPHERE: radius, GEOM_CAPSULE+GEOM_CYLINDER:length, radius, GEOM_MESH: mesh scale
    double("m_localCollisionFrame", "")[7]  //pos[3], orn[4]
    charASCII("m_meshAssetFileName", "")["VISUAL_SHAPE_MAX_PATH_LEN"]
}
val b3CollisionShapeInformation = struct(Module.BULLET, "B3CollisionShapeInformation", nativeName = "struct b3CollisionShapeInformation") {
    AutoSize("m_collisionShapeData")..int("m_numCollisionShapes", "")
    b3CollisionShapeData.p("m_collisionShapeData", "")
}

val b3PhysicsSimulationParameters = struct(Module.BULLET, "B3PhysicsSimulationParameters", nativeName = "struct b3PhysicsSimulationParameters") {
    double("m_deltaTime", "")
    double("m_gravityAcceleration", "")[3]
    int("m_numSimulationSubSteps", "")
    int("m_numSolverIterations", "")
    int("m_useRealTimeSimulation", "")
    int("m_useSplitImpulse", "")
    double("m_splitImpulsePenetrationThreshold", "")
    double("m_contactBreakingThreshold", "")
    int("m_internalSimFlags", "")
    double("m_defaultContactERP", "")
    int("m_collisionFilterMode", "")
    int("m_enableFileCaching", "")
    double("m_restitutionVelocityThreshold", "")
    double("m_defaultNonContactERP", "")
    double("m_frictionERP", "")
    double("m_defaultGlobalCFM", "")
    double("m_frictionCFM", "")
    int("m_enableConeFriction", "")
    int("m_deterministicOverlappingPairs", "")
    double("m_allowedCcdPenetration", "")
    int("m_jointFeedbackMode", "")
    double("m_solverResidualThreshold", "")
    double("m_contactSlop", "")
    int("m_enableSAT", "")
    int("m_constraintSolverType", "")
    int("m_minimumSolverIslandSize", "")
}

val b3JointSensorState = struct(Module.BULLET, "B3JointSensorState", nativeName = "struct b3JointSensorState") {
    double("m_jointPosition", "")
    double("m_jointVelocity", "")
    double("m_jointForceTorque", "")[6] /* note to roboticists: this is NOT the motor torque/force, but the spatial reaction force vector at joint */
    double("m_jointMotorTorque", "")
}

val b3JointSensorState2 = struct(Module.BULLET, "B3JointSensorState2", nativeName = "struct b3JointSensorState2") {
    double("m_jointPosition", "")[4]
    double("m_jointVelocity", "")[3]
    double("m_jointReactionForceTorque", "")[6] /* note to roboticists: this is NOT the motor torque/force, but the spatial reaction force vector at joint */
    double("m_jointMotorTorque", "")
    int("m_qDofSize", "")
	int("m_uDofSize", "")
}

///b3LinkState provides extra information such as the Cartesian world coordinates
///center of mass (COM) of the link, relative to the world reference frame.
///Orientation is a quaternion x,y,z,w
///Note: to compute the URDF link frame (which equals the joint frame at joint position 0)
///use URDF link frame = link COM frame * inertiaFrame.inverse()
val b3LinkState = struct(Module.BULLET, "B3LinkState", nativeName = "struct b3LinkState") {
    //m_worldPosition and m_worldOrientation of the Center Of Mass (COM)
    double("m_worldPosition", "")[3]
    double("m_worldOrientation", "")[4]

    double("m_localInertialPosition", "")[3]
    double("m_localInertialOrientation", "")[4]

    ///world position and orientation of the (URDF) link frame
    double("m_worldLinkFramePosition", "")[3]
    double("m_worldLinkFrameOrientation", "")[4]

    double("m_worldLinearVelocity", "")[3]   //only valid when ACTUAL_STATE_COMPUTE_LINKVELOCITY is set (b3RequestActualStateCommandComputeLinkVelocity)
    double("m_worldAngularVelocity", "")[3]  //only valid when ACTUAL_STATE_COMPUTE_LINKVELOCITY is set (b3RequestActualStateCommandComputeLinkVelocity)

    double("m_worldAABBMin", "")[3]  //world space bounding minium and maximum box corners.
    double("m_worldAABBMax", "")[3]
}

val b3RayHitInfo = struct(Module.BULLET, "B3RayHitInfo", nativeName = "struct b3RayHitInfo") {
    double("m_hitFraction", "")
    int("m_hitObjectUniqueId", "")
    int("m_hitObjectLinkIndex", "")
    double("m_hitPositionWorld", "")[3]
    double("m_hitNormalWorld", "")[3]
}
val b3RaycastInformation = struct(Module.BULLET, "B3RaycastInformation", nativeName = "struct b3RaycastInformation") {
    AutoSize("m_rayHits")..int("m_numRayHits", "")
    b3RayHitInfo.p("m_rayHits", "")
}

val b3VRControllerEvent = struct(Module.BULLET, "B3VRControllerEvent", nativeName = "struct b3VRControllerEvent") {
    javaImport("static org.lwjgl.bullet.PhysicsClient.*")

    int("m_controllerId", "")  //valid for VR_CONTROLLER_MOVE_EVENT and VR_CONTROLLER_BUTTON_EVENT
    int("m_deviceType", "")
    int("m_numMoveEvents", "")
    int("m_numButtonEvents", "")

    float("m_pos", "")[4]  //valid for VR_CONTROLLER_MOVE_EVENT and VR_CONTROLLER_BUTTON_EVENT
    float("m_orn", "")[4]  //valid for VR_CONTROLLER_MOVE_EVENT and VR_CONTROLLER_BUTTON_EVENT

    float("m_analogAxis", "")                             //valid if VR_CONTROLLER_MOVE_EVENT
    float("m_auxAnalogAxis", "")["MAX_VR_ANALOG_AXIS * 2"]  //store x,y per axis, only valid if VR_CONTROLLER_MOVE_EVENT
    int("m_buttons", "")["MAX_VR_BUTTONS"]                  //valid if VR_CONTROLLER_BUTTON_EVENT, see b3VRButtonInfo
}

val b3VREventsData = struct(Module.BULLET, "B3VREventsData", nativeName = "struct b3VREventsData") {
    AutoSize("m_controllerEvents")..int("m_numControllerEvents", "")
    b3VRControllerEvent.p("m_controllerEvents", "")
}


val b3KeyboardEvent = struct(Module.BULLET, "B3KeyboardEvent", nativeName = "struct b3KeyboardEvent") {
    int("m_keyCode", "")   //ascii
    int("m_keyState", "")  // see b3VRButtonInfo
}

val b3KeyboardEventsData = struct(Module.BULLET, "B3KeyboardEventsData", nativeName = "struct b3KeyboardEventsData") {
    AutoSize("m_keyboardEvents")..int("m_numKeyboardEvents", "")
    b3KeyboardEvent.p("m_keyboardEvents", "")
}

val b3MouseEvent = struct(Module.BULLET, "B3MouseEvent", nativeName = "struct b3MouseEvent") {
    int("m_eventType", "")
    float("m_mousePosX", "")
    float("m_mousePosY", "")
    int("m_buttonIndex", "")
    int("m_buttonState", "")
}

val b3MouseEventsData = struct(Module.BULLET, "B3MouseEventsData", nativeName = "struct b3MouseEventsData") {
    AutoSize("m_mouseEvents")..int("m_numMouseEvents", "")
    b3MouseEvent.p("m_mouseEvents", "")
}