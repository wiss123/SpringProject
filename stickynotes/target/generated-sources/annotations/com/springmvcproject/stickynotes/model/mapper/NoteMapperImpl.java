package com.springmvcproject.stickynotes.model.mapper;

import com.springmvcproject.stickynotes.model.dto.AddNoteDTO;
import com.springmvcproject.stickynotes.model.dto.NoteDTO;
import com.springmvcproject.stickynotes.model.entity.Note;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-21T13:14:43+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class NoteMapperImpl implements NoteMapper {

    @Override
    public NoteDTO toDTO(Note entity) {
        if ( entity == null ) {
            return null;
        }

        NoteDTO.NoteDTOBuilder noteDTO = NoteDTO.builder();

        noteDTO.id( entity.getId() );
        noteDTO.note( entity.getNote() );
        noteDTO.stickyNoteId( entity.getStickyNoteId() );
        noteDTO.createdAt( entity.getCreatedAt() );
        noteDTO.updatedAt( entity.getUpdatedAt() );

        return noteDTO.build();
    }

    @Override
    public Note toEntity(NoteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Note.NoteBuilder note = Note.builder();

        note.id( dto.getId() );
        note.note( dto.getNote() );
        note.stickyNoteId( dto.getStickyNoteId() );
        note.createdAt( dto.getCreatedAt() );
        note.updatedAt( dto.getUpdatedAt() );

        return note.build();
    }

    @Override
    public List<NoteDTO> toDTOs(List<Note> entities) {
        if ( entities == null ) {
            return null;
        }

        List<NoteDTO> list = new ArrayList<NoteDTO>( entities.size() );
        for ( Note note : entities ) {
            list.add( toDTO( note ) );
        }

        return list;
    }

    @Override
    public Note toEntity(AddNoteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Note.NoteBuilder note = Note.builder();

        note.note( dto.getNote() );

        return note.build();
    }
}
