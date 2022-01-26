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
 * Structure specifying parameters of a newly created pipeline input assembly state.
 * 
 * <h5>Description</h5>
 * 
 * <p>Restarting the assembly of primitives discards the most recent index values if those elements formed an incomplete primitive, and restarts the primitive assembly using the subsequent indices, but only assembling the immediately following element through the end of the originally specified elements. The primitive restart index value comparison is performed before adding the {@code vertexOffset} value to the index value.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code topology} is {@link VK10#VK_PRIMITIVE_TOPOLOGY_POINT_LIST PRIMITIVE_TOPOLOGY_POINT_LIST}, {@link VK10#VK_PRIMITIVE_TOPOLOGY_LINE_LIST PRIMITIVE_TOPOLOGY_LINE_LIST}, {@link VK10#VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST PRIMITIVE_TOPOLOGY_TRIANGLE_LIST}, {@link VK10#VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY} or {@link VK10#VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY}, and {@code primitiveRestartEnable} is {@link VK10#VK_TRUE TRUE}, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitiveTopologyListRestart">{@code primitiveTopologyListRestart}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code topology} is {@link VK10#VK_PRIMITIVE_TOPOLOGY_PATCH_LIST PRIMITIVE_TOPOLOGY_PATCH_LIST}, and {@code primitiveRestartEnable} is {@link VK10#VK_TRUE TRUE}, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitiveTopologyPatchListRestart">{@code primitiveTopologyPatchListRestart}</a> feature <b>must</b> be enabled</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code topology} <b>must</b> not be any of {@link VK10#VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY}, {@link VK10#VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY}, {@link VK10#VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY} or {@link VK10#VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code topology} <b>must</b> not be {@link VK10#VK_PRIMITIVE_TOPOLOGY_PATCH_LIST PRIMITIVE_TOPOLOGY_PATCH_LIST}</li>
 * <li>If the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension is enabled, and {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR}{@code ::triangleFans} is {@link VK10#VK_FALSE FALSE}, {@code topology} <b>must</b> not be {@link VK10#VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN PRIMITIVE_TOPOLOGY_TRIANGLE_FAN}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code topology} <b>must</b> be a valid {@code VkPrimitiveTopology} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsPipelineCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineInputAssemblyStateCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineInputAssemblyStateCreateFlags {@link #flags};
 *     VkPrimitiveTopology {@link #topology};
 *     VkBool32 {@link #primitiveRestartEnable};
 * }</code></pre>
 */
public class VkPipelineInputAssemblyStateCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        TOPOLOGY,
        PRIMITIVERESTARTENABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TOPOLOGY = layout.offsetof(3);
        PRIMITIVERESTARTENABLE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPipelineInputAssemblyStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineInputAssemblyStateCreateInfo(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkPipelineInputAssemblyStateCreateFlags")
    public int flags() { return nflags(address()); }
    /** a {@code VkPrimitiveTopology} defining the primitive topology, as described below. */
    @NativeType("VkPrimitiveTopology")
    public int topology() { return ntopology(address()); }
    /** controls whether a special vertex index value is treated as restarting the assembly of primitives. This enable only applies to indexed draws ({@link VK10#vkCmdDrawIndexed CmdDrawIndexed}, {@link EXTMultiDraw#vkCmdDrawMultiIndexedEXT CmdDrawMultiIndexedEXT}, and {@link VK10#vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect}), and the special index value is either 0xFFFFFFFF when the {@code indexType} parameter of {@code vkCmdBindIndexBuffer} is equal to {@link VK10#VK_INDEX_TYPE_UINT32 INDEX_TYPE_UINT32}, 0xFF when {@code indexType} is equal to {@link EXTIndexTypeUint8#VK_INDEX_TYPE_UINT8_EXT INDEX_TYPE_UINT8_EXT}, or 0xFFFF when {@code indexType} is equal to {@link VK10#VK_INDEX_TYPE_UINT16 INDEX_TYPE_UINT16}. Primitive restart is not allowed for “list” topologies, unless one of the features <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitiveTopologyPatchListRestart">{@code primitiveTopologyPatchListRestart}</a> (for {@link VK10#VK_PRIMITIVE_TOPOLOGY_PATCH_LIST PRIMITIVE_TOPOLOGY_PATCH_LIST}) or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitiveTopologyListRestart">{@code primitiveTopologyListRestart}</a> (for all other list topologies) is enabled. */
    @NativeType("VkBool32")
    public boolean primitiveRestartEnable() { return nprimitiveRestartEnable(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineInputAssemblyStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO} value to the {@link #sType} field. */
    public VkPipelineInputAssemblyStateCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineInputAssemblyStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineInputAssemblyStateCreateInfo flags(@NativeType("VkPipelineInputAssemblyStateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #topology} field. */
    public VkPipelineInputAssemblyStateCreateInfo topology(@NativeType("VkPrimitiveTopology") int value) { ntopology(address(), value); return this; }
    /** Sets the specified value to the {@link #primitiveRestartEnable} field. */
    public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnable(@NativeType("VkBool32") boolean value) { nprimitiveRestartEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineInputAssemblyStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int topology,
        boolean primitiveRestartEnable
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        topology(topology);
        primitiveRestartEnable(primitiveRestartEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineInputAssemblyStateCreateInfo set(VkPipelineInputAssemblyStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineInputAssemblyStateCreateInfo malloc() {
        return wrap(VkPipelineInputAssemblyStateCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineInputAssemblyStateCreateInfo calloc() {
        return wrap(VkPipelineInputAssemblyStateCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineInputAssemblyStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineInputAssemblyStateCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineInputAssemblyStateCreateInfo create(long address) {
        return wrap(VkPipelineInputAssemblyStateCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineInputAssemblyStateCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineInputAssemblyStateCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineInputAssemblyStateCreateInfo malloc(MemoryStack stack) {
        return wrap(VkPipelineInputAssemblyStateCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineInputAssemblyStateCreateInfo calloc(MemoryStack stack) {
        return wrap(VkPipelineInputAssemblyStateCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineInputAssemblyStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineInputAssemblyStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineInputAssemblyStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #topology}. */
    public static int ntopology(long struct) { return UNSAFE.getInt(null, struct + VkPipelineInputAssemblyStateCreateInfo.TOPOLOGY); }
    /** Unsafe version of {@link #primitiveRestartEnable}. */
    public static int nprimitiveRestartEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineInputAssemblyStateCreateInfo.PRIMITIVERESTARTENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineInputAssemblyStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineInputAssemblyStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineInputAssemblyStateCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #topology(int) topology}. */
    public static void ntopology(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineInputAssemblyStateCreateInfo.TOPOLOGY, value); }
    /** Unsafe version of {@link #primitiveRestartEnable(boolean) primitiveRestartEnable}. */
    public static void nprimitiveRestartEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineInputAssemblyStateCreateInfo.PRIMITIVERESTARTENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineInputAssemblyStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineInputAssemblyStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineInputAssemblyStateCreateInfo ELEMENT_FACTORY = VkPipelineInputAssemblyStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineInputAssemblyStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineInputAssemblyStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineInputAssemblyStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineInputAssemblyStateCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineInputAssemblyStateCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkPipelineInputAssemblyStateCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineInputAssemblyStateCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkPipelineInputAssemblyStateCreateInfo#flags} field. */
        @NativeType("VkPipelineInputAssemblyStateCreateFlags")
        public int flags() { return VkPipelineInputAssemblyStateCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkPipelineInputAssemblyStateCreateInfo#topology} field. */
        @NativeType("VkPrimitiveTopology")
        public int topology() { return VkPipelineInputAssemblyStateCreateInfo.ntopology(address()); }
        /** @return the value of the {@link VkPipelineInputAssemblyStateCreateInfo#primitiveRestartEnable} field. */
        @NativeType("VkBool32")
        public boolean primitiveRestartEnable() { return VkPipelineInputAssemblyStateCreateInfo.nprimitiveRestartEnable(address()) != 0; }

        /** Sets the specified value to the {@link VkPipelineInputAssemblyStateCreateInfo#sType} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineInputAssemblyStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO} value to the {@link VkPipelineInputAssemblyStateCreateInfo#sType} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkPipelineInputAssemblyStateCreateInfo#pNext} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineInputAssemblyStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineInputAssemblyStateCreateInfo#flags} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer flags(@NativeType("VkPipelineInputAssemblyStateCreateFlags") int value) { VkPipelineInputAssemblyStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineInputAssemblyStateCreateInfo#topology} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer topology(@NativeType("VkPrimitiveTopology") int value) { VkPipelineInputAssemblyStateCreateInfo.ntopology(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineInputAssemblyStateCreateInfo#primitiveRestartEnable} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer primitiveRestartEnable(@NativeType("VkBool32") boolean value) { VkPipelineInputAssemblyStateCreateInfo.nprimitiveRestartEnable(address(), value ? 1 : 0); return this; }

    }

}