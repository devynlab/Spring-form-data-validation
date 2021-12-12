package net.validation.formdatavalidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
  @Autowired
  private PersonRepository repo;

  public void savePerson(Person person) {
    this.repo.save(person);
  }
}
