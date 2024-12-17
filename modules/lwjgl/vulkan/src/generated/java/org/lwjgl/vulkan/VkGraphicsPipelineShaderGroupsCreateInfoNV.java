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
 * <pre>{@code
 * struct VkGraphicsPipelineShaderGroupsCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t groupCount;
 *     {@link VkGraphicsShaderGroupCreateInfoNV VkGraphicsShaderGroupCreateInfoNV} const * pGroups;
 *     uint32_t pipelineCount;
 *     VkPipeline const * pPipelines;
 * }}</pre>
 */
public class VkGraphicsPipelineShaderGroupsCreateInfoNV extends Struct<VkGraphicsPipelineShaderGroupsCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GROUPCOUNT,
        PGROUPS,
        PIPELINECOUNT,
        PPIPELINES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GROUPCOUNT = layout.offsetof(2);
        PGROUPS = layout.offsetof(3);
        PIPELINECOUNT = layout.offsetof(4);
        PPIPELINES = layout.offsetof(5);
    }

    protected VkGraphicsPipelineShaderGroupsCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGraphicsPipelineShaderGroupsCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code groupCount} field. */
    @NativeType("uint32_t")
    public int groupCount() { return ngroupCount(address()); }
    /** @return a {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} view of the struct array pointed to by the {@code pGroups} field. */
    @NativeType("VkGraphicsShaderGroupCreateInfoNV const *")
    public VkGraphicsShaderGroupCreateInfoNV.@Nullable Buffer pGroups() { return npGroups(address()); }
    /** @return the value of the {@code pipelineCount} field. */
    @NativeType("uint32_t")
    public int pipelineCount() { return npipelineCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pPipelines} field. */
    @NativeType("VkPipeline const *")
    public @Nullable LongBuffer pPipelines() { return npPipelines(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} to the {@code pGroups} field. */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pGroups(@NativeType("VkGraphicsShaderGroupCreateInfoNV const *") VkGraphicsShaderGroupCreateInfoNV.@Nullable Buffer value) { npGroups(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pPipelines} field. */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pPipelines(@Nullable @NativeType("VkPipeline const *") LongBuffer value) { npPipelines(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV set(
        int sType,
        long pNext,
        VkGraphicsShaderGroupCreateInfoNV.@Nullable Buffer pGroups,
        @Nullable LongBuffer pPipelines
    ) {
        sType(sType);
        pNext(pNext);
        pGroups(pGroups);
        pPipelines(pPipelines);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV set(VkGraphicsPipelineShaderGroupsCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV malloc() {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV calloc() {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance for the specified memory address. */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV create(long address) {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGraphicsPipelineShaderGroupsCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkGraphicsPipelineShaderGroupsCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV malloc(MemoryStack stack) {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV calloc(MemoryStack stack) {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #groupCount}. */
    public static int ngroupCount(long struct) { return memGetInt(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.GROUPCOUNT); }
    /** Unsafe version of {@link #pGroups}. */
    public static VkGraphicsShaderGroupCreateInfoNV.@Nullable Buffer npGroups(long struct) { return VkGraphicsShaderGroupCreateInfoNV.createSafe(memGetAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PGROUPS), ngroupCount(struct)); }
    /** Unsafe version of {@link #pipelineCount}. */
    public static int npipelineCount(long struct) { return memGetInt(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PIPELINECOUNT); }
    /** Unsafe version of {@link #pPipelines() pPipelines}. */
    public static @Nullable LongBuffer npPipelines(long struct) { return memLongBufferSafe(memGetAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PPIPELINES), npipelineCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PNEXT, value); }
    /** Sets the specified value to the {@code groupCount} field of the specified {@code struct}. */
    public static void ngroupCount(long struct, int value) { memPutInt(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.GROUPCOUNT, value); }
    /** Unsafe version of {@link #pGroups(VkGraphicsShaderGroupCreateInfoNV.Buffer) pGroups}. */
    public static void npGroups(long struct, VkGraphicsShaderGroupCreateInfoNV.@Nullable Buffer value) { memPutAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PGROUPS, memAddressSafe(value)); ngroupCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code pipelineCount} field of the specified {@code struct}. */
    public static void npipelineCount(long struct, int value) { memPutInt(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PIPELINECOUNT, value); }
    /** Unsafe version of {@link #pPipelines(LongBuffer) pPipelines}. */
    public static void npPipelines(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PPIPELINES, memAddressSafe(value)); npipelineCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int groupCount = ngroupCount(struct);
        if (groupCount != 0) {
            long pGroups = memGetAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PGROUPS);
            check(pGroups);
            validate(pGroups, groupCount, VkGraphicsShaderGroupCreateInfoNV.SIZEOF, VkGraphicsShaderGroupCreateInfoNV::validate);
        }
        if (npipelineCount(struct) != 0) {
            check(memGetAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PPIPELINES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkGraphicsPipelineShaderGroupsCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkGraphicsPipelineShaderGroupsCreateInfoNV, Buffer> implements NativeResource {

        private static final VkGraphicsPipelineShaderGroupsCreateInfoNV ELEMENT_FACTORY = VkGraphicsPipelineShaderGroupsCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGraphicsPipelineShaderGroupsCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code groupCount} field. */
        @NativeType("uint32_t")
        public int groupCount() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.ngroupCount(address()); }
        /** @return a {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} view of the struct array pointed to by the {@code pGroups} field. */
        @NativeType("VkGraphicsShaderGroupCreateInfoNV const *")
        public VkGraphicsShaderGroupCreateInfoNV.@Nullable Buffer pGroups() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.npGroups(address()); }
        /** @return the value of the {@code pipelineCount} field. */
        @NativeType("uint32_t")
        public int pipelineCount() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.npipelineCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pPipelines} field. */
        @NativeType("VkPipeline const *")
        public @Nullable LongBuffer pPipelines() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.npPipelines(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} to the {@code pGroups} field. */
        public VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer pGroups(@NativeType("VkGraphicsShaderGroupCreateInfoNV const *") VkGraphicsShaderGroupCreateInfoNV.@Nullable Buffer value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.npGroups(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pPipelines} field. */
        public VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer pPipelines(@Nullable @NativeType("VkPipeline const *") LongBuffer value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.npPipelines(address(), value); return this; }

    }

}