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
 * The data of a hand mesh.
 * 
 * <h5>Description</h5>
 * 
 * <p>When the returned {@code isActive} value is {@link XR10#XR_FALSE FALSE}, the runtime indicates the hand is not actively tracked, for example, the hand is outside of sensor’s range, or the input focus is taken away from the application. When the runtime returns {@link XR10#XR_FALSE FALSE} to {@code isActive}, it <b>must</b> set {@code indexBufferChanged} and {@code vertexBufferChanged} to {@link XR10#XR_FALSE FALSE}, and <b>must</b> not change the content in {@code indexBuffer} or {@code vertexBuffer},</p>
 * 
 * <p>When the returned {@code isActive} value is {@link XR10#XR_TRUE TRUE}, the hand tracking mesh represented in {@code indexBuffer} and {@code vertexBuffer} are updated to the latest data of the {@code time} given to the {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT} function. The runtime <b>must</b> set {@code indexBufferChanged} and {@code vertexBufferChanged} to reflect whether the index or vertex buffer’s content are changed during the update. In this way, the application can easily avoid unnecessary processing of buffers when there’s no new data.</p>
 * 
 * <p>The hand mesh is represented in triangle lists and each triangle’s vertices are in clockwise order when looking from outside of the hand. When hand tracking is active, i.e. when {@code isActive} is returned as {@link XR10#XR_TRUE TRUE}, the returned {@code indexBuffer.indexCountOutput} value <b>must</b> be positive and multiple of 3, and {@code vertexBuffer.vertexCountOutput} value <b>must</b> be equal to or larger than 3.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using {@link XrHandMeshMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTHandTrackingMesh#XR_TYPE_HAND_MESH_MSFT TYPE_HAND_MESH_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code indexBuffer} <b>must</b> be a valid {@link XrHandMeshIndexBufferMSFT} structure</li>
 * <li>{@code vertexBuffer} <b>must</b> be a valid {@link XrHandMeshVertexBufferMSFT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandMeshIndexBufferMSFT}, {@link XrHandMeshVertexBufferMSFT}, {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandMeshMSFT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #isActive};
 *     XrBool32 {@link #indexBufferChanged};
 *     XrBool32 {@link #vertexBufferChanged};
 *     {@link XrHandMeshIndexBufferMSFT XrHandMeshIndexBufferMSFT} {@link #indexBuffer};
 *     {@link XrHandMeshVertexBufferMSFT XrHandMeshVertexBufferMSFT} {@link #vertexBuffer};
 * }</code></pre>
 */
public class XrHandMeshMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISACTIVE,
        INDEXBUFFERCHANGED,
        VERTEXBUFFERCHANGED,
        INDEXBUFFER,
        VERTEXBUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(XrHandMeshIndexBufferMSFT.SIZEOF, XrHandMeshIndexBufferMSFT.ALIGNOF),
            __member(XrHandMeshVertexBufferMSFT.SIZEOF, XrHandMeshVertexBufferMSFT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ISACTIVE = layout.offsetof(2);
        INDEXBUFFERCHANGED = layout.offsetof(3);
        VERTEXBUFFERCHANGED = layout.offsetof(4);
        INDEXBUFFER = layout.offsetof(5);
        VERTEXBUFFER = layout.offsetof(6);
    }

    /**
     * Creates a {@code XrHandMeshMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandMeshMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** an {@code XrBool32} indicating if the current hand tracker is active. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }
    /** an {@code XrBool32} indicating if the {@code indexBuffer} content was changed during the update. */
    @NativeType("XrBool32")
    public boolean indexBufferChanged() { return nindexBufferChanged(address()) != 0; }
    /** an {@code XrBool32} indicating if the {@code vertexBuffer} content was changed during the update. */
    @NativeType("XrBool32")
    public boolean vertexBufferChanged() { return nvertexBufferChanged(address()) != 0; }
    /** an {@link XrHandMeshIndexBufferMSFT} returns the index buffer of the tracked hand mesh. */
    public XrHandMeshIndexBufferMSFT indexBuffer() { return nindexBuffer(address()); }
    /** an {@link XrHandMeshVertexBufferMSFT} returns the vertex buffer of the tracked hand mesh. */
    public XrHandMeshVertexBufferMSFT vertexBuffer() { return nvertexBuffer(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandMeshMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_HAND_MESH_MSFT TYPE_HAND_MESH_MSFT} value to the {@link #type} field. */
    public XrHandMeshMSFT type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_HAND_MESH_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandMeshMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #isActive} field. */
    public XrHandMeshMSFT isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #indexBufferChanged} field. */
    public XrHandMeshMSFT indexBufferChanged(@NativeType("XrBool32") boolean value) { nindexBufferChanged(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #vertexBufferChanged} field. */
    public XrHandMeshMSFT vertexBufferChanged(@NativeType("XrBool32") boolean value) { nvertexBufferChanged(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link XrHandMeshIndexBufferMSFT} to the {@link #indexBuffer} field. */
    public XrHandMeshMSFT indexBuffer(XrHandMeshIndexBufferMSFT value) { nindexBuffer(address(), value); return this; }
    /** Passes the {@link #indexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrHandMeshMSFT indexBuffer(java.util.function.Consumer<XrHandMeshIndexBufferMSFT> consumer) { consumer.accept(indexBuffer()); return this; }
    /** Copies the specified {@link XrHandMeshVertexBufferMSFT} to the {@link #vertexBuffer} field. */
    public XrHandMeshMSFT vertexBuffer(XrHandMeshVertexBufferMSFT value) { nvertexBuffer(address(), value); return this; }
    /** Passes the {@link #vertexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrHandMeshMSFT vertexBuffer(java.util.function.Consumer<XrHandMeshVertexBufferMSFT> consumer) { consumer.accept(vertexBuffer()); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandMeshMSFT set(
        int type,
        long next,
        boolean isActive,
        boolean indexBufferChanged,
        boolean vertexBufferChanged,
        XrHandMeshIndexBufferMSFT indexBuffer,
        XrHandMeshVertexBufferMSFT vertexBuffer
    ) {
        type(type);
        next(next);
        isActive(isActive);
        indexBufferChanged(indexBufferChanged);
        vertexBufferChanged(vertexBufferChanged);
        indexBuffer(indexBuffer);
        vertexBuffer(vertexBuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandMeshMSFT set(XrHandMeshMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandMeshMSFT malloc() {
        return wrap(XrHandMeshMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandMeshMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandMeshMSFT calloc() {
        return wrap(XrHandMeshMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandMeshMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandMeshMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandMeshMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandMeshMSFT} instance for the specified memory address. */
    public static XrHandMeshMSFT create(long address) {
        return wrap(XrHandMeshMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandMeshMSFT.class, address);
    }

    /**
     * Returns a new {@link XrHandMeshMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandMeshMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandMeshMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshMSFT malloc(MemoryStack stack) {
        return wrap(XrHandMeshMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandMeshMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshMSFT calloc(MemoryStack stack) {
        return wrap(XrHandMeshMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandMeshMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandMeshMSFT.NEXT); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshMSFT.ISACTIVE); }
    /** Unsafe version of {@link #indexBufferChanged}. */
    public static int nindexBufferChanged(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshMSFT.INDEXBUFFERCHANGED); }
    /** Unsafe version of {@link #vertexBufferChanged}. */
    public static int nvertexBufferChanged(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshMSFT.VERTEXBUFFERCHANGED); }
    /** Unsafe version of {@link #indexBuffer}. */
    public static XrHandMeshIndexBufferMSFT nindexBuffer(long struct) { return XrHandMeshIndexBufferMSFT.create(struct + XrHandMeshMSFT.INDEXBUFFER); }
    /** Unsafe version of {@link #vertexBuffer}. */
    public static XrHandMeshVertexBufferMSFT nvertexBuffer(long struct) { return XrHandMeshVertexBufferMSFT.create(struct + XrHandMeshMSFT.VERTEXBUFFER); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandMeshMSFT.NEXT, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshMSFT.ISACTIVE, value); }
    /** Unsafe version of {@link #indexBufferChanged(boolean) indexBufferChanged}. */
    public static void nindexBufferChanged(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshMSFT.INDEXBUFFERCHANGED, value); }
    /** Unsafe version of {@link #vertexBufferChanged(boolean) vertexBufferChanged}. */
    public static void nvertexBufferChanged(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshMSFT.VERTEXBUFFERCHANGED, value); }
    /** Unsafe version of {@link #indexBuffer(XrHandMeshIndexBufferMSFT) indexBuffer}. */
    public static void nindexBuffer(long struct, XrHandMeshIndexBufferMSFT value) { memCopy(value.address(), struct + XrHandMeshMSFT.INDEXBUFFER, XrHandMeshIndexBufferMSFT.SIZEOF); }
    /** Unsafe version of {@link #vertexBuffer(XrHandMeshVertexBufferMSFT) vertexBuffer}. */
    public static void nvertexBuffer(long struct, XrHandMeshVertexBufferMSFT value) { memCopy(value.address(), struct + XrHandMeshMSFT.VERTEXBUFFER, XrHandMeshVertexBufferMSFT.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        XrHandMeshIndexBufferMSFT.validate(struct + XrHandMeshMSFT.INDEXBUFFER);
        XrHandMeshVertexBufferMSFT.validate(struct + XrHandMeshMSFT.VERTEXBUFFER);
    }

    // -----------------------------------

    /** An array of {@link XrHandMeshMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandMeshMSFT, Buffer> implements NativeResource {

        private static final XrHandMeshMSFT ELEMENT_FACTORY = XrHandMeshMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandMeshMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandMeshMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandMeshMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandMeshMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandMeshMSFT.ntype(address()); }
        /** @return the value of the {@link XrHandMeshMSFT#next} field. */
        @NativeType("void *")
        public long next() { return XrHandMeshMSFT.nnext(address()); }
        /** @return the value of the {@link XrHandMeshMSFT#isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrHandMeshMSFT.nisActive(address()) != 0; }
        /** @return the value of the {@link XrHandMeshMSFT#indexBufferChanged} field. */
        @NativeType("XrBool32")
        public boolean indexBufferChanged() { return XrHandMeshMSFT.nindexBufferChanged(address()) != 0; }
        /** @return the value of the {@link XrHandMeshMSFT#vertexBufferChanged} field. */
        @NativeType("XrBool32")
        public boolean vertexBufferChanged() { return XrHandMeshMSFT.nvertexBufferChanged(address()) != 0; }
        /** @return a {@link XrHandMeshIndexBufferMSFT} view of the {@link XrHandMeshMSFT#indexBuffer} field. */
        public XrHandMeshIndexBufferMSFT indexBuffer() { return XrHandMeshMSFT.nindexBuffer(address()); }
        /** @return a {@link XrHandMeshVertexBufferMSFT} view of the {@link XrHandMeshMSFT#vertexBuffer} field. */
        public XrHandMeshVertexBufferMSFT vertexBuffer() { return XrHandMeshMSFT.nvertexBuffer(address()); }

        /** Sets the specified value to the {@link XrHandMeshMSFT#type} field. */
        public XrHandMeshMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrHandMeshMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_HAND_MESH_MSFT TYPE_HAND_MESH_MSFT} value to the {@link XrHandMeshMSFT#type} field. */
        public XrHandMeshMSFT.Buffer type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_HAND_MESH_MSFT); }
        /** Sets the specified value to the {@link XrHandMeshMSFT#next} field. */
        public XrHandMeshMSFT.Buffer next(@NativeType("void *") long value) { XrHandMeshMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandMeshMSFT#isActive} field. */
        public XrHandMeshMSFT.Buffer isActive(@NativeType("XrBool32") boolean value) { XrHandMeshMSFT.nisActive(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrHandMeshMSFT#indexBufferChanged} field. */
        public XrHandMeshMSFT.Buffer indexBufferChanged(@NativeType("XrBool32") boolean value) { XrHandMeshMSFT.nindexBufferChanged(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrHandMeshMSFT#vertexBufferChanged} field. */
        public XrHandMeshMSFT.Buffer vertexBufferChanged(@NativeType("XrBool32") boolean value) { XrHandMeshMSFT.nvertexBufferChanged(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link XrHandMeshIndexBufferMSFT} to the {@link XrHandMeshMSFT#indexBuffer} field. */
        public XrHandMeshMSFT.Buffer indexBuffer(XrHandMeshIndexBufferMSFT value) { XrHandMeshMSFT.nindexBuffer(address(), value); return this; }
        /** Passes the {@link XrHandMeshMSFT#indexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrHandMeshMSFT.Buffer indexBuffer(java.util.function.Consumer<XrHandMeshIndexBufferMSFT> consumer) { consumer.accept(indexBuffer()); return this; }
        /** Copies the specified {@link XrHandMeshVertexBufferMSFT} to the {@link XrHandMeshMSFT#vertexBuffer} field. */
        public XrHandMeshMSFT.Buffer vertexBuffer(XrHandMeshVertexBufferMSFT value) { XrHandMeshMSFT.nvertexBuffer(address(), value); return this; }
        /** Passes the {@link XrHandMeshMSFT#vertexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrHandMeshMSFT.Buffer vertexBuffer(java.util.function.Consumer<XrHandMeshVertexBufferMSFT> consumer) { consumer.accept(vertexBuffer()); return this; }

    }

}