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
 * Scene component.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> set {@code parentId} to either zero or a valid {@link XrUuidMSFT} that corresponds to a scene component of type {@link MSFTSceneUnderstanding#XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT SCENE_COMPONENT_TYPE_OBJECT_MSFT} that exists in the {@code XrSceneMSFT}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The parent scene object is intended to allow scene components to be grouped. For example, the scene object for a wall might have multiple scene component children like {@link MSFTSceneUnderstanding#XR_SCENE_COMPONENT_TYPE_PLANE_MSFT SCENE_COMPONENT_TYPE_PLANE_MSFT}, {@link MSFTSceneUnderstanding#XR_SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT}, and {@link MSFTSceneUnderstanding#XR_SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT}. Those child scene components would be alternative representations of the same wall.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneComponentMSFT}</li>
 * <li>{@code componentType} <b>must</b> be a valid {@code XrSceneComponentTypeMSFT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneComponentsMSFT}, {@link XrUuidMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneComponentMSFT {
 *     XrSceneComponentTypeMSFT {@link #componentType};
 *     {@link XrUuidMSFT XrUuidMSFT} {@link #id};
 *     {@link XrUuidMSFT XrUuidMSFT} {@link #parentId};
 *     XrTime {@link #updateTime};
 * }</code></pre>
 */
public class XrSceneComponentMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COMPONENTTYPE,
        ID,
        PARENTID,
        UPDATETIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(XrUuidMSFT.SIZEOF, XrUuidMSFT.ALIGNOF),
            __member(XrUuidMSFT.SIZEOF, XrUuidMSFT.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COMPONENTTYPE = layout.offsetof(0);
        ID = layout.offsetof(1);
        PARENTID = layout.offsetof(2);
        UPDATETIME = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSceneComponentMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneComponentMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrSceneComponentTypeMSFT} of the scene component. */
    @NativeType("XrSceneComponentTypeMSFT")
    public int componentType() { return ncomponentType(address()); }
    /** the {@link XrUuidMSFT} of the scene component. */
    public XrUuidMSFT id() { return nid(address()); }
    /** the {@link XrUuidMSFT} of the parent scene object. If the scene component does not have a parent, then {@code parentId} will be equal to zero. */
    public XrUuidMSFT parentId() { return nparentId(address()); }
    /** the {@code XrTime} that this scene component was last updated. */
    @NativeType("XrTime")
    public long updateTime() { return nupdateTime(address()); }

    /** Sets the specified value to the {@link #componentType} field. */
    public XrSceneComponentMSFT componentType(@NativeType("XrSceneComponentTypeMSFT") int value) { ncomponentType(address(), value); return this; }
    /** Copies the specified {@link XrUuidMSFT} to the {@link #id} field. */
    public XrSceneComponentMSFT id(XrUuidMSFT value) { nid(address(), value); return this; }
    /** Passes the {@link #id} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneComponentMSFT id(java.util.function.Consumer<XrUuidMSFT> consumer) { consumer.accept(id()); return this; }
    /** Copies the specified {@link XrUuidMSFT} to the {@link #parentId} field. */
    public XrSceneComponentMSFT parentId(XrUuidMSFT value) { nparentId(address(), value); return this; }
    /** Passes the {@link #parentId} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneComponentMSFT parentId(java.util.function.Consumer<XrUuidMSFT> consumer) { consumer.accept(parentId()); return this; }
    /** Sets the specified value to the {@link #updateTime} field. */
    public XrSceneComponentMSFT updateTime(@NativeType("XrTime") long value) { nupdateTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneComponentMSFT set(
        int componentType,
        XrUuidMSFT id,
        XrUuidMSFT parentId,
        long updateTime
    ) {
        componentType(componentType);
        id(id);
        parentId(parentId);
        updateTime(updateTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneComponentMSFT set(XrSceneComponentMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneComponentMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneComponentMSFT malloc() {
        return wrap(XrSceneComponentMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneComponentMSFT calloc() {
        return wrap(XrSceneComponentMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneComponentMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneComponentMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneComponentMSFT} instance for the specified memory address. */
    public static XrSceneComponentMSFT create(long address) {
        return wrap(XrSceneComponentMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneComponentMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneComponentMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneComponentMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneComponentMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneComponentMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneComponentMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneComponentMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneComponentMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #componentType}. */
    public static int ncomponentType(long struct) { return UNSAFE.getInt(null, struct + XrSceneComponentMSFT.COMPONENTTYPE); }
    /** Unsafe version of {@link #id}. */
    public static XrUuidMSFT nid(long struct) { return XrUuidMSFT.create(struct + XrSceneComponentMSFT.ID); }
    /** Unsafe version of {@link #parentId}. */
    public static XrUuidMSFT nparentId(long struct) { return XrUuidMSFT.create(struct + XrSceneComponentMSFT.PARENTID); }
    /** Unsafe version of {@link #updateTime}. */
    public static long nupdateTime(long struct) { return UNSAFE.getLong(null, struct + XrSceneComponentMSFT.UPDATETIME); }

    /** Unsafe version of {@link #componentType(int) componentType}. */
    public static void ncomponentType(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneComponentMSFT.COMPONENTTYPE, value); }
    /** Unsafe version of {@link #id(XrUuidMSFT) id}. */
    public static void nid(long struct, XrUuidMSFT value) { memCopy(value.address(), struct + XrSceneComponentMSFT.ID, XrUuidMSFT.SIZEOF); }
    /** Unsafe version of {@link #parentId(XrUuidMSFT) parentId}. */
    public static void nparentId(long struct, XrUuidMSFT value) { memCopy(value.address(), struct + XrSceneComponentMSFT.PARENTID, XrUuidMSFT.SIZEOF); }
    /** Unsafe version of {@link #updateTime(long) updateTime}. */
    public static void nupdateTime(long struct, long value) { UNSAFE.putLong(null, struct + XrSceneComponentMSFT.UPDATETIME, value); }

    // -----------------------------------

    /** An array of {@link XrSceneComponentMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneComponentMSFT, Buffer> implements NativeResource {

        private static final XrSceneComponentMSFT ELEMENT_FACTORY = XrSceneComponentMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneComponentMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneComponentMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneComponentMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneComponentMSFT#componentType} field. */
        @NativeType("XrSceneComponentTypeMSFT")
        public int componentType() { return XrSceneComponentMSFT.ncomponentType(address()); }
        /** @return a {@link XrUuidMSFT} view of the {@link XrSceneComponentMSFT#id} field. */
        public XrUuidMSFT id() { return XrSceneComponentMSFT.nid(address()); }
        /** @return a {@link XrUuidMSFT} view of the {@link XrSceneComponentMSFT#parentId} field. */
        public XrUuidMSFT parentId() { return XrSceneComponentMSFT.nparentId(address()); }
        /** @return the value of the {@link XrSceneComponentMSFT#updateTime} field. */
        @NativeType("XrTime")
        public long updateTime() { return XrSceneComponentMSFT.nupdateTime(address()); }

        /** Sets the specified value to the {@link XrSceneComponentMSFT#componentType} field. */
        public XrSceneComponentMSFT.Buffer componentType(@NativeType("XrSceneComponentTypeMSFT") int value) { XrSceneComponentMSFT.ncomponentType(address(), value); return this; }
        /** Copies the specified {@link XrUuidMSFT} to the {@link XrSceneComponentMSFT#id} field. */
        public XrSceneComponentMSFT.Buffer id(XrUuidMSFT value) { XrSceneComponentMSFT.nid(address(), value); return this; }
        /** Passes the {@link XrSceneComponentMSFT#id} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneComponentMSFT.Buffer id(java.util.function.Consumer<XrUuidMSFT> consumer) { consumer.accept(id()); return this; }
        /** Copies the specified {@link XrUuidMSFT} to the {@link XrSceneComponentMSFT#parentId} field. */
        public XrSceneComponentMSFT.Buffer parentId(XrUuidMSFT value) { XrSceneComponentMSFT.nparentId(address(), value); return this; }
        /** Passes the {@link XrSceneComponentMSFT#parentId} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneComponentMSFT.Buffer parentId(java.util.function.Consumer<XrUuidMSFT> consumer) { consumer.accept(parentId()); return this; }
        /** Sets the specified value to the {@link XrSceneComponentMSFT#updateTime} field. */
        public XrSceneComponentMSFT.Buffer updateTime(@NativeType("XrTime") long value) { XrSceneComponentMSFT.nupdateTime(address(), value); return this; }

    }

}