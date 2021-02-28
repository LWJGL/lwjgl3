/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

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
 * struct XrEventDataReferenceSpaceChangePending {
 *     XrStructureType type;
 *     void const * next;
 *     XrSession session;
 *     XrReferenceSpaceType referenceSpaceType;
 *     XrTime changeTime;
 *     XrBool32 poseValid;
 *     {@link XrPosef XrPosef} poseInPreviousSpace;
 * }</code></pre>
 */
public class XrEventDataReferenceSpaceChangePending extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SESSION,
        REFERENCESPACETYPE,
        CHANGETIME,
        POSEVALID,
        POSEINPREVIOUSSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        REFERENCESPACETYPE = layout.offsetof(3);
        CHANGETIME = layout.offsetof(4);
        POSEVALID = layout.offsetof(5);
        POSEINPREVIOUSSPACE = layout.offsetof(6);
    }

    /**
     * Creates a {@code XrEventDataReferenceSpaceChangePending} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataReferenceSpaceChangePending(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** Returns the value of the {@code session} field. */
    @NativeType("XrSession")
    public long session() { return nsession(address()); }
    /** Returns the value of the {@code referenceSpaceType} field. */
    @NativeType("XrReferenceSpaceType")
    public int referenceSpaceType() { return nreferenceSpaceType(address()); }
    /** Returns the value of the {@code changeTime} field. */
    @NativeType("XrTime")
    public long changeTime() { return nchangeTime(address()); }
    /** Returns the value of the {@code poseValid} field. */
    @NativeType("XrBool32")
    public boolean poseValid() { return nposeValid(address()) != 0; }
    /** Returns a {@link XrPosef} view of the {@code poseInPreviousSpace} field. */
    public XrPosef poseInPreviousSpace() { return nposeInPreviousSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataReferenceSpaceChangePending type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataReferenceSpaceChangePending next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code session} field. */
    public XrEventDataReferenceSpaceChangePending session(XrSession value) { nsession(address(), value); return this; }
    /** Sets the specified value to the {@code referenceSpaceType} field. */
    public XrEventDataReferenceSpaceChangePending referenceSpaceType(@NativeType("XrReferenceSpaceType") int value) { nreferenceSpaceType(address(), value); return this; }
    /** Sets the specified value to the {@code changeTime} field. */
    public XrEventDataReferenceSpaceChangePending changeTime(@NativeType("XrTime") long value) { nchangeTime(address(), value); return this; }
    /** Sets the specified value to the {@code poseValid} field. */
    public XrEventDataReferenceSpaceChangePending poseValid(@NativeType("XrBool32") boolean value) { nposeValid(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link XrPosef} to the {@code poseInPreviousSpace} field. */
    public XrEventDataReferenceSpaceChangePending poseInPreviousSpace(XrPosef value) { nposeInPreviousSpace(address(), value); return this; }
    /** Passes the {@code poseInPreviousSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEventDataReferenceSpaceChangePending poseInPreviousSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInPreviousSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataReferenceSpaceChangePending set(
        int type,
        long next,
        XrSession session,
        int referenceSpaceType,
        long changeTime,
        boolean poseValid,
        XrPosef poseInPreviousSpace
    ) {
        type(type);
        next(next);
        session(session);
        referenceSpaceType(referenceSpaceType);
        changeTime(changeTime);
        poseValid(poseValid);
        poseInPreviousSpace(poseInPreviousSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataReferenceSpaceChangePending set(XrEventDataReferenceSpaceChangePending src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataReferenceSpaceChangePending malloc() {
        return wrap(XrEventDataReferenceSpaceChangePending.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataReferenceSpaceChangePending calloc() {
        return wrap(XrEventDataReferenceSpaceChangePending.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated with {@link BufferUtils}. */
    public static XrEventDataReferenceSpaceChangePending create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataReferenceSpaceChangePending.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance for the specified memory address. */
    public static XrEventDataReferenceSpaceChangePending create(long address) {
        return wrap(XrEventDataReferenceSpaceChangePending.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataReferenceSpaceChangePending createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataReferenceSpaceChangePending.class, address);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataReferenceSpaceChangePending.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataReferenceSpaceChangePending.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrEventDataReferenceSpaceChangePending mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrEventDataReferenceSpaceChangePending callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataReferenceSpaceChangePending mallocStack(MemoryStack stack) {
        return wrap(XrEventDataReferenceSpaceChangePending.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataReferenceSpaceChangePending callocStack(MemoryStack stack) {
        return wrap(XrEventDataReferenceSpaceChangePending.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataReferenceSpaceChangePending.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataReferenceSpaceChangePending.NEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetAddress(struct + XrEventDataReferenceSpaceChangePending.SESSION); }
    /** Unsafe version of {@link #referenceSpaceType}. */
    public static int nreferenceSpaceType(long struct) { return UNSAFE.getInt(null, struct + XrEventDataReferenceSpaceChangePending.REFERENCESPACETYPE); }
    /** Unsafe version of {@link #changeTime}. */
    public static long nchangeTime(long struct) { return UNSAFE.getLong(null, struct + XrEventDataReferenceSpaceChangePending.CHANGETIME); }
    /** Unsafe version of {@link #poseValid}. */
    public static int nposeValid(long struct) { return UNSAFE.getInt(null, struct + XrEventDataReferenceSpaceChangePending.POSEVALID); }
    /** Unsafe version of {@link #poseInPreviousSpace}. */
    public static XrPosef nposeInPreviousSpace(long struct) { return XrPosef.create(struct + XrEventDataReferenceSpaceChangePending.POSEINPREVIOUSSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataReferenceSpaceChangePending.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataReferenceSpaceChangePending.NEXT, check(value)); }
    /** Unsafe version of {@link #session(XrSession) session}. */
    public static void nsession(long struct, XrSession value) { memPutAddress(struct + XrEventDataReferenceSpaceChangePending.SESSION, value.address()); }
    /** Unsafe version of {@link #referenceSpaceType(int) referenceSpaceType}. */
    public static void nreferenceSpaceType(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataReferenceSpaceChangePending.REFERENCESPACETYPE, value); }
    /** Unsafe version of {@link #changeTime(long) changeTime}. */
    public static void nchangeTime(long struct, long value) { UNSAFE.putLong(null, struct + XrEventDataReferenceSpaceChangePending.CHANGETIME, value); }
    /** Unsafe version of {@link #poseValid(boolean) poseValid}. */
    public static void nposeValid(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataReferenceSpaceChangePending.POSEVALID, value); }
    /** Unsafe version of {@link #poseInPreviousSpace(XrPosef) poseInPreviousSpace}. */
    public static void nposeInPreviousSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrEventDataReferenceSpaceChangePending.POSEINPREVIOUSSPACE, XrPosef.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEventDataReferenceSpaceChangePending.NEXT));
        check(memGetAddress(struct + XrEventDataReferenceSpaceChangePending.SESSION));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrEventDataReferenceSpaceChangePending} structs. */
    public static class Buffer extends StructBuffer<XrEventDataReferenceSpaceChangePending, Buffer> implements NativeResource {

        private static final XrEventDataReferenceSpaceChangePending ELEMENT_FACTORY = XrEventDataReferenceSpaceChangePending.create(-1L);

        /**
         * Creates a new {@code XrEventDataReferenceSpaceChangePending.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataReferenceSpaceChangePending#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataReferenceSpaceChangePending getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataReferenceSpaceChangePending.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataReferenceSpaceChangePending.nnext(address()); }
        /** Returns the value of the {@code session} field. */
        @NativeType("XrSession")
        public long session() { return XrEventDataReferenceSpaceChangePending.nsession(address()); }
        /** Returns the value of the {@code referenceSpaceType} field. */
        @NativeType("XrReferenceSpaceType")
        public int referenceSpaceType() { return XrEventDataReferenceSpaceChangePending.nreferenceSpaceType(address()); }
        /** Returns the value of the {@code changeTime} field. */
        @NativeType("XrTime")
        public long changeTime() { return XrEventDataReferenceSpaceChangePending.nchangeTime(address()); }
        /** Returns the value of the {@code poseValid} field. */
        @NativeType("XrBool32")
        public boolean poseValid() { return XrEventDataReferenceSpaceChangePending.nposeValid(address()) != 0; }
        /** Returns a {@link XrPosef} view of the {@code poseInPreviousSpace} field. */
        public XrPosef poseInPreviousSpace() { return XrEventDataReferenceSpaceChangePending.nposeInPreviousSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataReferenceSpaceChangePending.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer next(@NativeType("void const *") long value) { XrEventDataReferenceSpaceChangePending.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code session} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer session(XrSession value) { XrEventDataReferenceSpaceChangePending.nsession(address(), value); return this; }
        /** Sets the specified value to the {@code referenceSpaceType} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer referenceSpaceType(@NativeType("XrReferenceSpaceType") int value) { XrEventDataReferenceSpaceChangePending.nreferenceSpaceType(address(), value); return this; }
        /** Sets the specified value to the {@code changeTime} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer changeTime(@NativeType("XrTime") long value) { XrEventDataReferenceSpaceChangePending.nchangeTime(address(), value); return this; }
        /** Sets the specified value to the {@code poseValid} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer poseValid(@NativeType("XrBool32") boolean value) { XrEventDataReferenceSpaceChangePending.nposeValid(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link XrPosef} to the {@code poseInPreviousSpace} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer poseInPreviousSpace(XrPosef value) { XrEventDataReferenceSpaceChangePending.nposeInPreviousSpace(address(), value); return this; }
        /** Passes the {@code poseInPreviousSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEventDataReferenceSpaceChangePending.Buffer poseInPreviousSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInPreviousSpace()); return this; }

    }

}