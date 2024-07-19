package net.achraf.chatbotrag.services;


import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;
import net.achraf.chatbotrag.PersonRepository;
import net.achraf.chatbotrag.entities.Person;


@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person, Long, PersonRepository> {
}
