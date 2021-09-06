/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A group of callbacks used by {@link ClangIndex#clang_indexSourceFile indexSourceFile} and {@link ClangIndex#clang_indexTranslationUnit indexTranslationUnit}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct IndexerCallbacks {
 *     int (*{@link IndexerAbortQueryI abortQuery}) (CXClientData client_data, void *reserved);
 *     void (*{@link IndexerDiagnosticI diagnostic}) (CXClientData client_data, CXDiagnosticSet diagnosticSet, void *reserved);
 *     CXIdxClientFile (*{@link IndexerEnteredMainFileI enteredMainFile}) (CXClientData client_data, CXFile mainFile, void *reserved);
 *     CXIdxClientFile (*{@link IndexerIncludedFileI ppIncludedFile}) (CXClientData client_data, CXIdxIncludedFileInfo const *info);
 *     CXIdxClientASTFile (*{@link IndexerImportedASTFileI importedASTFile}) (CXClientData client_data, CXIdxImportedASTFileInfo const *info);
 *     CXIdxClientContainer (*{@link IndexerStartedTranslationUnitI startedTranslationUnit}) (CXClientData client_data, void *reserved);
 *     void (*{@link IndexerIndexDeclarationI indexDeclaration}) (CXClientData client_data, CXIdxDeclInfo const *info);
 *     void (*{@link IndexerIndexEntityReferenceI indexEntityReference}) (CXClientData client_data, CXIdxEntityRefInfo const *info);
 * }</code></pre>
 */
