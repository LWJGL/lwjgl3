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
 * struct XrInteractionProfileState {
 *     XrStructureType type;
 *     void * next;
 *     XrPath interactionProfile;
 * }</code></pre>
 */
public class XrInteractionProfileState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        INTERACTIONPROFILE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        INTERACTIONPROFILE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrInteractionProfileState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrInteractionProfileState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** Returns the value of the {@code interactionProfile} field. */
    @NativeType("XrPath")
    public long interactionProfile() { return ninteractionProfile(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrInteractionProfileState type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrInteractionProfileState next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code interactionProfile} field. */
    public XrInteractionProfileState interactionProfile(@NativeType("XrPath") long value) { ninteractionProfile(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrInteractionProfileState set(
        int type,
        long next,
        long interactionProfile
    ) {
        type(type);
        next(next);
        interactionProfile(interactionProfile);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrInteractionProfileState set(XrInteractionProfileState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrInteractionProfileState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrInteractionProfileState malloc() {
        return wrap(XrInteractionProfileState.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrInteractionProfileState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInteractionProfileState calloc() {
        return wrap(XrInteractionProfileState.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrInteractionProfileState} instance allocated with {@link BufferUtils}. */
    public static XrInteractionProfileState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrInteractionProfileState.class, memAddress(container), container);
    }

    /** Returns a new {@code XrInteractionProfileState} instance for the specified memory address. */
    public static XrInteractionProfileState create(long address) {
        return wrap(XrInteractionProfileState.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInteractionProfileState createSafe(long address) {
        return address == NULL ? null : wrap(XrInteractionProfileState.class, address);
    }

    /**
     * Returns a new {@link XrInteractionProfileState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileState.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileState.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrInteractionProfileState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileState.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInteractionProfileState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrInteractionProfileState} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrInteractionProfileState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrInteractionProfileState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrInteractionProfileState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrInteractionProfileState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileState mallocStack(MemoryStack stack) {
        return wrap(XrInteractionProfileState.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrInteractionProfileState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileState callocStack(MemoryStack stack) {
        return wrap(XrInteractionProfileState.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrInteractionProfileState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileState.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrInteractionProfileState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileState.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrInteractionProfileState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileState.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileState.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrInteractionProfileState.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInteractionProfileState.NEXT); }
    /** Unsafe version of {@link #interactionProfile}. */
    public static long ninteractionProfile(long struct) { return UNSAFE.getLong(null, struct + XrInteractionProfileState.INTERACTIONPROFILE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrInteractionProfileState.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInteractionProfileState.NEXT, check(value)); }
    /** Unsafe version of {@link #interactionProfile(long) interactionProfile}. */
    public static void ninteractionProfile(long struct, long value) { UNSAFE.putLong(null, struct + XrInteractionProfileState.INTERACTIONPROFILE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrInteractionProfileState.NEXT));
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

    /** An array of {@link XrInteractionProfileState} structs. */
    public static class Buffer extends StructBuffer<XrInteractionProfileState, Buffer> implements NativeResource {

        private static final XrInteractionProfileState ELEMENT_FACTORY = XrInteractionProfileState.create(-1L);

        /**
         * Creates a new {@code XrInteractionProfileState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInteractionProfileState#SIZEOF}, and its mark will be undefined.
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
        protected XrInteractionProfileState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInteractionProfileState.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrInteractionProfileState.nnext(address()); }
        /** Returns the value of the {@code interactionProfile} field. */
        @NativeType("XrPath")
        public long interactionProfile() { return XrInteractionProfileState.ninteractionProfile(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrInteractionProfileState.Buffer type(@NativeType("XrStructureType") int value) { XrInteractionProfileState.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrInteractionProfileState.Buffer next(@NativeType("void *") long value) { XrInteractionProfileState.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code interactionProfile} field. */
        public XrInteractionProfileState.Buffer interactionProfile(@NativeType("XrPath") long value) { XrInteractionProfileState.ninteractionProfile(address(), value); return this; }

    }

}