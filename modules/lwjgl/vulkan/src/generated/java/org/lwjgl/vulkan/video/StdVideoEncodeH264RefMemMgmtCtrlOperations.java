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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH264RefMemMgmtCtrlOperations {
 *     {@link StdVideoEncodeH264RefMgmtFlags StdVideoEncodeH264RefMgmtFlags} flags;
 *     uint8_t refList0ModOpCount;
 *     {@link StdVideoEncodeH264RefListModEntry StdVideoEncodeH264RefListModEntry} * pRefList0ModOperations;
 *     uint8_t refList1ModOpCount;
 *     {@link StdVideoEncodeH264RefListModEntry StdVideoEncodeH264RefListModEntry} * pRefList1ModOperations;
 *     uint8_t refPicMarkingOpCount;
 *     {@link StdVideoEncodeH264RefPicMarkingEntry StdVideoEncodeH264RefPicMarkingEntry} * pRefPicMarkingOperations;
 * }</code></pre>
 */
public class StdVideoEncodeH264RefMemMgmtCtrlOperations extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        REFLIST0MODOPCOUNT,
        PREFLIST0MODOPERATIONS,
        REFLIST1MODOPCOUNT,
        PREFLIST1MODOPERATIONS,
        REFPICMARKINGOPCOUNT,
        PREFPICMARKINGOPERATIONS;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH264RefMgmtFlags.SIZEOF, StdVideoEncodeH264RefMgmtFlags.ALIGNOF),
            __member(1),
            __member(POINTER_SIZE),
            __member(1),
            __member(POINTER_SIZE),
            __member(1),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        REFLIST0MODOPCOUNT = layout.offsetof(1);
        PREFLIST0MODOPERATIONS = layout.offsetof(2);
        REFLIST1MODOPCOUNT = layout.offsetof(3);
        PREFLIST1MODOPERATIONS = layout.offsetof(4);
        REFPICMARKINGOPCOUNT = layout.offsetof(5);
        PREFPICMARKINGOPERATIONS = layout.offsetof(6);
    }

    /**
     * Creates a {@code StdVideoEncodeH264RefMemMgmtCtrlOperations} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264RefMemMgmtCtrlOperations(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH264RefMgmtFlags} view of the {@code flags} field. */
    public StdVideoEncodeH264RefMgmtFlags flags() { return nflags(address()); }
    /** @return the value of the {@code refList0ModOpCount} field. */
    @NativeType("uint8_t")
    public byte refList0ModOpCount() { return nrefList0ModOpCount(address()); }
    /** @return a {@link StdVideoEncodeH264RefListModEntry} view of the struct pointed to by the {@code pRefList0ModOperations} field. */
    @NativeType("StdVideoEncodeH264RefListModEntry *")
    public StdVideoEncodeH264RefListModEntry pRefList0ModOperations() { return npRefList0ModOperations(address()); }
    /** @return the value of the {@code refList1ModOpCount} field. */
    @NativeType("uint8_t")
    public byte refList1ModOpCount() { return nrefList1ModOpCount(address()); }
    /** @return a {@link StdVideoEncodeH264RefListModEntry} view of the struct pointed to by the {@code pRefList1ModOperations} field. */
    @NativeType("StdVideoEncodeH264RefListModEntry *")
    public StdVideoEncodeH264RefListModEntry pRefList1ModOperations() { return npRefList1ModOperations(address()); }
    /** @return the value of the {@code refPicMarkingOpCount} field. */
    @NativeType("uint8_t")
    public byte refPicMarkingOpCount() { return nrefPicMarkingOpCount(address()); }
    /** @return a {@link StdVideoEncodeH264RefPicMarkingEntry} view of the struct pointed to by the {@code pRefPicMarkingOperations} field. */
    @NativeType("StdVideoEncodeH264RefPicMarkingEntry *")
    public StdVideoEncodeH264RefPicMarkingEntry pRefPicMarkingOperations() { return npRefPicMarkingOperations(address()); }

    /** Copies the specified {@link StdVideoEncodeH264RefMgmtFlags} to the {@code flags} field. */
    public StdVideoEncodeH264RefMemMgmtCtrlOperations flags(StdVideoEncodeH264RefMgmtFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH264RefMemMgmtCtrlOperations flags(java.util.function.Consumer<StdVideoEncodeH264RefMgmtFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code refList0ModOpCount} field. */
    public StdVideoEncodeH264RefMemMgmtCtrlOperations refList0ModOpCount(@NativeType("uint8_t") byte value) { nrefList0ModOpCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry} to the {@code pRefList0ModOperations} field. */
    public StdVideoEncodeH264RefMemMgmtCtrlOperations pRefList0ModOperations(@NativeType("StdVideoEncodeH264RefListModEntry *") StdVideoEncodeH264RefListModEntry value) { npRefList0ModOperations(address(), value); return this; }
    /** Sets the specified value to the {@code refList1ModOpCount} field. */
    public StdVideoEncodeH264RefMemMgmtCtrlOperations refList1ModOpCount(@NativeType("uint8_t") byte value) { nrefList1ModOpCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry} to the {@code pRefList1ModOperations} field. */
    public StdVideoEncodeH264RefMemMgmtCtrlOperations pRefList1ModOperations(@NativeType("StdVideoEncodeH264RefListModEntry *") StdVideoEncodeH264RefListModEntry value) { npRefList1ModOperations(address(), value); return this; }
    /** Sets the specified value to the {@code refPicMarkingOpCount} field. */
    public StdVideoEncodeH264RefMemMgmtCtrlOperations refPicMarkingOpCount(@NativeType("uint8_t") byte value) { nrefPicMarkingOpCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264RefPicMarkingEntry} to the {@code pRefPicMarkingOperations} field. */
    public StdVideoEncodeH264RefMemMgmtCtrlOperations pRefPicMarkingOperations(@NativeType("StdVideoEncodeH264RefPicMarkingEntry *") StdVideoEncodeH264RefPicMarkingEntry value) { npRefPicMarkingOperations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264RefMemMgmtCtrlOperations set(
        StdVideoEncodeH264RefMgmtFlags flags,
        byte refList0ModOpCount,
        StdVideoEncodeH264RefListModEntry pRefList0ModOperations,
        byte refList1ModOpCount,
        StdVideoEncodeH264RefListModEntry pRefList1ModOperations,
        byte refPicMarkingOpCount,
        StdVideoEncodeH264RefPicMarkingEntry pRefPicMarkingOperations
    ) {
        flags(flags);
        refList0ModOpCount(refList0ModOpCount);
        pRefList0ModOperations(pRefList0ModOperations);
        refList1ModOpCount(refList1ModOpCount);
        pRefList1ModOperations(pRefList1ModOperations);
        refPicMarkingOpCount(refPicMarkingOpCount);
        pRefPicMarkingOperations(pRefPicMarkingOperations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264RefMemMgmtCtrlOperations set(StdVideoEncodeH264RefMemMgmtCtrlOperations src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264RefMemMgmtCtrlOperations} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations malloc() {
        return wrap(StdVideoEncodeH264RefMemMgmtCtrlOperations.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264RefMemMgmtCtrlOperations} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations calloc() {
        return wrap(StdVideoEncodeH264RefMemMgmtCtrlOperations.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264RefMemMgmtCtrlOperations} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH264RefMemMgmtCtrlOperations.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264RefMemMgmtCtrlOperations} instance for the specified memory address. */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations create(long address) {
        return wrap(StdVideoEncodeH264RefMemMgmtCtrlOperations.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH264RefMemMgmtCtrlOperations.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264RefMemMgmtCtrlOperations} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264RefMemMgmtCtrlOperations.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH264RefMemMgmtCtrlOperations} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264RefMemMgmtCtrlOperations.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH264RefMgmtFlags nflags(long struct) { return StdVideoEncodeH264RefMgmtFlags.create(struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.FLAGS); }
    /** Unsafe version of {@link #refList0ModOpCount}. */
    public static byte nrefList0ModOpCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.REFLIST0MODOPCOUNT); }
    /** Unsafe version of {@link #pRefList0ModOperations}. */
    public static StdVideoEncodeH264RefListModEntry npRefList0ModOperations(long struct) { return StdVideoEncodeH264RefListModEntry.create(memGetAddress(struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.PREFLIST0MODOPERATIONS)); }
    /** Unsafe version of {@link #refList1ModOpCount}. */
    public static byte nrefList1ModOpCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.REFLIST1MODOPCOUNT); }
    /** Unsafe version of {@link #pRefList1ModOperations}. */
    public static StdVideoEncodeH264RefListModEntry npRefList1ModOperations(long struct) { return StdVideoEncodeH264RefListModEntry.create(memGetAddress(struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.PREFLIST1MODOPERATIONS)); }
    /** Unsafe version of {@link #refPicMarkingOpCount}. */
    public static byte nrefPicMarkingOpCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.REFPICMARKINGOPCOUNT); }
    /** Unsafe version of {@link #pRefPicMarkingOperations}. */
    public static StdVideoEncodeH264RefPicMarkingEntry npRefPicMarkingOperations(long struct) { return StdVideoEncodeH264RefPicMarkingEntry.create(memGetAddress(struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.PREFPICMARKINGOPERATIONS)); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH264RefMgmtFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH264RefMgmtFlags value) { memCopy(value.address(), struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.FLAGS, StdVideoEncodeH264RefMgmtFlags.SIZEOF); }
    /** Unsafe version of {@link #refList0ModOpCount(byte) refList0ModOpCount}. */
    public static void nrefList0ModOpCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.REFLIST0MODOPCOUNT, value); }
    /** Unsafe version of {@link #pRefList0ModOperations(StdVideoEncodeH264RefListModEntry) pRefList0ModOperations}. */
    public static void npRefList0ModOperations(long struct, StdVideoEncodeH264RefListModEntry value) { memPutAddress(struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.PREFLIST0MODOPERATIONS, value.address()); }
    /** Unsafe version of {@link #refList1ModOpCount(byte) refList1ModOpCount}. */
    public static void nrefList1ModOpCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.REFLIST1MODOPCOUNT, value); }
    /** Unsafe version of {@link #pRefList1ModOperations(StdVideoEncodeH264RefListModEntry) pRefList1ModOperations}. */
    public static void npRefList1ModOperations(long struct, StdVideoEncodeH264RefListModEntry value) { memPutAddress(struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.PREFLIST1MODOPERATIONS, value.address()); }
    /** Unsafe version of {@link #refPicMarkingOpCount(byte) refPicMarkingOpCount}. */
    public static void nrefPicMarkingOpCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.REFPICMARKINGOPCOUNT, value); }
    /** Unsafe version of {@link #pRefPicMarkingOperations(StdVideoEncodeH264RefPicMarkingEntry) pRefPicMarkingOperations}. */
    public static void npRefPicMarkingOperations(long struct, StdVideoEncodeH264RefPicMarkingEntry value) { memPutAddress(struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.PREFPICMARKINGOPERATIONS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.PREFLIST0MODOPERATIONS));
        check(memGetAddress(struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.PREFLIST1MODOPERATIONS));
        check(memGetAddress(struct + StdVideoEncodeH264RefMemMgmtCtrlOperations.PREFPICMARKINGOPERATIONS));
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264RefMemMgmtCtrlOperations} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264RefMemMgmtCtrlOperations, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264RefMemMgmtCtrlOperations ELEMENT_FACTORY = StdVideoEncodeH264RefMemMgmtCtrlOperations.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264RefMemMgmtCtrlOperations#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH264RefMemMgmtCtrlOperations getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH264RefMgmtFlags} view of the {@code flags} field. */
        public StdVideoEncodeH264RefMgmtFlags flags() { return StdVideoEncodeH264RefMemMgmtCtrlOperations.nflags(address()); }
        /** @return the value of the {@code refList0ModOpCount} field. */
        @NativeType("uint8_t")
        public byte refList0ModOpCount() { return StdVideoEncodeH264RefMemMgmtCtrlOperations.nrefList0ModOpCount(address()); }
        /** @return a {@link StdVideoEncodeH264RefListModEntry} view of the struct pointed to by the {@code pRefList0ModOperations} field. */
        @NativeType("StdVideoEncodeH264RefListModEntry *")
        public StdVideoEncodeH264RefListModEntry pRefList0ModOperations() { return StdVideoEncodeH264RefMemMgmtCtrlOperations.npRefList0ModOperations(address()); }
        /** @return the value of the {@code refList1ModOpCount} field. */
        @NativeType("uint8_t")
        public byte refList1ModOpCount() { return StdVideoEncodeH264RefMemMgmtCtrlOperations.nrefList1ModOpCount(address()); }
        /** @return a {@link StdVideoEncodeH264RefListModEntry} view of the struct pointed to by the {@code pRefList1ModOperations} field. */
        @NativeType("StdVideoEncodeH264RefListModEntry *")
        public StdVideoEncodeH264RefListModEntry pRefList1ModOperations() { return StdVideoEncodeH264RefMemMgmtCtrlOperations.npRefList1ModOperations(address()); }
        /** @return the value of the {@code refPicMarkingOpCount} field. */
        @NativeType("uint8_t")
        public byte refPicMarkingOpCount() { return StdVideoEncodeH264RefMemMgmtCtrlOperations.nrefPicMarkingOpCount(address()); }
        /** @return a {@link StdVideoEncodeH264RefPicMarkingEntry} view of the struct pointed to by the {@code pRefPicMarkingOperations} field. */
        @NativeType("StdVideoEncodeH264RefPicMarkingEntry *")
        public StdVideoEncodeH264RefPicMarkingEntry pRefPicMarkingOperations() { return StdVideoEncodeH264RefMemMgmtCtrlOperations.npRefPicMarkingOperations(address()); }

        /** Copies the specified {@link StdVideoEncodeH264RefMgmtFlags} to the {@code flags} field. */
        public StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer flags(StdVideoEncodeH264RefMgmtFlags value) { StdVideoEncodeH264RefMemMgmtCtrlOperations.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer flags(java.util.function.Consumer<StdVideoEncodeH264RefMgmtFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code refList0ModOpCount} field. */
        public StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer refList0ModOpCount(@NativeType("uint8_t") byte value) { StdVideoEncodeH264RefMemMgmtCtrlOperations.nrefList0ModOpCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry} to the {@code pRefList0ModOperations} field. */
        public StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer pRefList0ModOperations(@NativeType("StdVideoEncodeH264RefListModEntry *") StdVideoEncodeH264RefListModEntry value) { StdVideoEncodeH264RefMemMgmtCtrlOperations.npRefList0ModOperations(address(), value); return this; }
        /** Sets the specified value to the {@code refList1ModOpCount} field. */
        public StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer refList1ModOpCount(@NativeType("uint8_t") byte value) { StdVideoEncodeH264RefMemMgmtCtrlOperations.nrefList1ModOpCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry} to the {@code pRefList1ModOperations} field. */
        public StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer pRefList1ModOperations(@NativeType("StdVideoEncodeH264RefListModEntry *") StdVideoEncodeH264RefListModEntry value) { StdVideoEncodeH264RefMemMgmtCtrlOperations.npRefList1ModOperations(address(), value); return this; }
        /** Sets the specified value to the {@code refPicMarkingOpCount} field. */
        public StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer refPicMarkingOpCount(@NativeType("uint8_t") byte value) { StdVideoEncodeH264RefMemMgmtCtrlOperations.nrefPicMarkingOpCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264RefPicMarkingEntry} to the {@code pRefPicMarkingOperations} field. */
        public StdVideoEncodeH264RefMemMgmtCtrlOperations.Buffer pRefPicMarkingOperations(@NativeType("StdVideoEncodeH264RefPicMarkingEntry *") StdVideoEncodeH264RefPicMarkingEntry value) { StdVideoEncodeH264RefMemMgmtCtrlOperations.npRefPicMarkingOperations(address(), value); return this; }

    }

}