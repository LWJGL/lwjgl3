/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package driftfx

import org.lwjgl.generator.*

val Context = "driftfx::Context".opaque
val DriftFX = "driftfx::DriftFX".opaque
val DriftFXSurface = "driftfx::DriftFXSurface".opaque
val RenderTarget = "driftfx::RenderTarget".opaque
val Texture = "driftfx::Texture".opaque
val TransferMode = "driftfx::TransferMode".opaque
val GLContext = "driftfx::gl::GLContext".opaque

val PresentationHint = "driftfx::PresentationHint".enumType

val TransferModeId = typedef(unsigned_int, "driftfx::TransferModeId")

val Vec2i = struct(Module.DRIFTFX, "Vec2i", nativeName = "driftfx::math::Vec2i") {
    int("x", "")
    int("y", "")
}

val Vec2ui = struct(Module.DRIFTFX, "Vec2ui", nativeName = "driftfx::math::Vec2ui") {
    unsigned_int("x", "")
    unsigned_int("y", "")
}

val Vec2d = struct(Module.DRIFTFX, "Vec2d", nativeName = "driftfx::math::Vec2d") {
    double("x", "")
    double("y", "")
}