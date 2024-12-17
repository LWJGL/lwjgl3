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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxGraphicsShaderGroupCount;
 *     uint32_t maxIndirectSequenceCount;
 *     uint32_t maxIndirectCommandsTokenCount;
 *     uint32_t maxIndirectCommandsStreamCount;
 *     uint32_t maxIndirectCommandsTokenOffset;
 *     uint32_t maxIndirectCommandsStreamStride;
 *     uint32_t minSequencesCountBufferOffsetAlignment;
 *     uint32_t minSequencesIndexBufferOffsetAlignment;
 *     uint32_t minIndirectCommandsBufferOffsetAlignment;
 * }}</pre>
 */
public class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV extends Struct<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXGRAPHICSSHADERGROUPCOUNT,
        MAXINDIRECTSEQUENCECOUNT,
        MAXINDIRECTCOMMANDSTOKENCOUNT,
        MAXINDIRECTCOMMANDSSTREAMCOUNT,
        MAXINDIRECTCOMMANDSTOKENOFFSET,
        MAXINDIRECTCOMMANDSSTREAMSTRIDE,
        MINSEQUENCESCOUNTBUFFEROFFSETALIGNMENT,
        MINSEQUENCESINDEXBUFFEROFFSETALIGNMENT,
        MININDIRECTCOMMANDSBUFFEROFFSETALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXGRAPHICSSHADERGROUPCOUNT = layout.offsetof(2);
        MAXINDIRECTSEQUENCECOUNT = layout.offsetof(3);
        MAXINDIRECTCOMMANDSTOKENCOUNT = layout.offsetof(4);
        MAXINDIRECTCOMMANDSSTREAMCOUNT = layout.offsetof(5);
        MAXINDIRECTCOMMANDSTOKENOFFSET = layout.offsetof(6);
        MAXINDIRECTCOMMANDSSTREAMSTRIDE = layout.offsetof(7);
        MINSEQUENCESCOUNTBUFFEROFFSETALIGNMENT = layout.offsetof(8);
        MINSEQUENCESINDEXBUFFEROFFSETALIGNMENT = layout.offsetof(9);
        MININDIRECTCOMMANDSBUFFEROFFSETALIGNMENT = layout.offsetof(10);
    }

    protected VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code maxGraphicsShaderGroupCount} field. */
    @NativeType("uint32_t")
    public int maxGraphicsShaderGroupCount() { return nmaxGraphicsShaderGroupCount(address()); }
    /** @return the value of the {@code maxIndirectSequenceCount} field. */
    @NativeType("uint32_t")
    public int maxIndirectSequenceCount() { return nmaxIndirectSequenceCount(address()); }
    /** @return the value of the {@code maxIndirectCommandsTokenCount} field. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsTokenCount() { return nmaxIndirectCommandsTokenCount(address()); }
    /** @return the value of the {@code maxIndirectCommandsStreamCount} field. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsStreamCount() { return nmaxIndirectCommandsStreamCount(address()); }
    /** @return the value of the {@code maxIndirectCommandsTokenOffset} field. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsTokenOffset() { return nmaxIndirectCommandsTokenOffset(address()); }
    /** @return the value of the {@code maxIndirectCommandsStreamStride} field. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsStreamStride() { return nmaxIndirectCommandsStreamStride(address()); }
    /** @return the value of the {@code minSequencesCountBufferOffsetAlignment} field. */
    @NativeType("uint32_t")
    public int minSequencesCountBufferOffsetAlignment() { return nminSequencesCountBufferOffsetAlignment(address()); }
    /** @return the value of the {@code minSequencesIndexBufferOffsetAlignment} field. */
    @NativeType("uint32_t")
    public int minSequencesIndexBufferOffsetAlignment() { return nminSequencesIndexBufferOffsetAlignment(address()); }
    /** @return the value of the {@code minIndirectCommandsBufferOffsetAlignment} field. */
    @NativeType("uint32_t")
    public int minIndirectCommandsBufferOffsetAlignment() { return nminIndirectCommandsBufferOffsetAlignment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV set(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV malloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV calloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV create(long address) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #maxGraphicsShaderGroupCount}. */
    public static int nmaxGraphicsShaderGroupCount(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXGRAPHICSSHADERGROUPCOUNT); }
    /** Unsafe version of {@link #maxIndirectSequenceCount}. */
    public static int nmaxIndirectSequenceCount(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXINDIRECTSEQUENCECOUNT); }
    /** Unsafe version of {@link #maxIndirectCommandsTokenCount}. */
    public static int nmaxIndirectCommandsTokenCount(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXINDIRECTCOMMANDSTOKENCOUNT); }
    /** Unsafe version of {@link #maxIndirectCommandsStreamCount}. */
    public static int nmaxIndirectCommandsStreamCount(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXINDIRECTCOMMANDSSTREAMCOUNT); }
    /** Unsafe version of {@link #maxIndirectCommandsTokenOffset}. */
    public static int nmaxIndirectCommandsTokenOffset(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXINDIRECTCOMMANDSTOKENOFFSET); }
    /** Unsafe version of {@link #maxIndirectCommandsStreamStride}. */
    public static int nmaxIndirectCommandsStreamStride(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXINDIRECTCOMMANDSSTREAMSTRIDE); }
    /** Unsafe version of {@link #minSequencesCountBufferOffsetAlignment}. */
    public static int nminSequencesCountBufferOffsetAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MINSEQUENCESCOUNTBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minSequencesIndexBufferOffsetAlignment}. */
    public static int nminSequencesIndexBufferOffsetAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MINSEQUENCESINDEXBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minIndirectCommandsBufferOffsetAlignment}. */
    public static int nminIndirectCommandsBufferOffsetAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MININDIRECTCOMMANDSBUFFEROFFSETALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.npNext(address()); }
        /** @return the value of the {@code maxGraphicsShaderGroupCount} field. */
        @NativeType("uint32_t")
        public int maxGraphicsShaderGroupCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxGraphicsShaderGroupCount(address()); }
        /** @return the value of the {@code maxIndirectSequenceCount} field. */
        @NativeType("uint32_t")
        public int maxIndirectSequenceCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectSequenceCount(address()); }
        /** @return the value of the {@code maxIndirectCommandsTokenCount} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsTokenCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsTokenCount(address()); }
        /** @return the value of the {@code maxIndirectCommandsStreamCount} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsStreamCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsStreamCount(address()); }
        /** @return the value of the {@code maxIndirectCommandsTokenOffset} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsTokenOffset() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsTokenOffset(address()); }
        /** @return the value of the {@code maxIndirectCommandsStreamStride} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsStreamStride() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsStreamStride(address()); }
        /** @return the value of the {@code minSequencesCountBufferOffsetAlignment} field. */
        @NativeType("uint32_t")
        public int minSequencesCountBufferOffsetAlignment() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nminSequencesCountBufferOffsetAlignment(address()); }
        /** @return the value of the {@code minSequencesIndexBufferOffsetAlignment} field. */
        @NativeType("uint32_t")
        public int minSequencesIndexBufferOffsetAlignment() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nminSequencesIndexBufferOffsetAlignment(address()); }
        /** @return the value of the {@code minIndirectCommandsBufferOffsetAlignment} field. */
        @NativeType("uint32_t")
        public int minIndirectCommandsBufferOffsetAlignment() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nminIndirectCommandsBufferOffsetAlignment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.npNext(address(), value); return this; }

    }

}