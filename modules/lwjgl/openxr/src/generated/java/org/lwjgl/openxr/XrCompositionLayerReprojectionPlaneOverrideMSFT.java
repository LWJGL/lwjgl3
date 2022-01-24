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
 * Describe the parameters to override the reprojection plane.
 * 
 * <h5>Description</h5>
 * 
 * <p>A runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if the {@code normal} vector deviates by more than 1% from unit length.</p>
 * 
 * <p>Adding a reprojection plane override <b>may</b> benefit various reprojection modes including {@link MSFTCompositionLayerReprojection#XR_REPROJECTION_MODE_DEPTH_MSFT REPROJECTION_MODE_DEPTH_MSFT}, {@link MSFTCompositionLayerReprojection#XR_REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT} and {@link MSFTCompositionLayerReprojection#XR_REPROJECTION_MODE_PLANAR_MANUAL_MSFT REPROJECTION_MODE_PLANAR_MANUAL_MSFT}.</p>
 * 
 * <p>When application choose {@link MSFTCompositionLayerReprojection#XR_REPROJECTION_MODE_ORIENTATION_ONLY_MSFT REPROJECTION_MODE_ORIENTATION_ONLY_MSFT} mode, the reprojection plane override <b>may</b> be ignored by the runtime.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTCompositionLayerReprojection XR_MSFT_composition_layer_reprojection} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerReprojectionPlaneOverrideMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTCompositionLayerReprojection#XR_TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrVector3f}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerReprojectionPlaneOverrideMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrVector3f XrVector3f} {@link #position$ position};
 *     {@link XrVector3f XrVector3f} {@link #normal};
 *     {@link XrVector3f XrVector3f} {@link #velocity};
 * }</code></pre>
 */
public class XrCompositionLayerReprojectionPlaneOverrideMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        POSITION,
        NORMAL,
        VELOCITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        POSITION = layout.offsetof(2);
        NORMAL = layout.offsetof(3);
        VELOCITY = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrCompositionLayerReprojectionPlaneOverrideMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** describes the position of the focus plane represented in the corresponding {@link XrCompositionLayerProjection}{@code ::space}. */
    public XrVector3f position$() { return nposition$(address()); }
    /** a unit vector describes the focus plane normal represented in the corresponding {@link XrCompositionLayerProjection}{@code ::space}. */
    public XrVector3f normal() { return nnormal(address()); }
    /** a velocity of the position in the corresponding {@link XrCompositionLayerProjection}{@code ::space} measured in meters per second. */
    public XrVector3f velocity() { return nvelocity(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTCompositionLayerReprojection#XR_TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT} value to the {@code type} field. */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT type$Default() { return type(MSFTCompositionLayerReprojection.XR_TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@link #position$} field. */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT position$(XrVector3f value) { nposition$(address(), value); return this; }
    /** Passes the {@link #position$} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT position$(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(position$()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@link #normal} field. */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT normal(XrVector3f value) { nnormal(address(), value); return this; }
    /** Passes the {@link #normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT normal(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(normal()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@link #velocity} field. */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT velocity(XrVector3f value) { nvelocity(address(), value); return this; }
    /** Passes the {@link #velocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT velocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(velocity()); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT set(
        int type,
        long next,
        XrVector3f position$,
        XrVector3f normal,
        XrVector3f velocity
    ) {
        type(type);
        next(next);
        position$(position$);
        normal(normal);
        velocity(velocity);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerReprojectionPlaneOverrideMSFT set(XrCompositionLayerReprojectionPlaneOverrideMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerReprojectionPlaneOverrideMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT malloc() {
        return wrap(XrCompositionLayerReprojectionPlaneOverrideMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerReprojectionPlaneOverrideMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT calloc() {
        return wrap(XrCompositionLayerReprojectionPlaneOverrideMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerReprojectionPlaneOverrideMSFT} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerReprojectionPlaneOverrideMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerReprojectionPlaneOverrideMSFT} instance for the specified memory address. */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT create(long address) {
        return wrap(XrCompositionLayerReprojectionPlaneOverrideMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerReprojectionPlaneOverrideMSFT.class, address);
    }

    /**
     * Returns a new {@link XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerReprojectionPlaneOverrideMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerReprojectionPlaneOverrideMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerReprojectionPlaneOverrideMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerReprojectionPlaneOverrideMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerReprojectionPlaneOverrideMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerReprojectionPlaneOverrideMSFT.NEXT); }
    /** Unsafe version of {@link #position$}. */
    public static XrVector3f nposition$(long struct) { return XrVector3f.create(struct + XrCompositionLayerReprojectionPlaneOverrideMSFT.POSITION); }
    /** Unsafe version of {@link #normal}. */
    public static XrVector3f nnormal(long struct) { return XrVector3f.create(struct + XrCompositionLayerReprojectionPlaneOverrideMSFT.NORMAL); }
    /** Unsafe version of {@link #velocity}. */
    public static XrVector3f nvelocity(long struct) { return XrVector3f.create(struct + XrCompositionLayerReprojectionPlaneOverrideMSFT.VELOCITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerReprojectionPlaneOverrideMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerReprojectionPlaneOverrideMSFT.NEXT, value); }
    /** Unsafe version of {@link #position$(XrVector3f) position$}. */
    public static void nposition$(long struct, XrVector3f value) { memCopy(value.address(), struct + XrCompositionLayerReprojectionPlaneOverrideMSFT.POSITION, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #normal(XrVector3f) normal}. */
    public static void nnormal(long struct, XrVector3f value) { memCopy(value.address(), struct + XrCompositionLayerReprojectionPlaneOverrideMSFT.NORMAL, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #velocity(XrVector3f) velocity}. */
    public static void nvelocity(long struct, XrVector3f value) { memCopy(value.address(), struct + XrCompositionLayerReprojectionPlaneOverrideMSFT.VELOCITY, XrVector3f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerReprojectionPlaneOverrideMSFT} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerReprojectionPlaneOverrideMSFT, Buffer> implements NativeResource {

        private static final XrCompositionLayerReprojectionPlaneOverrideMSFT ELEMENT_FACTORY = XrCompositionLayerReprojectionPlaneOverrideMSFT.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerReprojectionPlaneOverrideMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerReprojectionPlaneOverrideMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerReprojectionPlaneOverrideMSFT.nnext(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#position$} field. */
        public XrVector3f position$() { return XrCompositionLayerReprojectionPlaneOverrideMSFT.nposition$(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#normal} field. */
        public XrVector3f normal() { return XrCompositionLayerReprojectionPlaneOverrideMSFT.nnormal(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#velocity} field. */
        public XrVector3f velocity() { return XrCompositionLayerReprojectionPlaneOverrideMSFT.nvelocity(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerReprojectionPlaneOverrideMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTCompositionLayerReprojection#XR_TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT} value to the {@code type} field. */
        public XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer type$Default() { return type(MSFTCompositionLayerReprojection.XR_TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerReprojectionPlaneOverrideMSFT.nnext(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#position$} field. */
        public XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer position$(XrVector3f value) { XrCompositionLayerReprojectionPlaneOverrideMSFT.nposition$(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#position$} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer position$(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(position$()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#normal} field. */
        public XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer normal(XrVector3f value) { XrCompositionLayerReprojectionPlaneOverrideMSFT.nnormal(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer normal(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(normal()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#velocity} field. */
        public XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer velocity(XrVector3f value) { XrCompositionLayerReprojectionPlaneOverrideMSFT.nvelocity(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#velocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerReprojectionPlaneOverrideMSFT.Buffer velocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(velocity()); return this; }

    }

}