/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes a layer of type {@link OVR#ovrLayerType_Cube LayerType_Cube} which is a single timewarped cubemap at infinity. When looking down the recentered origin's -Z axis, +X face
 * is left and +Y face is up. Similarly, if headlocked the +X face is left, +Y face is up and -Z face is forward. Note that the coordinate system is
 * left-handed.
 * 
 * <p>{@link OVR#ovrLayerFlag_TextureOriginAtBottomLeft LayerFlag_TextureOriginAtBottomLeft} flag is not supported by {@code ovrLayerCube}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrLayerCube {
 *     {@link OVRLayerHeader ovrLayerHeader} {@link #Header};
 *     {@link OVRQuatf ovrQuatf} {@link #Orientation};
 *     ovrTextureSwapChain {@link #CubeMapTexture};
 * }</code></pre>
 */
@NativeType("struct ovrLayerCube")
public class OVRLayerCube extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER,
        ORIENTATION,
        CUBEMAPTEXTURE;

    static {
        Layout layout = __struct(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF, true),
            __member(OVRQuatf.SIZEOF, OVRQuatf.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        ORIENTATION = layout.offsetof(1);
        CUBEMAPTEXTURE = layout.offsetof(2);
    }

    /**
     * Creates a {@code OVRLayerCube} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerCube(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code Header.Type} must be {@link OVR#ovrLayerType_Cube LayerType_Cube} */
    @NativeType("ovrLayerHeader")
    public OVRLayerHeader Header() { return nHeader(address()); }
    /** orientation of the cube */
    @NativeType("ovrQuatf")
    public OVRQuatf Orientation() { return nOrientation(address()); }
    /** contains a single cubemap swapchain (not a stereo pair of swapchains) */
    @NativeType("ovrTextureSwapChain")
    public long CubeMapTexture() { return nCubeMapTexture(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@link #Header} field. */
    public OVRLayerCube Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Passes the {@link #Header} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerCube Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
    /** Copies the specified {@link OVRQuatf} to the {@link #Orientation} field. */
    public OVRLayerCube Orientation(@NativeType("ovrQuatf") OVRQuatf value) { nOrientation(address(), value); return this; }
    /** Passes the {@link #Orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerCube Orientation(java.util.function.Consumer<OVRQuatf> consumer) { consumer.accept(Orientation()); return this; }
    /** Sets the specified value to the {@link #CubeMapTexture} field. */
    public OVRLayerCube CubeMapTexture(@NativeType("ovrTextureSwapChain") long value) { nCubeMapTexture(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRLayerCube set(
        OVRLayerHeader Header,
        OVRQuatf Orientation,
        long CubeMapTexture
    ) {
        Header(Header);
        Orientation(Orientation);
        CubeMapTexture(CubeMapTexture);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerCube set(OVRLayerCube src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRLayerCube} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerCube malloc() {
        return wrap(OVRLayerCube.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRLayerCube} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerCube calloc() {
        return wrap(OVRLayerCube.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRLayerCube} instance allocated with {@link BufferUtils}. */
    public static OVRLayerCube create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRLayerCube.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRLayerCube} instance for the specified memory address. */
    public static OVRLayerCube create(long address) {
        return wrap(OVRLayerCube.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerCube createSafe(long address) {
        return address == NULL ? null : wrap(OVRLayerCube.class, address);
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerCube.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerCube.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerCube.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRLayerCube.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRLayerCube.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerCube.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerCube mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerCube callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerCube mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerCube callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerCube.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerCube.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerCube.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerCube.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRLayerCube} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerCube malloc(MemoryStack stack) {
        return wrap(OVRLayerCube.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRLayerCube} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerCube calloc(MemoryStack stack) {
        return wrap(OVRLayerCube.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerCube.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerCube.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerCube.HEADER); }
    /** Unsafe version of {@link #Orientation}. */
    public static OVRQuatf nOrientation(long struct) { return OVRQuatf.create(struct + OVRLayerCube.ORIENTATION); }
    /** Unsafe version of {@link #CubeMapTexture}. */
    public static long nCubeMapTexture(long struct) { return memGetAddress(struct + OVRLayerCube.CUBEMAPTEXTURE); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerCube.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #Orientation(OVRQuatf) Orientation}. */
    public static void nOrientation(long struct, OVRQuatf value) { memCopy(value.address(), struct + OVRLayerCube.ORIENTATION, OVRQuatf.SIZEOF); }
    /** Unsafe version of {@link #CubeMapTexture(long) CubeMapTexture}. */
    public static void nCubeMapTexture(long struct, long value) { memPutAddress(struct + OVRLayerCube.CUBEMAPTEXTURE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRLayerCube.CUBEMAPTEXTURE));
    }

    // -----------------------------------

    /** An array of {@link OVRLayerCube} structs. */
    public static class Buffer extends StructBuffer<OVRLayerCube, Buffer> implements NativeResource {

        private static final OVRLayerCube ELEMENT_FACTORY = OVRLayerCube.create(-1L);

        /**
         * Creates a new {@code OVRLayerCube.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerCube#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerCube getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRLayerHeader} view of the {@link OVRLayerCube#Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerCube.nHeader(address()); }
        /** @return a {@link OVRQuatf} view of the {@link OVRLayerCube#Orientation} field. */
        @NativeType("ovrQuatf")
        public OVRQuatf Orientation() { return OVRLayerCube.nOrientation(address()); }
        /** @return the value of the {@link OVRLayerCube#CubeMapTexture} field. */
        @NativeType("ovrTextureSwapChain")
        public long CubeMapTexture() { return OVRLayerCube.nCubeMapTexture(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@link OVRLayerCube#Header} field. */
        public OVRLayerCube.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerCube.nHeader(address(), value); return this; }
        /** Passes the {@link OVRLayerCube#Header} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerCube.Buffer Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
        /** Copies the specified {@link OVRQuatf} to the {@link OVRLayerCube#Orientation} field. */
        public OVRLayerCube.Buffer Orientation(@NativeType("ovrQuatf") OVRQuatf value) { OVRLayerCube.nOrientation(address(), value); return this; }
        /** Passes the {@link OVRLayerCube#Orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerCube.Buffer Orientation(java.util.function.Consumer<OVRQuatf> consumer) { consumer.accept(Orientation()); return this; }
        /** Sets the specified value to the {@link OVRLayerCube#CubeMapTexture} field. */
        public OVRLayerCube.Buffer CubeMapTexture(@NativeType("ovrTextureSwapChain") long value) { OVRLayerCube.nCubeMapTexture(address(), value); return this; }

    }

}