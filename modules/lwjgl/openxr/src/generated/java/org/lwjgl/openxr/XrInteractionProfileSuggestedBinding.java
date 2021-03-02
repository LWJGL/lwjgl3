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
 * struct XrInteractionProfileSuggestedBinding {
 *     XrStructureType type;
 *     void const * next;
 *     XrPath interactionProfile;
 *     uint32_t countSuggestedBindings;
 *     {@link XrActionSuggestedBinding XrActionSuggestedBinding} const * suggestedBindings;
 * }</code></pre>
 */
public class XrInteractionProfileSuggestedBinding extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        INTERACTIONPROFILE,
        COUNTSUGGESTEDBINDINGS,
        SUGGESTEDBINDINGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        INTERACTIONPROFILE = layout.offsetof(2);
        COUNTSUGGESTEDBINDINGS = layout.offsetof(3);
        SUGGESTEDBINDINGS = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrInteractionProfileSuggestedBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrInteractionProfileSuggestedBinding(ByteBuffer container) {
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
    /** Returns the value of the {@code interactionProfile} field. */
    @NativeType("XrPath")
    public long interactionProfile() { return ninteractionProfile(address()); }
    /** Returns the value of the {@code countSuggestedBindings} field. */
    @NativeType("uint32_t")
    public int countSuggestedBindings() { return ncountSuggestedBindings(address()); }
    /** Returns a {@link XrActionSuggestedBinding.Buffer} view of the struct array pointed to by the {@code suggestedBindings} field. */
    @NativeType("XrActionSuggestedBinding const *")
    public XrActionSuggestedBinding.Buffer suggestedBindings() { return nsuggestedBindings(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrInteractionProfileSuggestedBinding type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrInteractionProfileSuggestedBinding next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code interactionProfile} field. */
    public XrInteractionProfileSuggestedBinding interactionProfile(@NativeType("XrPath") long value) { ninteractionProfile(address(), value); return this; }
    /** Sets the address of the specified {@link XrActionSuggestedBinding.Buffer} to the {@code suggestedBindings} field. */
    public XrInteractionProfileSuggestedBinding suggestedBindings(@NativeType("XrActionSuggestedBinding const *") XrActionSuggestedBinding.Buffer value) { nsuggestedBindings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrInteractionProfileSuggestedBinding set(
        int type,
        long next,
        long interactionProfile,
        XrActionSuggestedBinding.Buffer suggestedBindings
    ) {
        type(type);
        next(next);
        interactionProfile(interactionProfile);
        suggestedBindings(suggestedBindings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrInteractionProfileSuggestedBinding set(XrInteractionProfileSuggestedBinding src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrInteractionProfileSuggestedBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrInteractionProfileSuggestedBinding malloc() {
        return wrap(XrInteractionProfileSuggestedBinding.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrInteractionProfileSuggestedBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInteractionProfileSuggestedBinding calloc() {
        return wrap(XrInteractionProfileSuggestedBinding.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrInteractionProfileSuggestedBinding} instance allocated with {@link BufferUtils}. */
    public static XrInteractionProfileSuggestedBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrInteractionProfileSuggestedBinding.class, memAddress(container), container);
    }

    /** Returns a new {@code XrInteractionProfileSuggestedBinding} instance for the specified memory address. */
    public static XrInteractionProfileSuggestedBinding create(long address) {
        return wrap(XrInteractionProfileSuggestedBinding.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInteractionProfileSuggestedBinding createSafe(long address) {
        return address == NULL ? null : wrap(XrInteractionProfileSuggestedBinding.class, address);
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrInteractionProfileSuggestedBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInteractionProfileSuggestedBinding.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrInteractionProfileSuggestedBinding} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrInteractionProfileSuggestedBinding mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrInteractionProfileSuggestedBinding} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrInteractionProfileSuggestedBinding callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrInteractionProfileSuggestedBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileSuggestedBinding mallocStack(MemoryStack stack) {
        return wrap(XrInteractionProfileSuggestedBinding.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrInteractionProfileSuggestedBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileSuggestedBinding callocStack(MemoryStack stack) {
        return wrap(XrInteractionProfileSuggestedBinding.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrInteractionProfileSuggestedBinding.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInteractionProfileSuggestedBinding.NEXT); }
    /** Unsafe version of {@link #interactionProfile}. */
    public static long ninteractionProfile(long struct) { return UNSAFE.getLong(null, struct + XrInteractionProfileSuggestedBinding.INTERACTIONPROFILE); }
    /** Unsafe version of {@link #countSuggestedBindings}. */
    public static int ncountSuggestedBindings(long struct) { return UNSAFE.getInt(null, struct + XrInteractionProfileSuggestedBinding.COUNTSUGGESTEDBINDINGS); }
    /** Unsafe version of {@link #suggestedBindings}. */
    public static XrActionSuggestedBinding.Buffer nsuggestedBindings(long struct) { return XrActionSuggestedBinding.create(memGetAddress(struct + XrInteractionProfileSuggestedBinding.SUGGESTEDBINDINGS), ncountSuggestedBindings(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrInteractionProfileSuggestedBinding.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInteractionProfileSuggestedBinding.NEXT, value); }
    /** Unsafe version of {@link #interactionProfile(long) interactionProfile}. */
    public static void ninteractionProfile(long struct, long value) { UNSAFE.putLong(null, struct + XrInteractionProfileSuggestedBinding.INTERACTIONPROFILE, value); }
    /** Sets the specified value to the {@code countSuggestedBindings} field of the specified {@code struct}. */
    public static void ncountSuggestedBindings(long struct, int value) { UNSAFE.putInt(null, struct + XrInteractionProfileSuggestedBinding.COUNTSUGGESTEDBINDINGS, value); }
    /** Unsafe version of {@link #suggestedBindings(XrActionSuggestedBinding.Buffer) suggestedBindings}. */
    public static void nsuggestedBindings(long struct, XrActionSuggestedBinding.Buffer value) { memPutAddress(struct + XrInteractionProfileSuggestedBinding.SUGGESTEDBINDINGS, value.address()); ncountSuggestedBindings(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int countSuggestedBindings = ncountSuggestedBindings(struct);
        long suggestedBindings = memGetAddress(struct + XrInteractionProfileSuggestedBinding.SUGGESTEDBINDINGS);
        check(suggestedBindings);
        XrActionSuggestedBinding.validate(suggestedBindings, countSuggestedBindings);
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

    /** An array of {@link XrInteractionProfileSuggestedBinding} structs. */
    public static class Buffer extends StructBuffer<XrInteractionProfileSuggestedBinding, Buffer> implements NativeResource {

        private static final XrInteractionProfileSuggestedBinding ELEMENT_FACTORY = XrInteractionProfileSuggestedBinding.create(-1L);

        /**
         * Creates a new {@code XrInteractionProfileSuggestedBinding.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInteractionProfileSuggestedBinding#SIZEOF}, and its mark will be undefined.
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
        protected XrInteractionProfileSuggestedBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInteractionProfileSuggestedBinding.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrInteractionProfileSuggestedBinding.nnext(address()); }
        /** Returns the value of the {@code interactionProfile} field. */
        @NativeType("XrPath")
        public long interactionProfile() { return XrInteractionProfileSuggestedBinding.ninteractionProfile(address()); }
        /** Returns the value of the {@code countSuggestedBindings} field. */
        @NativeType("uint32_t")
        public int countSuggestedBindings() { return XrInteractionProfileSuggestedBinding.ncountSuggestedBindings(address()); }
        /** Returns a {@link XrActionSuggestedBinding.Buffer} view of the struct array pointed to by the {@code suggestedBindings} field. */
        @NativeType("XrActionSuggestedBinding const *")
        public XrActionSuggestedBinding.Buffer suggestedBindings() { return XrInteractionProfileSuggestedBinding.nsuggestedBindings(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrInteractionProfileSuggestedBinding.Buffer type(@NativeType("XrStructureType") int value) { XrInteractionProfileSuggestedBinding.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrInteractionProfileSuggestedBinding.Buffer next(@NativeType("void const *") long value) { XrInteractionProfileSuggestedBinding.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code interactionProfile} field. */
        public XrInteractionProfileSuggestedBinding.Buffer interactionProfile(@NativeType("XrPath") long value) { XrInteractionProfileSuggestedBinding.ninteractionProfile(address(), value); return this; }
        /** Sets the address of the specified {@link XrActionSuggestedBinding.Buffer} to the {@code suggestedBindings} field. */
        public XrInteractionProfileSuggestedBinding.Buffer suggestedBindings(@NativeType("XrActionSuggestedBinding const *") XrActionSuggestedBinding.Buffer value) { XrInteractionProfileSuggestedBinding.nsuggestedBindings(address(), value); return this; }

    }

}