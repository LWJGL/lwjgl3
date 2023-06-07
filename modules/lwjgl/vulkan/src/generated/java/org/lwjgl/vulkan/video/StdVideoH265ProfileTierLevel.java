/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH265ProfileTierLevel {
 *     {@link StdVideoH265ProfileTierLevelFlags StdVideoH265ProfileTierLevelFlags} flags;
 *     StdVideoH265ProfileIdc general_profile_idc;
 *     StdVideoH265LevelIdc general_level_idc;
 * }</code></pre>
 */
public class StdVideoH265ProfileTierLevel extends Struct<StdVideoH265ProfileTierLevel> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        GENERAL_PROFILE_IDC,
        GENERAL_LEVEL_IDC;

    static {
        Layout layout = __struct(
            __member(StdVideoH265ProfileTierLevelFlags.SIZEOF, StdVideoH265ProfileTierLevelFlags.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        GENERAL_PROFILE_IDC = layout.offsetof(1);
        GENERAL_LEVEL_IDC = layout.offsetof(2);
    }

    protected StdVideoH265ProfileTierLevel(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoH265ProfileTierLevel create(long address, @Nullable ByteBuffer container) {
        return new StdVideoH265ProfileTierLevel(address, container);
    }

    /**
     * Creates a {@code StdVideoH265ProfileTierLevel} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265ProfileTierLevel(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoH265ProfileTierLevelFlags} view of the {@code flags} field. */
    public StdVideoH265ProfileTierLevelFlags flags() { return nflags(address()); }
    /** @return the value of the {@code general_profile_idc} field. */
    @NativeType("StdVideoH265ProfileIdc")
    public int general_profile_idc() { return ngeneral_profile_idc(address()); }
    /** @return the value of the {@code general_level_idc} field. */
    @NativeType("StdVideoH265LevelIdc")
    public int general_level_idc() { return ngeneral_level_idc(address()); }

    /** Copies the specified {@link StdVideoH265ProfileTierLevelFlags} to the {@code flags} field. */
    public StdVideoH265ProfileTierLevel flags(StdVideoH265ProfileTierLevelFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH265ProfileTierLevel flags(java.util.function.Consumer<StdVideoH265ProfileTierLevelFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code general_profile_idc} field. */
    public StdVideoH265ProfileTierLevel general_profile_idc(@NativeType("StdVideoH265ProfileIdc") int value) { ngeneral_profile_idc(address(), value); return this; }
    /** Sets the specified value to the {@code general_level_idc} field. */
    public StdVideoH265ProfileTierLevel general_level_idc(@NativeType("StdVideoH265LevelIdc") int value) { ngeneral_level_idc(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265ProfileTierLevel set(
        StdVideoH265ProfileTierLevelFlags flags,
        int general_profile_idc,
        int general_level_idc
    ) {
        flags(flags);
        general_profile_idc(general_profile_idc);
        general_level_idc(general_level_idc);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265ProfileTierLevel set(StdVideoH265ProfileTierLevel src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265ProfileTierLevel} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265ProfileTierLevel malloc() {
        return new StdVideoH265ProfileTierLevel(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265ProfileTierLevel} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265ProfileTierLevel calloc() {
        return new StdVideoH265ProfileTierLevel(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265ProfileTierLevel} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265ProfileTierLevel create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265ProfileTierLevel(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265ProfileTierLevel} instance for the specified memory address. */
    public static StdVideoH265ProfileTierLevel create(long address) {
        return new StdVideoH265ProfileTierLevel(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265ProfileTierLevel createSafe(long address) {
        return address == NULL ? null : new StdVideoH265ProfileTierLevel(address, null);
    }

    /**
     * Returns a new {@link StdVideoH265ProfileTierLevel.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevel.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ProfileTierLevel.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevel.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ProfileTierLevel.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevel.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoH265ProfileTierLevel.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevel.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265ProfileTierLevel.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265ProfileTierLevel} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265ProfileTierLevel malloc(MemoryStack stack) {
        return new StdVideoH265ProfileTierLevel(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoH265ProfileTierLevel} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265ProfileTierLevel calloc(MemoryStack stack) {
        return new StdVideoH265ProfileTierLevel(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoH265ProfileTierLevel.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevel.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ProfileTierLevel.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevel.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoH265ProfileTierLevelFlags nflags(long struct) { return StdVideoH265ProfileTierLevelFlags.create(struct + StdVideoH265ProfileTierLevel.FLAGS); }
    /** Unsafe version of {@link #general_profile_idc}. */
    public static int ngeneral_profile_idc(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265ProfileTierLevel.GENERAL_PROFILE_IDC); }
    /** Unsafe version of {@link #general_level_idc}. */
    public static int ngeneral_level_idc(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265ProfileTierLevel.GENERAL_LEVEL_IDC); }

    /** Unsafe version of {@link #flags(StdVideoH265ProfileTierLevelFlags) flags}. */
    public static void nflags(long struct, StdVideoH265ProfileTierLevelFlags value) { memCopy(value.address(), struct + StdVideoH265ProfileTierLevel.FLAGS, StdVideoH265ProfileTierLevelFlags.SIZEOF); }
    /** Unsafe version of {@link #general_profile_idc(int) general_profile_idc}. */
    public static void ngeneral_profile_idc(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265ProfileTierLevel.GENERAL_PROFILE_IDC, value); }
    /** Unsafe version of {@link #general_level_idc(int) general_level_idc}. */
    public static void ngeneral_level_idc(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265ProfileTierLevel.GENERAL_LEVEL_IDC, value); }

    // -----------------------------------

    /** An array of {@link StdVideoH265ProfileTierLevel} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265ProfileTierLevel, Buffer> implements NativeResource {

        private static final StdVideoH265ProfileTierLevel ELEMENT_FACTORY = StdVideoH265ProfileTierLevel.create(-1L);

        /**
         * Creates a new {@code StdVideoH265ProfileTierLevel.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265ProfileTierLevel#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoH265ProfileTierLevel getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoH265ProfileTierLevelFlags} view of the {@code flags} field. */
        public StdVideoH265ProfileTierLevelFlags flags() { return StdVideoH265ProfileTierLevel.nflags(address()); }
        /** @return the value of the {@code general_profile_idc} field. */
        @NativeType("StdVideoH265ProfileIdc")
        public int general_profile_idc() { return StdVideoH265ProfileTierLevel.ngeneral_profile_idc(address()); }
        /** @return the value of the {@code general_level_idc} field. */
        @NativeType("StdVideoH265LevelIdc")
        public int general_level_idc() { return StdVideoH265ProfileTierLevel.ngeneral_level_idc(address()); }

        /** Copies the specified {@link StdVideoH265ProfileTierLevelFlags} to the {@code flags} field. */
        public StdVideoH265ProfileTierLevel.Buffer flags(StdVideoH265ProfileTierLevelFlags value) { StdVideoH265ProfileTierLevel.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH265ProfileTierLevel.Buffer flags(java.util.function.Consumer<StdVideoH265ProfileTierLevelFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code general_profile_idc} field. */
        public StdVideoH265ProfileTierLevel.Buffer general_profile_idc(@NativeType("StdVideoH265ProfileIdc") int value) { StdVideoH265ProfileTierLevel.ngeneral_profile_idc(address(), value); return this; }
        /** Sets the specified value to the {@code general_level_idc} field. */
        public StdVideoH265ProfileTierLevel.Buffer general_level_idc(@NativeType("StdVideoH265LevelIdc") int value) { StdVideoH265ProfileTierLevel.ngeneral_level_idc(address(), value); return this; }

    }

}