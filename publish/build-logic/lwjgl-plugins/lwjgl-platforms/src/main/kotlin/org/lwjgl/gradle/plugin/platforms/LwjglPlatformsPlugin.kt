/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.gradle.plugin.platforms

import org.gradle.api.*

class Platform internal constructor(
    val os: String,
    val arch: String
) {
    fun classifier(): String {
        return if (arch == "x64")
            "natives-${os}"
        else
            "natives-${os}-${arch}"
    }
}

class PlatformGroup internal constructor(
    internal vararg val platforms: Platform
) {
    internal fun forEach(action: (Platform) -> Unit) = platforms.forEach(action)
}

class NativeRequirement internal constructor()

open class LwjglPlatformsExtension {
    val FREEBSD_X64: Platform = Platform("freebsd", "x64")
    val LINUX_X64: Platform = Platform("linux", "x64")
    val LINUX_ARM64: Platform = Platform("linux", "arm64")
    val LINUX_ARM32: Platform = Platform("linux", "arm32")
    val LINUX_PPC64LE: Platform = Platform("linux", "ppc64le")
    val LINUX_RISCV64: Platform = Platform("linux", "riscv64")
    val MACOS_X64: Platform = Platform("macos", "x64")
    val MACOS_ARM64: Platform = Platform("macos", "arm64")
    val WINDOWS_X64: Platform = Platform("windows", "x64")
    val WINDOWS_X86: Platform = Platform("windows", "x86")
    val WINDOWS_ARM64: Platform = Platform("windows", "arm64")

    val FREEBSD: PlatformGroup = PlatformGroup(FREEBSD_X64)
    val LINUX: PlatformGroup = PlatformGroup(LINUX_X64, LINUX_ARM64, LINUX_ARM32, LINUX_PPC64LE, LINUX_RISCV64)
    val MACOS: PlatformGroup = PlatformGroup(MACOS_X64, MACOS_ARM64)
    val WINDOWS: PlatformGroup = PlatformGroup(WINDOWS_X64, WINDOWS_X86, WINDOWS_ARM64)
    val ALL: PlatformGroup = PlatformGroup(*FREEBSD.platforms, *LINUX.platforms, *MACOS.platforms, *WINDOWS.platforms)

    val NATIVE_REQUIRED: NativeRequirement = NativeRequirement()
    val NATIVE_OPTIONAL: NativeRequirement = NativeRequirement()

    private val platformMap = mutableMapOf<Platform, NativeRequirement>()
    private val actions = mutableListOf<(Platform, Boolean) -> Unit>()

    fun addSupport(platform: Platform, nativeRequirement: NativeRequirement) {
        platformMap.put(platform, nativeRequirement)
        actions.forEach { action ->
            action.invoke(platform, nativeRequirement == NATIVE_REQUIRED)
        }
    }

    fun addSupport(platformGroup: PlatformGroup, nativeRequirement: NativeRequirement) {
        platformGroup.forEach { platform ->
            addSupport(platform, nativeRequirement)
        }
    }

    fun all(action: (Platform, Boolean) -> Unit) {
        actions.add(action)
        platformMap.forEach { platform, nativeRequirement ->
            action.invoke(platform, nativeRequirement == NATIVE_REQUIRED)
        }
    }
}

class LwjglPlatformsPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.create(
            LwjglPlatformsExtension::class.java,
            "lwjglPlatforms",
            LwjglPlatformsExtension::class.java
        )
    }
}