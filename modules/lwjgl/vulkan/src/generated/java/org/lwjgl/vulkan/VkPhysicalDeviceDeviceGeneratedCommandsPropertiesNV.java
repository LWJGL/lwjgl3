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
 * Structure describing push descriptor limits that can be supported by an implementation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to a structure extending this structure.</li>
 * <li>{@code maxGraphicsShaderGroupCount} &ndash; the maximum number of shader groups in {@link VkGraphicsPipelineShaderGroupsCreateInfoNV}.</li>
 * <li>{@code maxIndirectSequenceCount} &ndash; the maximum number of sequences in {@link VkGeneratedCommandsInfoNV} and in {@link VkGeneratedCommandsMemoryRequirementsInfoNV}.</li>
 * <li>{@code maxIndirectCommandsStreamCount} &ndash; the maximum number of streams in {@link VkIndirectCommandsLayoutCreateInfoNV}.</li>
 * <li>{@code maxIndirectCommandsTokenOffset} &ndash; the maximum offset in {@link VkIndirectCommandsLayoutTokenNV}.</li>
 * <li>{@code maxIndirectCommandsStreamStride} &ndash; the maximum stream stride in {@link VkIndirectCommandsLayoutCreateInfoNV}.</li>
 * <li>{@code minIndirectCommandsBufferOffsetAlignment} &ndash; the minimum alignment for memory addresses used in {@link VkIndirectCommandsStreamNV} and as preprocess buffer in {@link VkGeneratedCommandsInfoNV}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
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
 * }</code></pre>
 */
public class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code maxGraphicsShaderGroupCount} field. */
    @NativeType("uint32_t")
    public int maxGraphicsShaderGroupCount() { return nmaxGraphicsShaderGroupCount(address()); }
    /** Returns the value of the {@code maxIndirectSequenceCount} field. */
    @NativeType("uint32_t")
    public int maxIndirectSequenceCount() { return nmaxIndirectSequenceCount(address()); }
    /** Returns the value of the {@code maxIndirectCommandsTokenCount} field. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsTokenCount() { return nmaxIndirectCommandsTokenCount(address()); }
    /** Returns the value of the {@code maxIndirectCommandsStreamCount} field. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsStreamCount() { return nmaxIndirectCommandsStreamCount(address()); }
    /** Returns the value of the {@code maxIndirectCommandsTokenOffset} field. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsTokenOffset() { return nmaxIndirectCommandsTokenOffset(address()); }
    /** Returns the value of the {@code maxIndirectCommandsStreamStride} field. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsStreamStride() { return nmaxIndirectCommandsStreamStride(address()); }
    /** Returns the value of the {@code minSequencesCountBufferOffsetAlignment} field. */
    @NativeType("uint32_t")
    public int minSequencesCountBufferOffsetAlignment() { return nminSequencesCountBufferOffsetAlignment(address()); }
    /** Returns the value of the {@code minSequencesIndexBufferOffsetAlignment} field. */
    @NativeType("uint32_t")
    public int minSequencesIndexBufferOffsetAlignment() { return nminSequencesIndexBufferOffsetAlignment(address()); }
    /** Returns the value of the {@code minIndirectCommandsBufferOffsetAlignment} field. */
    @NativeType("uint32_t")
    public int minIndirectCommandsBufferOffsetAlignment() { return nminIndirectCommandsBufferOffsetAlignment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
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
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV calloc() {
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV create(long address) {
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #maxGraphicsShaderGroupCount}. */
    public static int nmaxGraphicsShaderGroupCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXGRAPHICSSHADERGROUPCOUNT); }
    /** Unsafe version of {@link #maxIndirectSequenceCount}. */
    public static int nmaxIndirectSequenceCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXINDIRECTSEQUENCECOUNT); }
    /** Unsafe version of {@link #maxIndirectCommandsTokenCount}. */
    public static int nmaxIndirectCommandsTokenCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXINDIRECTCOMMANDSTOKENCOUNT); }
    /** Unsafe version of {@link #maxIndirectCommandsStreamCount}. */
    public static int nmaxIndirectCommandsStreamCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXINDIRECTCOMMANDSSTREAMCOUNT); }
    /** Unsafe version of {@link #maxIndirectCommandsTokenOffset}. */
    public static int nmaxIndirectCommandsTokenOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXINDIRECTCOMMANDSTOKENOFFSET); }
    /** Unsafe version of {@link #maxIndirectCommandsStreamStride}. */
    public static int nmaxIndirectCommandsStreamStride(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MAXINDIRECTCOMMANDSSTREAMSTRIDE); }
    /** Unsafe version of {@link #minSequencesCountBufferOffsetAlignment}. */
    public static int nminSequencesCountBufferOffsetAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MINSEQUENCESCOUNTBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minSequencesIndexBufferOffsetAlignment}. */
    public static int nminSequencesIndexBufferOffsetAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MINSEQUENCESINDEXBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minIndirectCommandsBufferOffsetAlignment}. */
    public static int nminIndirectCommandsBufferOffsetAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.MININDIRECTCOMMANDSBUFFEROFFSETALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.npNext(address()); }
        /** Returns the value of the {@code maxGraphicsShaderGroupCount} field. */
        @NativeType("uint32_t")
        public int maxGraphicsShaderGroupCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxGraphicsShaderGroupCount(address()); }
        /** Returns the value of the {@code maxIndirectSequenceCount} field. */
        @NativeType("uint32_t")
        public int maxIndirectSequenceCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectSequenceCount(address()); }
        /** Returns the value of the {@code maxIndirectCommandsTokenCount} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsTokenCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsTokenCount(address()); }
        /** Returns the value of the {@code maxIndirectCommandsStreamCount} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsStreamCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsStreamCount(address()); }
        /** Returns the value of the {@code maxIndirectCommandsTokenOffset} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsTokenOffset() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsTokenOffset(address()); }
        /** Returns the value of the {@code maxIndirectCommandsStreamStride} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsStreamStride() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsStreamStride(address()); }
        /** Returns the value of the {@code minSequencesCountBufferOffsetAlignment} field. */
        @NativeType("uint32_t")
        public int minSequencesCountBufferOffsetAlignment() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nminSequencesCountBufferOffsetAlignment(address()); }
        /** Returns the value of the {@code minSequencesIndexBufferOffsetAlignment} field. */
        @NativeType("uint32_t")
        public int minSequencesIndexBufferOffsetAlignment() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nminSequencesIndexBufferOffsetAlignment(address()); }
        /** Returns the value of the {@code minIndirectCommandsBufferOffsetAlignment} field. */
        @NativeType("uint32_t")
        public int minIndirectCommandsBufferOffsetAlignment() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nminIndirectCommandsBufferOffsetAlignment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.npNext(address(), value); return this; }

    }

}