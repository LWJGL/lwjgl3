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
 * The information to get the scene components.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneComponentsGetInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENTS_GET_INFO_MSFT TYPE_SCENE_COMPONENTS_GET_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrSceneComponentParentFilterInfoMSFT}, {@link XrSceneObjectTypesFilterInfoMSFT}, {@link XrScenePlaneAlignmentFilterInfoMSFT}</li>
 * <li>{@code componentType} <b>must</b> be a valid {@code XrSceneComponentTypeMSFT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneComponentsGetInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSceneComponentTypeMSFT {@link #componentType};
 * }</code></pre>
 */
public class XrSceneComponentsGetInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COMPONENTTYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COMPONENTTYPE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSceneComponentsGetInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneComponentsGetInfoMSFT(ByteBuffer container) {
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
    /** the scene component type requested. */
    @NativeType("XrSceneComponentTypeMSFT")
    public int componentType() { return ncomponentType(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneComponentsGetInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENTS_GET_INFO_MSFT TYPE_SCENE_COMPONENTS_GET_INFO_MSFT} value to the {@link #type} field. */
    public XrSceneComponentsGetInfoMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENTS_GET_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneComponentsGetInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSceneComponentParentFilterInfoMSFT} value to the {@code next} chain. */
    public XrSceneComponentsGetInfoMSFT next(XrSceneComponentParentFilterInfoMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSceneObjectTypesFilterInfoMSFT} value to the {@code next} chain. */
    public XrSceneComponentsGetInfoMSFT next(XrSceneObjectTypesFilterInfoMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrScenePlaneAlignmentFilterInfoMSFT} value to the {@code next} chain. */
    public XrSceneComponentsGetInfoMSFT next(XrScenePlaneAlignmentFilterInfoMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #componentType} field. */
    public XrSceneComponentsGetInfoMSFT componentType(@NativeType("XrSceneComponentTypeMSFT") int value) { ncomponentType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneComponentsGetInfoMSFT set(
        int type,
        long next,
        int componentType
    ) {
        type(type);
        next(next);
        componentType(componentType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneComponentsGetInfoMSFT set(XrSceneComponentsGetInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneComponentsGetInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneComponentsGetInfoMSFT malloc() {
        return wrap(XrSceneComponentsGetInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentsGetInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneComponentsGetInfoMSFT calloc() {
        return wrap(XrSceneComponentsGetInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentsGetInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneComponentsGetInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneComponentsGetInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneComponentsGetInfoMSFT} instance for the specified memory address. */
    public static XrSceneComponentsGetInfoMSFT create(long address) {
        return wrap(XrSceneComponentsGetInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentsGetInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneComponentsGetInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneComponentsGetInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsGetInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentsGetInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsGetInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentsGetInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsGetInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneComponentsGetInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsGetInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentsGetInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneComponentsGetInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentsGetInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneComponentsGetInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneComponentsGetInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentsGetInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneComponentsGetInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneComponentsGetInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsGetInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentsGetInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsGetInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSceneComponentsGetInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneComponentsGetInfoMSFT.NEXT); }
    /** Unsafe version of {@link #componentType}. */
    public static int ncomponentType(long struct) { return UNSAFE.getInt(null, struct + XrSceneComponentsGetInfoMSFT.COMPONENTTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneComponentsGetInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneComponentsGetInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #componentType(int) componentType}. */
    public static void ncomponentType(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneComponentsGetInfoMSFT.COMPONENTTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrSceneComponentsGetInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneComponentsGetInfoMSFT, Buffer> implements NativeResource {

        private static final XrSceneComponentsGetInfoMSFT ELEMENT_FACTORY = XrSceneComponentsGetInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneComponentsGetInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneComponentsGetInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneComponentsGetInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneComponentsGetInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneComponentsGetInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneComponentsGetInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneComponentsGetInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrSceneComponentsGetInfoMSFT#componentType} field. */
        @NativeType("XrSceneComponentTypeMSFT")
        public int componentType() { return XrSceneComponentsGetInfoMSFT.ncomponentType(address()); }

        /** Sets the specified value to the {@link XrSceneComponentsGetInfoMSFT#type} field. */
        public XrSceneComponentsGetInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneComponentsGetInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENTS_GET_INFO_MSFT TYPE_SCENE_COMPONENTS_GET_INFO_MSFT} value to the {@link XrSceneComponentsGetInfoMSFT#type} field. */
        public XrSceneComponentsGetInfoMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENTS_GET_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSceneComponentsGetInfoMSFT#next} field. */
        public XrSceneComponentsGetInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSceneComponentsGetInfoMSFT.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSceneComponentParentFilterInfoMSFT} value to the {@code next} chain. */
        public XrSceneComponentsGetInfoMSFT.Buffer next(XrSceneComponentParentFilterInfoMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSceneObjectTypesFilterInfoMSFT} value to the {@code next} chain. */
        public XrSceneComponentsGetInfoMSFT.Buffer next(XrSceneObjectTypesFilterInfoMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrScenePlaneAlignmentFilterInfoMSFT} value to the {@code next} chain. */
        public XrSceneComponentsGetInfoMSFT.Buffer next(XrScenePlaneAlignmentFilterInfoMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrSceneComponentsGetInfoMSFT#componentType} field. */
        public XrSceneComponentsGetInfoMSFT.Buffer componentType(@NativeType("XrSceneComponentTypeMSFT") int value) { XrSceneComponentsGetInfoMSFT.ncomponentType(address(), value); return this; }

    }

}