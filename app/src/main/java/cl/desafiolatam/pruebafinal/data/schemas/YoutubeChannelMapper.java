package cl.desafiolatam.pruebafinal.data.schemas;

import cl.desafiolatam.pruebafinal.domain.model.DomainModel;

public class YoutubeChannelMapper {

    // transformar de youtubechannelschema a domainmodel

    public DomainModel mapSchemaToModel (YouTubeChannelSchema schema){
       return new DomainModel (schema.getNombre(), schema.getType(), schema.getDescripcion(),
                schema.getVideoUrl(), schema.getImageUrl(), schema.getFecha());
    }

    // transformar de domainmodel a youtubechannelschema

    public  YouTubeChannelSchema mapModelToSchema (DomainModel model){
        return new YouTubeChannelSchema (model.getNombre(), model.getType(), model.getDescripcion(),
               model.getVideoUrl(), model.getImageUrl(), model.getFecha());
    }
}
