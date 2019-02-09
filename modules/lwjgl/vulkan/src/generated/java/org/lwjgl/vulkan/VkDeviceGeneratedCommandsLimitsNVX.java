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
 * Structure specifying physical device limits.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXDeviceGeneratedCommands#VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVXDeviceGeneratedCommands#vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX GetPhysicalDeviceGeneratedCommandsPropertiesNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code maxIndirectCommandsLayoutTokenCount} &ndash; the maximum number of tokens in {@code VkIndirectCommandsLayoutNVX}.</li>
 * <li>{@code maxObjectEntryCounts} &ndash; the maximum number of entries per resource type in {@code VkObjectTableNVX}.</li>
 * <li>{@code minSequenceCountBufferOffsetAlignment} &ndash; the minimum alignment for memory addresses optionally used in {@code vkCmdProcessCommandsNVX}.</li>
 * <li>{@code minSequenceIndexBufferOffsetAlignment} &ndash; the minimum alignment for memory addresses optionally used in {@code vkCmdProcessCommandsNVX}.</li>
 * <li>{@code minCommandsTokenBufferOffsetAlignment} &ndash; the minimum alignment for memory addresses optionally used in {@code vkCmdProcessCommandsNVX}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceGeneratedCommandsLimitsNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t maxIndirectCommandsLayoutTokenCount;
 *     uint32_t maxObjectEntryCounts;
 *     uint32_t minSequenceCountBufferOffsetAlignment;
 *     uint32_t minSequenceIndexBufferOffsetAlignment;
 *     uint32_t minCommandsTokenBufferOffsetAlignment;
 * }</code></pre>
 */
