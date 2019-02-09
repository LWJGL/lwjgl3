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
 * Structure specifying parameters for the reservation of command buffer space.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXDeviceGeneratedCommands#VK_STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code objectTable} <b>must</b> be a valid {@code VkObjectTableNVX} handle</li>
 * <li>{@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutNVX} handle</li>
 * <li>Both of {@code indirectCommandsLayout}, and {@code objectTable} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code objectTable} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVXDeviceGeneratedCommands#vkCmdReserveSpaceForCommandsNVX CmdReserveSpaceForCommandsNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code objectTable} &ndash; the {@code VkObjectTableNVX} to be used for the generation process. Only registered objects at the time {@link NVXDeviceGeneratedCommands#vkCmdReserveSpaceForCommandsNVX CmdReserveSpaceForCommandsNVX} is called, will be taken into account for the reservation.</li>
 * <li>{@code indirectCommandsLayout} &ndash; the {@code VkIndirectCommandsLayoutNVX} that <b>must</b> also be used at generation time.</li>
 * <li>{@code maxSequencesCount} &ndash; the maximum number of sequences for which command buffer space will be reserved.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCmdReserveSpaceForCommandsInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkObjectTableNVX objectTable;
 *     VkIndirectCommandsLayoutNVX indirectCommandsLayout;
 *     uint32_t maxSequencesCount;
 * }</code></pre>
 */
