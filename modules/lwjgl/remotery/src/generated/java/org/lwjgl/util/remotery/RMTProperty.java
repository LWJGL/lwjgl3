/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Definition of a property that should be stored globally.
 * 
 * <p>Note: Use the callback api and the {@code rmt_PropertyGetxxx} accessors to traverse this structure.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct rmtProperty {
 *     rmtBool {@link #initialised};
 *     rmtPropertyType {@link #type};
 *     rmtPropertyFlags flags;
 *     {@link RMTPropertyValue rmtPropertyValue} {@link #value};
 *     {@link RMTPropertyValue rmtPropertyValue} {@link #lastFrameValue};
 *     {@link RMTPropertyValue rmtPropertyValue} {@link #prevValue};
 *     rmtU32 prevValueFrame;
 *     char const * {@link #name};
 *     char const * description;
 *     {@link RMTPropertyValue rmtPropertyValue} {@link #defaultValue};
 *     {@link RMTProperty rmtProperty} * {@link #parent};
 *     {@link RMTProperty rmtProperty} * {@link #firstChild};
 *     {@link RMTProperty rmtProperty} * {@link #lastChild};
 *     {@link RMTProperty rmtProperty} * {@link #nextSibling};
 *     rmtU32 {@link #nameHash};
 *     rmtU32 {@link #uniqueID};
 * }</code></pre>
 */
@NativeType("struct rmtProperty")
public class RMTProperty extends Struct<RMTProperty> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INITIALISED,
        TYPE,
        FLAGS,
        VALUE,
        LASTFRAMEVALUE,
        PREVVALUE,
        PREVVALUEFRAME,
        NAME,
        DESCRIPTION,
        DEFAULTVALUE,
        PARENT,
        FIRSTCHILD,
        LASTCHILD,
        NEXTSIBLING,
        NAMEHASH,
        UNIQUEID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(RMTPropertyValue.SIZEOF, RMTPropertyValue.ALIGNOF),
            __member(RMTPropertyValue.SIZEOF, RMTPropertyValue.ALIGNOF),
            __member(RMTPropertyValue.SIZEOF, RMTPropertyValue.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(RMTPropertyValue.SIZEOF, RMTPropertyValue.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INITIALISED = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VALUE = layout.offsetof(3);
        LASTFRAMEVALUE = layout.offsetof(4);
        PREVVALUE = layout.offsetof(5);
        PREVVALUEFRAME = layout.offsetof(6);
        NAME = layout.offsetof(7);
        DESCRIPTION = layout.offsetof(8);
        DEFAULTVALUE = layout.offsetof(9);
        PARENT = layout.offsetof(10);
        FIRSTCHILD = layout.offsetof(11);
        LASTCHILD = layout.offsetof(12);
        NEXTSIBLING = layout.offsetof(13);
        NAMEHASH = layout.offsetof(14);
        UNIQUEID = layout.offsetof(15);
    }

    protected RMTProperty(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RMTProperty create(long address, @Nullable ByteBuffer container) {
        return new RMTProperty(address, container);
    }

    /**
     * Creates a {@code RMTProperty} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RMTProperty(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** gets set to {@link Remotery#RMT_TRUE TRUE} after a property has been modified, when it gets initialised for the first time */
    @NativeType("rmtBool")
    public boolean initialised() { return ninitialised(address()) != 0; }
    /** runtime description */
    @NativeType("rmtPropertyType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("rmtPropertyFlags")
    public int flags() { return nflags(address()); }
    /** current value */
    @NativeType("rmtPropertyValue")
    public RMTPropertyValue value() { return nvalue(address()); }
    /** last frame value to see if previous value needs to be updated */
    @NativeType("rmtPropertyValue")
    public RMTPropertyValue lastFrameValue() { return nlastFrameValue(address()); }
    /** previous value only if it's different from the current value, and when it changed */
    @NativeType("rmtPropertyValue")
    public RMTPropertyValue prevValue() { return nprevValue(address()); }
    /** @return the value of the {@code prevValueFrame} field. */
    @NativeType("rmtU32")
    public int prevValueFrame() { return nprevValueFrame(address()); }
    /** text description */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** text description */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code description} field. */
    @NativeType("char const *")
    public ByteBuffer description() { return ndescription(address()); }
    /** @return the null-terminated string pointed to by the {@code description} field. */
    @NativeType("char const *")
    public String descriptionString() { return ndescriptionString(address()); }
    /** default value for Reset calls */
    @NativeType("rmtPropertyValue")
    public RMTPropertyValue defaultValue() { return ndefaultValue(address()); }
    /** parent link specifically placed after default value so that variadic macro can initialise it */
    @Nullable
    @NativeType("rmtProperty *")
    public RMTProperty parent() { return nparent(address()); }
    /** links within the property tree */
    @Nullable
    @NativeType("rmtProperty *")
    public RMTProperty firstChild() { return nfirstChild(address()); }
    /** links within the property tree */
    @Nullable
    @NativeType("rmtProperty *")
    public RMTProperty lastChild() { return nlastChild(address()); }
    /** links within the property tree */
    @Nullable
    @NativeType("rmtProperty *")
    public RMTProperty nextSibling() { return nnextSibling(address()); }
    /** hash for efficient sending of properties to the viewer */
    @NativeType("rmtU32")
    public int nameHash() { return nnameHash(address()); }
    /** unique, persistent ID among all properties */
    @NativeType("rmtU32")
    public int uniqueID() { return nuniqueID(address()); }

    /** Sets the specified value to the {@link #initialised} field. */
    public RMTProperty initialised(@NativeType("rmtBool") boolean value) { ninitialised(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public RMTProperty type(@NativeType("rmtPropertyType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public RMTProperty flags(@NativeType("rmtPropertyFlags") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link RMTPropertyValue} to the {@link #value} field. */
    public RMTProperty value(@NativeType("rmtPropertyValue") RMTPropertyValue value) { nvalue(address(), value); return this; }
    /** Passes the {@link #value} field to the specified {@link java.util.function.Consumer Consumer}. */
    public RMTProperty value(java.util.function.Consumer<RMTPropertyValue> consumer) { consumer.accept(value()); return this; }
    /** Copies the specified {@link RMTPropertyValue} to the {@link #lastFrameValue} field. */
    public RMTProperty lastFrameValue(@NativeType("rmtPropertyValue") RMTPropertyValue value) { nlastFrameValue(address(), value); return this; }
    /** Passes the {@link #lastFrameValue} field to the specified {@link java.util.function.Consumer Consumer}. */
    public RMTProperty lastFrameValue(java.util.function.Consumer<RMTPropertyValue> consumer) { consumer.accept(lastFrameValue()); return this; }
    /** Copies the specified {@link RMTPropertyValue} to the {@link #prevValue} field. */
    public RMTProperty prevValue(@NativeType("rmtPropertyValue") RMTPropertyValue value) { nprevValue(address(), value); return this; }
    /** Passes the {@link #prevValue} field to the specified {@link java.util.function.Consumer Consumer}. */
    public RMTProperty prevValue(java.util.function.Consumer<RMTPropertyValue> consumer) { consumer.accept(prevValue()); return this; }
    /** Sets the specified value to the {@code prevValueFrame} field. */
    public RMTProperty prevValueFrame(@NativeType("rmtU32") int value) { nprevValueFrame(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #name} field. */
    public RMTProperty name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code description} field. */
    public RMTProperty description(@NativeType("char const *") ByteBuffer value) { ndescription(address(), value); return this; }
    /** Copies the specified {@link RMTPropertyValue} to the {@link #defaultValue} field. */
    public RMTProperty defaultValue(@NativeType("rmtPropertyValue") RMTPropertyValue value) { ndefaultValue(address(), value); return this; }
    /** Passes the {@link #defaultValue} field to the specified {@link java.util.function.Consumer Consumer}. */
    public RMTProperty defaultValue(java.util.function.Consumer<RMTPropertyValue> consumer) { consumer.accept(defaultValue()); return this; }
    /** Sets the address of the specified {@link RMTProperty} to the {@link #parent} field. */
    public RMTProperty parent(@Nullable @NativeType("rmtProperty *") RMTProperty value) { nparent(address(), value); return this; }
    /** Sets the address of the specified {@link RMTProperty} to the {@link #firstChild} field. */
    public RMTProperty firstChild(@Nullable @NativeType("rmtProperty *") RMTProperty value) { nfirstChild(address(), value); return this; }
    /** Sets the address of the specified {@link RMTProperty} to the {@link #lastChild} field. */
    public RMTProperty lastChild(@Nullable @NativeType("rmtProperty *") RMTProperty value) { nlastChild(address(), value); return this; }
    /** Sets the address of the specified {@link RMTProperty} to the {@link #nextSibling} field. */
    public RMTProperty nextSibling(@Nullable @NativeType("rmtProperty *") RMTProperty value) { nnextSibling(address(), value); return this; }
    /** Sets the specified value to the {@link #nameHash} field. */
    public RMTProperty nameHash(@NativeType("rmtU32") int value) { nnameHash(address(), value); return this; }
    /** Sets the specified value to the {@link #uniqueID} field. */
    public RMTProperty uniqueID(@NativeType("rmtU32") int value) { nuniqueID(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public RMTProperty set(
        boolean initialised,
        int type,
        int flags,
        RMTPropertyValue value,
        RMTPropertyValue lastFrameValue,
        RMTPropertyValue prevValue,
        int prevValueFrame,
        ByteBuffer name,
        ByteBuffer description,
        RMTPropertyValue defaultValue,
        @Nullable RMTProperty parent,
        @Nullable RMTProperty firstChild,
        @Nullable RMTProperty lastChild,
        @Nullable RMTProperty nextSibling,
        int nameHash,
        int uniqueID
    ) {
        initialised(initialised);
        type(type);
        flags(flags);
        value(value);
        lastFrameValue(lastFrameValue);
        prevValue(prevValue);
        prevValueFrame(prevValueFrame);
        name(name);
        description(description);
        defaultValue(defaultValue);
        parent(parent);
        firstChild(firstChild);
        lastChild(lastChild);
        nextSibling(nextSibling);
        nameHash(nameHash);
        uniqueID(uniqueID);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public RMTProperty set(RMTProperty src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code RMTProperty} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RMTProperty malloc() {
        return new RMTProperty(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RMTProperty} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RMTProperty calloc() {
        return new RMTProperty(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RMTProperty} instance allocated with {@link BufferUtils}. */
    public static RMTProperty create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RMTProperty(memAddress(container), container);
    }

    /** Returns a new {@code RMTProperty} instance for the specified memory address. */
    public static RMTProperty create(long address) {
        return new RMTProperty(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RMTProperty createSafe(long address) {
        return address == NULL ? null : new RMTProperty(address, null);
    }

    /**
     * Returns a new {@link RMTProperty.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RMTProperty.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RMTProperty.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RMTProperty.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RMTProperty.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RMTProperty.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link RMTProperty.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RMTProperty.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RMTProperty.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code RMTProperty} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTProperty malloc(MemoryStack stack) {
        return new RMTProperty(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RMTProperty} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTProperty calloc(MemoryStack stack) {
        return new RMTProperty(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link RMTProperty.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RMTProperty.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RMTProperty.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RMTProperty.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #initialised}. */
    public static int ninitialised(long struct) { return UNSAFE.getInt(null, struct + RMTProperty.INITIALISED); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + RMTProperty.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + RMTProperty.FLAGS); }
    /** Unsafe version of {@link #value}. */
    public static RMTPropertyValue nvalue(long struct) { return RMTPropertyValue.create(struct + RMTProperty.VALUE); }
    /** Unsafe version of {@link #lastFrameValue}. */
    public static RMTPropertyValue nlastFrameValue(long struct) { return RMTPropertyValue.create(struct + RMTProperty.LASTFRAMEVALUE); }
    /** Unsafe version of {@link #prevValue}. */
    public static RMTPropertyValue nprevValue(long struct) { return RMTPropertyValue.create(struct + RMTProperty.PREVVALUE); }
    /** Unsafe version of {@link #prevValueFrame}. */
    public static int nprevValueFrame(long struct) { return UNSAFE.getInt(null, struct + RMTProperty.PREVVALUEFRAME); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + RMTProperty.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + RMTProperty.NAME)); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBufferNT1(memGetAddress(struct + RMTProperty.DESCRIPTION)); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(memGetAddress(struct + RMTProperty.DESCRIPTION)); }
    /** Unsafe version of {@link #defaultValue}. */
    public static RMTPropertyValue ndefaultValue(long struct) { return RMTPropertyValue.create(struct + RMTProperty.DEFAULTVALUE); }
    /** Unsafe version of {@link #parent}. */
    @Nullable public static RMTProperty nparent(long struct) { return RMTProperty.createSafe(memGetAddress(struct + RMTProperty.PARENT)); }
    /** Unsafe version of {@link #firstChild}. */
    @Nullable public static RMTProperty nfirstChild(long struct) { return RMTProperty.createSafe(memGetAddress(struct + RMTProperty.FIRSTCHILD)); }
    /** Unsafe version of {@link #lastChild}. */
    @Nullable public static RMTProperty nlastChild(long struct) { return RMTProperty.createSafe(memGetAddress(struct + RMTProperty.LASTCHILD)); }
    /** Unsafe version of {@link #nextSibling}. */
    @Nullable public static RMTProperty nnextSibling(long struct) { return RMTProperty.createSafe(memGetAddress(struct + RMTProperty.NEXTSIBLING)); }
    /** Unsafe version of {@link #nameHash}. */
    public static int nnameHash(long struct) { return UNSAFE.getInt(null, struct + RMTProperty.NAMEHASH); }
    /** Unsafe version of {@link #uniqueID}. */
    public static int nuniqueID(long struct) { return UNSAFE.getInt(null, struct + RMTProperty.UNIQUEID); }

    /** Unsafe version of {@link #initialised(boolean) initialised}. */
    public static void ninitialised(long struct, int value) { UNSAFE.putInt(null, struct + RMTProperty.INITIALISED, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + RMTProperty.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + RMTProperty.FLAGS, value); }
    /** Unsafe version of {@link #value(RMTPropertyValue) value}. */
    public static void nvalue(long struct, RMTPropertyValue value) { memCopy(value.address(), struct + RMTProperty.VALUE, RMTPropertyValue.SIZEOF); }
    /** Unsafe version of {@link #lastFrameValue(RMTPropertyValue) lastFrameValue}. */
    public static void nlastFrameValue(long struct, RMTPropertyValue value) { memCopy(value.address(), struct + RMTProperty.LASTFRAMEVALUE, RMTPropertyValue.SIZEOF); }
    /** Unsafe version of {@link #prevValue(RMTPropertyValue) prevValue}. */
    public static void nprevValue(long struct, RMTPropertyValue value) { memCopy(value.address(), struct + RMTProperty.PREVVALUE, RMTPropertyValue.SIZEOF); }
    /** Unsafe version of {@link #prevValueFrame(int) prevValueFrame}. */
    public static void nprevValueFrame(long struct, int value) { UNSAFE.putInt(null, struct + RMTProperty.PREVVALUEFRAME, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + RMTProperty.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #description(ByteBuffer) description}. */
    public static void ndescription(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + RMTProperty.DESCRIPTION, memAddress(value));
    }
    /** Unsafe version of {@link #defaultValue(RMTPropertyValue) defaultValue}. */
    public static void ndefaultValue(long struct, RMTPropertyValue value) { memCopy(value.address(), struct + RMTProperty.DEFAULTVALUE, RMTPropertyValue.SIZEOF); }
    /** Unsafe version of {@link #parent(RMTProperty) parent}. */
    public static void nparent(long struct, @Nullable RMTProperty value) { memPutAddress(struct + RMTProperty.PARENT, memAddressSafe(value)); }
    /** Unsafe version of {@link #firstChild(RMTProperty) firstChild}. */
    public static void nfirstChild(long struct, @Nullable RMTProperty value) { memPutAddress(struct + RMTProperty.FIRSTCHILD, memAddressSafe(value)); }
    /** Unsafe version of {@link #lastChild(RMTProperty) lastChild}. */
    public static void nlastChild(long struct, @Nullable RMTProperty value) { memPutAddress(struct + RMTProperty.LASTCHILD, memAddressSafe(value)); }
    /** Unsafe version of {@link #nextSibling(RMTProperty) nextSibling}. */
    public static void nnextSibling(long struct, @Nullable RMTProperty value) { memPutAddress(struct + RMTProperty.NEXTSIBLING, memAddressSafe(value)); }
    /** Unsafe version of {@link #nameHash(int) nameHash}. */
    public static void nnameHash(long struct, int value) { UNSAFE.putInt(null, struct + RMTProperty.NAMEHASH, value); }
    /** Unsafe version of {@link #uniqueID(int) uniqueID}. */
    public static void nuniqueID(long struct, int value) { UNSAFE.putInt(null, struct + RMTProperty.UNIQUEID, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + RMTProperty.NAME));
        check(memGetAddress(struct + RMTProperty.DESCRIPTION));
    }

    // -----------------------------------

    /** An array of {@link RMTProperty} structs. */
    public static class Buffer extends StructBuffer<RMTProperty, Buffer> implements NativeResource {

        private static final RMTProperty ELEMENT_FACTORY = RMTProperty.create(-1L);

        /**
         * Creates a new {@code RMTProperty.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RMTProperty#SIZEOF}, and its mark will be undefined.</p>
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
        protected RMTProperty getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link RMTProperty#initialised} field. */
        @NativeType("rmtBool")
        public boolean initialised() { return RMTProperty.ninitialised(address()) != 0; }
        /** @return the value of the {@link RMTProperty#type} field. */
        @NativeType("rmtPropertyType")
        public int type() { return RMTProperty.ntype(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("rmtPropertyFlags")
        public int flags() { return RMTProperty.nflags(address()); }
        /** @return a {@link RMTPropertyValue} view of the {@link RMTProperty#value} field. */
        @NativeType("rmtPropertyValue")
        public RMTPropertyValue value() { return RMTProperty.nvalue(address()); }
        /** @return a {@link RMTPropertyValue} view of the {@link RMTProperty#lastFrameValue} field. */
        @NativeType("rmtPropertyValue")
        public RMTPropertyValue lastFrameValue() { return RMTProperty.nlastFrameValue(address()); }
        /** @return a {@link RMTPropertyValue} view of the {@link RMTProperty#prevValue} field. */
        @NativeType("rmtPropertyValue")
        public RMTPropertyValue prevValue() { return RMTProperty.nprevValue(address()); }
        /** @return the value of the {@code prevValueFrame} field. */
        @NativeType("rmtU32")
        public int prevValueFrame() { return RMTProperty.nprevValueFrame(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link RMTProperty#name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return RMTProperty.nname(address()); }
        /** @return the null-terminated string pointed to by the {@link RMTProperty#name} field. */
        @NativeType("char const *")
        public String nameString() { return RMTProperty.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code description} field. */
        @NativeType("char const *")
        public ByteBuffer description() { return RMTProperty.ndescription(address()); }
        /** @return the null-terminated string pointed to by the {@code description} field. */
        @NativeType("char const *")
        public String descriptionString() { return RMTProperty.ndescriptionString(address()); }
        /** @return a {@link RMTPropertyValue} view of the {@link RMTProperty#defaultValue} field. */
        @NativeType("rmtPropertyValue")
        public RMTPropertyValue defaultValue() { return RMTProperty.ndefaultValue(address()); }
        /** @return a {@link RMTProperty} view of the struct pointed to by the {@link RMTProperty#parent} field. */
        @Nullable
        @NativeType("rmtProperty *")
        public RMTProperty parent() { return RMTProperty.nparent(address()); }
        /** @return a {@link RMTProperty} view of the struct pointed to by the {@link RMTProperty#firstChild} field. */
        @Nullable
        @NativeType("rmtProperty *")
        public RMTProperty firstChild() { return RMTProperty.nfirstChild(address()); }
        /** @return a {@link RMTProperty} view of the struct pointed to by the {@link RMTProperty#lastChild} field. */
        @Nullable
        @NativeType("rmtProperty *")
        public RMTProperty lastChild() { return RMTProperty.nlastChild(address()); }
        /** @return a {@link RMTProperty} view of the struct pointed to by the {@link RMTProperty#nextSibling} field. */
        @Nullable
        @NativeType("rmtProperty *")
        public RMTProperty nextSibling() { return RMTProperty.nnextSibling(address()); }
        /** @return the value of the {@link RMTProperty#nameHash} field. */
        @NativeType("rmtU32")
        public int nameHash() { return RMTProperty.nnameHash(address()); }
        /** @return the value of the {@link RMTProperty#uniqueID} field. */
        @NativeType("rmtU32")
        public int uniqueID() { return RMTProperty.nuniqueID(address()); }

        /** Sets the specified value to the {@link RMTProperty#initialised} field. */
        public RMTProperty.Buffer initialised(@NativeType("rmtBool") boolean value) { RMTProperty.ninitialised(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link RMTProperty#type} field. */
        public RMTProperty.Buffer type(@NativeType("rmtPropertyType") int value) { RMTProperty.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public RMTProperty.Buffer flags(@NativeType("rmtPropertyFlags") int value) { RMTProperty.nflags(address(), value); return this; }
        /** Copies the specified {@link RMTPropertyValue} to the {@link RMTProperty#value} field. */
        public RMTProperty.Buffer value(@NativeType("rmtPropertyValue") RMTPropertyValue value) { RMTProperty.nvalue(address(), value); return this; }
        /** Passes the {@link RMTProperty#value} field to the specified {@link java.util.function.Consumer Consumer}. */
        public RMTProperty.Buffer value(java.util.function.Consumer<RMTPropertyValue> consumer) { consumer.accept(value()); return this; }
        /** Copies the specified {@link RMTPropertyValue} to the {@link RMTProperty#lastFrameValue} field. */
        public RMTProperty.Buffer lastFrameValue(@NativeType("rmtPropertyValue") RMTPropertyValue value) { RMTProperty.nlastFrameValue(address(), value); return this; }
        /** Passes the {@link RMTProperty#lastFrameValue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public RMTProperty.Buffer lastFrameValue(java.util.function.Consumer<RMTPropertyValue> consumer) { consumer.accept(lastFrameValue()); return this; }
        /** Copies the specified {@link RMTPropertyValue} to the {@link RMTProperty#prevValue} field. */
        public RMTProperty.Buffer prevValue(@NativeType("rmtPropertyValue") RMTPropertyValue value) { RMTProperty.nprevValue(address(), value); return this; }
        /** Passes the {@link RMTProperty#prevValue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public RMTProperty.Buffer prevValue(java.util.function.Consumer<RMTPropertyValue> consumer) { consumer.accept(prevValue()); return this; }
        /** Sets the specified value to the {@code prevValueFrame} field. */
        public RMTProperty.Buffer prevValueFrame(@NativeType("rmtU32") int value) { RMTProperty.nprevValueFrame(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link RMTProperty#name} field. */
        public RMTProperty.Buffer name(@NativeType("char const *") ByteBuffer value) { RMTProperty.nname(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code description} field. */
        public RMTProperty.Buffer description(@NativeType("char const *") ByteBuffer value) { RMTProperty.ndescription(address(), value); return this; }
        /** Copies the specified {@link RMTPropertyValue} to the {@link RMTProperty#defaultValue} field. */
        public RMTProperty.Buffer defaultValue(@NativeType("rmtPropertyValue") RMTPropertyValue value) { RMTProperty.ndefaultValue(address(), value); return this; }
        /** Passes the {@link RMTProperty#defaultValue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public RMTProperty.Buffer defaultValue(java.util.function.Consumer<RMTPropertyValue> consumer) { consumer.accept(defaultValue()); return this; }
        /** Sets the address of the specified {@link RMTProperty} to the {@link RMTProperty#parent} field. */
        public RMTProperty.Buffer parent(@Nullable @NativeType("rmtProperty *") RMTProperty value) { RMTProperty.nparent(address(), value); return this; }
        /** Sets the address of the specified {@link RMTProperty} to the {@link RMTProperty#firstChild} field. */
        public RMTProperty.Buffer firstChild(@Nullable @NativeType("rmtProperty *") RMTProperty value) { RMTProperty.nfirstChild(address(), value); return this; }
        /** Sets the address of the specified {@link RMTProperty} to the {@link RMTProperty#lastChild} field. */
        public RMTProperty.Buffer lastChild(@Nullable @NativeType("rmtProperty *") RMTProperty value) { RMTProperty.nlastChild(address(), value); return this; }
        /** Sets the address of the specified {@link RMTProperty} to the {@link RMTProperty#nextSibling} field. */
        public RMTProperty.Buffer nextSibling(@Nullable @NativeType("rmtProperty *") RMTProperty value) { RMTProperty.nnextSibling(address(), value); return this; }
        /** Sets the specified value to the {@link RMTProperty#nameHash} field. */
        public RMTProperty.Buffer nameHash(@NativeType("rmtU32") int value) { RMTProperty.nnameHash(address(), value); return this; }
        /** Sets the specified value to the {@link RMTProperty#uniqueID} field. */
        public RMTProperty.Buffer uniqueID(@NativeType("rmtU32") int value) { RMTProperty.nuniqueID(address(), value); return this; }

    }

}