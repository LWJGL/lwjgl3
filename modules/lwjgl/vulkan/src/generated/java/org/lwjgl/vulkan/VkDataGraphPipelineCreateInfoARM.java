/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkDataGraphPipelineCreateInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCreateFlags2KHR flags;
 *     VkPipelineLayout layout;
 *     uint32_t resourceInfoCount;
 *     {@link VkDataGraphPipelineResourceInfoARM VkDataGraphPipelineResourceInfoARM} const * pResourceInfos;
 * }</code></pre>
 */
public class VkDataGraphPipelineCreateInfoARM extends Struct<VkDataGraphPipelineCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        LAYOUT,
        RESOURCEINFOCOUNT,
        PRESOURCEINFOS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        RESOURCEINFOCOUNT = layout.offsetof(4);
        PRESOURCEINFOS = layout.offsetof(5);
    }

    protected VkDataGraphPipelineCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineCreateInfoARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkPipelineCreateFlags2KHR")
    public long flags() { return nflags(address()); }
    /** @return the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** @return the value of the {@code resourceInfoCount} field. */
    @NativeType("uint32_t")
    public int resourceInfoCount() { return nresourceInfoCount(address()); }
    /** @return a {@link VkDataGraphPipelineResourceInfoARM.Buffer} view of the struct array pointed to by the {@code pResourceInfos} field. */
    @NativeType("VkDataGraphPipelineResourceInfoARM const *")
    public VkDataGraphPipelineResourceInfoARM.@Nullable Buffer pResourceInfos() { return npResourceInfos(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineCreateInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineCreateInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDataGraphPipelineBuiltinModelCreateInfoQCOM} value to the {@code pNext} chain. */
    public VkDataGraphPipelineCreateInfoARM pNext(VkDataGraphPipelineBuiltinModelCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDataGraphPipelineCompilerControlCreateInfoARM} value to the {@code pNext} chain. */
    public VkDataGraphPipelineCreateInfoARM pNext(VkDataGraphPipelineCompilerControlCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDataGraphPipelineIdentifierCreateInfoARM} value to the {@code pNext} chain. */
    public VkDataGraphPipelineCreateInfoARM pNext(VkDataGraphPipelineIdentifierCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDataGraphPipelineShaderModuleCreateInfoARM} value to the {@code pNext} chain. */
    public VkDataGraphPipelineCreateInfoARM pNext(VkDataGraphPipelineShaderModuleCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDataGraphProcessingEngineCreateInfoARM} value to the {@code pNext} chain. */
    public VkDataGraphPipelineCreateInfoARM pNext(VkDataGraphProcessingEngineCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
    public VkDataGraphPipelineCreateInfoARM pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkDataGraphPipelineCreateInfoARM pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkShaderModuleCreateInfo} value to the {@code pNext} chain. */
    public VkDataGraphPipelineCreateInfoARM pNext(VkShaderModuleCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkDataGraphPipelineCreateInfoARM flags(@NativeType("VkPipelineCreateFlags2KHR") long value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkDataGraphPipelineCreateInfoARM layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkDataGraphPipelineResourceInfoARM.Buffer} to the {@code pResourceInfos} field. */
    public VkDataGraphPipelineCreateInfoARM pResourceInfos(@NativeType("VkDataGraphPipelineResourceInfoARM const *") VkDataGraphPipelineResourceInfoARM.@Nullable Buffer value) { npResourceInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineCreateInfoARM set(
        int sType,
        long pNext,
        long flags,
        long layout,
        VkDataGraphPipelineResourceInfoARM.@Nullable Buffer pResourceInfos
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        layout(layout);
        pResourceInfos(pResourceInfos);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineCreateInfoARM set(VkDataGraphPipelineCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineCreateInfoARM malloc() {
        return new VkDataGraphPipelineCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineCreateInfoARM calloc() {
        return new VkDataGraphPipelineCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineCreateInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineCreateInfoARM create(long address) {
        return new VkDataGraphPipelineCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + VkDataGraphPipelineCreateInfoARM.FLAGS); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkDataGraphPipelineCreateInfoARM.LAYOUT); }
    /** Unsafe version of {@link #resourceInfoCount}. */
    public static int nresourceInfoCount(long struct) { return memGetInt(struct + VkDataGraphPipelineCreateInfoARM.RESOURCEINFOCOUNT); }
    /** Unsafe version of {@link #pResourceInfos}. */
    public static VkDataGraphPipelineResourceInfoARM.@Nullable Buffer npResourceInfos(long struct) { return VkDataGraphPipelineResourceInfoARM.createSafe(memGetAddress(struct + VkDataGraphPipelineCreateInfoARM.PRESOURCEINFOS), nresourceInfoCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineCreateInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + VkDataGraphPipelineCreateInfoARM.FLAGS, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkDataGraphPipelineCreateInfoARM.LAYOUT, value); }
    /** Sets the specified value to the {@code resourceInfoCount} field of the specified {@code struct}. */
    public static void nresourceInfoCount(long struct, int value) { memPutInt(struct + VkDataGraphPipelineCreateInfoARM.RESOURCEINFOCOUNT, value); }
    /** Unsafe version of {@link #pResourceInfos(VkDataGraphPipelineResourceInfoARM.Buffer) pResourceInfos}. */
    public static void npResourceInfos(long struct, VkDataGraphPipelineResourceInfoARM.@Nullable Buffer value) { memPutAddress(struct + VkDataGraphPipelineCreateInfoARM.PRESOURCEINFOS, memAddressSafe(value)); nresourceInfoCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nresourceInfoCount(struct) != 0) {
            check(memGetAddress(struct + VkDataGraphPipelineCreateInfoARM.PRESOURCEINFOS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineCreateInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkDataGraphPipelineCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineCreateInfoARM.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineCreateFlags2KHR")
        public long flags() { return VkDataGraphPipelineCreateInfoARM.nflags(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkDataGraphPipelineCreateInfoARM.nlayout(address()); }
        /** @return the value of the {@code resourceInfoCount} field. */
        @NativeType("uint32_t")
        public int resourceInfoCount() { return VkDataGraphPipelineCreateInfoARM.nresourceInfoCount(address()); }
        /** @return a {@link VkDataGraphPipelineResourceInfoARM.Buffer} view of the struct array pointed to by the {@code pResourceInfos} field. */
        @NativeType("VkDataGraphPipelineResourceInfoARM const *")
        public VkDataGraphPipelineResourceInfoARM.@Nullable Buffer pResourceInfos() { return VkDataGraphPipelineCreateInfoARM.npResourceInfos(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineCreateInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineCreateInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineCreateInfoARM.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDataGraphPipelineBuiltinModelCreateInfoQCOM} value to the {@code pNext} chain. */
        public VkDataGraphPipelineCreateInfoARM.Buffer pNext(VkDataGraphPipelineBuiltinModelCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDataGraphPipelineCompilerControlCreateInfoARM} value to the {@code pNext} chain. */
        public VkDataGraphPipelineCreateInfoARM.Buffer pNext(VkDataGraphPipelineCompilerControlCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDataGraphPipelineIdentifierCreateInfoARM} value to the {@code pNext} chain. */
        public VkDataGraphPipelineCreateInfoARM.Buffer pNext(VkDataGraphPipelineIdentifierCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDataGraphPipelineShaderModuleCreateInfoARM} value to the {@code pNext} chain. */
        public VkDataGraphPipelineCreateInfoARM.Buffer pNext(VkDataGraphPipelineShaderModuleCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDataGraphProcessingEngineCreateInfoARM} value to the {@code pNext} chain. */
        public VkDataGraphPipelineCreateInfoARM.Buffer pNext(VkDataGraphProcessingEngineCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
        public VkDataGraphPipelineCreateInfoARM.Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkDataGraphPipelineCreateInfoARM.Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkShaderModuleCreateInfo} value to the {@code pNext} chain. */
        public VkDataGraphPipelineCreateInfoARM.Buffer pNext(VkShaderModuleCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkDataGraphPipelineCreateInfoARM.Buffer flags(@NativeType("VkPipelineCreateFlags2KHR") long value) { VkDataGraphPipelineCreateInfoARM.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkDataGraphPipelineCreateInfoARM.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkDataGraphPipelineCreateInfoARM.nlayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkDataGraphPipelineResourceInfoARM.Buffer} to the {@code pResourceInfos} field. */
        public VkDataGraphPipelineCreateInfoARM.Buffer pResourceInfos(@NativeType("VkDataGraphPipelineResourceInfoARM const *") VkDataGraphPipelineResourceInfoARM.@Nullable Buffer value) { VkDataGraphPipelineCreateInfoARM.npResourceInfos(address(), value); return this; }

    }

}