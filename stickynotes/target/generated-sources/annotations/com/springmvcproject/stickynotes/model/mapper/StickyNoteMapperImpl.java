package com.springmvcproject.stickynotes.model.mapper;

import com.springmvcproject.stickynotes.model.dto.AddStickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.StickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.UpdateStickyNoteDTO;
import com.springmvcproject.stickynotes.model.entity.StickyNote;
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
public class StickyNoteMapperImpl implements StickyNoteMapper {

    @Override
    public StickyNoteDTO toDto(StickyNote entity) {
        if ( entity == null ) {
            return null;
        }

        StickyNoteDTO.StickyNoteDTOBuilder stickyNoteDTO = StickyNoteDTO.builder();

        stickyNoteDTO.id( entity.getId() );
        stickyNoteDTO.description( entity.getDescription() );
        stickyNoteDTO.name( entity.getName() );
        stickyNoteDTO.status( entity.getStatus() );
        stickyNoteDTO.color( entity.getColor() );
        stickyNoteDTO.createdAt( entity.getCreatedAt() );
        stickyNoteDTO.updatedAt( entity.getUpdatedAt() );

        return stickyNoteDTO.build();
    }

    @Override
    public StickyNote toEntity(StickyNoteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        StickyNote.StickyNoteBuilder stickyNote = StickyNote.builder();

        stickyNote.id( dto.getId() );
        stickyNote.description( dto.getDescription() );
        stickyNote.name( dto.getName() );
        stickyNote.status( dto.getStatus() );
        stickyNote.color( dto.getColor() );
        stickyNote.createdAt( dto.getCreatedAt() );
        stickyNote.updatedAt( dto.getUpdatedAt() );

        return stickyNote.build();
    }

    @Override
    public List<StickyNote> toEntities(List<StickyNoteDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<StickyNote> list = new ArrayList<StickyNote>( dtos.size() );
        for ( StickyNoteDTO stickyNoteDTO : dtos ) {
            list.add( toEntity( stickyNoteDTO ) );
        }

        return list;
    }

    @Override
    public List<StickyNoteDTO> toDtos(List<StickyNote> entities) {
        if ( entities == null ) {
            return null;
        }

        List<StickyNoteDTO> list = new ArrayList<StickyNoteDTO>( entities.size() );
        for ( StickyNote stickyNote : entities ) {
            list.add( toDto( stickyNote ) );
        }

        return list;
    }

    @Override
    public StickyNote toEntity(AddStickyNoteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        StickyNote.StickyNoteBuilder stickyNote = StickyNote.builder();

        stickyNote.description( dto.getDescription() );
        stickyNote.name( dto.getName() );
        stickyNote.color( dto.getColor() );

        return stickyNote.build();
    }

    @Override
    public AddStickyNoteDTO toAddDto(StickyNote savedEntity) {
        if ( savedEntity == null ) {
            return null;
        }

        AddStickyNoteDTO.AddStickyNoteDTOBuilder addStickyNoteDTO = AddStickyNoteDTO.builder();

        addStickyNoteDTO.description( savedEntity.getDescription() );
        addStickyNoteDTO.name( savedEntity.getName() );
        addStickyNoteDTO.color( savedEntity.getColor() );

        return addStickyNoteDTO.build();
    }

    @Override
    public StickyNote toEntity(UpdateStickyNoteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        StickyNote.StickyNoteBuilder stickyNote = StickyNote.builder();

        stickyNote.description( dto.getDescription() );
        stickyNote.name( dto.getName() );
        stickyNote.status( dto.getStatus() );
        stickyNote.color( dto.getColor() );

        return stickyNote.build();
    }
}
