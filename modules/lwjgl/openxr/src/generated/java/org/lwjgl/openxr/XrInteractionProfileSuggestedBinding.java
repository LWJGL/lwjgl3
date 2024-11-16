/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Suggested bindings for a interaction profile.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrBindingModificationsKHR}</li>
 * <li>{@code suggestedBindings} <b>must</b> be a pointer to an array of {@code countSuggestedBindings} valid {@link XrActionSuggestedBinding} structures</li>
 * <li>The {@code countSuggestedBindings} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrActionSuggestedBinding}, {@link XR10#xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrInteractionProfileSuggestedBinding {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrPath {@link #interactionProfile};
 *     uint32_t {@link #countSuggestedBindings};
 *     {@link XrActionSuggestedBinding XrActionSuggestedBinding} const * {@link #suggestedBindings};
 * }</code></pre>
 */
public class XrInteractionProfileSuggestedBinding extends Struct<XrInteractionProfileSuggestedBinding> implements NativeResource {

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

    protected XrInteractionProfileSuggestedBinding(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrInteractionProfileSuggestedBinding create(long address, @Nullable ByteBuffer container) {
        return new XrInteractionProfileSuggestedBinding(address, container);
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@code XrPath} of an interaction profile. */
    @NativeType("XrPath")
    public long interactionProfile() { return ninteractionProfile(address()); }
    /** the number of suggested bindings in the array pointed to by {@code suggestedBindings}. */
    @NativeType("uint32_t")
    public int countSuggestedBindings() { return ncountSuggestedBindings(address()); }
    /** a pointer to an array of {@link XrActionSuggestedBinding} structures that define all of the application’s suggested bindings for the specified interaction profile. */
    @NativeType("XrActionSuggestedBinding const *")
    public XrActionSuggestedBinding.Buffer suggestedBindings() { return nsuggestedBindings(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrInteractionProfileSuggestedBinding type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING} value to the {@link #type} field. */
    public XrInteractionProfileSuggestedBinding type$Default() { return type(XR10.XR_TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING); }
    /** Sets the specified value to the {@link #next} field. */
    public XrInteractionProfileSuggestedBinding next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrBindingModificationsKHR} value to the {@code next} chain. */
    public XrInteractionProfileSuggestedBinding next(XrBindingModificationsKHR value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #interactionProfile} field. */
    public XrInteractionProfileSuggestedBinding interactionProfile(@NativeType("XrPath") long value) { ninteractionProfile(address(), value); return this; }
    /** Sets the address of the specified {@link XrActionSuggestedBinding.Buffer} to the {@link #suggestedBindings} field. */
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
        return new XrInteractionProfileSuggestedBinding(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrInteractionProfileSuggestedBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInteractionProfileSuggestedBinding calloc() {
        return new XrInteractionProfileSuggestedBinding(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrInteractionProfileSuggestedBinding} instance allocated with {@link BufferUtils}. */
    public static XrInteractionProfileSuggestedBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrInteractionProfileSuggestedBinding(memAddress(container), container);
    }

    /** Returns a new {@code XrInteractionProfileSuggestedBinding} instance for the specified memory address. */
    public static XrInteractionProfileSuggestedBinding create(long address) {
        return new XrInteractionProfileSuggestedBinding(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrInteractionProfileSuggestedBinding createSafe(long address) {
        return address == NULL ? null : new XrInteractionProfileSuggestedBinding(address, null);
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrInteractionProfileSuggestedBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrInteractionProfileSuggestedBinding.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrInteractionProfileSuggestedBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileSuggestedBinding malloc(MemoryStack stack) {
        return new XrInteractionProfileSuggestedBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrInteractionProfileSuggestedBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileSuggestedBinding calloc(MemoryStack stack) {
        return new XrInteractionProfileSuggestedBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileSuggestedBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileSuggestedBinding.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrInteractionProfileSuggestedBinding.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInteractionProfileSuggestedBinding.NEXT); }
    /** Unsafe version of {@link #interactionProfile}. */
    public static long ninteractionProfile(long struct) { return memGetLong(struct + XrInteractionProfileSuggestedBinding.INTERACTIONPROFILE); }
    /** Unsafe version of {@link #countSuggestedBindings}. */
    public static int ncountSuggestedBindings(long struct) { return memGetInt(struct + XrInteractionProfileSuggestedBinding.COUNTSUGGESTEDBINDINGS); }
    /** Unsafe version of {@link #suggestedBindings}. */
    public static XrActionSuggestedBinding.Buffer nsuggestedBindings(long struct) { return XrActionSuggestedBinding.create(memGetAddress(struct + XrInteractionProfileSuggestedBinding.SUGGESTEDBINDINGS), ncountSuggestedBindings(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrInteractionProfileSuggestedBinding.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInteractionProfileSuggestedBinding.NEXT, value); }
    /** Unsafe version of {@link #interactionProfile(long) interactionProfile}. */
    public static void ninteractionProfile(long struct, long value) { memPutLong(struct + XrInteractionProfileSuggestedBinding.INTERACTIONPROFILE, value); }
    /** Sets the specified value to the {@code countSuggestedBindings} field of the specified {@code struct}. */
    public static void ncountSuggestedBindings(long struct, int value) { memPutInt(struct + XrInteractionProfileSuggestedBinding.COUNTSUGGESTEDBINDINGS, value); }
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
        validate(suggestedBindings, countSuggestedBindings, XrActionSuggestedBinding.SIZEOF, XrActionSuggestedBinding::validate);
    }

    // -----------------------------------

    /** An array of {@link XrInteractionProfileSuggestedBinding} structs. */
    public static class Buffer extends StructBuffer<XrInteractionProfileSuggestedBinding, Buffer> implements NativeResource {

        private static final XrInteractionProfileSuggestedBinding ELEMENT_FACTORY = XrInteractionProfileSuggestedBinding.create(-1L);

        /**
         * Creates a new {@code XrInteractionProfileSuggestedBinding.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInteractionProfileSuggestedBinding#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrInteractionProfileSuggestedBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrInteractionProfileSuggestedBinding#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInteractionProfileSuggestedBinding.ntype(address()); }
        /** @return the value of the {@link XrInteractionProfileSuggestedBinding#next} field. */
        @NativeType("void const *")
        public long next() { return XrInteractionProfileSuggestedBinding.nnext(address()); }
        /** @return the value of the {@link XrInteractionProfileSuggestedBinding#interactionProfile} field. */
        @NativeType("XrPath")
        public long interactionProfile() { return XrInteractionProfileSuggestedBinding.ninteractionProfile(address()); }
        /** @return the value of the {@link XrInteractionProfileSuggestedBinding#countSuggestedBindings} field. */
        @NativeType("uint32_t")
        public int countSuggestedBindings() { return XrInteractionProfileSuggestedBinding.ncountSuggestedBindings(address()); }
        /** @return a {@link XrActionSuggestedBinding.Buffer} view of the struct array pointed to by the {@link XrInteractionProfileSuggestedBinding#suggestedBindings} field. */
        @NativeType("XrActionSuggestedBinding const *")
        public XrActionSuggestedBinding.Buffer suggestedBindings() { return XrInteractionProfileSuggestedBinding.nsuggestedBindings(address()); }

        /** Sets the specified value to the {@link XrInteractionProfileSuggestedBinding#type} field. */
        public XrInteractionProfileSuggestedBinding.Buffer type(@NativeType("XrStructureType") int value) { XrInteractionProfileSuggestedBinding.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING} value to the {@link XrInteractionProfileSuggestedBinding#type} field. */
        public XrInteractionProfileSuggestedBinding.Buffer type$Default() { return type(XR10.XR_TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING); }
        /** Sets the specified value to the {@link XrInteractionProfileSuggestedBinding#next} field. */
        public XrInteractionProfileSuggestedBinding.Buffer next(@NativeType("void const *") long value) { XrInteractionProfileSuggestedBinding.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrBindingModificationsKHR} value to the {@code next} chain. */
        public XrInteractionProfileSuggestedBinding.Buffer next(XrBindingModificationsKHR value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrInteractionProfileSuggestedBinding#interactionProfile} field. */
        public XrInteractionProfileSuggestedBinding.Buffer interactionProfile(@NativeType("XrPath") long value) { XrInteractionProfileSuggestedBinding.ninteractionProfile(address(), value); return this; }
        /** Sets the address of the specified {@link XrActionSuggestedBinding.Buffer} to the {@link XrInteractionProfileSuggestedBinding#suggestedBindings} field. */
        public XrInteractionProfileSuggestedBinding.Buffer suggestedBindings(@NativeType("XrActionSuggestedBinding const *") XrActionSuggestedBinding.Buffer value) { XrInteractionProfileSuggestedBinding.nsuggestedBindings(address(), value); return this; }

    }

}