public class VkCmdReserveSpaceForCommandsInfoNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OBJECTTABLE,
        INDIRECTCOMMANDSLAYOUT,
        MAXSEQUENCESCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OBJECTTABLE = layout.offsetof(2);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(3);
        MAXSEQUENCESCOUNT = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkCmdReserveSpaceForCommandsInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCmdReserveSpaceForCommandsInfoNVX(ByteBuffer container) {
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
    /** Returns the value of the {@code objectTable} field. */
    @NativeType("VkObjectTableNVX")
    public long objectTable() { return nobjectTable(address()); }
    /** Returns the value of the {@code indirectCommandsLayout} field. */
    @NativeType("VkIndirectCommandsLayoutNVX")
    public long indirectCommandsLayout() { return nindirectCommandsLayout(address()); }
    /** Returns the value of the {@code maxSequencesCount} field. */
    @NativeType("uint32_t")
    public int maxSequencesCount() { return nmaxSequencesCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCmdReserveSpaceForCommandsInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCmdReserveSpaceForCommandsInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code objectTable} field. */
    public VkCmdReserveSpaceForCommandsInfoNVX objectTable(@NativeType("VkObjectTableNVX") long value) { nobjectTable(address(), value); return this; }
    /** Sets the specified value to the {@code indirectCommandsLayout} field. */
    public VkCmdReserveSpaceForCommandsInfoNVX indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNVX") long value) { nindirectCommandsLayout(address(), value); return this; }
    /** Sets the specified value to the {@code maxSequencesCount} field. */
    public VkCmdReserveSpaceForCommandsInfoNVX maxSequencesCount(@NativeType("uint32_t") int value) { nmaxSequencesCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCmdReserveSpaceForCommandsInfoNVX set(
        int sType,
        long pNext,
        long objectTable,
        long indirectCommandsLayout,
        int maxSequencesCount
    ) {
        sType(sType);
        pNext(pNext);
        objectTable(objectTable);
        indirectCommandsLayout(indirectCommandsLayout);
        maxSequencesCount(maxSequencesCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCmdReserveSpaceForCommandsInfoNVX set(VkCmdReserveSpaceForCommandsInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCmdReserveSpaceForCommandsInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCmdReserveSpaceForCommandsInfoNVX malloc() {
        return wrap(VkCmdReserveSpaceForCommandsInfoNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCmdReserveSpaceForCommandsInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCmdReserveSpaceForCommandsInfoNVX calloc() {
        return wrap(VkCmdReserveSpaceForCommandsInfoNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCmdReserveSpaceForCommandsInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkCmdReserveSpaceForCommandsInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCmdReserveSpaceForCommandsInfoNVX.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCmdReserveSpaceForCommandsInfoNVX} instance for the specified memory address. */
    public static VkCmdReserveSpaceForCommandsInfoNVX create(long address) {
        return wrap(VkCmdReserveSpaceForCommandsInfoNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCmdReserveSpaceForCommandsInfoNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkCmdReserveSpaceForCommandsInfoNVX.class, address);
    }

    /**
     * Returns a new {@link VkCmdReserveSpaceForCommandsInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCmdReserveSpaceForCommandsInfoNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCmdReserveSpaceForCommandsInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCmdReserveSpaceForCommandsInfoNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCmdReserveSpaceForCommandsInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCmdReserveSpaceForCommandsInfoNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCmdReserveSpaceForCommandsInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCmdReserveSpaceForCommandsInfoNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCmdReserveSpaceForCommandsInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkCmdReserveSpaceForCommandsInfoNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkCmdReserveSpaceForCommandsInfoNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkCmdReserveSpaceForCommandsInfoNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkCmdReserveSpaceForCommandsInfoNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkCmdReserveSpaceForCommandsInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCmdReserveSpaceForCommandsInfoNVX mallocStack(MemoryStack stack) {
        return wrap(VkCmdReserveSpaceForCommandsInfoNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCmdReserveSpaceForCommandsInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCmdReserveSpaceForCommandsInfoNVX callocStack(MemoryStack stack) {
        return wrap(VkCmdReserveSpaceForCommandsInfoNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCmdReserveSpaceForCommandsInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCmdReserveSpaceForCommandsInfoNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCmdReserveSpaceForCommandsInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkCmdReserveSpaceForCommandsInfoNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCmdReserveSpaceForCommandsInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCmdReserveSpaceForCommandsInfoNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCmdReserveSpaceForCommandsInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCmdReserveSpaceForCommandsInfoNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCmdReserveSpaceForCommandsInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCmdReserveSpaceForCommandsInfoNVX.PNEXT); }
    /** Unsafe version of {@link #objectTable}. */
    public static long nobjectTable(long struct) { return UNSAFE.getLong(null, struct + VkCmdReserveSpaceForCommandsInfoNVX.OBJECTTABLE); }
    /** Unsafe version of {@link #indirectCommandsLayout}. */
    public static long nindirectCommandsLayout(long struct) { return UNSAFE.getLong(null, struct + VkCmdReserveSpaceForCommandsInfoNVX.INDIRECTCOMMANDSLAYOUT); }
    /** Unsafe version of {@link #maxSequencesCount}. */
    public static int nmaxSequencesCount(long struct) { return UNSAFE.getInt(null, struct + VkCmdReserveSpaceForCommandsInfoNVX.MAXSEQUENCESCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCmdReserveSpaceForCommandsInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCmdReserveSpaceForCommandsInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #objectTable(long) objectTable}. */
    public static void nobjectTable(long struct, long value) { UNSAFE.putLong(null, struct + VkCmdReserveSpaceForCommandsInfoNVX.OBJECTTABLE, value); }
    /** Unsafe version of {@link #indirectCommandsLayout(long) indirectCommandsLayout}. */
    public static void nindirectCommandsLayout(long struct, long value) { UNSAFE.putLong(null, struct + VkCmdReserveSpaceForCommandsInfoNVX.INDIRECTCOMMANDSLAYOUT, value); }
    /** Unsafe version of {@link #maxSequencesCount(int) maxSequencesCount}. */
    public static void nmaxSequencesCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCmdReserveSpaceForCommandsInfoNVX.MAXSEQUENCESCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkCmdReserveSpaceForCommandsInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkCmdReserveSpaceForCommandsInfoNVX, Buffer> implements NativeResource {

        private static final VkCmdReserveSpaceForCommandsInfoNVX ELEMENT_FACTORY = VkCmdReserveSpaceForCommandsInfoNVX.create(-1L);

        /**
         * Creates a new {@code VkCmdReserveSpaceForCommandsInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCmdReserveSpaceForCommandsInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkCmdReserveSpaceForCommandsInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCmdReserveSpaceForCommandsInfoNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCmdReserveSpaceForCommandsInfoNVX.npNext(address()); }
        /** Returns the value of the {@code objectTable} field. */
        @NativeType("VkObjectTableNVX")
        public long objectTable() { return VkCmdReserveSpaceForCommandsInfoNVX.nobjectTable(address()); }
        /** Returns the value of the {@code indirectCommandsLayout} field. */
        @NativeType("VkIndirectCommandsLayoutNVX")
        public long indirectCommandsLayout() { return VkCmdReserveSpaceForCommandsInfoNVX.nindirectCommandsLayout(address()); }
        /** Returns the value of the {@code maxSequencesCount} field. */
        @NativeType("uint32_t")
        public int maxSequencesCount() { return VkCmdReserveSpaceForCommandsInfoNVX.nmaxSequencesCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCmdReserveSpaceForCommandsInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkCmdReserveSpaceForCommandsInfoNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCmdReserveSpaceForCommandsInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkCmdReserveSpaceForCommandsInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code objectTable} field. */
        public VkCmdReserveSpaceForCommandsInfoNVX.Buffer objectTable(@NativeType("VkObjectTableNVX") long value) { VkCmdReserveSpaceForCommandsInfoNVX.nobjectTable(address(), value); return this; }
        /** Sets the specified value to the {@code indirectCommandsLayout} field. */
        public VkCmdReserveSpaceForCommandsInfoNVX.Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNVX") long value) { VkCmdReserveSpaceForCommandsInfoNVX.nindirectCommandsLayout(address(), value); return this; }
        /** Sets the specified value to the {@code maxSequencesCount} field. */
        public VkCmdReserveSpaceForCommandsInfoNVX.Buffer maxSequencesCount(@NativeType("uint32_t") int value) { VkCmdReserveSpaceForCommandsInfoNVX.nmaxSequencesCount(address(), value); return this; }

    }

}