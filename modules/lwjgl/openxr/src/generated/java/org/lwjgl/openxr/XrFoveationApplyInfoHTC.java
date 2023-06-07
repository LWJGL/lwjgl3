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
 * Information for foveation applying.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>should</b> set the following configurations in {@link XrFoveationApplyInfoHTC}:</p>
 * 
 * <ul>
 * <li>The foveation mode to be applied.</li>
 * <li>The specified {@link XrSwapchainSubImage} to the corresponding view.</li>
 * </ul>
 * 
 * <p>The {@code faceCount} of {@code XrSwapchain} in {@link XrSwapchainSubImage} <b>must</b> be 1 since this extension does not support cubemaps.</p>
 * 
 * <p>If {@code mode} is {@link HTCFoveation#XR_FOVEATION_MODE_DYNAMIC_HTC FOVEATION_MODE_DYNAMIC_HTC}, the {@code next} chain for this structure <b>must</b> include {@link XrFoveationDynamicModeInfoHTC} structure.</p>
 * 
 * <p>If {@code mode} is {@link HTCFoveation#XR_FOVEATION_MODE_CUSTOM_HTC FOVEATION_MODE_CUSTOM_HTC}, the {@code next} chain for this structure <b>must</b> include {@link XrFoveationCustomModeInfoHTC} structure.</p>
 * 
 * <p>The order of {@code subImages} <b>must</b> be the same order as in {@link XrCompositionLayerProjectionView} when submitted in {@link XR10#xrEndFrame EndFrame}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCFoveation XR_HTC_foveation} extension <b>must</b> be enabled prior to using {@link XrFoveationApplyInfoHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCFoveation#XR_TYPE_FOVEATION_APPLY_INFO_HTC TYPE_FOVEATION_APPLY_INFO_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrFoveationCustomModeInfoHTC}, {@link XrFoveationDynamicModeInfoHTC}</li>
 * <li>{@code mode} <b>must</b> be a valid {@code XrFoveationModeHTC} value</li>
 * <li>{@code subImages} <b>must</b> be a pointer to an array of {@code subImageCount} {@link XrSwapchainSubImage} structures</li>
 * <li>The {@code subImageCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSwapchainSubImage}, {@link HTCFoveation#xrApplyFoveationHTC ApplyFoveationHTC}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFoveationApplyInfoHTC {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrFoveationModeHTC {@link #mode};
 *     uint32_t {@link #subImageCount};
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} * {@link #subImages};
 * }</code></pre>
 */
public class XrFoveationApplyInfoHTC extends Struct<XrFoveationApplyInfoHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MODE,
        SUBIMAGECOUNT,
        SUBIMAGES;

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
        MODE = layout.offsetof(2);
        SUBIMAGECOUNT = layout.offsetof(3);
        SUBIMAGES = layout.offsetof(4);
    }

    protected XrFoveationApplyInfoHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFoveationApplyInfoHTC create(long address, @Nullable ByteBuffer container) {
        return new XrFoveationApplyInfoHTC(address, container);
    }

    /**
     * Creates a {@code XrFoveationApplyInfoHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFoveationApplyInfoHTC(ByteBuffer container) {
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
    /** an {@code XrFoveationModeHTC} enum describing the foveation mode. */
    @NativeType("XrFoveationModeHTC")
    public int mode() { return nmode(address()); }
    /** the count of {@code subImages} in the {@code subImages} array. This <b>must</b> be equal to the number of view poses returned by {@link XR10#xrLocateViews LocateViews}. */
    @NativeType("uint32_t")
    public int subImageCount() { return nsubImageCount(address()); }
    /** an array of {@link XrSwapchainSubImage} to apply foveated rendering. */
    @NativeType("XrSwapchainSubImage *")
    public XrSwapchainSubImage.Buffer subImages() { return nsubImages(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFoveationApplyInfoHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCFoveation#XR_TYPE_FOVEATION_APPLY_INFO_HTC TYPE_FOVEATION_APPLY_INFO_HTC} value to the {@link #type} field. */
    public XrFoveationApplyInfoHTC type$Default() { return type(HTCFoveation.XR_TYPE_FOVEATION_APPLY_INFO_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFoveationApplyInfoHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrFoveationCustomModeInfoHTC} value to the {@code next} chain. */
    public XrFoveationApplyInfoHTC next(XrFoveationCustomModeInfoHTC value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrFoveationDynamicModeInfoHTC} value to the {@code next} chain. */
    public XrFoveationApplyInfoHTC next(XrFoveationDynamicModeInfoHTC value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #mode} field. */
    public XrFoveationApplyInfoHTC mode(@NativeType("XrFoveationModeHTC") int value) { nmode(address(), value); return this; }
    /** Sets the address of the specified {@link XrSwapchainSubImage.Buffer} to the {@link #subImages} field. */
    public XrFoveationApplyInfoHTC subImages(@NativeType("XrSwapchainSubImage *") XrSwapchainSubImage.Buffer value) { nsubImages(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFoveationApplyInfoHTC set(
        int type,
        long next,
        int mode,
        XrSwapchainSubImage.Buffer subImages
    ) {
        type(type);
        next(next);
        mode(mode);
        subImages(subImages);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFoveationApplyInfoHTC set(XrFoveationApplyInfoHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFoveationApplyInfoHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFoveationApplyInfoHTC malloc() {
        return new XrFoveationApplyInfoHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationApplyInfoHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFoveationApplyInfoHTC calloc() {
        return new XrFoveationApplyInfoHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationApplyInfoHTC} instance allocated with {@link BufferUtils}. */
    public static XrFoveationApplyInfoHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFoveationApplyInfoHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrFoveationApplyInfoHTC} instance for the specified memory address. */
    public static XrFoveationApplyInfoHTC create(long address) {
        return new XrFoveationApplyInfoHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationApplyInfoHTC createSafe(long address) {
        return address == NULL ? null : new XrFoveationApplyInfoHTC(address, null);
    }

    /**
     * Returns a new {@link XrFoveationApplyInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFoveationApplyInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationApplyInfoHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFoveationApplyInfoHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationApplyInfoHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFoveationApplyInfoHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationApplyInfoHTC malloc(MemoryStack stack) {
        return new XrFoveationApplyInfoHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFoveationApplyInfoHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationApplyInfoHTC calloc(MemoryStack stack) {
        return new XrFoveationApplyInfoHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFoveationApplyInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationApplyInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFoveationApplyInfoHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFoveationApplyInfoHTC.NEXT); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + XrFoveationApplyInfoHTC.MODE); }
    /** Unsafe version of {@link #subImageCount}. */
    public static int nsubImageCount(long struct) { return UNSAFE.getInt(null, struct + XrFoveationApplyInfoHTC.SUBIMAGECOUNT); }
    /** Unsafe version of {@link #subImages}. */
    public static XrSwapchainSubImage.Buffer nsubImages(long struct) { return XrSwapchainSubImage.create(memGetAddress(struct + XrFoveationApplyInfoHTC.SUBIMAGES), nsubImageCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationApplyInfoHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFoveationApplyInfoHTC.NEXT, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationApplyInfoHTC.MODE, value); }
    /** Sets the specified value to the {@code subImageCount} field of the specified {@code struct}. */
    public static void nsubImageCount(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationApplyInfoHTC.SUBIMAGECOUNT, value); }
    /** Unsafe version of {@link #subImages(XrSwapchainSubImage.Buffer) subImages}. */
    public static void nsubImages(long struct, XrSwapchainSubImage.Buffer value) { memPutAddress(struct + XrFoveationApplyInfoHTC.SUBIMAGES, value.address()); nsubImageCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int subImageCount = nsubImageCount(struct);
        long subImages = memGetAddress(struct + XrFoveationApplyInfoHTC.SUBIMAGES);
        check(subImages);
        validate(subImages, subImageCount, XrSwapchainSubImage.SIZEOF, XrSwapchainSubImage::validate);
    }

    // -----------------------------------

    /** An array of {@link XrFoveationApplyInfoHTC} structs. */
    public static class Buffer extends StructBuffer<XrFoveationApplyInfoHTC, Buffer> implements NativeResource {

        private static final XrFoveationApplyInfoHTC ELEMENT_FACTORY = XrFoveationApplyInfoHTC.create(-1L);

        /**
         * Creates a new {@code XrFoveationApplyInfoHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFoveationApplyInfoHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFoveationApplyInfoHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFoveationApplyInfoHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFoveationApplyInfoHTC.ntype(address()); }
        /** @return the value of the {@link XrFoveationApplyInfoHTC#next} field. */
        @NativeType("void const *")
        public long next() { return XrFoveationApplyInfoHTC.nnext(address()); }
        /** @return the value of the {@link XrFoveationApplyInfoHTC#mode} field. */
        @NativeType("XrFoveationModeHTC")
        public int mode() { return XrFoveationApplyInfoHTC.nmode(address()); }
        /** @return the value of the {@link XrFoveationApplyInfoHTC#subImageCount} field. */
        @NativeType("uint32_t")
        public int subImageCount() { return XrFoveationApplyInfoHTC.nsubImageCount(address()); }
        /** @return a {@link XrSwapchainSubImage.Buffer} view of the struct array pointed to by the {@link XrFoveationApplyInfoHTC#subImages} field. */
        @NativeType("XrSwapchainSubImage *")
        public XrSwapchainSubImage.Buffer subImages() { return XrFoveationApplyInfoHTC.nsubImages(address()); }

        /** Sets the specified value to the {@link XrFoveationApplyInfoHTC#type} field. */
        public XrFoveationApplyInfoHTC.Buffer type(@NativeType("XrStructureType") int value) { XrFoveationApplyInfoHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCFoveation#XR_TYPE_FOVEATION_APPLY_INFO_HTC TYPE_FOVEATION_APPLY_INFO_HTC} value to the {@link XrFoveationApplyInfoHTC#type} field. */
        public XrFoveationApplyInfoHTC.Buffer type$Default() { return type(HTCFoveation.XR_TYPE_FOVEATION_APPLY_INFO_HTC); }
        /** Sets the specified value to the {@link XrFoveationApplyInfoHTC#next} field. */
        public XrFoveationApplyInfoHTC.Buffer next(@NativeType("void const *") long value) { XrFoveationApplyInfoHTC.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrFoveationCustomModeInfoHTC} value to the {@code next} chain. */
        public XrFoveationApplyInfoHTC.Buffer next(XrFoveationCustomModeInfoHTC value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrFoveationDynamicModeInfoHTC} value to the {@code next} chain. */
        public XrFoveationApplyInfoHTC.Buffer next(XrFoveationDynamicModeInfoHTC value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrFoveationApplyInfoHTC#mode} field. */
        public XrFoveationApplyInfoHTC.Buffer mode(@NativeType("XrFoveationModeHTC") int value) { XrFoveationApplyInfoHTC.nmode(address(), value); return this; }
        /** Sets the address of the specified {@link XrSwapchainSubImage.Buffer} to the {@link XrFoveationApplyInfoHTC#subImages} field. */
        public XrFoveationApplyInfoHTC.Buffer subImages(@NativeType("XrSwapchainSubImage *") XrSwapchainSubImage.Buffer value) { XrFoveationApplyInfoHTC.nsubImages(address(), value); return this; }

    }

}