/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*
import vulkan.*

val SDL_vulkan = "SDLVulkan".nativeClassSDL("SDL_vulkan") {
    javaImport("org.lwjgl.vulkan.*")

    bool(
        "Vulkan_LoadLibrary",

        nullable..charUTF8.const.p("path")
    )

    SDL_FunctionPointer(
        "Vulkan_GetVkGetInstanceProcAddr",

        void()
    )

    void(
        "Vulkan_UnloadLibrary",

        void()
    )

    charASCII.const.p.const.p(
        "Vulkan_GetInstanceExtensions",

        AutoSizeResult..Uint32.p("count")
    )

    bool(
        "Vulkan_CreateSurface",

        SDL_Window.p("window"),
        VkInstance("instance"),
        nullable..VkAllocationCallbacks.const.p("allocator"),
        Check(1)..VkSurfaceKHR.p("surface")
    )

    void(
        "Vulkan_DestroySurface",

        VkInstance("instance"),
        VkSurfaceKHR("surface"),
        nullable..VkAllocationCallbacks.const.p("allocator")
    )

    bool(
        "Vulkan_GetPresentationSupport",

        VkInstance("instance"),
        VkPhysicalDevice("physicalDevice"),
        Uint32("queueFamilyIndex")
    )
}