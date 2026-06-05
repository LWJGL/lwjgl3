#!/bin/bash
#
# Prepare LWJGL native library dependencies for LoongArch64.
# On this architecture, prebuilt binaries are not available from build.lwjgl.org,
# so we use system-installed libraries instead.
#

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
DEST_BASE="${SCRIPT_DIR}/bin/libs/native/linux/loongarch64/org/lwjgl"

# Library mapping: module -> lib name -> system search pattern
declare -A LIB_MAP
LIB_MAP["freetype"]="libfreetype.so"
LIB_MAP["glfw"]="libglfw.so"
LIB_MAP["harfbuzz"]="libharfbuzz.so"
LIB_MAP["hwloc"]="libhwloc.so"
LIB_MAP["jemalloc"]="libjemalloc.so"
LIB_MAP["openal"]="libopenal.so"
LIB_MAP["opus"]="libopus.so"

# assimp needs special handling - it's in qt5 plugin dir
mkdir -p "${DEST_BASE}/assimp"
for f in libassimp.so libdraco.so; do
  syslib=$(find /usr/lib /usr/lib64 -name "${f}" -type f,l 2>/dev/null | head -1 || true)
  if [ -n "$syslib" ]; then
    cp -fL "$syslib" "${DEST_BASE}/assimp/${f}"
    echo "OK:   ${DEST_BASE}/assimp/${f}"
  else
    echo "SKIP: ${f} not found in system"
  fi
done

# Standard libraries
for mod in "${!LIB_MAP[@]}"; do
  lib="${LIB_MAP[$mod]}"
  mkdir -p "${DEST_BASE}/${mod}"
  
  # Direct match first, then try with versioned symlink resolution
  syslib=$(find /usr/lib /usr/lib64 -name "${lib}" -type f,l 2>/dev/null | head -1 || true)
  if [ -n "$syslib" ]; then
    cp -fL "$syslib" "${DEST_BASE}/${mod}/${lib}"
    echo "OK:   ${DEST_BASE}/${mod}/${lib}"
  else
    echo "SKIP: ${lib} (${mod}) not found in system"
  fi
done

# Modules that may not be available on system - create empty dirs
for mod in bgfx ktx openvr openxr shaderc spvc; do
  mkdir -p "${DEST_BASE}/${mod}"
done

# Create a touch file so that build system thinks dependencies are ready
touch "${SCRIPT_DIR}/bin/libs/native/linux/loongarch64/touch.txt"
echo ""
echo "Done. Prepared native libraries for LoongArch64 build."
echo "Run with: LWJGL_BUILD_OFFLINE=true ant compile-native-platform"
