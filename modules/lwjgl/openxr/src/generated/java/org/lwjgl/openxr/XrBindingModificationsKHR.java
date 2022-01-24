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
 * Suggested bindings with binding modification details.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRBindingModification XR_KHR_binding_modification} extension <b>must</b> be enabled prior to using {@link XrBindingModificationsKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRBindingModification#XR_TYPE_BINDING_MODIFICATIONS_KHR TYPE_BINDING_MODIFICATIONS_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code bindingModificationCount} is not 0, {@code bindingModifications} <b>must</b> be a pointer to an array of {@code bindingModificationCount} valid {@link XrBindingModificationBaseHeaderKHR}-based structures. See also: {@link XrInteractionProfileAnalogThresholdVALVE}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrBindingModificationBaseHeaderKHR}, {@link XR10#xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBindingModificationsKHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #bindingModificationCount};
 *     {@link XrBindingModificationBaseHeaderKHR XrBindingModificationBaseHeaderKHR} const * const * {@link #bindingModifications};
 * }</code></pre>
 */
public class XrBindingModificationsKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BINDINGMODIFICATIONCOUNT,
        BINDINGMODIFICATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BINDINGMODIFICATIONCOUNT = layout.offsetof(2);
        BINDINGMODIFICATIONS = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrBindingModificationsKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBindingModificationsKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the number of binding modifications in the array pointed to by {@code bindingModifications}. */
    @NativeType("uint32_t")
    public int bindingModificationCount() { return nbindingModificationCount(address()); }
    /** a pointer to an array of pointers to binding modification structures based on {@link XrBindingModificationBaseHeaderKHR}, that define all of the application’s suggested binding modifications for the specified interaction profile. */
    @Nullable
    @NativeType("XrBindingModificationBaseHeaderKHR const * const *")
    public PointerBuffer bindingModifications() { return nbindingModifications(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrBindingModificationsKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRBindingModification#XR_TYPE_BINDING_MODIFICATIONS_KHR TYPE_BINDING_MODIFICATIONS_KHR} value to the {@link #type} field. */
    public XrBindingModificationsKHR type$Default() { return type(KHRBindingModification.XR_TYPE_BINDING_MODIFICATIONS_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrBindingModificationsKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #bindingModificationCount} field. */
    public XrBindingModificationsKHR bindingModificationCount(@NativeType("uint32_t") int value) { nbindingModificationCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #bindingModifications} field. */
    public XrBindingModificationsKHR bindingModifications(@Nullable @NativeType("XrBindingModificationBaseHeaderKHR const * const *") PointerBuffer value) { nbindingModifications(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBindingModificationsKHR set(
        int type,
        long next,
        int bindingModificationCount,
        @Nullable PointerBuffer bindingModifications
    ) {
        type(type);
        next(next);
        bindingModificationCount(bindingModificationCount);
        bindingModifications(bindingModifications);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBindingModificationsKHR set(XrBindingModificationsKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBindingModificationsKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBindingModificationsKHR malloc() {
        return wrap(XrBindingModificationsKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrBindingModificationsKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBindingModificationsKHR calloc() {
        return wrap(XrBindingModificationsKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrBindingModificationsKHR} instance allocated with {@link BufferUtils}. */
    public static XrBindingModificationsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrBindingModificationsKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrBindingModificationsKHR} instance for the specified memory address. */
    public static XrBindingModificationsKHR create(long address) {
        return wrap(XrBindingModificationsKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBindingModificationsKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrBindingModificationsKHR.class, address);
    }

    /**
     * Returns a new {@link XrBindingModificationsKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationsKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationsKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrBindingModificationsKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBindingModificationsKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrBindingModificationsKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBindingModificationsKHR malloc(MemoryStack stack) {
        return wrap(XrBindingModificationsKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrBindingModificationsKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBindingModificationsKHR calloc(MemoryStack stack) {
        return wrap(XrBindingModificationsKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrBindingModificationsKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationsKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrBindingModificationsKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBindingModificationsKHR.NEXT); }
    /** Unsafe version of {@link #bindingModificationCount}. */
    public static int nbindingModificationCount(long struct) { return UNSAFE.getInt(null, struct + XrBindingModificationsKHR.BINDINGMODIFICATIONCOUNT); }
    /** Unsafe version of {@link #bindingModifications() bindingModifications}. */
    @Nullable public static PointerBuffer nbindingModifications(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrBindingModificationsKHR.BINDINGMODIFICATIONS), nbindingModificationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrBindingModificationsKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBindingModificationsKHR.NEXT, value); }
    /** Sets the specified value to the {@code bindingModificationCount} field of the specified {@code struct}. */
    public static void nbindingModificationCount(long struct, int value) { UNSAFE.putInt(null, struct + XrBindingModificationsKHR.BINDINGMODIFICATIONCOUNT, value); }
    /** Unsafe version of {@link #bindingModifications(PointerBuffer) bindingModifications}. */
    public static void nbindingModifications(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrBindingModificationsKHR.BINDINGMODIFICATIONS, memAddressSafe(value)); if (value != null) { nbindingModificationCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrBindingModificationsKHR} structs. */
    public static class Buffer extends StructBuffer<XrBindingModificationsKHR, Buffer> implements NativeResource {

        private static final XrBindingModificationsKHR ELEMENT_FACTORY = XrBindingModificationsKHR.create(-1L);

        /**
         * Creates a new {@code XrBindingModificationsKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBindingModificationsKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrBindingModificationsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrBindingModificationsKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBindingModificationsKHR.ntype(address()); }
        /** @return the value of the {@link XrBindingModificationsKHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrBindingModificationsKHR.nnext(address()); }
        /** @return the value of the {@link XrBindingModificationsKHR#bindingModificationCount} field. */
        @NativeType("uint32_t")
        public int bindingModificationCount() { return XrBindingModificationsKHR.nbindingModificationCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link XrBindingModificationsKHR#bindingModifications} field. */
        @Nullable
        @NativeType("XrBindingModificationBaseHeaderKHR const * const *")
        public PointerBuffer bindingModifications() { return XrBindingModificationsKHR.nbindingModifications(address()); }

        /** Sets the specified value to the {@link XrBindingModificationsKHR#type} field. */
        public XrBindingModificationsKHR.Buffer type(@NativeType("XrStructureType") int value) { XrBindingModificationsKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRBindingModification#XR_TYPE_BINDING_MODIFICATIONS_KHR TYPE_BINDING_MODIFICATIONS_KHR} value to the {@link XrBindingModificationsKHR#type} field. */
        public XrBindingModificationsKHR.Buffer type$Default() { return type(KHRBindingModification.XR_TYPE_BINDING_MODIFICATIONS_KHR); }
        /** Sets the specified value to the {@link XrBindingModificationsKHR#next} field. */
        public XrBindingModificationsKHR.Buffer next(@NativeType("void const *") long value) { XrBindingModificationsKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrBindingModificationsKHR#bindingModificationCount} field. */
        public XrBindingModificationsKHR.Buffer bindingModificationCount(@NativeType("uint32_t") int value) { XrBindingModificationsKHR.nbindingModificationCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link XrBindingModificationsKHR#bindingModifications} field. */
        public XrBindingModificationsKHR.Buffer bindingModifications(@Nullable @NativeType("XrBindingModificationBaseHeaderKHR const * const *") PointerBuffer value) { XrBindingModificationsKHR.nbindingModifications(address(), value); return this; }

    }

}