public class VkDeviceGeneratedCommandsLimitsNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXINDIRECTCOMMANDSLAYOUTTOKENCOUNT,
        MAXOBJECTENTRYCOUNTS,
        MINSEQUENCECOUNTBUFFEROFFSETALIGNMENT,
        MINSEQUENCEINDEXBUFFEROFFSETALIGNMENT,
        MINCOMMANDSTOKENBUFFEROFFSETALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
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
        MAXINDIRECTCOMMANDSLAYOUTTOKENCOUNT = layout.offsetof(2);
        MAXOBJECTENTRYCOUNTS = layout.offsetof(3);
        MINSEQUENCECOUNTBUFFEROFFSETALIGNMENT = layout.offsetof(4);
        MINSEQUENCEINDEXBUFFEROFFSETALIGNMENT = layout.offsetof(5);
        MINCOMMANDSTOKENBUFFEROFFSETALIGNMENT = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkDeviceGeneratedCommandsLimitsNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGeneratedCommandsLimitsNVX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code maxIndirectCommandsLayoutTokenCount} field. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsLayoutTokenCount() { return nmaxIndirectCommandsLayoutTokenCount(address()); }
    /** Returns the value of the {@code maxObjectEntryCounts} field. */
    @NativeType("uint32_t")
    public int maxObjectEntryCounts() { return nmaxObjectEntryCounts(address()); }
    /** Returns the value of the {@code minSequenceCountBufferOffsetAlignment} field. */
    @NativeType("uint32_t")
    public int minSequenceCountBufferOffsetAlignment() { return nminSequenceCountBufferOffsetAlignment(address()); }
    /** Returns the value of the {@code minSequenceIndexBufferOffsetAlignment} field. */
    @NativeType("uint32_t")
    public int minSequenceIndexBufferOffsetAlignment() { return nminSequenceIndexBufferOffsetAlignment(address()); }
    /** Returns the value of the {@code minCommandsTokenBufferOffsetAlignment} field. */
    @NativeType("uint32_t")
    public int minCommandsTokenBufferOffsetAlignment() { return nminCommandsTokenBufferOffsetAlignment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGeneratedCommandsLimitsNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGeneratedCommandsLimitsNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maxIndirectCommandsLayoutTokenCount} field. */
    public VkDeviceGeneratedCommandsLimitsNVX maxIndirectCommandsLayoutTokenCount(@NativeType("uint32_t") int value) { nmaxIndirectCommandsLayoutTokenCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxObjectEntryCounts} field. */
    public VkDeviceGeneratedCommandsLimitsNVX maxObjectEntryCounts(@NativeType("uint32_t") int value) { nmaxObjectEntryCounts(address(), value); return this; }
    /** Sets the specified value to the {@code minSequenceCountBufferOffsetAlignment} field. */
    public VkDeviceGeneratedCommandsLimitsNVX minSequenceCountBufferOffsetAlignment(@NativeType("uint32_t") int value) { nminSequenceCountBufferOffsetAlignment(address(), value); return this; }
    /** Sets the specified value to the {@code minSequenceIndexBufferOffsetAlignment} field. */
    public VkDeviceGeneratedCommandsLimitsNVX minSequenceIndexBufferOffsetAlignment(@NativeType("uint32_t") int value) { nminSequenceIndexBufferOffsetAlignment(address(), value); return this; }
    /** Sets the specified value to the {@code minCommandsTokenBufferOffsetAlignment} field. */
    public VkDeviceGeneratedCommandsLimitsNVX minCommandsTokenBufferOffsetAlignment(@NativeType("uint32_t") int value) { nminCommandsTokenBufferOffsetAlignment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGeneratedCommandsLimitsNVX set(
        int sType,
        long pNext,
        int maxIndirectCommandsLayoutTokenCount,
        int maxObjectEntryCounts,
        int minSequenceCountBufferOffsetAlignment,
        int minSequenceIndexBufferOffsetAlignment,
        int minCommandsTokenBufferOffsetAlignment
    ) {
        sType(sType);
        pNext(pNext);
        maxIndirectCommandsLayoutTokenCount(maxIndirectCommandsLayoutTokenCount);
        maxObjectEntryCounts(maxObjectEntryCounts);
        minSequenceCountBufferOffsetAlignment(minSequenceCountBufferOffsetAlignment);
        minSequenceIndexBufferOffsetAlignment(minSequenceIndexBufferOffsetAlignment);
        minCommandsTokenBufferOffsetAlignment(minCommandsTokenBufferOffsetAlignment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGeneratedCommandsLimitsNVX set(VkDeviceGeneratedCommandsLimitsNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGeneratedCommandsLimitsNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGeneratedCommandsLimitsNVX malloc() {
        return wrap(VkDeviceGeneratedCommandsLimitsNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceGeneratedCommandsLimitsNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGeneratedCommandsLimitsNVX calloc() {
        return wrap(VkDeviceGeneratedCommandsLimitsNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceGeneratedCommandsLimitsNVX} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGeneratedCommandsLimitsNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceGeneratedCommandsLimitsNVX.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGeneratedCommandsLimitsNVX} instance for the specified memory address. */
    public static VkDeviceGeneratedCommandsLimitsNVX create(long address) {
        return wrap(VkDeviceGeneratedCommandsLimitsNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGeneratedCommandsLimitsNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceGeneratedCommandsLimitsNVX.class, address);
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsLimitsNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsLimitsNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsLimitsNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsLimitsNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsLimitsNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsLimitsNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceGeneratedCommandsLimitsNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsLimitsNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGeneratedCommandsLimitsNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGeneratedCommandsLimitsNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceGeneratedCommandsLimitsNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDeviceGeneratedCommandsLimitsNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceGeneratedCommandsLimitsNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDeviceGeneratedCommandsLimitsNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGeneratedCommandsLimitsNVX mallocStack(MemoryStack stack) {
        return wrap(VkDeviceGeneratedCommandsLimitsNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceGeneratedCommandsLimitsNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGeneratedCommandsLimitsNVX callocStack(MemoryStack stack) {
        return wrap(VkDeviceGeneratedCommandsLimitsNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsLimitsNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsLimitsNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsLimitsNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsLimitsNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsLimitsNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsLimitsNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsLimitsNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsLimitsNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGeneratedCommandsLimitsNVX.PNEXT); }
    /** Unsafe version of {@link #maxIndirectCommandsLayoutTokenCount}. */
    public static int nmaxIndirectCommandsLayoutTokenCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.MAXINDIRECTCOMMANDSLAYOUTTOKENCOUNT); }
    /** Unsafe version of {@link #maxObjectEntryCounts}. */
    public static int nmaxObjectEntryCounts(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.MAXOBJECTENTRYCOUNTS); }
    /** Unsafe version of {@link #minSequenceCountBufferOffsetAlignment}. */
    public static int nminSequenceCountBufferOffsetAlignment(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.MINSEQUENCECOUNTBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minSequenceIndexBufferOffsetAlignment}. */
    public static int nminSequenceIndexBufferOffsetAlignment(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.MINSEQUENCEINDEXBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minCommandsTokenBufferOffsetAlignment}. */
    public static int nminCommandsTokenBufferOffsetAlignment(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.MINCOMMANDSTOKENBUFFEROFFSETALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGeneratedCommandsLimitsNVX.PNEXT, value); }
    /** Unsafe version of {@link #maxIndirectCommandsLayoutTokenCount(int) maxIndirectCommandsLayoutTokenCount}. */
    public static void nmaxIndirectCommandsLayoutTokenCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.MAXINDIRECTCOMMANDSLAYOUTTOKENCOUNT, value); }
    /** Unsafe version of {@link #maxObjectEntryCounts(int) maxObjectEntryCounts}. */
    public static void nmaxObjectEntryCounts(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.MAXOBJECTENTRYCOUNTS, value); }
    /** Unsafe version of {@link #minSequenceCountBufferOffsetAlignment(int) minSequenceCountBufferOffsetAlignment}. */
    public static void nminSequenceCountBufferOffsetAlignment(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.MINSEQUENCECOUNTBUFFEROFFSETALIGNMENT, value); }
    /** Unsafe version of {@link #minSequenceIndexBufferOffsetAlignment(int) minSequenceIndexBufferOffsetAlignment}. */
    public static void nminSequenceIndexBufferOffsetAlignment(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.MINSEQUENCEINDEXBUFFEROFFSETALIGNMENT, value); }
    /** Unsafe version of {@link #minCommandsTokenBufferOffsetAlignment(int) minCommandsTokenBufferOffsetAlignment}. */
    public static void nminCommandsTokenBufferOffsetAlignment(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGeneratedCommandsLimitsNVX.MINCOMMANDSTOKENBUFFEROFFSETALIGNMENT, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceGeneratedCommandsLimitsNVX} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGeneratedCommandsLimitsNVX, Buffer> implements NativeResource {

        private static final VkDeviceGeneratedCommandsLimitsNVX ELEMENT_FACTORY = VkDeviceGeneratedCommandsLimitsNVX.create(-1L);

        /**
         * Creates a new {@code VkDeviceGeneratedCommandsLimitsNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGeneratedCommandsLimitsNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGeneratedCommandsLimitsNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGeneratedCommandsLimitsNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGeneratedCommandsLimitsNVX.npNext(address()); }
        /** Returns the value of the {@code maxIndirectCommandsLayoutTokenCount} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsLayoutTokenCount() { return VkDeviceGeneratedCommandsLimitsNVX.nmaxIndirectCommandsLayoutTokenCount(address()); }
        /** Returns the value of the {@code maxObjectEntryCounts} field. */
        @NativeType("uint32_t")
        public int maxObjectEntryCounts() { return VkDeviceGeneratedCommandsLimitsNVX.nmaxObjectEntryCounts(address()); }
        /** Returns the value of the {@code minSequenceCountBufferOffsetAlignment} field. */
        @NativeType("uint32_t")
        public int minSequenceCountBufferOffsetAlignment() { return VkDeviceGeneratedCommandsLimitsNVX.nminSequenceCountBufferOffsetAlignment(address()); }
        /** Returns the value of the {@code minSequenceIndexBufferOffsetAlignment} field. */
        @NativeType("uint32_t")
        public int minSequenceIndexBufferOffsetAlignment() { return VkDeviceGeneratedCommandsLimitsNVX.nminSequenceIndexBufferOffsetAlignment(address()); }
        /** Returns the value of the {@code minCommandsTokenBufferOffsetAlignment} field. */
        @NativeType("uint32_t")
        public int minCommandsTokenBufferOffsetAlignment() { return VkDeviceGeneratedCommandsLimitsNVX.nminCommandsTokenBufferOffsetAlignment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGeneratedCommandsLimitsNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGeneratedCommandsLimitsNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGeneratedCommandsLimitsNVX.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGeneratedCommandsLimitsNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maxIndirectCommandsLayoutTokenCount} field. */
        public VkDeviceGeneratedCommandsLimitsNVX.Buffer maxIndirectCommandsLayoutTokenCount(@NativeType("uint32_t") int value) { VkDeviceGeneratedCommandsLimitsNVX.nmaxIndirectCommandsLayoutTokenCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxObjectEntryCounts} field. */
        public VkDeviceGeneratedCommandsLimitsNVX.Buffer maxObjectEntryCounts(@NativeType("uint32_t") int value) { VkDeviceGeneratedCommandsLimitsNVX.nmaxObjectEntryCounts(address(), value); return this; }
        /** Sets the specified value to the {@code minSequenceCountBufferOffsetAlignment} field. */
        public VkDeviceGeneratedCommandsLimitsNVX.Buffer minSequenceCountBufferOffsetAlignment(@NativeType("uint32_t") int value) { VkDeviceGeneratedCommandsLimitsNVX.nminSequenceCountBufferOffsetAlignment(address(), value); return this; }
        /** Sets the specified value to the {@code minSequenceIndexBufferOffsetAlignment} field. */
        public VkDeviceGeneratedCommandsLimitsNVX.Buffer minSequenceIndexBufferOffsetAlignment(@NativeType("uint32_t") int value) { VkDeviceGeneratedCommandsLimitsNVX.nminSequenceIndexBufferOffsetAlignment(address(), value); return this; }
        /** Sets the specified value to the {@code minCommandsTokenBufferOffsetAlignment} field. */
        public VkDeviceGeneratedCommandsLimitsNVX.Buffer minCommandsTokenBufferOffsetAlignment(@NativeType("uint32_t") int value) { VkDeviceGeneratedCommandsLimitsNVX.nminCommandsTokenBufferOffsetAlignment(address(), value); return this; }

    }

}