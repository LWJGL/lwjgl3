/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes an file format which Assimp can export to. Use {@link Assimp#aiGetExportFormatCount GetExportFormatCount} to learn how many export-formats are supported by the current
 * Assimp-build and {@link Assimp#aiGetExportFormatDescription GetExportFormatDescription} to retrieve the description of the export format option.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiExportFormatDesc {
 *     char const * {@link #id};
 *     char const * {@link #description};
 *     char const * {@link #fileExtension};
 * }</code></pre>
 */
@NativeType("struct aiExportFormatDesc")
public class AIExportFormatDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ID,
        DESCRIPTION,
        FILEEXTENSION;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ID = layout.offsetof(0);
        DESCRIPTION = layout.offsetof(1);
        FILEEXTENSION = layout.offsetof(2);
    }

    /**
     * Creates a {@code AIExportFormatDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIExportFormatDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * a short string ID to uniquely identify the export format. Use this ID string to specify which file format you want to export to when calling
     * {@link Assimp#aiExportScene ExportScene}. Example: "dae" or "obj"
     */
    @NativeType("char const *")
    public ByteBuffer id() { return nid(address()); }
    /**
     * a short string ID to uniquely identify the export format. Use this ID string to specify which file format you want to export to when calling
     * {@link Assimp#aiExportScene ExportScene}. Example: "dae" or "obj"
     */
    @NativeType("char const *")
    public String idString() { return nidString(address()); }
    /** A short description of the file format to present to users. Useful if you want to allow the user to select an export format. */
    @NativeType("char const *")
    public ByteBuffer description() { return ndescription(address()); }
    /** A short description of the file format to present to users. Useful if you want to allow the user to select an export format. */
    @NativeType("char const *")
    public String descriptionString() { return ndescriptionString(address()); }
    /** Recommended file extension for the exported file in lower case. */
    @NativeType("char const *")
    public ByteBuffer fileExtension() { return nfileExtension(address()); }
    /** Recommended file extension for the exported file in lower case. */
    @NativeType("char const *")
    public String fileExtensionString() { return nfileExtensionString(address()); }

    /** Sets the address of the specified encoded string to the {@link #id} field. */
    public AIExportFormatDesc id(@NativeType("char const *") ByteBuffer value) { nid(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #description} field. */
    public AIExportFormatDesc description(@NativeType("char const *") ByteBuffer value) { ndescription(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #fileExtension} field. */
    public AIExportFormatDesc fileExtension(@NativeType("char const *") ByteBuffer value) { nfileExtension(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIExportFormatDesc set(
        ByteBuffer id,
        ByteBuffer description,
        ByteBuffer fileExtension
    ) {
        id(id);
        description(description);
        fileExtension(fileExtension);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIExportFormatDesc set(AIExportFormatDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIExportFormatDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIExportFormatDesc malloc() {
        return wrap(AIExportFormatDesc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIExportFormatDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIExportFormatDesc calloc() {
        return wrap(AIExportFormatDesc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIExportFormatDesc} instance allocated with {@link BufferUtils}. */
    public static AIExportFormatDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIExportFormatDesc.class, memAddress(container), container);
    }

    /** Returns a new {@code AIExportFormatDesc} instance for the specified memory address. */
    public static AIExportFormatDesc create(long address) {
        return wrap(AIExportFormatDesc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIExportFormatDesc createSafe(long address) {
        return address == NULL ? null : wrap(AIExportFormatDesc.class, address);
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIExportFormatDesc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIExportFormatDesc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIExportFormatDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIExportFormatDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIExportFormatDesc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIExportFormatDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIExportFormatDesc mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIExportFormatDesc callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIExportFormatDesc mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIExportFormatDesc callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIExportFormatDesc.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIExportFormatDesc.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIExportFormatDesc.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIExportFormatDesc.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIExportFormatDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIExportFormatDesc malloc(MemoryStack stack) {
        return wrap(AIExportFormatDesc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIExportFormatDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIExportFormatDesc calloc(MemoryStack stack) {
        return wrap(AIExportFormatDesc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIExportFormatDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIExportFormatDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #id}. */
    public static ByteBuffer nid(long struct) { return memByteBufferNT1(memGetAddress(struct + AIExportFormatDesc.ID)); }
    /** Unsafe version of {@link #idString}. */
    public static String nidString(long struct) { return memUTF8(memGetAddress(struct + AIExportFormatDesc.ID)); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBufferNT1(memGetAddress(struct + AIExportFormatDesc.DESCRIPTION)); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(memGetAddress(struct + AIExportFormatDesc.DESCRIPTION)); }
    /** Unsafe version of {@link #fileExtension}. */
    public static ByteBuffer nfileExtension(long struct) { return memByteBufferNT1(memGetAddress(struct + AIExportFormatDesc.FILEEXTENSION)); }
    /** Unsafe version of {@link #fileExtensionString}. */
    public static String nfileExtensionString(long struct) { return memUTF8(memGetAddress(struct + AIExportFormatDesc.FILEEXTENSION)); }

    /** Unsafe version of {@link #id(ByteBuffer) id}. */
    public static void nid(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + AIExportFormatDesc.ID, memAddress(value));
    }
    /** Unsafe version of {@link #description(ByteBuffer) description}. */
    public static void ndescription(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + AIExportFormatDesc.DESCRIPTION, memAddress(value));
    }
    /** Unsafe version of {@link #fileExtension(ByteBuffer) fileExtension}. */
    public static void nfileExtension(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + AIExportFormatDesc.FILEEXTENSION, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIExportFormatDesc.ID));
        check(memGetAddress(struct + AIExportFormatDesc.DESCRIPTION));
        check(memGetAddress(struct + AIExportFormatDesc.FILEEXTENSION));
    }

    // -----------------------------------

    /** An array of {@link AIExportFormatDesc} structs. */
    public static class Buffer extends StructBuffer<AIExportFormatDesc, Buffer> implements NativeResource {

        private static final AIExportFormatDesc ELEMENT_FACTORY = AIExportFormatDesc.create(-1L);

        /**
         * Creates a new {@code AIExportFormatDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIExportFormatDesc#SIZEOF}, and its mark will be undefined.
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
        protected AIExportFormatDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link AIExportFormatDesc#id} field. */
        @NativeType("char const *")
        public ByteBuffer id() { return AIExportFormatDesc.nid(address()); }
        /** @return the null-terminated string pointed to by the {@link AIExportFormatDesc#id} field. */
        @NativeType("char const *")
        public String idString() { return AIExportFormatDesc.nidString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link AIExportFormatDesc#description} field. */
        @NativeType("char const *")
        public ByteBuffer description() { return AIExportFormatDesc.ndescription(address()); }
        /** @return the null-terminated string pointed to by the {@link AIExportFormatDesc#description} field. */
        @NativeType("char const *")
        public String descriptionString() { return AIExportFormatDesc.ndescriptionString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link AIExportFormatDesc#fileExtension} field. */
        @NativeType("char const *")
        public ByteBuffer fileExtension() { return AIExportFormatDesc.nfileExtension(address()); }
        /** @return the null-terminated string pointed to by the {@link AIExportFormatDesc#fileExtension} field. */
        @NativeType("char const *")
        public String fileExtensionString() { return AIExportFormatDesc.nfileExtensionString(address()); }

        /** Sets the address of the specified encoded string to the {@link AIExportFormatDesc#id} field. */
        public AIExportFormatDesc.Buffer id(@NativeType("char const *") ByteBuffer value) { AIExportFormatDesc.nid(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link AIExportFormatDesc#description} field. */
        public AIExportFormatDesc.Buffer description(@NativeType("char const *") ByteBuffer value) { AIExportFormatDesc.ndescription(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link AIExportFormatDesc#fileExtension} field. */
        public AIExportFormatDesc.Buffer fileExtension(@NativeType("char const *") ByteBuffer value) { AIExportFormatDesc.nfileExtension(address(), value); return this; }

    }

}