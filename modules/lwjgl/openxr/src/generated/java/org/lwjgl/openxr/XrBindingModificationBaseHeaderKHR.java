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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Base struct for all binding modifications.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrBindingModificationBaseHeaderKHR} is a base structure is overridden by stext:XrBindingModification* child structures.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRBindingModification XR_KHR_binding_modification} extension <b>must</b> be enabled prior to using {@link XrBindingModificationBaseHeaderKHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrBindingModificationsKHR}, {@link XR10#xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBindingModificationBaseHeaderKHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 * }</code></pre>
 */
public class XrBindingModificationBaseHeaderKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrBindingModificationBaseHeaderKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBindingModificationBaseHeaderKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or in this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrBindingModificationBaseHeaderKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #next} field. */
    public XrBindingModificationBaseHeaderKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBindingModificationBaseHeaderKHR set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBindingModificationBaseHeaderKHR set(XrBindingModificationBaseHeaderKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBindingModificationBaseHeaderKHR malloc() {
        return wrap(XrBindingModificationBaseHeaderKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBindingModificationBaseHeaderKHR calloc() {
        return wrap(XrBindingModificationBaseHeaderKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated with {@link BufferUtils}. */
    public static XrBindingModificationBaseHeaderKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrBindingModificationBaseHeaderKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance for the specified memory address. */
    public static XrBindingModificationBaseHeaderKHR create(long address) {
        return wrap(XrBindingModificationBaseHeaderKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBindingModificationBaseHeaderKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrBindingModificationBaseHeaderKHR.class, address);
    }

    /** Upcasts the specified {@code XrInteractionProfileAnalogThresholdVALVE} instance to {@code XrBindingModificationBaseHeaderKHR}. */
    public static XrBindingModificationBaseHeaderKHR create(XrInteractionProfileAnalogThresholdVALVE value) {
        return wrap(XrBindingModificationBaseHeaderKHR.class, value);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrBindingModificationBaseHeaderKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBindingModificationBaseHeaderKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Upcasts the specified {@code XrInteractionProfileAnalogThresholdVALVE.Buffer} instance to {@code XrBindingModificationBaseHeaderKHR.Buffer}. */
    public static XrBindingModificationBaseHeaderKHR.Buffer create(XrInteractionProfileAnalogThresholdVALVE.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBindingModificationBaseHeaderKHR malloc(MemoryStack stack) {
        return wrap(XrBindingModificationBaseHeaderKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBindingModificationBaseHeaderKHR calloc(MemoryStack stack) {
        return wrap(XrBindingModificationBaseHeaderKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrBindingModificationBaseHeaderKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBindingModificationBaseHeaderKHR.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrBindingModificationBaseHeaderKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBindingModificationBaseHeaderKHR.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrBindingModificationBaseHeaderKHR} structs. */
    public static class Buffer extends StructBuffer<XrBindingModificationBaseHeaderKHR, Buffer> implements NativeResource {

        private static final XrBindingModificationBaseHeaderKHR ELEMENT_FACTORY = XrBindingModificationBaseHeaderKHR.create(-1L);

        /**
         * Creates a new {@code XrBindingModificationBaseHeaderKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBindingModificationBaseHeaderKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrBindingModificationBaseHeaderKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrBindingModificationBaseHeaderKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBindingModificationBaseHeaderKHR.ntype(address()); }
        /** @return the value of the {@link XrBindingModificationBaseHeaderKHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrBindingModificationBaseHeaderKHR.nnext(address()); }

        /** Sets the specified value to the {@link XrBindingModificationBaseHeaderKHR#type} field. */
        public XrBindingModificationBaseHeaderKHR.Buffer type(@NativeType("XrStructureType") int value) { XrBindingModificationBaseHeaderKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XrBindingModificationBaseHeaderKHR#next} field. */
        public XrBindingModificationBaseHeaderKHR.Buffer next(@NativeType("void const *") long value) { XrBindingModificationBaseHeaderKHR.nnext(address(), value); return this; }

    }

}