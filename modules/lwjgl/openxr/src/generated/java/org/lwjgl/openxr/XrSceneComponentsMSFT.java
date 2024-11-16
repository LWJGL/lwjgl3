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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Scene components.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneComponentsMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENTS_MSFT TYPE_SCENE_COMPONENTS_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrSceneMarkerQRCodesMSFT}, {@link XrSceneMarkersMSFT}, {@link XrSceneMeshesMSFT}, {@link XrSceneObjectsMSFT}, {@link XrScenePlanesMSFT}</li>
 * <li>If {@code componentCapacityInput} is not 0, {@code components} <b>must</b> be a pointer to an array of {@code componentCapacityInput} {@link XrSceneComponentMSFT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneComponentMSFT}, {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneComponentsMSFT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #componentCapacityInput};
 *     uint32_t {@link #componentCountOutput};
 *     {@link XrSceneComponentMSFT XrSceneComponentMSFT} * {@link #components};
 * }</code></pre>
 */
public class XrSceneComponentsMSFT extends Struct<XrSceneComponentsMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COMPONENTCAPACITYINPUT,
        COMPONENTCOUNTOUTPUT,
        COMPONENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COMPONENTCAPACITYINPUT = layout.offsetof(2);
        COMPONENTCOUNTOUTPUT = layout.offsetof(3);
        COMPONENTS = layout.offsetof(4);
    }

    protected XrSceneComponentsMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneComponentsMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSceneComponentsMSFT(address, container);
    }

    /**
     * Creates a {@code XrSceneComponentsMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneComponentsMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the capacity of the array, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int componentCapacityInput() { return ncomponentCapacityInput(address()); }
    /** a pointer to the count of components, or a pointer to the required capacity in the case that {@code componentCapacityInput} is insufficient. */
    @NativeType("uint32_t")
    public int componentCountOutput() { return ncomponentCountOutput(address()); }
    /** an array of {@link XrSceneComponentMSFT}. */
    @NativeType("XrSceneComponentMSFT *")
    public XrSceneComponentMSFT.@Nullable Buffer components() { return ncomponents(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneComponentsMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENTS_MSFT TYPE_SCENE_COMPONENTS_MSFT} value to the {@link #type} field. */
    public XrSceneComponentsMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENTS_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneComponentsMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSceneMarkerQRCodesMSFT} value to the {@code next} chain. */
    public XrSceneComponentsMSFT next(XrSceneMarkerQRCodesMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSceneMarkersMSFT} value to the {@code next} chain. */
    public XrSceneComponentsMSFT next(XrSceneMarkersMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSceneMeshesMSFT} value to the {@code next} chain. */
    public XrSceneComponentsMSFT next(XrSceneMeshesMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSceneObjectsMSFT} value to the {@code next} chain. */
    public XrSceneComponentsMSFT next(XrSceneObjectsMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrScenePlanesMSFT} value to the {@code next} chain. */
    public XrSceneComponentsMSFT next(XrScenePlanesMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #componentCapacityInput} field. */
    public XrSceneComponentsMSFT componentCapacityInput(@NativeType("uint32_t") int value) { ncomponentCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #componentCountOutput} field. */
    public XrSceneComponentsMSFT componentCountOutput(@NativeType("uint32_t") int value) { ncomponentCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrSceneComponentMSFT.Buffer} to the {@link #components} field. */
    public XrSceneComponentsMSFT components(@NativeType("XrSceneComponentMSFT *") XrSceneComponentMSFT.@Nullable Buffer value) { ncomponents(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneComponentsMSFT set(
        int type,
        long next,
        int componentCapacityInput,
        int componentCountOutput,
        XrSceneComponentMSFT.@Nullable Buffer components
    ) {
        type(type);
        next(next);
        componentCapacityInput(componentCapacityInput);
        componentCountOutput(componentCountOutput);
        components(components);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneComponentsMSFT set(XrSceneComponentsMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneComponentsMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneComponentsMSFT malloc() {
        return new XrSceneComponentsMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneComponentsMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneComponentsMSFT calloc() {
        return new XrSceneComponentsMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneComponentsMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneComponentsMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneComponentsMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneComponentsMSFT} instance for the specified memory address. */
    public static XrSceneComponentsMSFT create(long address) {
        return new XrSceneComponentsMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneComponentsMSFT createSafe(long address) {
        return address == NULL ? null : new XrSceneComponentsMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSceneComponentsMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentsMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentsMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneComponentsMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneComponentsMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneComponentsMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentsMSFT malloc(MemoryStack stack) {
        return new XrSceneComponentsMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneComponentsMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentsMSFT calloc(MemoryStack stack) {
        return new XrSceneComponentsMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneComponentsMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentsMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneComponentsMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneComponentsMSFT.NEXT); }
    /** Unsafe version of {@link #componentCapacityInput}. */
    public static int ncomponentCapacityInput(long struct) { return memGetInt(struct + XrSceneComponentsMSFT.COMPONENTCAPACITYINPUT); }
    /** Unsafe version of {@link #componentCountOutput}. */
    public static int ncomponentCountOutput(long struct) { return memGetInt(struct + XrSceneComponentsMSFT.COMPONENTCOUNTOUTPUT); }
    /** Unsafe version of {@link #components}. */
    public static XrSceneComponentMSFT.@Nullable Buffer ncomponents(long struct) { return XrSceneComponentMSFT.createSafe(memGetAddress(struct + XrSceneComponentsMSFT.COMPONENTS), ncomponentCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneComponentsMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneComponentsMSFT.NEXT, value); }
    /** Sets the specified value to the {@code componentCapacityInput} field of the specified {@code struct}. */
    public static void ncomponentCapacityInput(long struct, int value) { memPutInt(struct + XrSceneComponentsMSFT.COMPONENTCAPACITYINPUT, value); }
    /** Unsafe version of {@link #componentCountOutput(int) componentCountOutput}. */
    public static void ncomponentCountOutput(long struct, int value) { memPutInt(struct + XrSceneComponentsMSFT.COMPONENTCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #components(XrSceneComponentMSFT.Buffer) components}. */
    public static void ncomponents(long struct, XrSceneComponentMSFT.@Nullable Buffer value) { memPutAddress(struct + XrSceneComponentsMSFT.COMPONENTS, memAddressSafe(value)); if (value != null) { ncomponentCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSceneComponentsMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneComponentsMSFT, Buffer> implements NativeResource {

        private static final XrSceneComponentsMSFT ELEMENT_FACTORY = XrSceneComponentsMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneComponentsMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneComponentsMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneComponentsMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneComponentsMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneComponentsMSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneComponentsMSFT#next} field. */
        @NativeType("void *")
        public long next() { return XrSceneComponentsMSFT.nnext(address()); }
        /** @return the value of the {@link XrSceneComponentsMSFT#componentCapacityInput} field. */
        @NativeType("uint32_t")
        public int componentCapacityInput() { return XrSceneComponentsMSFT.ncomponentCapacityInput(address()); }
        /** @return the value of the {@link XrSceneComponentsMSFT#componentCountOutput} field. */
        @NativeType("uint32_t")
        public int componentCountOutput() { return XrSceneComponentsMSFT.ncomponentCountOutput(address()); }
        /** @return a {@link XrSceneComponentMSFT.Buffer} view of the struct array pointed to by the {@link XrSceneComponentsMSFT#components} field. */
        @NativeType("XrSceneComponentMSFT *")
        public XrSceneComponentMSFT.@Nullable Buffer components() { return XrSceneComponentsMSFT.ncomponents(address()); }

        /** Sets the specified value to the {@link XrSceneComponentsMSFT#type} field. */
        public XrSceneComponentsMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneComponentsMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENTS_MSFT TYPE_SCENE_COMPONENTS_MSFT} value to the {@link XrSceneComponentsMSFT#type} field. */
        public XrSceneComponentsMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENTS_MSFT); }
        /** Sets the specified value to the {@link XrSceneComponentsMSFT#next} field. */
        public XrSceneComponentsMSFT.Buffer next(@NativeType("void *") long value) { XrSceneComponentsMSFT.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSceneMarkerQRCodesMSFT} value to the {@code next} chain. */
        public XrSceneComponentsMSFT.Buffer next(XrSceneMarkerQRCodesMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSceneMarkersMSFT} value to the {@code next} chain. */
        public XrSceneComponentsMSFT.Buffer next(XrSceneMarkersMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSceneMeshesMSFT} value to the {@code next} chain. */
        public XrSceneComponentsMSFT.Buffer next(XrSceneMeshesMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSceneObjectsMSFT} value to the {@code next} chain. */
        public XrSceneComponentsMSFT.Buffer next(XrSceneObjectsMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrScenePlanesMSFT} value to the {@code next} chain. */
        public XrSceneComponentsMSFT.Buffer next(XrScenePlanesMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrSceneComponentsMSFT#componentCapacityInput} field. */
        public XrSceneComponentsMSFT.Buffer componentCapacityInput(@NativeType("uint32_t") int value) { XrSceneComponentsMSFT.ncomponentCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneComponentsMSFT#componentCountOutput} field. */
        public XrSceneComponentsMSFT.Buffer componentCountOutput(@NativeType("uint32_t") int value) { XrSceneComponentsMSFT.ncomponentCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrSceneComponentMSFT.Buffer} to the {@link XrSceneComponentsMSFT#components} field. */
        public XrSceneComponentsMSFT.Buffer components(@NativeType("XrSceneComponentMSFT *") XrSceneComponentMSFT.@Nullable Buffer value) { XrSceneComponentsMSFT.ncomponents(address(), value); return this; }

    }

}