public class IndexerCallbacks extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ABORTQUERY,
        DIAGNOSTIC,
        ENTEREDMAINFILE,
        PPINCLUDEDFILE,
        IMPORTEDASTFILE,
        STARTEDTRANSLATIONUNIT,
        INDEXDECLARATION,
        INDEXENTITYREFERENCE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ABORTQUERY = layout.offsetof(0);
        DIAGNOSTIC = layout.offsetof(1);
        ENTEREDMAINFILE = layout.offsetof(2);
        PPINCLUDEDFILE = layout.offsetof(3);
        IMPORTEDASTFILE = layout.offsetof(4);
        STARTEDTRANSLATIONUNIT = layout.offsetof(5);
        INDEXDECLARATION = layout.offsetof(6);
        INDEXENTITYREFERENCE = layout.offsetof(7);
    }

    /**
     * Creates a {@code IndexerCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IndexerCallbacks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** called periodically to check whether indexing should be aborted. Should return 0 to continue, and non-zero to abort. */
    @NativeType("int (*) (CXClientData, void *)")
    public IndexerAbortQuery abortQuery() { return nabortQuery(address()); }
    /** called at the end of indexing; passes the complete diagnostic set. */
    @NativeType("void (*) (CXClientData, CXDiagnosticSet, void *)")
    public IndexerDiagnostic diagnostic() { return ndiagnostic(address()); }
    /** @return the value of the {@code enteredMainFile} field. */
    @NativeType("CXIdxClientFile (*) (CXClientData, CXFile, void *)")
    public IndexerEnteredMainFile enteredMainFile() { return nenteredMainFile(address()); }
    /** called when a file gets {@code #included/#imported} */
    @NativeType("CXIdxClientFile (*) (CXClientData, CXIdxIncludedFileInfo const *)")
    public IndexerIncludedFile ppIncludedFile() { return nppIncludedFile(address()); }
    /**
     * Called when a AST file (PCH or module) gets imported.
     * 
     * <p>AST files will not get indexed (there will not be callbacks to index all the entities in an AST file). The recommended action is that, if the AST file
     * is not already indexed, to initiate a new indexing job specific to the AST file.</p>
     */
    @NativeType("CXIdxClientASTFile (*) (CXClientData, CXIdxImportedASTFileInfo const *)")
    public IndexerImportedASTFile importedASTFile() { return nimportedASTFile(address()); }
    /** called at the beginning of indexing a translation unit */
    @NativeType("CXIdxClientContainer (*) (CXClientData, void *)")
    public IndexerStartedTranslationUnit startedTranslationUnit() { return nstartedTranslationUnit(address()); }
    /** @return the value of the {@code indexDeclaration} field. */
    @NativeType("void (*) (CXClientData, CXIdxDeclInfo const *)")
    public IndexerIndexDeclaration indexDeclaration() { return nindexDeclaration(address()); }
    /** called to index a reference of an entity */
    @NativeType("void (*) (CXClientData, CXIdxEntityRefInfo const *)")
    public IndexerIndexEntityReference indexEntityReference() { return nindexEntityReference(address()); }

    // -----------------------------------

    /** Returns a new {@code IndexerCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IndexerCallbacks malloc() {
        return wrap(IndexerCallbacks.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code IndexerCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IndexerCallbacks calloc() {
        return wrap(IndexerCallbacks.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code IndexerCallbacks} instance allocated with {@link BufferUtils}. */
    public static IndexerCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(IndexerCallbacks.class, memAddress(container), container);
    }

    /** Returns a new {@code IndexerCallbacks} instance for the specified memory address. */
    public static IndexerCallbacks create(long address) {
        return wrap(IndexerCallbacks.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IndexerCallbacks createSafe(long address) {
        return address == NULL ? null : wrap(IndexerCallbacks.class, address);
    }

    /**
     * Returns a new {@link IndexerCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IndexerCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IndexerCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link IndexerCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IndexerCallbacks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code IndexerCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IndexerCallbacks malloc(MemoryStack stack) {
        return wrap(IndexerCallbacks.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code IndexerCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IndexerCallbacks calloc(MemoryStack stack) {
        return wrap(IndexerCallbacks.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link IndexerCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IndexerCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #abortQuery}. */
    public static IndexerAbortQuery nabortQuery(long struct) { return IndexerAbortQuery.create(memGetAddress(struct + IndexerCallbacks.ABORTQUERY)); }
    /** Unsafe version of {@link #diagnostic}. */
    public static IndexerDiagnostic ndiagnostic(long struct) { return IndexerDiagnostic.create(memGetAddress(struct + IndexerCallbacks.DIAGNOSTIC)); }
    /** Unsafe version of {@link #enteredMainFile}. */
    public static IndexerEnteredMainFile nenteredMainFile(long struct) { return IndexerEnteredMainFile.create(memGetAddress(struct + IndexerCallbacks.ENTEREDMAINFILE)); }
    /** Unsafe version of {@link #ppIncludedFile}. */
    public static IndexerIncludedFile nppIncludedFile(long struct) { return IndexerIncludedFile.create(memGetAddress(struct + IndexerCallbacks.PPINCLUDEDFILE)); }
    /** Unsafe version of {@link #importedASTFile}. */
    public static IndexerImportedASTFile nimportedASTFile(long struct) { return IndexerImportedASTFile.create(memGetAddress(struct + IndexerCallbacks.IMPORTEDASTFILE)); }
    /** Unsafe version of {@link #startedTranslationUnit}. */
    public static IndexerStartedTranslationUnit nstartedTranslationUnit(long struct) { return IndexerStartedTranslationUnit.create(memGetAddress(struct + IndexerCallbacks.STARTEDTRANSLATIONUNIT)); }
    /** Unsafe version of {@link #indexDeclaration}. */
    public static IndexerIndexDeclaration nindexDeclaration(long struct) { return IndexerIndexDeclaration.create(memGetAddress(struct + IndexerCallbacks.INDEXDECLARATION)); }
    /** Unsafe version of {@link #indexEntityReference}. */
    public static IndexerIndexEntityReference nindexEntityReference(long struct) { return IndexerIndexEntityReference.create(memGetAddress(struct + IndexerCallbacks.INDEXENTITYREFERENCE)); }

    // -----------------------------------

    /** An array of {@link IndexerCallbacks} structs. */
    public static class Buffer extends StructBuffer<IndexerCallbacks, Buffer> implements NativeResource {

        private static final IndexerCallbacks ELEMENT_FACTORY = IndexerCallbacks.create(-1L);

        /**
         * Creates a new {@code IndexerCallbacks.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IndexerCallbacks#SIZEOF}, and its mark will be undefined.
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
        protected IndexerCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link IndexerCallbacks#abortQuery} field. */
        @NativeType("int (*) (CXClientData, void *)")
        public IndexerAbortQuery abortQuery() { return IndexerCallbacks.nabortQuery(address()); }
        /** @return the value of the {@link IndexerCallbacks#diagnostic} field. */
        @NativeType("void (*) (CXClientData, CXDiagnosticSet, void *)")
        public IndexerDiagnostic diagnostic() { return IndexerCallbacks.ndiagnostic(address()); }
        /** @return the value of the {@code enteredMainFile} field. */
        @NativeType("CXIdxClientFile (*) (CXClientData, CXFile, void *)")
        public IndexerEnteredMainFile enteredMainFile() { return IndexerCallbacks.nenteredMainFile(address()); }
        /** @return the value of the {@link IndexerCallbacks#ppIncludedFile} field. */
        @NativeType("CXIdxClientFile (*) (CXClientData, CXIdxIncludedFileInfo const *)")
        public IndexerIncludedFile ppIncludedFile() { return IndexerCallbacks.nppIncludedFile(address()); }
        /** @return the value of the {@link IndexerCallbacks#importedASTFile} field. */
        @NativeType("CXIdxClientASTFile (*) (CXClientData, CXIdxImportedASTFileInfo const *)")
        public IndexerImportedASTFile importedASTFile() { return IndexerCallbacks.nimportedASTFile(address()); }
        /** @return the value of the {@link IndexerCallbacks#startedTranslationUnit} field. */
        @NativeType("CXIdxClientContainer (*) (CXClientData, void *)")
        public IndexerStartedTranslationUnit startedTranslationUnit() { return IndexerCallbacks.nstartedTranslationUnit(address()); }
        /** @return the value of the {@code indexDeclaration} field. */
        @NativeType("void (*) (CXClientData, CXIdxDeclInfo const *)")
        public IndexerIndexDeclaration indexDeclaration() { return IndexerCallbacks.nindexDeclaration(address()); }
        /** @return the value of the {@link IndexerCallbacks#indexEntityReference} field. */
        @NativeType("void (*) (CXClientData, CXIdxEntityRefInfo const *)")
        public IndexerIndexEntityReference indexEntityReference() { return IndexerCallbacks.nindexEntityReference(address()); }

    }

}