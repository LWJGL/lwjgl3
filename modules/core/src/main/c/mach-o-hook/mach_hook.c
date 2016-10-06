#include "mach_hook.h"

#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <strings.h>
#include <errno.h>

#include <mach-o/fat.h>
#include <mach-o/loader.h>
#include <mach-o/nlist.h>

#ifdef __x86_64
    #undef MH_MAGIC
    #define MH_MAGIC MH_MAGIC_64

    #undef CPU_TYPE_I386
    #define CPU_TYPE_I386 CPU_TYPE_X86_64

    #undef LC_SEGMENT
    #define LC_SEGMENT LC_SEGMENT_64

    #define mach_header mach_header_64
    #define nlist nlist_64
    #define segment_command segment_command_64
    #define section section_64
#endif

#define INVALID_OFFSET 1
#define JMP_OPCODE '\xE9'
#define DATA_SEG_NAME "__DATA"
#define LAZY_SECT_NAME "__la_symbol_ptr"
#define IMPORT_SEG_NAME "__IMPORT"
#define JUMP_SECT_NAME "__jump_table"

//==================================================================================================
struct mach_hook_handle
{
    void const *library_address;  //base address of a library in memory
    char const *string_table;  //buffer to read string_table table from file
    struct nlist const *symbol_table;  //buffer to read symbol table from file
    uint32_t const *indirect_table;  //buffer to read the indirect symbol table in dynamic symbol table from file
    uint32_t undefined_symbols_count;  //number of undefined symbols in the symbol table
    uint32_t undefined_symbols_index;  //position of undefined symbols in the symbol table
    uint32_t indirect_symbols_count;  //number of indirect symbols in the indirect symbol table of DYSYMTAB
    uint32_t indirect_symbols_index;  //index of the first imported symbol in the indirect symbol table of DYSYMTAB
    uint32_t import_table_offset;  //the offset of (__DATA, __la_symbol_ptr) or (__IMPORT, __jump_table)
    uint32_t jump_table_present;  //special flag to show if we work with (__IMPORT, __jump_table)
};
//==================================================================================================
static inline
void *read_file(int f, size_t offset, size_t count)
{
    void *ret;

    if (lseek(f, offset, SEEK_SET) < 0)
        return 0;

    ret = malloc(count);

    if (!ret || read(f, ret, count) != (ssize_t)count)
    {
        free(ret);

        return 0;
    }

    return ret;
}
//--------------------------------------------------------------------------------------------------
static inline
uint32_t read_head_offset(int descriptor)  //returns offset to the target mach-o (including 0 for not fat binary) or INVALID_OFFSET on error
{
    uint32_t ret = INVALID_OFFSET;  //obviously invalid offset
    uint32_t magic;
    cpu_type_t cpu_type;
    uint32_t nfat_arch, i;
    struct fat_arch const *fat_archs = 0, *fat_arch_i;

    if (sizeof(uint32_t) != read(descriptor, &magic, sizeof(uint32_t)))
        return ret;

    if (MH_MAGIC == magic)  //if only one architecture
        return 0;

    magic = OSSwapInt32(magic);

    if (FAT_MAGIC == magic)  //if fat binary
    {
        if (sizeof(uint32_t) != read(descriptor, &nfat_arch, sizeof(uint32_t)))
            return ret;

        nfat_arch = OSSwapInt32(nfat_arch);
        fat_archs = (struct fat_arch const *)read_file(descriptor, sizeof(struct fat_header), nfat_arch * sizeof(struct fat_arch));

        if (!fat_archs)
            return ret;

        for (fat_arch_i = fat_archs, i = 0; i < nfat_arch; ++fat_arch_i, ++i)
        {
            cpu_type = fat_arch_i->cputype;
            cpu_type = OSSwapInt32(cpu_type);

			if (CPU_TYPE_I386 == cpu_type)
			{
				ret = OSSwapInt32(fat_arch_i->offset);

				break;
			}
        }

		free((void *)fat_archs);
    }

    return ret;
}
//--------------------------------------------------------------------------------------------------
static inline
int read_load_command(struct load_command const *load_commands, uint32_t load_commands_count,
                      int command_code, void *command, size_t command_size)  //reads load command by its code, returns 0 on error
{
    struct load_command const *current = load_commands;
    uint32_t i;

    if (!load_commands || ! command)
        return 0;

    for (i = 0; i < load_commands_count; ++i)
    {
        if (command_code == (int)current->cmd) {
            if (command_size == current->cmdsize)
            {
                memcpy(command, current, command_size);

                return 1;
            }
            else
                return 0;
        }

        current = (struct load_command const *)(((char const *)current) + current->cmdsize);
    }

    return 0;
}
//--------------------------------------------------------------------------------------------------
static inline
void read_indirect_table_info(struct load_command const *load_commands, uint32_t load_commands_count,
                              uint32_t *indirect_symbols_index, uint32_t *import_table_offset, uint32_t *jump_table_present)
{
    struct load_command const *current_load_command = load_commands;
    uint32_t i;

    if (!load_commands || !indirect_symbols_index || !import_table_offset || !jump_table_present)
        return;

    *indirect_symbols_index = 0;
    *import_table_offset = 0;
    *jump_table_present = 0;

    for (i = 0; i < load_commands_count; ++i)  //find offset of the relocating table and it's reflection in the indirect symbol table
    {
        if (LC_SEGMENT == current_load_command->cmd)
        {
            struct section const *current_section;  //iterator for sections
            uint32_t sections_count;  //segment_command.nsects
            uint32_t j;

            if (!strcmp(DATA_SEG_NAME, ((struct segment_command const *)current_load_command)->segname))  //if __DATA segment
            {
                sections_count = ((struct segment_command const *)current_load_command)->nsects;
                current_section = (struct section const *)(((char const *)current_load_command) + sizeof(struct segment_command));

                for (j = 0; j < sections_count; ++j)  //find __la_symbol_prt
                {
                    if (!strcmp(LAZY_SECT_NAME, current_section->sectname))
                    {
                        *import_table_offset = current_section->addr;
                        *indirect_symbols_index = current_section->reserved1;

                        break;
                    }

                    ++current_section;
                }

                if (*import_table_offset)
                    break;
            }

            if (!strcmp(IMPORT_SEG_NAME, ((struct segment_command const *)current_load_command)->segname))  //if __IMPORT segment
            {
                sections_count = ((struct segment_command const *)current_load_command)->nsects;
                current_section = (struct section const *)(((char const *)current_load_command) + sizeof(struct segment_command));

                for (j = 0; j < sections_count; ++j)  //find __jump_table
                {
                    if (!strcmp(JUMP_SECT_NAME, current_section->sectname))
                    {
                        *import_table_offset = current_section->addr;
                        *indirect_symbols_index = current_section->reserved1;
                        *jump_table_present = 1;

                        break;
                    }

                    ++current_section;
                }

                if (*import_table_offset)
                    break;
            }

        }

        current_load_command = (struct load_command const *)(((char const *)current_load_command) + current_load_command->cmdsize);
    }
}
//==================================================================================================
#ifdef __cplusplus
extern "C"
{
#endif
//==================================================================================================
void *mach_hook_init(char const *library_filename, void const *library_address)
{
	struct mach_hook_handle *ret = 0;

    int descriptor;
    uint32_t head_offset = 0;  //the beginning of the Intel architecture
    uint32_t load_commands_count = 0; //number of load commands
    struct load_command *load_commands = 0;  //load commands content
    struct dysymtab_command dysymtab_cmd;  //for DYSYMTAB.iundefsym, DYSYMTAB.nundefsym, DYSYMTAB.indirectsymoff and DYSYMTAB.nindirectsyms
    struct symtab_command symtab_cmd;  //for SYMTAB.symoff, SYMTAB.nsyms, SYMTAB.stroff and SYMTAB.strsize
    char const *string_table = 0;  //buffer to read string_table table from file
    struct nlist const *symbol_table = 0;  //buffer to read symbol table from file
    uint32_t const *indirect_table = 0;  //buffer to read the indirect symbol table in dynamic symbol table from file
    uint32_t indirect_symbols_index = 0;  //index of the first imported symbol in the indirect symbol table of DYSYMTAB
    uint32_t import_table_offset = 0;  //the offset of (__DATA, __la_symbol_ptr) or (__IMPORT, __jump_table)
    uint32_t jump_table_present = 0;  //flag to tell the __IMPORT, __jump_table section is present (seems, only for Leopard)

    if (!library_filename || !library_address)
		return ret;

    descriptor = open(library_filename, O_RDONLY);

    if (descriptor < 0)
        return ret;

    head_offset = read_head_offset(descriptor);  //get mach-o header offset, not zero for fat binary

    if (INVALID_OFFSET == head_offset)
        goto free;

    load_commands_count = ((struct mach_header const *)library_address)->ncmds;
    load_commands = (struct load_command *)read_file(descriptor, head_offset + sizeof(struct mach_header),
                                                     ((struct mach_header const *)library_address)->sizeofcmds);  //read all load commands

    if (!read_load_command(load_commands, load_commands_count, LC_SYMTAB, &symtab_cmd, sizeof(symtab_cmd)))  //read SYMTAB load command
        goto free;

    if (0 == symtab_cmd.nsyms || 0 == symtab_cmd.strsize)
        goto free;

    string_table = (char const *)read_file(descriptor, head_offset + symtab_cmd.stroff, symtab_cmd.strsize);  //read string table
    symbol_table = (struct nlist const *)read_file(descriptor, head_offset + symtab_cmd.symoff,
                                                   symtab_cmd.nsyms * sizeof(struct nlist));  //read symbol table

    if (!string_table || !symbol_table)
        goto free;

    if (!read_load_command(load_commands, load_commands_count, LC_DYSYMTAB, &dysymtab_cmd, sizeof(dysymtab_cmd)))  //read DYSYMTAB
        goto free;

    if (0 == dysymtab_cmd.nundefsym || 0 == dysymtab_cmd.nindirectsyms)
        goto free;

    indirect_table = (uint32_t const *)read_file(descriptor, head_offset + dysymtab_cmd.indirectsymoff,
                                                 dysymtab_cmd.nindirectsyms * sizeof(uint32_t));  //read indirect symbol table

    if (!indirect_table)
        goto free;

    read_indirect_table_info((struct load_command const *)((char const *)(library_address) + sizeof(struct mach_header)),
                             load_commands_count, &indirect_symbols_index, &import_table_offset, &jump_table_present);  //read necessary info about indirect symbols from memory

    if (!import_table_offset)
        goto free;

    ret = (struct mach_hook_handle *)malloc(sizeof(struct mach_hook_handle));

    if (!ret)
        goto free;

    ret->library_address = library_address;
    ret->string_table = string_table;
    ret->symbol_table = symbol_table;
    ret->undefined_symbols_count = dysymtab_cmd.nundefsym;
    ret->undefined_symbols_index = dysymtab_cmd.iundefsym;
    ret->indirect_symbols_count = dysymtab_cmd.nindirectsyms;
    ret->indirect_table = indirect_table;
    ret->indirect_symbols_index = indirect_symbols_index;
    ret->import_table_offset = import_table_offset;
    ret->jump_table_present = jump_table_present;

    close(descriptor);
    free((void *)load_commands);

    return ret;

free :

    free((void *)string_table);
    free((void *)symbol_table);
    free((void *)indirect_table);

    close(descriptor);
    free((void *)load_commands);

	return ret;
}
//--------------------------------------------------------------------------------------------------
mach_substitution mach_hook(void const *h, char const *function_name, mach_substitution substitution)
{
    mach_substitution ret = 0LL;  //address of the symbol being substituted

    struct mach_hook_handle const *handle = (struct mach_hook_handle const*)h;
    struct nlist const *symbol_table_entry;  //nlist structure for the target symbol
    uint32_t symbol_table_entry_index;
    uint32_t symbol_found = 0;
    size_t *import_table_entry;  //pointer to the entry in (__DATA, __la_symbol_ptr) or (__IMPORT, __jump_table) that corresponds to the target symbol
    uint32_t import_table_entry_index;
    uint32_t i;

    if (!handle || !function_name || !substitution)
        return ret;

    symbol_table_entry_index = handle->undefined_symbols_index;
    symbol_table_entry = handle->symbol_table + symbol_table_entry_index; //now we're at the first undefined symbol in the symbol table

    for (i = 0; i < handle->undefined_symbols_count; ++i)  //find the target symbol by specified function's name
    {
        char const *symbol_name = handle->string_table + symbol_table_entry->n_un.n_strx;  //shift to name in the string table

        if ('_' == *symbol_name)  //each name in Mach-O starts with underscore
            if (!strcmp(function_name, symbol_name + 1))  //shift by one to avoid leading underscore
            {
                symbol_table_entry_index += i;  //index correction, now we've got an index of the target symbol in symbol table
                symbol_found = 1;

                break;
            }

        ++symbol_table_entry;
    }

    if (!symbol_found)
        goto end;
    else
        symbol_found = 0;  //switch off flag to reuse

    for (i = handle->indirect_symbols_index; i < handle->indirect_symbols_count; ++i)  //find the target symbol from the start of indirect symbols reflection, not the very beginning
        if (handle->indirect_table[i] == symbol_table_entry_index)  //indirect symbol table contains indexes to symbol table
        {
            import_table_entry_index = i - handle->indirect_symbols_index;  //remember it's index from the beginning of indirect symbols reflection
            symbol_found = 1;

            break;
        }

    if (!symbol_found)
        goto end;

    if (handle->jump_table_present)  //if we resolve symbols via (__IMPORT, __jump_table)
    {
        import_table_entry = (size_t *)((char const *)(handle->library_address) + handle->import_table_offset
                                        + import_table_entry_index * (sizeof(uint32_t) + 1));  //compute the address of the target relocation, one entry consists of opcode (1 byte) and 32-bit address
        ret = *(unsigned char *)import_table_entry;  //store the opcode, can be CALL or JMP

        if (0 == (substitution & 0xFF00000000LL))  //if we have only the function's address in substitution, i.e. not the full instruction with opcode, like for the first hook
            *(unsigned char *)import_table_entry = JMP_OPCODE;  //convert CALL (0xE8) to JMP (0xE9), or just rewrite JMP, if this entry is already resolved by dyld
        else  //if we have a complete instruction in substitution
        {
            *(unsigned char *)import_table_entry = (unsigned char)substitution;  //write the opcode
            substitution >>= 8;  //cut off the opcode
        }

        import_table_entry = (size_t *)((char const *)import_table_entry + 1);  //shift the relocation address by 1 byte of opcode
        *(size_t *)((char *)&ret + 1) = *import_table_entry + (size_t)import_table_entry + sizeof(uint32_t);  //remember original address, the operand of CALL or JMP
        *import_table_entry = (size_t)substitution - (size_t)import_table_entry - sizeof(size_t);  //write new
    }
    else  //if we resolve symbols via (__DATA, __la_symbol_ptr)
    {
        import_table_entry = (size_t *)((char const *)(handle->library_address) + handle->import_table_offset
                                        + import_table_entry_index * sizeof(size_t));  //compute the address of the target relocation
        ret = (mach_substitution)(*import_table_entry);  //remember original address
        *import_table_entry = (size_t)substitution;  //write new
    }

end :

    return ret;
}
//--------------------------------------------------------------------------------------------------
void mach_hook_free(void *h)
{
	if (!h)
		return;

	struct mach_hook_handle *handle = (struct mach_hook_handle *)h;

    free((void *)handle->string_table);
    free((void *)handle->symbol_table);
    free((void *)handle->indirect_table);
	free(handle);
}
//==================================================================================================
#ifdef __cplusplus
}
#endif
//==================================================================================================
