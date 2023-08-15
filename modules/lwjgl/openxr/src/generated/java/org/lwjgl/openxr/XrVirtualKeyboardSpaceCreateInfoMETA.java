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
 * Virtual keyboard space creation info.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code locationType} is set to {@link METAVirtualKeyboard#XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META}, the runtime <b>must</b> use the value {@code poseInSpace} set by the application. Otherwise, the runtime <b>must</b> provide a default pose and ignore {@code poseInSpace}. In all cases, the runtime <b>must</b> default the scale to 1.0.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using {@link XrVirtualKeyboardSpaceCreateInfoMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code locationType} <b>must</b> be a valid {@code XrVirtualKeyboardLocationTypeMETA} value</li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link METAVirtualKeyboard#xrCreateVirtualKeyboardSpaceMETA CreateVirtualKeyboardSpaceMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVirtualKeyboardSpaceCreateInfoMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrVirtualKeyboardLocationTypeMETA {@link #locationType};
 *     XrSpace {@link #space};
 *     {@link XrPosef XrPosef} {@link #poseInSpace};
 * }</code></pre>
 */
public class XrVirtualKeyboardSpaceCreateInfoMETA extends Struct<XrVirtualKeyboardSpaceCreateInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOCATIONTYPE,
        SPACE,
        POSEINSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LOCATIONTYPE = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        POSEINSPACE = layout.offsetof(4);
    }

    protected XrVirtualKeyboardSpaceCreateInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVirtualKeyboardSpaceCreateInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrVirtualKeyboardSpaceCreateInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrVirtualKeyboardSpaceCreateInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVirtualKeyboardSpaceCreateInfoMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an {@code XrVirtualKeyboardLocationTypeMETA} enum providing the location type. */
    @NativeType("XrVirtualKeyboardLocationTypeMETA")
    public int locationType() { return nlocationType(address()); }
    /** an {@code XrSpace} previously created by a function such as {@link XR10#xrCreateReferenceSpace CreateReferenceSpace}. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the desired pose if {@code locationType} is {@link METAVirtualKeyboard#XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META}. */
    public XrPosef poseInSpace() { return nposeInSpace(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrVirtualKeyboardSpaceCreateInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META} value to the {@link #type} field. */
    public XrVirtualKeyboardSpaceCreateInfoMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrVirtualKeyboardSpaceCreateInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #locationType} field. */
    public XrVirtualKeyboardSpaceCreateInfoMETA locationType(@NativeType("XrVirtualKeyboardLocationTypeMETA") int value) { nlocationType(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrVirtualKeyboardSpaceCreateInfoMETA space(XrSpace value) { nspace(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #poseInSpace} field. */
    public XrVirtualKeyboardSpaceCreateInfoMETA poseInSpace(XrPosef value) { nposeInSpace(address(), value); return this; }
    /** Passes the {@link #poseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrVirtualKeyboardSpaceCreateInfoMETA poseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrVirtualKeyboardSpaceCreateInfoMETA set(
        int type,
        long next,
        int locationType,
        XrSpace space,
        XrPosef poseInSpace
    ) {
        type(type);
        next(next);
        locationType(locationType);
        space(space);
        poseInSpace(poseInSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVirtualKeyboardSpaceCreateInfoMETA set(XrVirtualKeyboardSpaceCreateInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVirtualKeyboardSpaceCreateInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardSpaceCreateInfoMETA malloc() {
        return new XrVirtualKeyboardSpaceCreateInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardSpaceCreateInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardSpaceCreateInfoMETA calloc() {
        return new XrVirtualKeyboardSpaceCreateInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardSpaceCreateInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrVirtualKeyboardSpaceCreateInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVirtualKeyboardSpaceCreateInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrVirtualKeyboardSpaceCreateInfoMETA} instance for the specified memory address. */
    public static XrVirtualKeyboardSpaceCreateInfoMETA create(long address) {
        return new XrVirtualKeyboardSpaceCreateInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardSpaceCreateInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrVirtualKeyboardSpaceCreateInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardSpaceCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardSpaceCreateInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardSpaceCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardSpaceCreateInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardSpaceCreateInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardSpaceCreateInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVirtualKeyboardSpaceCreateInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardSpaceCreateInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardSpaceCreateInfoMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardSpaceCreateInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardSpaceCreateInfoMETA malloc(MemoryStack stack) {
        return new XrVirtualKeyboardSpaceCreateInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardSpaceCreateInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardSpaceCreateInfoMETA calloc(MemoryStack stack) {
        return new XrVirtualKeyboardSpaceCreateInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardSpaceCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardSpaceCreateInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardSpaceCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardSpaceCreateInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardSpaceCreateInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVirtualKeyboardSpaceCreateInfoMETA.NEXT); }
    /** Unsafe version of {@link #locationType}. */
    public static int nlocationType(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardSpaceCreateInfoMETA.LOCATIONTYPE); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrVirtualKeyboardSpaceCreateInfoMETA.SPACE); }
    /** Unsafe version of {@link #poseInSpace}. */
    public static XrPosef nposeInSpace(long struct) { return XrPosef.create(struct + XrVirtualKeyboardSpaceCreateInfoMETA.POSEINSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardSpaceCreateInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVirtualKeyboardSpaceCreateInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #locationType(int) locationType}. */
    public static void nlocationType(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardSpaceCreateInfoMETA.LOCATIONTYPE, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrVirtualKeyboardSpaceCreateInfoMETA.SPACE, value.address()); }
    /** Unsafe version of {@link #poseInSpace(XrPosef) poseInSpace}. */
    public static void nposeInSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrVirtualKeyboardSpaceCreateInfoMETA.POSEINSPACE, XrPosef.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrVirtualKeyboardSpaceCreateInfoMETA.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrVirtualKeyboardSpaceCreateInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrVirtualKeyboardSpaceCreateInfoMETA, Buffer> implements NativeResource {

        private static final XrVirtualKeyboardSpaceCreateInfoMETA ELEMENT_FACTORY = XrVirtualKeyboardSpaceCreateInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrVirtualKeyboardSpaceCreateInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVirtualKeyboardSpaceCreateInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVirtualKeyboardSpaceCreateInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVirtualKeyboardSpaceCreateInfoMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVirtualKeyboardSpaceCreateInfoMETA.ntype(address()); }
        /** @return the value of the {@link XrVirtualKeyboardSpaceCreateInfoMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrVirtualKeyboardSpaceCreateInfoMETA.nnext(address()); }
        /** @return the value of the {@link XrVirtualKeyboardSpaceCreateInfoMETA#locationType} field. */
        @NativeType("XrVirtualKeyboardLocationTypeMETA")
        public int locationType() { return XrVirtualKeyboardSpaceCreateInfoMETA.nlocationType(address()); }
        /** @return the value of the {@link XrVirtualKeyboardSpaceCreateInfoMETA#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrVirtualKeyboardSpaceCreateInfoMETA.nspace(address()); }
        /** @return a {@link XrPosef} view of the {@link XrVirtualKeyboardSpaceCreateInfoMETA#poseInSpace} field. */
        public XrPosef poseInSpace() { return XrVirtualKeyboardSpaceCreateInfoMETA.nposeInSpace(address()); }

        /** Sets the specified value to the {@link XrVirtualKeyboardSpaceCreateInfoMETA#type} field. */
        public XrVirtualKeyboardSpaceCreateInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrVirtualKeyboardSpaceCreateInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META} value to the {@link XrVirtualKeyboardSpaceCreateInfoMETA#type} field. */
        public XrVirtualKeyboardSpaceCreateInfoMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META); }
        /** Sets the specified value to the {@link XrVirtualKeyboardSpaceCreateInfoMETA#next} field. */
        public XrVirtualKeyboardSpaceCreateInfoMETA.Buffer next(@NativeType("void const *") long value) { XrVirtualKeyboardSpaceCreateInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrVirtualKeyboardSpaceCreateInfoMETA#locationType} field. */
        public XrVirtualKeyboardSpaceCreateInfoMETA.Buffer locationType(@NativeType("XrVirtualKeyboardLocationTypeMETA") int value) { XrVirtualKeyboardSpaceCreateInfoMETA.nlocationType(address(), value); return this; }
        /** Sets the specified value to the {@link XrVirtualKeyboardSpaceCreateInfoMETA#space} field. */
        public XrVirtualKeyboardSpaceCreateInfoMETA.Buffer space(XrSpace value) { XrVirtualKeyboardSpaceCreateInfoMETA.nspace(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrVirtualKeyboardSpaceCreateInfoMETA#poseInSpace} field. */
        public XrVirtualKeyboardSpaceCreateInfoMETA.Buffer poseInSpace(XrPosef value) { XrVirtualKeyboardSpaceCreateInfoMETA.nposeInSpace(address(), value); return this; }
        /** Passes the {@link XrVirtualKeyboardSpaceCreateInfoMETA#poseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrVirtualKeyboardSpaceCreateInfoMETA.Buffer poseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInSpace()); return this; }

    }

}