/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the geometry data used to build an acceleration structure.
 * 
 * <h5>Description</h5>
 * 
 * <p>Only one of {@code pGeometries} or {@code ppGeometries} <b>can</b> be a valid pointer, the other <b>must</b> be {@code NULL}. Each element of the non-{@code NULL} array describes the data used to build each acceleration structure geometry.</p>
 * 
 * <p>The index of each element of the {@code pGeometries} or {@code ppGeometries} members of {@link VkAccelerationStructureBuildGeometryInfoKHR} is used as the <em>geometry index</em> during ray traversal. The geometry index is available in ray shaders via the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-builtin-variables-raygeometryindex">{@code RayGeometryIndexKHR} built-in</a>, and is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shader-binding-table-hit-shader-indexing">used to determine hit and intersection shaders executed during traversal</a>. The geometry index is available to ray queries via the {@code OpRayQueryGetIntersectionGeometryIndexKHR} instruction.</p>
 * 
 * <p>Setting {@link NVRayTracingMotionBlur#VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV} in {@code flags} indicates that this build is a motion top level acceleration structure. A motion top level uses instances of format {@link VkAccelerationStructureMotionInstanceNV} if {@link VkAccelerationStructureGeometryInstancesDataKHR}{@code ::arrayOfPointers} is {@link VK10#VK_FALSE FALSE}.</p>
 * 
 * <p>If {@link VkAccelerationStructureGeometryInstancesDataKHR}{@code ::arrayOfPointers} is {@link VK10#VK_TRUE TRUE}, the pointer for any given element of the array of instance pointers consists of 4 bits of {@code VkAccelerationStructureMotionInstanceTypeNV} in the low 4 bits of the pointer identifying the type of structure at the pointer. The device address accessed is the value in the array with the low 4 bits set to zero. The structure at the pointer is one of {@link VkAccelerationStructureInstanceKHR}, {@link VkAccelerationStructureMatrixMotionInstanceNV} or {@link VkAccelerationStructureSRTMotionInstanceNV}, depending on the type value encoded in the low 4 bits.</p>
 * 
 * <p>A top level acceleration structure with either motion instances or vertex motion in its instances <b>must</b> set {@link NVRayTracingMotionBlur#VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV} in {@code flags}.</p>
 * 
 * <p>Members {@code srcAccelerationStructure} and {@code dstAccelerationStructure} <b>may</b> be the same or different for an update operation (when {@code mode} is {@link KHRAccelerationStructure#VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}). If they are the same, the update happens in-place. Otherwise, the target acceleration structure is updated and the source is not modified.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> not be {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}</li>
 * <li>Only one of {@code pGeometries} or {@code ppGeometries} <b>can</b> be a valid pointer, the other <b>must</b> be {@code NULL}</li>
 * <li>If {@code type} is {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR}, the {@code geometryType} member of elements of either {@code pGeometries} or {@code ppGeometries} <b>must</b> be {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}</li>
 * <li>If {@code type} is {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR}, {@code geometryCount} <b>must</b> be 1</li>
 * <li>If {@code type} is {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR} the {@code geometryType} member of elements of either {@code pGeometries} or {@code ppGeometries} <b>must</b> not be {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}</li>
 * <li>If {@code type} is {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR} then the {@code geometryType} member of each geometry in either {@code pGeometries} or {@code ppGeometries} <b>must</b> be the same</li>
 * <li>If {@code type} is {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR} then {@code geometryCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::maxGeometryCount}</li>
 * <li>If {@code type} is {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR} and the {@code geometryType} member of either {@code pGeometries} or {@code ppGeometries} is {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, the total number of AABBs in all geometries <b>must</b> be less than or equal to {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::maxPrimitiveCount}</li>
 * <li>If {@code type} is {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR} and the {@code geometryType} member of either {@code pGeometries} or {@code ppGeometries} is {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, the total number of triangles in all geometries <b>must</b> be less than or equal to {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::maxPrimitiveCount}</li>
 * <li>If {@code flags} has the {@link KHRAccelerationStructure#VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR} bit set, then it <b>must</b> not have the {@link KHRAccelerationStructure#VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR} bit set</li>
 * <li>If {@code dstAccelerationStructure} was created with {@link NVRayTracingMotionBlur#VK_ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV} set in {@link VkAccelerationStructureCreateInfoKHR}{@code ::flags}, {@link NVRayTracingMotionBlur#VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV} <b>must</b> be set in {@code flags}</li>
 * <li>If {@link NVRayTracingMotionBlur#VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV} is set in {@code flags}, {@code dstAccelerationStructure} <b>must</b> have been created with {@link NVRayTracingMotionBlur#VK_ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV} set in {@link VkAccelerationStructureCreateInfoKHR}{@code ::flags}</li>
 * <li>If {@link NVRayTracingMotionBlur#VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV} is set in {@code flags}, {@code type} <b>must</b> not be {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkAccelerationStructureTypeKHR} value</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkBuildAccelerationStructureFlagBitsKHR} values</li>
 * <li>If {@code geometryCount} is not 0, and {@code pGeometries} is not {@code NULL}, {@code pGeometries} <b>must</b> be a valid pointer to an array of {@code geometryCount} valid {@link VkAccelerationStructureGeometryKHR} structures</li>
 * <li>If {@code geometryCount} is not 0, and {@code ppGeometries} is not {@code NULL}, {@code ppGeometries} <b>must</b> be a valid pointer to an array of {@code geometryCount} valid pointers to valid {@link VkAccelerationStructureGeometryKHR} structures</li>
 * <li>Both of {@code dstAccelerationStructure}, and {@code srcAccelerationStructure} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureGeometryKHR}, {@link VkDeviceOrHostAddressKHR}, {@link KHRAccelerationStructure#vkBuildAccelerationStructuresKHR BuildAccelerationStructuresKHR}, {@link KHRAccelerationStructure#vkCmdBuildAccelerationStructuresIndirectKHR CmdBuildAccelerationStructuresIndirectKHR}, {@link KHRAccelerationStructure#vkCmdBuildAccelerationStructuresKHR CmdBuildAccelerationStructuresKHR}, {@link KHRAccelerationStructure#vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureBuildGeometryInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAccelerationStructureTypeKHR {@link #type};
 *     VkBuildAccelerationStructureFlagsKHR {@link #flags};
 *     VkBuildAccelerationStructureModeKHR {@link #mode};
 *     VkAccelerationStructureKHR {@link #srcAccelerationStructure};
 *     VkAccelerationStructureKHR {@link #dstAccelerationStructure};
 *     uint32_t {@link #geometryCount};
 *     {@link VkAccelerationStructureGeometryKHR VkAccelerationStructureGeometryKHR} const * {@link #pGeometries};
 *     {@link VkAccelerationStructureGeometryKHR VkAccelerationStructureGeometryKHR} const * const * {@link #ppGeometries};
 *     {@link VkDeviceOrHostAddressKHR VkDeviceOrHostAddressKHR} {@link #scratchData};
 * }</code></pre>
 */
public class VkAccelerationStructureBuildGeometryInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        FLAGS,
        MODE,
        SRCACCELERATIONSTRUCTURE,
        DSTACCELERATIONSTRUCTURE,
        GEOMETRYCOUNT,
        PGEOMETRIES,
        PPGEOMETRIES,
        SCRATCHDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressKHR.SIZEOF, VkDeviceOrHostAddressKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        MODE = layout.offsetof(4);
        SRCACCELERATIONSTRUCTURE = layout.offsetof(5);
        DSTACCELERATIONSTRUCTURE = layout.offsetof(6);
        GEOMETRYCOUNT = layout.offsetof(7);
        PGEOMETRIES = layout.offsetof(8);
        PPGEOMETRIES = layout.offsetof(9);
        SCRATCHDATA = layout.offsetof(10);
    }

    /**
     * Creates a {@code VkAccelerationStructureBuildGeometryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureBuildGeometryInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkAccelerationStructureTypeKHR} value specifying the type of acceleration structure being built. */
    @NativeType("VkAccelerationStructureTypeKHR")
    public int type() { return ntype(address()); }
    /** a bitmask of {@code VkBuildAccelerationStructureFlagBitsKHR} specifying additional parameters of the acceleration structure. */
    @NativeType("VkBuildAccelerationStructureFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a {@code VkBuildAccelerationStructureModeKHR} value specifying the type of operation to perform. */
    @NativeType("VkBuildAccelerationStructureModeKHR")
    public int mode() { return nmode(address()); }
    /** a pointer to an existing acceleration structure that is to be used to update the {@code dst} acceleration structure when {@code mode} is {@link KHRAccelerationStructure#VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}. */
    @NativeType("VkAccelerationStructureKHR")
    public long srcAccelerationStructure() { return nsrcAccelerationStructure(address()); }
    /** a pointer to the target acceleration structure for the build. */
    @NativeType("VkAccelerationStructureKHR")
    public long dstAccelerationStructure() { return ndstAccelerationStructure(address()); }
    /** specifies the number of geometries that will be built into {@code dstAccelerationStructure}. */
    @NativeType("uint32_t")
    public int geometryCount() { return ngeometryCount(address()); }
    /** a pointer to an array of {@link VkAccelerationStructureGeometryKHR} structures. */
    @Nullable
    @NativeType("VkAccelerationStructureGeometryKHR const *")
    public VkAccelerationStructureGeometryKHR.Buffer pGeometries() { return npGeometries(address()); }
    /** a pointer to an array of pointers to {@link VkAccelerationStructureGeometryKHR} structures. */
    @Nullable
    @NativeType("VkAccelerationStructureGeometryKHR const * const *")
    public PointerBuffer ppGeometries() { return nppGeometries(address()); }
    /** the device or host address to memory that will be used as scratch memory for the build. */
    public VkDeviceOrHostAddressKHR scratchData() { return nscratchData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR} value to the {@link #sType} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR type(@NativeType("VkAccelerationStructureTypeKHR") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR mode(@NativeType("VkBuildAccelerationStructureModeKHR") int value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@link #srcAccelerationStructure} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR srcAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { nsrcAccelerationStructure(address(), value); return this; }
    /** Sets the specified value to the {@link #dstAccelerationStructure} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR dstAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { ndstAccelerationStructure(address(), value); return this; }
    /** Sets the specified value to the {@link #geometryCount} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR geometryCount(@NativeType("uint32_t") int value) { ngeometryCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkAccelerationStructureGeometryKHR.Buffer} to the {@link #pGeometries} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR pGeometries(@Nullable @NativeType("VkAccelerationStructureGeometryKHR const *") VkAccelerationStructureGeometryKHR.Buffer value) { npGeometries(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #ppGeometries} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR ppGeometries(@Nullable @NativeType("VkAccelerationStructureGeometryKHR const * const *") PointerBuffer value) { nppGeometries(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@link #scratchData} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData(VkDeviceOrHostAddressKHR value) { nscratchData(address(), value); return this; }
    /** Passes the {@link #scratchData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(scratchData()); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureBuildGeometryInfoKHR set(
        int sType,
        long pNext,
        int type,
        int flags,
        int mode,
        long srcAccelerationStructure,
        long dstAccelerationStructure,
        int geometryCount,
        @Nullable VkAccelerationStructureGeometryKHR.Buffer pGeometries,
        @Nullable PointerBuffer ppGeometries,
        VkDeviceOrHostAddressKHR scratchData
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        flags(flags);
        mode(mode);
        srcAccelerationStructure(srcAccelerationStructure);
        dstAccelerationStructure(dstAccelerationStructure);
        geometryCount(geometryCount);
        pGeometries(pGeometries);
        ppGeometries(ppGeometries);
        scratchData(scratchData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureBuildGeometryInfoKHR set(VkAccelerationStructureBuildGeometryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildGeometryInfoKHR malloc() {
        return wrap(VkAccelerationStructureBuildGeometryInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildGeometryInfoKHR calloc() {
        return wrap(VkAccelerationStructureBuildGeometryInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureBuildGeometryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureBuildGeometryInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance for the specified memory address. */
    public static VkAccelerationStructureBuildGeometryInfoKHR create(long address) {
        return wrap(VkAccelerationStructureBuildGeometryInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureBuildGeometryInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureBuildGeometryInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR malloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureBuildGeometryInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR calloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureBuildGeometryInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.FLAGS); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.MODE); }
    /** Unsafe version of {@link #srcAccelerationStructure}. */
    public static long nsrcAccelerationStructure(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.SRCACCELERATIONSTRUCTURE); }
    /** Unsafe version of {@link #dstAccelerationStructure}. */
    public static long ndstAccelerationStructure(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.DSTACCELERATIONSTRUCTURE); }
    /** Unsafe version of {@link #geometryCount}. */
    public static int ngeometryCount(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.GEOMETRYCOUNT); }
    /** Unsafe version of {@link #pGeometries}. */
    @Nullable public static VkAccelerationStructureGeometryKHR.Buffer npGeometries(long struct) { return VkAccelerationStructureGeometryKHR.createSafe(memGetAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PGEOMETRIES), ngeometryCount(struct)); }
    /** Unsafe version of {@link #ppGeometries() ppGeometries}. */
    @Nullable public static PointerBuffer nppGeometries(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PPGEOMETRIES), ngeometryCount(struct)); }
    /** Unsafe version of {@link #scratchData}. */
    public static VkDeviceOrHostAddressKHR nscratchData(long struct) { return VkDeviceOrHostAddressKHR.create(struct + VkAccelerationStructureBuildGeometryInfoKHR.SCRATCHDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.MODE, value); }
    /** Unsafe version of {@link #srcAccelerationStructure(long) srcAccelerationStructure}. */
    public static void nsrcAccelerationStructure(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.SRCACCELERATIONSTRUCTURE, value); }
    /** Unsafe version of {@link #dstAccelerationStructure(long) dstAccelerationStructure}. */
    public static void ndstAccelerationStructure(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.DSTACCELERATIONSTRUCTURE, value); }
    /** Sets the specified value to the {@code geometryCount} field of the specified {@code struct}. */
    public static void ngeometryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureBuildGeometryInfoKHR.GEOMETRYCOUNT, value); }
    /** Unsafe version of {@link #pGeometries(VkAccelerationStructureGeometryKHR.Buffer) pGeometries}. */
    public static void npGeometries(long struct, @Nullable VkAccelerationStructureGeometryKHR.Buffer value) { memPutAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PGEOMETRIES, memAddressSafe(value)); }
    /** Unsafe version of {@link #ppGeometries(PointerBuffer) ppGeometries}. */
    public static void nppGeometries(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PPGEOMETRIES, memAddressSafe(value)); }
    /** Unsafe version of {@link #scratchData(VkDeviceOrHostAddressKHR) scratchData}. */
    public static void nscratchData(long struct, VkDeviceOrHostAddressKHR value) { memCopy(value.address(), struct + VkAccelerationStructureBuildGeometryInfoKHR.SCRATCHDATA, VkDeviceOrHostAddressKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureBuildGeometryInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureBuildGeometryInfoKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureBuildGeometryInfoKHR ELEMENT_FACTORY = VkAccelerationStructureBuildGeometryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureBuildGeometryInfoKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkAccelerationStructureBuildGeometryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureBuildGeometryInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureBuildGeometryInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildGeometryInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureBuildGeometryInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildGeometryInfoKHR#type} field. */
        @NativeType("VkAccelerationStructureTypeKHR")
        public int type() { return VkAccelerationStructureBuildGeometryInfoKHR.ntype(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildGeometryInfoKHR#flags} field. */
        @NativeType("VkBuildAccelerationStructureFlagsKHR")
        public int flags() { return VkAccelerationStructureBuildGeometryInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildGeometryInfoKHR#mode} field. */
        @NativeType("VkBuildAccelerationStructureModeKHR")
        public int mode() { return VkAccelerationStructureBuildGeometryInfoKHR.nmode(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildGeometryInfoKHR#srcAccelerationStructure} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long srcAccelerationStructure() { return VkAccelerationStructureBuildGeometryInfoKHR.nsrcAccelerationStructure(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildGeometryInfoKHR#dstAccelerationStructure} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long dstAccelerationStructure() { return VkAccelerationStructureBuildGeometryInfoKHR.ndstAccelerationStructure(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildGeometryInfoKHR#geometryCount} field. */
        @NativeType("uint32_t")
        public int geometryCount() { return VkAccelerationStructureBuildGeometryInfoKHR.ngeometryCount(address()); }
        /** @return a {@link VkAccelerationStructureGeometryKHR.Buffer} view of the struct array pointed to by the {@link VkAccelerationStructureBuildGeometryInfoKHR#pGeometries} field. */
        @Nullable
        @NativeType("VkAccelerationStructureGeometryKHR const *")
        public VkAccelerationStructureGeometryKHR.Buffer pGeometries() { return VkAccelerationStructureBuildGeometryInfoKHR.npGeometries(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VkAccelerationStructureBuildGeometryInfoKHR#ppGeometries} field. */
        @Nullable
        @NativeType("VkAccelerationStructureGeometryKHR const * const *")
        public PointerBuffer ppGeometries() { return VkAccelerationStructureBuildGeometryInfoKHR.nppGeometries(address()); }
        /** @return a {@link VkDeviceOrHostAddressKHR} view of the {@link VkAccelerationStructureBuildGeometryInfoKHR#scratchData} field. */
        public VkDeviceOrHostAddressKHR scratchData() { return VkAccelerationStructureBuildGeometryInfoKHR.nscratchData(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureBuildGeometryInfoKHR#sType} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureBuildGeometryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR} value to the {@link VkAccelerationStructureBuildGeometryInfoKHR#sType} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR); }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildGeometryInfoKHR#pNext} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureBuildGeometryInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildGeometryInfoKHR#type} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer type(@NativeType("VkAccelerationStructureTypeKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildGeometryInfoKHR#flags} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildGeometryInfoKHR#mode} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer mode(@NativeType("VkBuildAccelerationStructureModeKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.nmode(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildGeometryInfoKHR#srcAccelerationStructure} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer srcAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { VkAccelerationStructureBuildGeometryInfoKHR.nsrcAccelerationStructure(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildGeometryInfoKHR#dstAccelerationStructure} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer dstAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { VkAccelerationStructureBuildGeometryInfoKHR.ndstAccelerationStructure(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildGeometryInfoKHR#geometryCount} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer geometryCount(@NativeType("uint32_t") int value) { VkAccelerationStructureBuildGeometryInfoKHR.ngeometryCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkAccelerationStructureGeometryKHR.Buffer} to the {@link VkAccelerationStructureBuildGeometryInfoKHR#pGeometries} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer pGeometries(@Nullable @NativeType("VkAccelerationStructureGeometryKHR const *") VkAccelerationStructureGeometryKHR.Buffer value) { VkAccelerationStructureBuildGeometryInfoKHR.npGeometries(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkAccelerationStructureBuildGeometryInfoKHR#ppGeometries} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer ppGeometries(@Nullable @NativeType("VkAccelerationStructureGeometryKHR const * const *") PointerBuffer value) { VkAccelerationStructureBuildGeometryInfoKHR.nppGeometries(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@link VkAccelerationStructureBuildGeometryInfoKHR#scratchData} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer scratchData(VkDeviceOrHostAddressKHR value) { VkAccelerationStructureBuildGeometryInfoKHR.nscratchData(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureBuildGeometryInfoKHR#scratchData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer scratchData(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(scratchData()); return this; }

    }

}