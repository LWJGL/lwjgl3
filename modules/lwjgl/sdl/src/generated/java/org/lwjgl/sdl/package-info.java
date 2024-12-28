/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Contains bindings to the <a href="https://www.libsdl.org/">Simple DirectMedia Layer</a>, a cross-platform development library designed to provide low
 * level access to audio, keyboard, mouse, joystick, and graphics hardware via OpenGL/Direct3D/Metal/Vulkan. It is used by video playback software,
 * emulators, and popular games.
 * 
 * <h3>Resources</h3>
 * 
 * <ul>
 * <li><a href="https://wiki.libsdl.org/SDL3/FrontPage">Documentation</a></li>
 * <li><a href="https://github.com/libsdl-org/SDL">Source Repository</a></li>
 * </ul>
 * 
 * <h3>SDL header to Java class mapping</h3>
 * 
 * <table>
 * <tr><td>{@code SDL_asyncio.h}</td><td>{@link org.lwjgl.sdl.SDLAsyncIO SDLAsyncIO}</td></tr>
 * <tr><td>{@code SDL_audio.h}</td><td>{@link org.lwjgl.sdl.SDLAudio SDLAudio}</td></tr>
 * <tr><td>{@code SDL_blendmode.h}</td><td>{@link org.lwjgl.sdl.SDLBlendMode SDLBlendMode}</td></tr>
 * <tr><td>{@code SDL_camera.h}</td><td>{@link org.lwjgl.sdl.SDLCamera SDLCamera}</td></tr>
 * <tr><td>{@code SDL_clipboard.h}</td><td>{@link org.lwjgl.sdl.SDLClipboard SDLClipboard}</td></tr>
 * <tr><td>{@code SDL_cpuinfo.h}</td><td>{@link org.lwjgl.sdl.SDLCPUInfo SDLCPUInfo}</td></tr>
 * <tr><td>{@code SDL_dialog.h}</td><td>{@link org.lwjgl.sdl.SDLDialog SDLDialog}</td></tr>
 * <tr><td>{@code SDL_error.h}</td><td>{@link org.lwjgl.sdl.SDLError SDLError}</td></tr>
 * <tr><td>{@code SDL_events.h}</td><td>{@link org.lwjgl.sdl.SDLEvents SDLEvents}</td></tr>
 * <tr><td>{@code SDL_filesystem.h}</td><td>{@link org.lwjgl.sdl.SDLFileSystem SDLFileSystem}</td></tr>
 * <tr><td>{@code SDL_gamepad.h}</td><td>{@link org.lwjgl.sdl.SDLGamepad SDLGamepad}</td></tr>
 * <tr><td>{@code SDL_gpu.h}</td><td>{@link org.lwjgl.sdl.SDLGPU SDLGPU}</td></tr>
 * <tr><td>{@code SDL_guid.h}</td><td>{@link org.lwjgl.sdl.SDLGUID SDLGUID}</td></tr>
 * <tr><td>{@code SDL_haptic.h}</td><td>{@link org.lwjgl.sdl.SDLHaptic SDLHaptic}</td></tr>
 * <tr><td>{@code SDL_hidapi.h}</td><td>{@link org.lwjgl.sdl.SDLHIDAPI SDLHIDAPI}</td></tr>
 * <tr><td>{@code SDL_hints.h}</td><td>{@link org.lwjgl.sdl.SDLHints SDLHints}</td></tr>
 * <tr><td>{@code SDL_init.h}</td><td>{@link org.lwjgl.sdl.SDLInit SDLInit}</td></tr>
 * <tr><td>{@code SDL_iostream.h}</td><td>{@link org.lwjgl.sdl.SDLIOStream SDLIOStream}</td></tr>
 * <tr><td>{@code SDL_joystick.h}</td><td>{@link org.lwjgl.sdl.SDLJoystick SDLJoystick}</td></tr>
 * <tr><td>{@code SDL_keyboard.h}</td><td>{@link org.lwjgl.sdl.SDLKeyboard SDLKeyboard}</td></tr>
 * <tr><td>{@code SDL_keycode.h}</td><td>{@link org.lwjgl.sdl.SDLKeycode SDLKeycode}</td></tr>
 * <tr><td>{@code SDL_loadso.h}</td><td>{@link org.lwjgl.sdl.SDLLoadSO SDLLoadSO}</td></tr>
 * <tr><td>{@code SDL_locale.h}</td><td>{@link org.lwjgl.sdl.SDLLocale SDLLocale}</td></tr>
 * <tr><td>{@code SDL_log.h}</td><td>{@link org.lwjgl.sdl.SDLLog SDLLog}</td></tr>
 * <tr><td>{@code SDL_messagebox.h}</td><td>{@link org.lwjgl.sdl.SDLMessageBox SDLMessageBox}</td></tr>
 * <tr><td>{@code SDL_metal.h}</td><td>{@link org.lwjgl.sdl.SDLMetal SDLMetal}</td></tr>
 * <tr><td>{@code SDL_misc.h}</td><td>{@link org.lwjgl.sdl.SDLMisc SDLMisc}</td></tr>
 * <tr><td>{@code SDL_mouse.h}</td><td>{@link org.lwjgl.sdl.SDLMouse SDLMouse}</td></tr>
 * <tr><td>{@code SDL_pen.h}</td><td>{@link org.lwjgl.sdl.SDLPen SDLPen}</td></tr>
 * <tr><td>{@code SDL_pixels.h}</td><td>{@link org.lwjgl.sdl.SDLPixels SDLPixels}</td></tr>
 * <tr><td>{@code SDL_platform.h}</td><td>{@link org.lwjgl.sdl.SDLPlatform SDLPlatform}</td></tr>
 * <tr><td>{@code SDL_power.h}</td><td>{@link org.lwjgl.sdl.SDLPower SDLPower}</td></tr>
 * <tr><td>{@code SDL_properties.h}</td><td>{@link org.lwjgl.sdl.SDLProperties SDLProperties}</td></tr>
 * <tr><td>{@code SDL_rect.h}</td><td>{@link org.lwjgl.sdl.SDLRect SDLRect}</td></tr>
 * <tr><td>{@code SDL_render.h}</td><td>{@link org.lwjgl.sdl.SDLRender SDLRender}</td></tr>
 * <tr><td>{@code SDL_scancode.h}</td><td>{@link org.lwjgl.sdl.SDLScancode SDLScancode}</td></tr>
 * <tr><td>{@code SDL_sensor.h}</td><td>{@link org.lwjgl.sdl.SDLSensor SDLSensor}</td></tr>
 * <tr><td>{@code SDL_stdinc.h}</td><td>{@link org.lwjgl.sdl.SDLStdinc SDLStdinc}</td></tr>
 * <tr><td>{@code SDL_storage.h}</td><td>{@link org.lwjgl.sdl.SDLStorage SDLStorage}</td></tr>
 * <tr><td>{@code SDL_surface.h}</td><td>{@link org.lwjgl.sdl.SDLSurface SDLSurface}</td></tr>
 * <tr><td>{@code SDL_system.h}</td><td>{@link org.lwjgl.sdl.SDLSystem SDLSystem}</td></tr>
 * <tr><td>{@code SDL_thread.h}</td><td>{@link org.lwjgl.sdl.SDLThread SDLThread}</td></tr>
 * <tr><td>{@code SDL_time.h}</td><td>{@link org.lwjgl.sdl.SDLTime SDLTime}</td></tr>
 * <tr><td>{@code SDL_timer.h}</td><td>{@link org.lwjgl.sdl.SDLTimer SDLTimer}</td></tr>
 * <tr><td>{@code SDL_touch.h}</td><td>{@link org.lwjgl.sdl.SDLTouch SDLTouch}</td></tr>
 * <tr><td>{@code SDL_tray.h}</td><td>{@link org.lwjgl.sdl.SDLTray SDLTray}</td></tr>
 * <tr><td>{@code SDL_version.h}</td><td>{@link org.lwjgl.sdl.SDLVersion SDLVersion}</td></tr>
 * <tr><td>{@code SDL_video.h}</td><td>{@link org.lwjgl.sdl.SDLVideo SDLVideo}</td></tr>
 * <tr><td>{@code SDL_vulkan.h}</td><td>{@link org.lwjgl.sdl.SDLVulkan SDLVulkan}</td></tr>
 * </table>
 */
@org.jspecify.annotations.NullMarked
package org.lwjgl.sdl;

